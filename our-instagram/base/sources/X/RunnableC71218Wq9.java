package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* renamed from: X.Wq9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71218Wq9 implements Runnable {
    public final /* synthetic */ WO7 A00;

    public RunnableC71218Wq9(WO7 wo7) {
        this.A00 = wo7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WO7 wo7 = this.A00;
        if (wo7.A03) {
            if (wo7.A06) {
                wo7.A06 = false;
                C70096W2w c70096W2w = wo7.A0F;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c70096W2w.A06 = currentAnimationTimeMillis;
                c70096W2w.A07 = -1L;
                c70096W2w.A05 = currentAnimationTimeMillis;
                c70096W2w.A00 = 0.5f;
            }
            C70096W2w c70096W2w2 = wo7.A0F;
            if ((c70096W2w2.A07 > 0 && AnimationUtils.currentAnimationTimeMillis() > c70096W2w2.A07 + c70096W2w2.A02) || !wo7.A02()) {
                wo7.A03 = false;
                return;
            }
            if (wo7.A05) {
                wo7.A05 = false;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                wo7.A0C.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (c70096W2w2.A05 != 0) {
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float A00 = C70096W2w.A00(c70096W2w2, currentAnimationTimeMillis2);
                long j = currentAnimationTimeMillis2 - c70096W2w2.A05;
                c70096W2w2.A05 = currentAnimationTimeMillis2;
                wo7.A0E.scrollListBy((int) (((float) j) * (((-4.0f) * A00 * A00) + (A00 * 4.0f)) * c70096W2w2.A01));
                wo7.A0C.postOnAnimation(this);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
    }
}
