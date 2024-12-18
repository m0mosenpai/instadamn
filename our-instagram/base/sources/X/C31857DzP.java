package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DzP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31857DzP extends UGO {
    public final InterfaceC16620sF A00;

    public C31857DzP(InterfaceC16620sF interfaceC16620sF) {
        super(3, 0);
        this.A00 = interfaceC16620sF;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167007dF.A1D(c3oo, 1, c3oo2);
        this.A00.invoke(Integer.valueOf(c3oo.getBindingAdapterPosition()), Integer.valueOf(c3oo2.getBindingAdapterPosition()));
        return true;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        float f3;
        AbstractC167017dG.A1P(recyclerView, c3oo);
        c3oo.itemView.setTranslationX(f);
        c3oo.itemView.setTranslationY(f2);
        View view = c3oo.itemView;
        if (z) {
            f3 = AbstractC13880nE.A04(AbstractC166997dE.A0L(recyclerView), 4);
        } else {
            f3 = 0.0f;
        }
        view.setElevation(f3);
    }
}
