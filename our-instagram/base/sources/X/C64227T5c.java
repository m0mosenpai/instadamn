package X;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* renamed from: X.T5c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64227T5c implements C64A {
    public final boolean A00;
    public final C61W A01;
    public final WeakReference A02;

    @Override // X.C64A
    public final void Dff(ConnectionResult connectionResult) {
        T5W t5w = (T5W) this.A02.get();
        if (t5w != null) {
            C3U5.A09(AbstractC167007dF.A1X(Looper.myLooper(), t5w.A0D.A05.A06), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            Lock lock = t5w.A0G;
            lock.lock();
            try {
                if (T5W.A07(t5w, 0)) {
                    if (connectionResult.A01 != 0) {
                        T5W.A01(connectionResult, this.A01, t5w, this.A00);
                    }
                    if (T5W.A06(t5w)) {
                        T5W.A04(t5w);
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public C64227T5c(C61W c61w, T5W t5w, boolean z) {
        this.A02 = AbstractC25225BEi.A16(t5w);
        this.A01 = c61w;
        this.A00 = z;
    }
}
