package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.If0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41784If0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C148146lk A00;

    public C41784If0(C148146lk c148146lk) {
        this.A00 = c148146lk;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Number number;
        C14360o3.A0B(valueAnimator, 0);
        C148146lk c148146lk = this.A00;
        if (!c148146lk.A0H) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Float) && (number = (Number) animatedValue) != null) {
                f = number.floatValue();
            } else {
                f = c148146lk.A00;
            }
            c148146lk.A00 = f;
            GradientSpinner gradientSpinner = c148146lk.A0E;
            if (gradientSpinner != null) {
                gradientSpinner.A09(f);
            }
        }
    }
}
