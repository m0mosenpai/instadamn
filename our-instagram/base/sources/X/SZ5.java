package X;

import com.fbpay.ptt.impl.javacpp.PttImpl;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class SZ5 {
    public final InterfaceC65390TjN A00;
    public final Executor A01;
    public final C2GC A02;
    public final InterfaceC65510Tlf A03;
    public final InterfaceC65389TjM A04;
    public final SJ1 A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static void A00(InterfaceC65388TjL interfaceC65388TjL, SZ5 sz5, PttImpl pttImpl, Map map, Executor executor) {
        try {
            interfaceC65388TjL = sz5;
            String createPtt = pttImpl.createPtt(AbstractC31175DnJ.A0d(map));
            InterfaceC65389TjM interfaceC65389TjM = sz5.A04;
            createPtt.getClass();
            interfaceC65389TjM.ATU(new C62583SHi(interfaceC65388TjL, sz5, pttImpl, executor), createPtt);
        } catch (IllegalArgumentException e) {
            executor.execute(new TR4(interfaceC65388TjL, interfaceC65388TjL, null, null, e));
        }
    }

    public final void A01(InterfaceC65388TjL interfaceC65388TjL, Object obj, String str, java.util.Set set, Executor executor) {
        C2GT BtY = this.A03.BtY(this.A05);
        BtY.A09(new C63624SqW(obj, executor, set, BtY, this, interfaceC65388TjL, str, 1));
    }

    public SZ5(C2GC c2gc, InterfaceC65510Tlf interfaceC65510Tlf, InterfaceC65389TjM interfaceC65389TjM, SJ1 sj1, InterfaceC65390TjN interfaceC65390TjN, Executor executor) {
        this.A00 = interfaceC65390TjN;
        this.A04 = interfaceC65389TjM;
        this.A01 = executor;
        this.A03 = interfaceC65510Tlf;
        this.A05 = sj1;
        this.A02 = c2gc;
    }
}
