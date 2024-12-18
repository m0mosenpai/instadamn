package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.MlC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51289MlC extends C3OO {
    public final RecyclerView A00;
    public final OJ5 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51289MlC(View view, InterfaceC11380iw interfaceC11380iw, O63 o63) {
        super(view);
        C14360o3.A0B(view, 1);
        RecyclerView recyclerView = (RecyclerView) AbstractC166987dD.A0c(view, R.id.recycler_view);
        this.A00 = recyclerView;
        Context A0L = AbstractC166997dE.A0L(view);
        OJ5 oj5 = new OJ5(A0L, interfaceC11380iw, o63);
        this.A01 = oj5;
        AbstractC31174DnI.A17(A0L, recyclerView, false);
        recyclerView.setAdapter(oj5.A00);
        recyclerView.getLayoutParams().height = -2;
    }
}
