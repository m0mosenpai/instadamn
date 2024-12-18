package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Iew, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41780Iew implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C38525Gwl A00;

    public C41780Iew(C38525Gwl c38525Gwl) {
        this.A00 = c38525Gwl;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        View view = this.A00.A0B;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setAlpha(1.0f - ((Number) animatedValue).floatValue());
        view.setAlpha(AbstractC37303Gc4.A00(valueAnimator));
    }
}
