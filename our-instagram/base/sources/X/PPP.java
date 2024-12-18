package X;

import com.facebook.mediastreaming.opt.transport.SpeedTestStatus;

/* loaded from: classes9.dex */
public final class PPP implements Runnable {
    public final /* synthetic */ C55691OoI A00;
    public final /* synthetic */ SpeedTestStatus A01;

    public PPP(C55691OoI c55691OoI, SpeedTestStatus speedTestStatus) {
        this.A00 = c55691OoI;
        this.A01 = speedTestStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.onSpeedTestResult(this.A01);
    }
}
