package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaar;
import java.util.concurrent.locks.Lock;

/* renamed from: X.T4z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64224T4z implements C69E, C69G {
    public final /* synthetic */ T5W A00;

    public /* synthetic */ C64224T4z(T5W t5w) {
        this.A00 = t5w;
    }

    @Override // X.C69F
    public final void D7H(int i) {
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        T5W t5w = this.A00;
        C3U5.A02(t5w.A0E);
        InterfaceC65661Tqr interfaceC65661Tqr = t5w.A01;
        C3U5.A02(interfaceC65661Tqr);
        interfaceC65661Tqr.FF3(new zaar(t5w));
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        T5W t5w = this.A00;
        Lock lock = t5w.A0G;
        lock.lock();
        try {
            if (t5w.A02 && (connectionResult.A01 == 0 || connectionResult.A02 == null)) {
                T5W.A03(t5w);
                T5W.A04(t5w);
            } else {
                T5W.A02(connectionResult, t5w);
            }
        } finally {
            lock.unlock();
        }
    }
}
