package X;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes11.dex */
public final class WcA implements C4YW {
    public final InterfaceC71908X9s A00;

    @Override // X.C4YW
    public final void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
    }

    @Override // X.C4YW
    public final /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
    }

    @Override // X.C4YW
    public final void DPd(InterfaceC98244b3 interfaceC98244b3, long j, long j2) {
        boolean z;
        InterfaceC71908X9s interfaceC71908X9s = this.A00;
        synchronized (AbstractC63115SdJ.A03) {
            z = AbstractC63115SdJ.A01;
        }
        if (!z) {
            C4XU.A03(((WcM) interfaceC71908X9s).A00, new IOException(new ConcurrentModificationException()));
        } else {
            interfaceC71908X9s.onInitialized();
        }
    }

    @Override // X.C4YW
    public final C98014ag DPf(InterfaceC98244b3 interfaceC98244b3, IOException iOException, int i, long j, long j2) {
        C4XU.A03(((WcM) this.A00).A00, iOException);
        return C98004af.A04;
    }

    public WcA(InterfaceC71908X9s interfaceC71908X9s) {
        this.A00 = interfaceC71908X9s;
    }
}
