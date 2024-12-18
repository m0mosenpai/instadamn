package X;

import android.animation.ValueAnimator;

/* renamed from: X.WqJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71228WqJ implements Runnable {
    public final /* synthetic */ UHD A00;

    public RunnableC71228WqJ(UHD uhd) {
        this.A00 = uhd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UHD uhd = this.A00;
        int i = uhd.A02;
        if (i != 1) {
            if (i != 2) {
                return;
            }
        } else {
            uhd.A0K.cancel();
        }
        uhd.A02 = 3;
        ValueAnimator valueAnimator = uhd.A0K;
        MSY.A1O(valueAnimator.getAnimatedValue(), r2, 0);
        float[] fArr = {0.0f, 0.0f};
        valueAnimator.setFloatValues(fArr);
        valueAnimator.setDuration(500L);
        valueAnimator.start();
    }
}
