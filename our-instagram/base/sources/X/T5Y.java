package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

/* loaded from: classes10.dex */
public final class T5Y implements TmP {
    public final /* synthetic */ T5Z A00;

    public /* synthetic */ T5Y(T5Z t5z) {
        this.A00 = t5z;
    }

    @Override // X.TmP
    public final void FF1(int i, boolean z) {
        T5Z t5z = this.A00;
        Lock lock = t5z.A0B;
        lock.lock();
        try {
            if (t5z.A04) {
                t5z.A04 = false;
                t5z.A07.FF1(i, false);
                t5z.A03 = null;
                t5z.A02 = null;
            } else {
                t5z.A04 = true;
                t5z.A08.D7H(i);
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
            t5z.A03 = connectionResult;
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
            t5z.A03 = ConnectionResult.A04;
            T5Z.A02(t5z);
        } finally {
            lock.unlock();
        }
    }
}
