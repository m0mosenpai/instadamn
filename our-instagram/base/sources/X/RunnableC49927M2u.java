package X;

import android.animation.ObjectAnimator;
import android.widget.ProgressBar;

/* renamed from: X.M2u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49927M2u implements Runnable {
    public final /* synthetic */ K5D A00;
    public final /* synthetic */ boolean A01;

    public RunnableC49927M2u(K5D k5d, boolean z) {
        this.A01 = z;
        this.A00 = k5d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        K5D k5d = this.A00;
        if (z) {
            ProgressBar progressBar = k5d.A08;
            C14360o3.A0A(progressBar);
            progressBar.setProgress(0);
            ProgressBar progressBar2 = k5d.A08;
            C14360o3.A0A(progressBar2);
            AbstractC43594JPz.A0H(progressBar2).start();
            ObjectAnimator objectAnimator = k5d.A00;
            if (objectAnimator != null) {
                objectAnimator.addListener(k5d.A0E);
                ObjectAnimator objectAnimator2 = k5d.A00;
                C14360o3.A0A(objectAnimator2);
                objectAnimator2.start();
                return;
            }
            return;
        }
        ProgressBar progressBar3 = k5d.A08;
        C14360o3.A0A(progressBar3);
        AbstractC43594JPz.A0G(progressBar3).start();
        ObjectAnimator objectAnimator3 = k5d.A00;
        if (objectAnimator3 == null) {
            return;
        }
        objectAnimator3.removeAllListeners();
        ObjectAnimator objectAnimator4 = k5d.A00;
        C14360o3.A0A(objectAnimator4);
        objectAnimator4.removeAllUpdateListeners();
    }
}
