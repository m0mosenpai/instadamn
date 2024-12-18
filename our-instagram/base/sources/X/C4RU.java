package X;

import android.os.SystemClock;

/* renamed from: X.4RU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RU {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public C9C1 A0K;
    public String A0L;
    public String A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final String A0V;
    public final String A0W;

    public final long A00() {
        long j;
        boolean equals = "DASH_LIVE".equals(this.A0M);
        if (equals) {
            j = this.A0D;
        } else {
            j = this.A08;
        }
        if (!equals) {
            if (j < 0) {
                C0K8.A0P("ServicePlayerState", "negative position=%d", Long.valueOf(j));
                return 0L;
            }
            long j2 = this.A0U;
            if (j2 <= 0 || j <= j2) {
                return j;
            }
            C0K8.A0P("ServicePlayerState", "position=%d bigger than duration=%d", Long.valueOf(j), Long.valueOf(j2));
            return j2;
        }
        return j;
    }

    public C4RU(String str, String str2, String str3, float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0H = j;
        this.A0Q = z;
        this.A0R = z2;
        this.A0O = z3;
        this.A0U = j2;
        this.A09 = j3;
        this.A08 = j4;
        this.A0D = j5;
        this.A0B = j6;
        this.A0A = j7;
        this.A0I = j8;
        this.A0M = str;
        this.A0E = j9;
        this.A0F = j10;
        this.A05 = i;
        this.A04 = i2;
        this.A0C = j11;
        this.A0J = j12;
        this.A03 = i3;
        this.A06 = i4;
        this.A01 = i5;
        this.A02 = i6;
        this.A00 = f;
        System.currentTimeMillis();
        this.A07 = i7;
        this.A0N = z4;
        this.A0V = str2;
        this.A0T = i8;
        this.A0P = z5;
        this.A0S = z6;
        this.A0W = str3;
        this.A0G = SystemClock.uptimeMillis();
    }

    public C4RU() {
        this.A0H = 0L;
        this.A0Q = false;
        this.A0R = false;
        this.A0O = false;
        this.A0U = 0L;
        this.A09 = 0L;
        this.A08 = 0L;
        this.A0D = 0L;
        this.A0B = 0L;
        this.A0A = 0L;
        this.A0I = 0L;
        this.A0M = "";
        this.A0E = -1L;
        this.A0F = -1L;
        this.A05 = 0;
        this.A04 = 0;
        this.A0C = 0L;
        this.A0J = -1L;
        this.A03 = 0;
        this.A06 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        System.currentTimeMillis();
        this.A07 = 0;
        this.A0N = false;
        this.A0V = null;
        this.A0W = null;
        this.A0T = -1;
        this.A0P = false;
        this.A0S = false;
        this.A0L = "";
        this.A0K = null;
        this.A0G = SystemClock.uptimeMillis();
    }
}
