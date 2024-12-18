package X;

import android.os.SystemClock;

/* loaded from: classes10.dex */
public final class SYU {
    public static final SYU A02 = new SYU();
    public SIJ A01 = new Object();
    public long A00 = -1;

    public final synchronized void A00(int i, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A00;
        long j2 = elapsedRealtime - j;
        SIJ sij = this.A01;
        sij.A00++;
        long j3 = 14000;
        if (j < 0 || j2 > 14000) {
            sij.A03++;
        }
        if (z) {
            sij.A02 += i;
        } else {
            sij.A01 += i;
        }
        long j4 = sij.A04;
        if (j >= 0) {
            j3 = Math.min(14000L, j2);
        }
        sij.A04 = j4 + j3;
        this.A00 = elapsedRealtime;
    }
}
