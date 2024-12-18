package X;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class ABV {
    public final /* synthetic */ InterfaceC176187sb A00;
    public final /* synthetic */ InterfaceC25159BBe A01;
    public final /* synthetic */ C176097sS A02;
    public final /* synthetic */ AtomicInteger A03;

    public ABV(InterfaceC176187sb interfaceC176187sb, InterfaceC25159BBe interfaceC25159BBe, C176097sS c176097sS, AtomicInteger atomicInteger) {
        this.A02 = c176097sS;
        this.A00 = interfaceC176187sb;
        this.A03 = atomicInteger;
        this.A01 = interfaceC25159BBe;
    }

    public final void A00() {
        if (this.A03.decrementAndGet() == 0) {
            C176097sS c176097sS = this.A02;
            C176137sW c176137sW = c176097sS.A03;
            c176137sW.A0E = true;
            c176137sW.A08.postDelayed(c176137sW.A0B, c176137sW.A09.ArS(1007));
            Map map = c176097sS.A05;
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                A16.next();
            }
            Iterator A162 = AbstractC166997dE.A16(map);
            while (A162.hasNext()) {
                ((InterfaceC176187sb) A162.next()).EnJ(new C22823A4s(c176097sS));
            }
        }
    }
}
