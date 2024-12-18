package X;

import android.os.SystemClock;

/* renamed from: X.3m5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82413m5 {
    public double A00;
    public double A01;
    public long A02;
    public long A03;

    public final void A00(double d) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d > this.A00) {
            this.A00 = d;
        }
        long j = this.A03;
        if (j != 0) {
            long j2 = elapsedRealtime - j;
            this.A02 += j2;
            this.A01 += d * j2;
        }
        this.A03 = elapsedRealtime;
    }
}
