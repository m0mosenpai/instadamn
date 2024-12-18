package X;

import android.os.SystemClock;

/* renamed from: X.0Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04280Ku {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass091 A07;
    public boolean A08;
    public boolean A09;
    public final Object A0A;

    public final synchronized long A00() {
        long j;
        j = 0;
        if (!this.A09 && !this.A08) {
            j = SystemClock.uptimeMillis() - this.A01;
        }
        return j;
    }

    public C04280Ku(long j) {
        this.A05 = 0L;
        this.A0A = new Object();
        this.A09 = true;
    }

    public C04280Ku() {
        this(0L);
    }
}
