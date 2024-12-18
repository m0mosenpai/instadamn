package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4WW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4WW {
    public static final C4WX A0E = new C4WY(new Object(), -1, -1, -1, -1);
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C4WX A04;
    public final C4WX A05;
    public final C4WU A06;
    public final C4WI A07;
    public final Integer A08;
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4WW(com.google.android.exoplayer2.Timeline r21, X.C4WU r22, X.C4WI r23, long r24) {
        /*
            r20 = this;
            X.4WX r2 = X.C4WW.A0E
            java.lang.Integer r6 = X.C05F.A00
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            r18 = 0
            r0 = r20
            r1 = r21
            r4 = r22
            r5 = r23
            r8 = r24
            r3 = r2
            r12 = r8
            r14 = r8
            r16 = r8
            r19 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r16, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4WW.<init>(com.google.android.exoplayer2.Timeline, X.4WU, X.4WI, long):void");
    }

    public static void A00(C4WW c4ww, C4WW c4ww2) {
        c4ww2.A0C = c4ww.A0C;
        c4ww2.A0B = c4ww.A0B;
        c4ww2.A0D = c4ww.A0D;
    }

    public final C4WW A01(C4WX c4wx, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        if (c4wx.A00 == -1) {
            j4 = -9223372036854775807L;
        }
        int i = this.A00;
        boolean z = this.A0A;
        C4WU c4wu = this.A06;
        C4WI c4wi = this.A07;
        return new C4WW(timeline, c4wx, this.A04, c4wu, c4wi, C05F.A00, i, j, j4, this.A0B, j3, j, z, false);
    }

    public final C4WW A02(C4WU c4wu, C4WI c4wi) {
        Timeline timeline = this.A03;
        C4WX c4wx = this.A05;
        long j = this.A02;
        long j2 = this.A01;
        int i = this.A00;
        boolean z = this.A0A;
        C4WW c4ww = new C4WW(timeline, c4wx, this.A04, c4wu, c4wi, this.A08, i, j, j2, this.A0B, this.A0D, this.A0C, z, this.A09);
        A00(this, c4ww);
        return c4ww;
    }

    public C4WW(Timeline timeline, C4WX c4wx, C4WX c4wx2, C4WU c4wu, C4WI c4wi, Integer num, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A03 = timeline;
        this.A05 = c4wx;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i;
        this.A0A = z;
        this.A06 = c4wu;
        this.A07 = c4wi;
        this.A04 = c4wx2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = num;
        this.A09 = z2;
    }
}
