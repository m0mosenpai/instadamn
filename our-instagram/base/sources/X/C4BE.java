package X;

import com.google.android.exoplayer2.util.Util;
import java.util.List;

/* renamed from: X.4BE, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BE extends AbstractC92194Az {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List A06;
    public final long A07;

    public C4BE(C4B0 c4b0, List list, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        super(c4b0, j, j2);
        this.A05 = j3;
        this.A02 = j4;
        this.A06 = list;
        this.A01 = j5;
        this.A07 = j6;
        this.A04 = j7;
        this.A00 = i;
        this.A03 = j8;
    }

    public C4B0 A06(C4BB c4bb, long j) {
        CU5 cu5;
        long j2 = j;
        C4BD c4bd = (C4BD) this;
        long j3 = 0;
        if (c4bd.A06 != null) {
            CS4 cs4 = c4bd.A00;
            if (cs4 == null || !c4bd.A03) {
                int i = (int) (j - c4bd.A05);
                if (!c4bd.A07(i).A05 || cs4 == null) {
                    j3 = c4bd.A07(i).A04;
                }
            }
            j2 = c4bd.A00(j);
            cu5 = cs4.A03;
            C4B6 c4b6 = c4bb.A02;
            return new C4B0(cu5.A00(c4b6.A0T, c4b6.A05, j2, j3), 0L, -1L);
        }
        j3 = (j - c4bd.A05) * ((C4BE) c4bd).A02;
        cu5 = c4bd.A02;
        C4B6 c4b62 = c4bb.A02;
        return new C4B0(cu5.A00(c4b62.A0T, c4b62.A05, j2, j3), 0L, -1L);
    }

    public final int A00(long j) {
        C4BD c4bd;
        List list;
        CS4 cs4;
        if ((this instanceof C4BD) && (list = (c4bd = (C4BD) this).A06) != null && (cs4 = c4bd.A00) != null) {
            int i = (int) (j - c4bd.A05);
            int i2 = ((C4BE) c4bd).A00;
            if (i2 != list.size()) {
                if (i >= i2) {
                    return ((C23012ACm) list.get(list.size() - 1)).A00 + (i - i2) + 1;
                }
                return c4bd.A07(i).A00;
            }
            return ((i + cs4.A01) - i2) + 1;
        }
        return -1;
    }

    public long A01(long j) {
        int i;
        if (this.A06 != null) {
            i = this.A00;
        } else if (j != -9223372036854775807L) {
            long j2 = (this.A02 * 1000000) / super.A01;
            i = (int) (((j + j2) - 1) / j2);
        } else {
            return -1L;
        }
        return i;
    }

    public final long A02(long j) {
        long j2;
        List list = this.A06;
        long j3 = j - this.A05;
        if (list != null) {
            j2 = A07((int) j3).A04 - super.A00;
        } else {
            j2 = j3 * this.A02;
        }
        return Util.A09(j2, 1000000L, super.A01);
    }

    public final long A04(long j, long j2) {
        long j3;
        if (this.A06 != null) {
            j3 = A07((int) (j - this.A05)).A03;
        } else {
            long A01 = A01(j2);
            if (A01 != -1 && j == (this.A05 + A01) - 1) {
                return j2 - A02(j);
            }
            j3 = this.A02;
        }
        return (j3 * 1000000) / super.A01;
    }

    public final long A05(long j, long j2) {
        long j3 = this.A05;
        long A01 = A01(j2);
        if (A01 != 0) {
            if (this.A06 == null) {
                long j4 = j3 + (j / ((this.A02 * 1000000) / super.A01));
                if (j4 >= j3) {
                    if (A01 == -1) {
                        return j4;
                    }
                    return Math.min(j4, (j3 + A01) - 1);
                }
            } else {
                long j5 = (A01 + j3) - 1;
                long j6 = j3;
                while (j6 <= j5) {
                    long j7 = ((j5 - j6) / 2) + j6;
                    long A02 = A02(j7);
                    if (A02 < j) {
                        j6 = j7 + 1;
                    } else if (A02 > j) {
                        j5 = j7 - 1;
                    } else {
                        return j7;
                    }
                }
                if (j6 == j3) {
                    return j6;
                }
                return j5;
            }
        }
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (r2 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (r1 > r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r14 = r7.A04;
        r0 = r7.A03;
        r12 = r7.A01;
        r6 = r6 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return new X.C23012ACm(1, r12, (r7.A00 - (r7.A02 - 1)) + r6, r14 + (r0 * r6), r0, r7.A05);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C23012ACm A07(int r20) {
        /*
            r19 = this;
            r0 = r19
            r6 = r20
            int r1 = r0.A00
            java.util.List r8 = r0.A06
            int r0 = r8.size()
            java.lang.String r4 = "SegmentTemplate"
            r11 = 1
            if (r1 != r0) goto L21
            if (r6 < r1) goto L1a
            int r6 = r1 + (-1)
            java.lang.String r0 = "index was past bounds of the list, so clamping to final element"
            android.util.Log.w(r4, r0)
        L1a:
            java.lang.Object r10 = r8.get(r6)
            X.ACm r10 = (X.C23012ACm) r10
            return r10
        L21:
            int r10 = r8.size()
            int r10 = r10 - r11
            r9 = 0
            java.lang.Object r0 = r8.get(r9)
            X.ACm r0 = (X.C23012ACm) r0
            int r0 = r0.A01
            int r6 = r20 + r0
            r5 = 0
        L32:
            java.lang.String r3 = "Segment Index out of Segment Timeline bounds"
            r0 = 2
            if (r5 > r10) goto L7d
            int r2 = r5 + r10
            int r2 = r2 / r0
            java.lang.Object r7 = r8.get(r2)
            X.ACm r7 = (X.C23012ACm) r7
            int r1 = r7.A01
            int r0 = r7.A02
            int r0 = r0 + r1
            if (r0 > r6) goto L4a
            int r5 = r2 + 1
            goto L32
        L4a:
            if (r0 <= r6) goto L53
            if (r2 == 0) goto L53
            if (r1 <= r6) goto L53
            int r10 = r2 + (-1)
            goto L32
        L53:
            if (r0 <= r6) goto L77
            if (r2 == 0) goto L59
            if (r1 > r6) goto L77
        L59:
            long r14 = r7.A04
            long r0 = r7.A03
            int r12 = r7.A01
            int r6 = r6 - r12
            long r4 = (long) r6
            long r2 = r0 * r4
            long r14 = r14 + r2
            boolean r3 = r7.A05
            int r13 = r7.A00
            int r2 = r7.A02
            int r2 = r2 - r11
            int r13 = r13 - r2
            int r13 = r13 + r6
            X.ACm r10 = new X.ACm
            r18 = r3
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r16, r18)
            return r10
        L77:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r3)
            throw r0
        L7d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            int r0 = r8.size()
            r1 = -1
            if (r0 <= 0) goto Lc6
            java.lang.Object r0 = r8.get(r9)
            X.ACm r0 = (X.C23012ACm) r0
            int r0 = r0.A01
        L90:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r8.size()
            if (r0 <= 0) goto La7
            int r0 = r8.size()
            int r0 = r0 - r11
            java.lang.Object r0 = r8.get(r0)
            X.ACm r0 = (X.C23012ACm) r0
            int r1 = r0.A01
        La7:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r0 = r8.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1, r0}
            java.lang.String r0 = "Search Fail; Index: %d, Start relative index: %d, End relative index: %d, Segment Timeline Size: %d"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.w(r4, r0)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r3)
            throw r0
        Lc6:
            r0 = -1
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4BE.A07(int):X.ACm");
    }

    public boolean A08() {
        if (this.A06 == null) {
            return false;
        }
        return true;
    }

    public final long A03(long j, long j2) {
        if (A01(j) == -1) {
            long j3 = this.A07;
            if (j3 != -9223372036854775807L) {
                return Math.max(this.A05, A05((j2 - this.A04) - j3, j));
            }
        }
        return this.A05;
    }
}
