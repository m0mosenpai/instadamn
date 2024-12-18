package X;

import java.util.Timer;

/* loaded from: classes9.dex */
public final class PT4 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ OIF A01;
    public final /* synthetic */ OML A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public PT4(OIF oif, OML oml, InterfaceC16820sZ interfaceC16820sZ, long j) {
        this.A02 = oml;
        this.A00 = j;
        this.A03 = interfaceC16820sZ;
        this.A01 = oif;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OML oml = this.A02;
        Timer timer = oml.A00;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        timer2.schedule(new PWA(this.A01, this.A03), this.A00);
        oml.A00 = timer2;
    }
}
