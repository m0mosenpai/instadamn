package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes8.dex */
public final class LM2 implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public LM2(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        Number number;
        Number number2;
        View view;
        Number number3;
        Number number4;
        switch (this.A00) {
            case 0:
                int A0D = AbstractC25230BEn.A0D(AbstractC43593JPy.A0s(valueAnimator), "null cannot be cast to non-null type kotlin.Int");
                BZI bzi = (BZI) this.A02;
                bzi.A02 = AbstractC167007dF.A1P(A0D, this.A01);
                super/*android.widget.ProgressBar*/.setProgress(A0D);
                return;
            case 1:
                int A0D2 = AbstractC25230BEn.A0D(AbstractC43593JPy.A0s(valueAnimator), "null cannot be cast to non-null type kotlin.Int");
                C66206U4c c66206U4c = (C66206U4c) this.A02;
                C66206U4c.A00(c66206U4c, A0D2);
                if (A0D2 != this.A01) {
                    return;
                }
                c66206U4c.A00 = A0D2;
                return;
            case 2:
                Object A0s = AbstractC43593JPy.A0s(valueAnimator);
                if (!(A0s instanceof Integer) || (number2 = (Number) A0s) == null) {
                    return;
                }
                C28427CgZ.A01((C28427CgZ) this.A02, number2.intValue(), this.A01);
                return;
            case 3:
                C14360o3.A0B(valueAnimator, 0);
                C3OO A0V = ((RecyclerView) this.A02).A0V(this.A01);
                if (!(A0V instanceof C51369MmU) || A0V == null || (view = A0V.itemView) == null) {
                    return;
                }
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || (number3 = (Number) animatedValue) == null) {
                    return;
                }
                int floatValue = (int) number3.floatValue();
                AbstractC13880nE.A0e(view, floatValue);
                AbstractC13880nE.A0V(view, floatValue);
                return;
            case 4:
                C14360o3.A0B(valueAnimator, 0);
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.A02;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if ((animatedValue2 instanceof Integer) && (number = (Number) animatedValue2) != null) {
                    i = number.intValue();
                } else {
                    i = this.A01;
                }
                bottomSheetBehavior.A0V(i);
                return;
            case 5:
                C14360o3.A0B(valueAnimator, 0);
                C44436Jks c44436Jks = (C44436Jks) this.A02;
                C44436Jks.A00(c44436Jks, valueAnimator.getAnimatedFraction(), c44436Jks.A01, this.A01);
                return;
            default:
                C14360o3.A0B(valueAnimator, 0);
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                if ((animatedValue3 instanceof Integer) && (number4 = (Number) animatedValue3) != null) {
                    int intValue = number4.intValue();
                    LinearLayout linearLayout = ((L8E) this.A02).A04;
                    linearLayout.setClipBounds(new Rect(0, 0, intValue, this.A01));
                    linearLayout.invalidate();
                    return;
                }
                return;
        }
    }
}
