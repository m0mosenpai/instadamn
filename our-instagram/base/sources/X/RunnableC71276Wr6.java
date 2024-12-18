package X;

import android.animation.ValueAnimator;

/* renamed from: X.Wr6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71276Wr6 implements Runnable {
    public final /* synthetic */ C66340UAd A00;

    public RunnableC71276Wr6(C66340UAd c66340UAd) {
        this.A00 = c66340UAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66340UAd c66340UAd = this.A00;
        c66340UAd.A02 = true;
        c66340UAd.A00 = null;
        for (C69465Vno c69465Vno : c66340UAd.A05) {
            c69465Vno.A0D.cancel();
            ValueAnimator valueAnimator = c69465Vno.A06;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c69465Vno.A09 = null;
        }
        c66340UAd.A03.removeCallbacksAndMessages(null);
    }
}
