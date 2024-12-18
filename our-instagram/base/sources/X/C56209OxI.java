package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.OxI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56209OxI implements InterfaceC58030PoG {
    public final int A00;
    public final Object A01;

    public C56209OxI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58030PoG
    public final void AGm() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            NLG nlg = (NLG) obj;
            nlg.A0C.post(new RunnableC56888PMh(AbstractC25651Mw.A00(nlg.A0A())));
            return;
        }
        C189588ad c189588ad = (C189588ad) obj;
        AtomicInteger atomicInteger = c189588ad.A0E;
        if (atomicInteger != null) {
            if (atomicInteger.decrementAndGet() != 0) {
                return;
            }
            C189588ad.A01(c189588ad);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58030PoG
    public final /* synthetic */ void AGo() {
    }
}
