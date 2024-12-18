package X;

import android.os.SystemClock;

/* renamed from: X.7tB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176537tB {
    public long A00 = -1;
    public long A01 = -1;
    public long A02;
    public boolean A03;

    public final long A00(long j) {
        long j2;
        if (!this.A03) {
            long j3 = Long.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                long nanoTime = System.nanoTime();
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long nanoTime2 = System.nanoTime();
                long j4 = nanoTime2 - nanoTime;
                if (i == 0 || j4 < j3) {
                    this.A02 = elapsedRealtimeNanos - ((nanoTime + nanoTime2) >> 1);
                    j3 = j4;
                }
            }
            this.A03 = true;
        }
        if (Math.abs(((float) (SystemClock.elapsedRealtimeNanos() - j)) / 1.0E9f) < 120.0f) {
            j2 = j - this.A02;
        } else {
            j2 = j;
        }
        this.A00 = j;
        this.A01 = j2;
        return j2;
    }
}
