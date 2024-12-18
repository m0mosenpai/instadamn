package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Suw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63864Suw implements InterfaceC65327Ti8 {
    public final /* synthetic */ SWS A00;

    public C63864Suw(SWS sws) {
        this.A00 = sws;
    }

    @Override // X.InterfaceC65327Ti8
    public final void D7I(boolean z) {
        ArrayList A1F;
        C63375Sim.A04();
        SWS sws = this.A00;
        synchronized (sws) {
            A1F = AbstractC166987dD.A1F(sws.A02);
        }
        Iterator it = A1F.iterator();
        while (it.hasNext()) {
            ((InterfaceC65327Ti8) it.next()).D7I(z);
        }
    }
}
