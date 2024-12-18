package X;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.DzR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31859DzR extends UGO {
    public final InterfaceC16620sF A00;

    public C31859DzR(InterfaceC16620sF interfaceC16620sF) {
        super(3, 0);
        this.A00 = interfaceC16620sF;
    }

    @Override // X.UGO, X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        if (!(c3oo instanceof E3T) || ((E3T) c3oo).A04.getVisibility() != 0) {
            return 0;
        }
        return C8S8.makeMovementFlags(3, 0);
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        float f3;
        long A08;
        AbstractC167007dF.A1D(recyclerView, 1, c3oo);
        C3OO A0V = recyclerView.A0V(c3oo.getBindingAdapterPosition() - 1);
        C3OO A0V2 = recyclerView.A0V(c3oo.getBindingAdapterPosition() + 1);
        float f4 = 0.0f;
        boolean z2 = false;
        if (f2 < 0.0f) {
            z2 = true;
        }
        boolean A1O = AbstractC167007dF.A1O((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)));
        if ((z2 && A0V != null && !canDropOver(recyclerView, c3oo, A0V)) || (A1O && A0V2 != null && !canDropOver(recyclerView, c3oo, A0V2))) {
            f2 = 0.0f;
        }
        View A06 = AbstractC31171DnF.A06(c3oo);
        A06.setTranslationX(f);
        A06.setTranslationY(f2);
        if (z) {
            f3 = AbstractC13880nE.A04(AbstractC166997dE.A0L(recyclerView), 1);
        } else {
            f3 = 0.0f;
        }
        A06.setElevation(f3);
        ViewPropertyAnimator animate = A06.animate();
        C3F1 c3f1 = recyclerView.A0C;
        if (c3f1 == null) {
            A08 = 200;
        } else {
            A08 = c3f1.A08();
        }
        ViewPropertyAnimator duration = animate.setDuration(A08);
        if (z) {
            f4 = AbstractC13880nE.A04(AbstractC166997dE.A0L(recyclerView), 19);
        }
        duration.translationZ(f4);
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    @Override // X.C8S8
    public final boolean canDropOver(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167017dG.A1P(c3oo, c3oo2);
        if ((c3oo instanceof E3T) && ((E3T) c3oo).A04.getVisibility() == 0 && (c3oo2 instanceof E3T) && ((E3T) c3oo2).A04.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167017dG.A1P(c3oo, c3oo2);
        return AbstractC166987dD.A1a(this.A00.invoke(Integer.valueOf(c3oo.getAbsoluteAdapterPosition()), Integer.valueOf(c3oo2.getAbsoluteAdapterPosition())));
    }
}
