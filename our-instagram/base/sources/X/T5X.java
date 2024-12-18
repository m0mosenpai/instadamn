package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class T5X implements TmP {
    public final /* synthetic */ T5Z A00;

    public /* synthetic */ T5X(T5Z t5z) {
        this.A00 = t5z;
    }

    @Override // X.TmP
    public final void FF1(int i, boolean z) {
        ConnectionResult connectionResult;
        T5Z t5z = this.A00;
        Lock lock = t5z.A0B;
        lock.lock();
        try {
            if (!t5z.A04 && (connectionResult = t5z.A03) != null && connectionResult.A01 == 0) {
                t5z.A04 = true;
                t5z.A09.D7H(i);
            } else {
                t5z.A04 = false;
                t5z.A07.FF1(i, false);
                t5z.A03 = null;
                t5z.A02 = null;
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // X.TmP
    public final void FEw(ConnectionResult connectionResult) {
        T5Z t5z = this.A00;
        Lock lock = t5z.A0B;
        lock.lock();
        try {
            t5z.A02 = connectionResult;
            T5Z.A02(t5z);
        } finally {
            lock.unlock();
        }
    }

    @Override // X.TmP
    public final void FEz(Bundle bundle) {
        T5Z t5z = this.A00;
        Lock lock = t5z.A0B;
        lock.lock();
        try {
            Bundle bundle2 = t5z.A01;
            if (bundle2 == null) {
                t5z.A01 = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            t5z.A02 = ConnectionResult.A04;
            T5Z.A02(t5z);
        } finally {
            lock.unlock();
        }
    }
}
