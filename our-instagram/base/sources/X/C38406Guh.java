package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Guh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38406Guh extends C3OO {
    public final C66362zD A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38406Guh(View view, InterfaceC11380iw interfaceC11380iw, InterfaceC16660sJ interfaceC16660sJ) {
        super(view);
        C3F0 c3f0;
        AbstractC167017dG.A1R(interfaceC11380iw, interfaceC16660sJ);
        Context context = view.getContext();
        C66392zG A00 = C66362zD.A00(context);
        A00.A0C.addAll(AbstractC166987dD.A1J(new V5E(interfaceC11380iw, interfaceC16660sJ)));
        A00.A09 = true;
        C66362zD A002 = A00.A00();
        this.A00 = A002;
        View requireViewById = view.requireViewById(R.id.horizontal_scroll_recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(A002);
        AbstractC31174DnI.A17(context, recyclerView, false);
        C14360o3.A07(requireViewById);
        int A05 = AbstractC166997dE.A05(view.getResources());
        recyclerView.setPadding(A05, 0, A05, 0);
        C3F1 c3f1 = recyclerView.A0C;
        if ((c3f1 instanceof C3F0) && (c3f0 = (C3F0) c3f1) != null) {
            c3f0.A00 = false;
        }
        recyclerView.A0S = true;
    }
}
