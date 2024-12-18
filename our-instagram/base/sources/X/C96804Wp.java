package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96804Wp extends Timeline {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C92124As A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C4W5 A08;
    public final C4W2 A09;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r8.A06 != (-9223372036854775807L)) goto L19;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C96604Vv A0E(X.C96604Vv r37, int r38, long r39) {
        /*
            r36 = this;
            r6 = 0
            r15 = 1
            r0 = r38
            X.C4B8.A00(r0, r15)
            r9 = r36
            long r0 = r9.A02
            X.4As r8 = r9.A04
            boolean r10 = r8.A0R
            if (r10 == 0) goto L35
            long r2 = r8.A0A
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 == 0) goto L35
            long r2 = r8.A06
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L35
            r13 = 0
            int r2 = (r39 > r13 ? 1 : (r39 == r13 ? 0 : -1))
            if (r2 <= 0) goto L7c
            long r0 = r0 + r39
            long r2 = r9.A03
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L7c
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L35:
            java.lang.Object r19 = X.C96604Vv.A0H
            X.4W2 r2 = r9.A09
            r18 = r2
            long r13 = r9.A06
            long r11 = r9.A07
            long r6 = r9.A05
            if (r10 == 0) goto L56
            long r2 = r8.A0A
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r4 == 0) goto L56
            long r2 = r8.A06
            int r4 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            r35 = 1
            if (r4 == 0) goto L58
        L56:
            r35 = 0
        L58:
            X.4W5 r10 = r9.A08
            long r4 = r9.A03
            int r2 = r9.A01()
            int r21 = r2 + (-1)
            long r2 = r9.A01
            r16 = r37
            r22 = r13
            r24 = r11
            r26 = r6
            r28 = r0
            r30 = r4
            r32 = r2
            r34 = r15
            r17 = r10
            r20 = r8
            r16.A00(r17, r18, r19, r20, r21, r22, r24, r26, r28, r30, r32, r34, r35)
            return r37
        L7c:
            long r4 = r9.A01
            long r4 = r4 + r0
            long r2 = r8.A00(r6)
            r11 = 0
        L84:
            java.util.List r7 = r8.A0Q
            int r7 = r7.size()
            int r7 = r7 + (-1)
            if (r11 >= r7) goto L9a
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto L9a
            long r4 = r4 - r2
            int r11 = r11 + 1
            long r2 = r8.A00(r11)
            goto L84
        L9a:
            X.4BI r12 = r8.A02(r11)
            r7 = 2
            int r11 = r12.A00(r7)
            r7 = -1
            if (r11 == r7) goto L35
            java.util.List r7 = r12.A03
            java.lang.Object r7 = r7.get(r11)
            X.4BF r7 = (X.C4BF) r7
            java.util.List r7 = r7.A07
            java.lang.Object r6 = r7.get(r6)
            X.4BB r6 = (X.C4BB) r6
            X.4Yw r7 = r6.A00()
            if (r7 == 0) goto L35
            long r11 = r7.BsK(r2)
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 == 0) goto L35
            long r2 = r7.BsO(r4, r2)
            long r2 = r7.C8V(r2)
            long r0 = r0 + r2
            long r0 = r0 - r4
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96804Wp.A0E(X.4Vv, int, long):X.4Vv");
    }

    public C96804Wp(C4W5 c4w5, C4W2 c4w2, C92124As c92124As, int i, long j, long j2, long j3, long j4, long j5, long j6) {
        C4B8.A04(c92124As.A0R == (c4w5 != null));
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A00 = i;
        this.A01 = j4;
        this.A03 = j5;
        this.A02 = j6;
        this.A04 = c92124As;
        this.A09 = c4w2;
        this.A08 = c4w5;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
        String str;
        C4B8.A00(i, A01());
        Integer num = null;
        if (z) {
            str = this.A04.A02(i).A02;
            int i2 = this.A00;
            C4B8.A00(i, A01());
            num = Integer.valueOf(i2 + i);
        } else {
            str = null;
        }
        C92124As c92124As = this.A04;
        c4wj.A02(c92124As.A00(i), str, Util.A07(c92124As.A02(i).A00 - c92124As.A02(0).A00) - this.A01, num);
        return c4wj;
    }
}
