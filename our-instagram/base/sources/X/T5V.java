package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class T5V implements InterfaceC65586TnQ {
    public final C64225T5a A00;

    public T5V(C64225T5a c64225T5a) {
        this.A00 = c64225T5a;
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF8(Bundle bundle) {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF9(ConnectionResult connectionResult, C61W c61w, boolean z) {
    }

    @Override // X.InterfaceC65586TnQ
    public final void FFA(int i) {
    }

    @Override // X.InterfaceC65586TnQ
    public final boolean FFB() {
        return true;
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEv(AbstractC60658RGk abstractC60658RGk) {
        this.A00.A05.A0F.add(abstractC60658RGk);
        return abstractC60658RGk;
    }

    @Override // X.InterfaceC65586TnQ
    public final AbstractC60658RGk FEy(AbstractC60658RGk abstractC60658RGk) {
        throw AbstractC166987dD.A14("GoogleApiClient is not connected yet.");
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF2() {
        C64225T5a c64225T5a = this.A00;
        Iterator A16 = AbstractC166997dE.A16(c64225T5a.A09);
        while (A16.hasNext()) {
            ((InterfaceC1340663q) A16.next()).disconnect();
        }
        c64225T5a.A05.A03 = Collections.emptySet();
    }

    @Override // X.InterfaceC65586TnQ
    public final void FF5() {
        C64225T5a c64225T5a = this.A00;
        Lock lock = c64225T5a.A0D;
        lock.lock();
        try {
            C1340363l c1340363l = c64225T5a.A08;
            Map map = c64225T5a.A0B;
            c64225T5a.A0E = new T5W(c64225T5a.A02, c64225T5a.A03, c64225T5a.A04, c64225T5a, c1340363l, map, lock);
            c64225T5a.A0E.FF2();
            c64225T5a.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
