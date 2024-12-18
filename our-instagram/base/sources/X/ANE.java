package X;

import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final class ANE implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C210119Ra A00;

    public ANE(C210119Ra c210119Ra) {
        this.A00 = c210119Ra;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        C210119Ra c210119Ra = this.A00;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        c210119Ra.A00 = AbstractC166987dD.A0H(animatedValue);
        c210119Ra.invalidateSelf();
    }
}
