package X;

import java.util.TimerTask;

/* loaded from: classes9.dex */
public final class PWA extends TimerTask {
    public final /* synthetic */ OIF A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public PWA(OIF oif, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = interfaceC16820sZ;
        this.A00 = oif;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.A01.invoke();
        OIF oif = this.A00;
        AbstractC25230BEn.A1N(oif, oif.A02, 17);
    }
}
