package X;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KR4 extends AbstractC44588Jon {
    public final RecyclerView A00;
    public final C66362zD A01;
    public final /* synthetic */ C44001Jco A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KR4(LayoutInflater layoutInflater, View view, C44001Jco c44001Jco) {
        super(view);
        this.A02 = c44001Jco;
        C66392zG c66392zG = new C66392zG(layoutInflater);
        UserSession userSession = c44001Jco.A02;
        InterfaceC11380iw interfaceC11380iw = c44001Jco.A01;
        C57112jm c57112jm = c44001Jco.A03;
        c66392zG.A0C.addAll(AbstractC16960so.A1Q(new C32605EXf(interfaceC11380iw, userSession, c57112jm), KIR.A00, new KHW(userSession)));
        C66362zD A00 = c66392zG.A00();
        this.A01 = A00;
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.inbox_tray_recycler_view);
        this.A00 = recyclerView;
        recyclerView.setAdapter(A00);
        AbstractC31174DnI.A17(recyclerView.getContext(), recyclerView, false);
        C3F1 c3f1 = recyclerView.A0C;
        if (c3f1 instanceof C3F0) {
            ((C3F0) c3f1).A00 = false;
        }
        AbstractC37301Gc2.A0v(recyclerView, c57112jm, c44001Jco.A00);
    }
}
