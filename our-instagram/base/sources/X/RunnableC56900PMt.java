package X;

import android.animation.ValueAnimator;

/* renamed from: X.PMt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56900PMt implements Runnable {
    public final /* synthetic */ C71L A00;

    public RunnableC56900PMt(C71L c71l) {
        this.A00 = c71l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C71L c71l = this.A00;
        ValueAnimator valueAnimator = c71l.A01;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            c71l.A03 = C05F.A01;
            ValueAnimator valueAnimator2 = c71l.A01;
            if (valueAnimator2 != null) {
                valueAnimator2.reverse();
            }
        }
    }
}
