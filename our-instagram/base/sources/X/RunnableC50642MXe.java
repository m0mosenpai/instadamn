package X;

import android.os.SystemClock;
import com.instagram.creation.capture.quickcapture.cameracountdown.CountdownView;

/* renamed from: X.MXe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC50642MXe implements Runnable {
    public final /* synthetic */ C50641MXd A00;

    public RunnableC50642MXe(C50641MXd c50641MXd) {
        this.A00 = c50641MXd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C50641MXd c50641MXd = this.A00;
        float A01 = AbstractC13600mm.A01((float) (elapsedRealtime - c50641MXd.A01), 0.0f, C8KL.A00(c50641MXd.A0E), 0.0f, 1.0f);
        CountdownView countdownView = c50641MXd.A0F;
        countdownView.setProgress(A01);
        countdownView.postOnAnimation(c50641MXd.A0G);
    }
}
