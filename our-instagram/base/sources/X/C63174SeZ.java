package X;

import com.fbpay.ptt.impl.javacpp.ServerCertsVerifierImpl;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.SeZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63174SeZ {
    public final C2GC A00;
    public final C63346Si2 A01;
    public final SX5 A02;
    public final C58443PvM A03;

    public final SZ5 A02(InterfaceC65389TjM interfaceC65389TjM, SJ1 sj1, InterfaceC65390TjN interfaceC65390TjN) {
        SX5 sx5 = this.A02;
        C63001SaP c63001SaP = new C63001SaP(sj1.A02, sj1.A03, sj1.A04, sj1.A06, sj1.A05, sj1.A01);
        Map map = sx5.A03;
        if (!map.containsKey(c63001SaP)) {
            InterfaceC65510Tlf interfaceC65510Tlf = (InterfaceC65510Tlf) map.get(c63001SaP);
            if (interfaceC65510Tlf == null) {
                C62522SEy c62522SEy = sx5.A02;
                C58443PvM c58443PvM = sx5.A01;
                interfaceC65510Tlf = new REW(sx5.A00, c63001SaP, (ServerCertsVerifierImpl) sx5.A04.get(), c58443PvM, c62522SEy, sx5.A05);
                map.put(c63001SaP, interfaceC65510Tlf);
            }
            interfaceC65510Tlf.AWQ(c63001SaP);
        }
        Object obj = map.get(c63001SaP);
        obj.getClass();
        Executor executor = this.A03.A00.A02;
        return new SZ5(this.A00, (InterfaceC65510Tlf) obj, interfaceC65389TjM, sj1, interfaceC65390TjN, executor);
    }

    public C63174SeZ(C2GC c2gc, C63346Si2 c63346Si2, C58443PvM c58443PvM, C62522SEy c62522SEy, boolean z) {
        this.A03 = c58443PvM;
        this.A02 = new SX5(c2gc, c58443PvM, c62522SEy, z);
        this.A01 = c63346Si2;
        this.A00 = c2gc;
    }

    public static C63346Si2 A00() {
        C63174SeZ A04 = C2FP.A04();
        C14360o3.A07(A04);
        return A04.A01;
    }

    public static C63346Si2 A01() {
        return C2FP.A04().A01;
    }
}
