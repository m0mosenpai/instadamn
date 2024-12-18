package X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes8.dex */
public final class LLw implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;

    public LLw(View view) {
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        AbstractC13880nE.A0W(this.A00, AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int"));
    }
}
