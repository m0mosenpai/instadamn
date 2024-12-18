package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes11.dex */
public final class WH1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ W33 A00;

    public WH1(W33 w33) {
        this.A00 = w33;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        View view = this.A00.A06;
        view.setTranslationY(r0.A03 * (1.0f - animatedFraction));
        view.setAlpha(animatedFraction);
    }
}
