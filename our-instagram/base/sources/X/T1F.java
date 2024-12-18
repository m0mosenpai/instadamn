package X;

import android.os.SystemClock;
import com.facebook.rti.common.time.RealtimeSinceBootClock;

/* loaded from: classes10.dex */
public final class T1F implements InterfaceC65367Tiz {
    public double A00;
    public long A01;
    public final int A02;
    public final long A03;
    public final RealtimeSinceBootClock A04;

    @Override // X.InterfaceC65367Tiz
    public final synchronized boolean AH9() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.A01;
        this.A01 = elapsedRealtime;
        double d = this.A02;
        double d2 = this.A00 + ((j * (d / this.A03)) / 1000.0d);
        this.A00 = d2;
        if (d2 > d) {
            this.A00 = d;
            d2 = d;
        }
        if (d2 < 1.0d) {
            z = false;
        } else {
            this.A00 = d2 - 1.0d;
            z = true;
        }
        return z;
    }

    public T1F(RealtimeSinceBootClock realtimeSinceBootClock, int i, long j) {
        this.A04 = realtimeSinceBootClock;
        this.A02 = i;
        this.A03 = j;
        this.A00 = i;
    }
}
