package X;

import android.widget.ProgressBar;

/* renamed from: X.LzR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49820LzR implements Runnable {
    public final /* synthetic */ K5S A00;

    public RunnableC49820LzR(K5S k5s) {
        this.A00 = k5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5S k5s = this.A00;
        ProgressBar progressBar = k5s.A0J;
        C14360o3.A0A(progressBar);
        AbstractC43594JPz.A0G(progressBar).withEndAction(new RunnableC49819LzQ(k5s)).start();
    }
}
