package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.DzS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31860DzS extends UGO {
    public final /* synthetic */ EJK A00;

    @Override // X.C8S8
    public final void clearView(RecyclerView recyclerView, C3OO c3oo) {
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, c3oo);
        super.clearView(recyclerView, c3oo);
        CardView cardView = (CardView) c3oo.itemView;
        if (cardView != null) {
            AnimatorSet A04 = AbstractC31181DnP.A04();
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[0] = cardView.getAlpha();
            fArr[A1R ? 1 : 0] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) property, fArr);
            C14360o3.A07(ofFloat);
            float cardElevation = cardView.getCardElevation();
            float A042 = AbstractC166997dE.A04(cardView.getContext(), R.dimen.action_bar_item_spacing_left);
            float[] fArr2 = new float[2];
            fArr2[0] = cardElevation;
            fArr2[A1R ? 1 : 0] = A042;
            C35292FhR.A00(ofFloat, A04, ValueAnimator.ofFloat(fArr2), cardView, 7);
        }
    }

    @Override // X.C8S8
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (r2 != r0.intValue()) goto L6;
     */
    @Override // X.C8S8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMove(androidx.recyclerview.widget.RecyclerView r9, X.C3OO r10, X.C3OO r11) {
        /*
            r8 = this;
            r7 = 1
            X.AbstractC167007dF.A1D(r10, r7, r11)
            int r3 = r10.getBindingAdapterPosition()
            int r2 = r11.getBindingAdapterPosition()
            X.EJK r0 = r8.A00
            X.0do r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.DyD r1 = (X.C31793DyD) r1
            X.05A r6 = r1.A03
            java.lang.Object r0 = r6.getValue()
            X.FMH r0 = (X.FMH) r0
            java.util.List r5 = r0.A01
            java.lang.Object r0 = r6.getValue()
            X.FMH r0 = (X.FMH) r0
            X.EiB r4 = r0.A00
            java.util.Collections.swap(r5, r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.0e4 r3 = X.AbstractC167007dF.A0o(r0, r2)
            int r2 = r5.hashCode()
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L42
            int r0 = r0.intValue()
            r1 = 0
            if (r2 == r0) goto L43
        L42:
            r1 = 1
        L43:
            X.FMH r0 = new X.FMH
            r0.<init>(r4, r5, r3, r1)
            r6.Egh(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31860DzS.onMove(androidx.recyclerview.widget.RecyclerView, X.3OO, X.3OO):boolean");
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        CardView cardView;
        if (i == 2) {
            View view = null;
            if (c3oo != null) {
                view = c3oo.itemView;
            }
            if ((view instanceof CardView) && (cardView = (CardView) view) != null) {
                AnimatorSet A04 = AbstractC31181DnP.A04();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.ALPHA, cardView.getAlpha(), 0.7f);
                C14360o3.A07(ofFloat);
                C35292FhR.A00(ofFloat, A04, ValueAnimator.ofFloat(cardView.getCardElevation(), AbstractC166997dE.A04(cardView.getContext(), R.dimen.abc_button_padding_horizontal_material)), cardView, 7);
            }
        }
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31860DzS(EJK ejk) {
        super(3, 0);
        this.A00 = ejk;
    }
}
