package X;

import java.util.Map;

/* renamed from: X.Seh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63182Seh {
    public static final boolean A07 = android.util.Log.isLoggable("Engine", 2);
    public final SM9 A00;
    public final SFT A01;
    public final C62612SIu A02;
    public final SL0 A03;
    public final SDD A04;
    public final SDE A05;
    public final C58821QBe A06;

    public C63182Seh(SAX sax, C58821QBe c58821QBe, ExecutorServiceC64807TUv executorServiceC64807TUv, ExecutorServiceC64807TUv executorServiceC64807TUv2, ExecutorServiceC64807TUv executorServiceC64807TUv3, ExecutorServiceC64807TUv executorServiceC64807TUv4) {
        this.A06 = c58821QBe;
        SL0 sl0 = new SL0(sax);
        this.A03 = sl0;
        SM9 sm9 = new SM9();
        this.A00 = sm9;
        synchronized (this) {
            synchronized (sm9) {
                sm9.A00 = this;
            }
        }
        this.A04 = new SDD();
        this.A02 = new C62612SIu(this, this, executorServiceC64807TUv, executorServiceC64807TUv2, executorServiceC64807TUv3, executorServiceC64807TUv4);
        this.A01 = new SFT(sl0);
        this.A05 = new SDE();
        c58821QBe.A00 = this;
    }

    public final synchronized void A01(InterfaceC65617To8 interfaceC65617To8, C63891SvP c63891SvP, C63789Stj c63789Stj) {
        Map map;
        if (c63789Stj != null) {
            if (c63789Stj.A03) {
                this.A00.A00(interfaceC65617To8, c63789Stj);
            }
        }
        SDD sdd = this.A04;
        if (c63891SvP.A0A) {
            map = sdd.A01;
        } else {
            map = sdd.A00;
        }
        if (c63891SvP.equals(map.get(interfaceC65617To8))) {
            map.remove(interfaceC65617To8);
        }
    }

    public static final void A00(InterfaceC65558Tme interfaceC65558Tme) {
        if (interfaceC65558Tme instanceof C63789Stj) {
            ((C63789Stj) interfaceC65558Tme).A00();
            return;
        }
        throw AbstractC166987dD.A12("Cannot release anything but an EngineResource");
    }
}
