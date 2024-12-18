package X;

import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class OML {
    public Timer A00;
    public final long A01;
    public final OIF A02 = new OIF();
    public final ExecutorService A03 = Executors.newSingleThreadExecutor();

    public final void A01(String str) {
        C14360o3.A0B(str, 0);
        this.A03.execute(new RunnableC56839PKj(this));
        OIF oif = this.A02;
        AbstractC166987dD.A1Z(new MCF(oif, str, null, 1), oif.A02);
    }

    public final void A02(String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(str, 0);
        OIF oif = this.A02;
        AbstractC166987dD.A1Z(new MCF(oif, str, null, 0), oif.A02);
        this.A03.execute(new PT4(oif, this, interfaceC16820sZ, this.A01));
    }

    public final void A03(Map map) {
        C14360o3.A0B(map, 0);
        OIF oif = this.A02;
        AbstractC166987dD.A1Z(new MBr(map, oif, (InterfaceC23621Ds) null, 6), oif.A02);
    }

    public final void A00(String str) {
        this.A03.execute(new RunnableC56839PKj(this));
        if (str.length() > 0) {
            this.A02.A00(new C51397Mn3(str), "cancel_reason");
        }
        OIF oif = this.A02;
        AbstractC25230BEn.A1N(oif, oif.A02, 14);
    }

    public OML(long j) {
        this.A01 = j;
    }
}
