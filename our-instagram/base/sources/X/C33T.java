package X;

import android.os.SystemClock;

/* renamed from: X.33T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33T {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public final C13920nI A05 = C13920nI.A00;

    public final void A00(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.A03;
        long j2 = 0;
        if (j != 0) {
            long j3 = elapsedRealtime - j;
            if (j3 != 0) {
                j2 = (i * 1000) / j3;
            }
        }
        this.A04 = j2;
        this.A03 = elapsedRealtime;
    }
}
