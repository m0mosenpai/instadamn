package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public final class ANG implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C7Y3 A00;

    public ANG(C7Y3 c7y3) {
        this.A00 = c7y3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        C7Y3 c7y3 = this.A00;
        View view = c7y3.A02;
        if (view != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            view.setAlpha(1.0f - ((Number) animatedValue).floatValue());
        }
        View view2 = c7y3.A01;
        if (view2 != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            C14360o3.A0C(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
            view2.setAlpha(((Number) animatedValue2).floatValue());
        }
    }
}
