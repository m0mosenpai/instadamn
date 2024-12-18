package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.5nz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126635nz extends Timeline {
    public static final C4W2 A07;
    public static final Object A08 = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C4W5 A04;
    public final C4W2 A05;
    public final boolean A06;

    @Deprecated
    public C126635nz(long j) {
        C96614Vw c96614Vw = new C96614Vw(A07);
        c96614Vw.A05 = null;
        C4W2 A00 = c96614Vw.A00();
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = j;
        this.A02 = j;
        this.A06 = true;
        this.A05 = A00;
        this.A04 = null;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A01() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A02() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object A0C(int i) {
        C4B8.A00(i, 1);
        return A08;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
        Object obj;
        C4B8.A00(i, 1);
        if (z) {
            obj = A08;
        } else {
            obj = null;
        }
        c4wj.A02(this.A00, null, 0L, obj);
        return c4wj;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C96604Vv A0E(C96604Vv c96604Vv, int i, long j) {
        C4B8.A00(i, 1);
        Object obj = C96604Vv.A0H;
        c96604Vv.A00(null, this.A05, obj, null, 0, this.A01, this.A03, -9223372036854775807L, 0L, this.A02, 0L, this.A06, false);
        return c96604Vv;
    }

    static {
        C96614Vw c96614Vw = new C96614Vw();
        c96614Vw.A07 = "SinglePeriodTimeline";
        c96614Vw.A00 = android.net.Uri.EMPTY;
        A07 = c96614Vw.A00();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int A06(Object obj) {
        if (!A08.equals(obj)) {
            return -1;
        }
        return 0;
    }

    public C126635nz(C4W2 c4w2, long j, boolean z, boolean z2) {
        C4W5 c4w5;
        if (z2) {
            c4w5 = c4w2.A02;
        } else {
            c4w5 = null;
        }
        this.A01 = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = j;
        this.A02 = j;
        this.A06 = z;
        this.A05 = c4w2;
        this.A04 = c4w5;
    }
}
