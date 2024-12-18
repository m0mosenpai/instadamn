package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class Jq2 extends C3OO {
    public final C66362zD A00;
    public final Context A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zI, java.lang.Object] */
    public Jq2(View view, C45523KDo c45523KDo, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        AbstractC167017dG.A1R(c45523KDo, interfaceC11380iw);
        Context context = view.getContext();
        this.A01 = context;
        C66392zG A00 = C66362zD.A00(context);
        A00.A0C.addAll(AbstractC16960so.A1Q(new C45629KHs(c45523KDo, interfaceC11380iw), new Object()));
        C66362zD A002 = A00.A00();
        this.A00 = A002;
        RecyclerView A0G = AbstractC31172DnG.A0G(view, R.id.horizontal_scroll_recycler_view);
        A0G.setAdapter(A002);
        AbstractC31174DnI.A17(context, A0G, false);
    }
}
