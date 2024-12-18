package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.MWc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50615MWc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C71L A01;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Number) animatedValue).intValue();
        View view = this.A00;
        if (view != null) {
            view.setTranslationY(intValue);
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.A01.A00;
        if (animatorUpdateListener != null) {
            animatorUpdateListener.onAnimationUpdate(valueAnimator);
        }
    }

    public C50615MWc(View view, C71L c71l) {
        this.A00 = view;
        this.A01 = c71l;
    }
}
