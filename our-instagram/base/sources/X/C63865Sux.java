package X;

import java.util.Iterator;

/* renamed from: X.Sux, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63865Sux implements InterfaceC65327Ti8 {
    public final SLS A00;
    public final /* synthetic */ Sv5 A01;

    public C63865Sux(Sv5 sv5, SLS sls) {
        this.A01 = sv5;
        this.A00 = sls;
    }

    @Override // X.InterfaceC65327Ti8
    public final void D7I(boolean z) {
        if (z) {
            synchronized (this.A01) {
                SLS sls = this.A00;
                Iterator A0y = AbstractC58322PtE.A0y(sls.A02);
                while (A0y.hasNext()) {
                    InterfaceC65582TnL interfaceC65582TnL = (InterfaceC65582TnL) A0y.next();
                    if (!interfaceC65582TnL.isComplete() && !interfaceC65582TnL.CRK()) {
                        interfaceC65582TnL.clear();
                        if (!sls.A00) {
                            interfaceC65582TnL.ADM();
                        } else {
                            sls.A01.add(interfaceC65582TnL);
                        }
                    }
                }
            }
        }
    }
}
