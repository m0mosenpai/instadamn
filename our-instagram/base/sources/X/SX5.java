package X;

import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SX5 {
    public static final C63001SaP A06 = new C63001SaP();
    public final C2GC A00;
    public final C58443PvM A01;
    public final C62522SEy A02;
    public final Map A03;
    public final InterfaceC08830cm A04;
    public final boolean A05;

    public SX5(C2GC c2gc, C58443PvM c58443PvM, C62522SEy c62522SEy, boolean z) {
        C64812TVb c64812TVb = new C64812TVb(3);
        Map synchronizedMap = Collections.synchronizedMap(AbstractC166987dD.A1G());
        this.A03 = synchronizedMap;
        this.A02 = c62522SEy;
        this.A01 = c58443PvM;
        this.A04 = c64812TVb;
        this.A05 = z;
        C63001SaP c63001SaP = A06;
        synchronizedMap.put(c63001SaP, new REW(c2gc, c63001SaP, (ServerCertsVerifierImpl) c64812TVb.get(), c58443PvM, c62522SEy, z));
        this.A00 = c2gc;
    }
}
