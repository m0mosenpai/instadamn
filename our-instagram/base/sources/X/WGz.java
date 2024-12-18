package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class WGz implements ValueAnimator.AnimatorUpdateListener {
    public final WeakReference A00;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        UAM uam = (UAM) this.A00.get();
        if (uam != null) {
            uam.A00(valueAnimator.getAnimatedFraction());
        }
    }

    public WGz(UAM uam) {
        this.A00 = new WeakReference(uam);
    }
}
