package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WH4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ W33 A00;
    public final /* synthetic */ boolean A01;

    public WH4(W33 w33, boolean z) {
        this.A00 = w33;
        this.A01 = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        float animatedFraction = valueAnimator.getAnimatedFraction();
        W33 w33 = this.A00;
        View view = w33.A07;
        view.setAlpha(animatedFraction);
        if (this.A01) {
            view.setBackgroundColor(AbstractC13950nL.A02(animatedFraction, 0, w33.A05.getContext().getColor(R.color.clips_overlay_ads_end_background_color)));
        }
    }
}
