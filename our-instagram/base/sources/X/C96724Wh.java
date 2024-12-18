package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4Wh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96724Wh {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C4YN A04;
    public C4YN A05;
    public C4YN A06;
    public Object A07;
    public boolean A08;
    public final C4WJ A09 = new C4WJ();
    public final C96604Vv A0A = new C96604Vv();

    public static C4YM A00(C4YN c4yn, C96724Wh c96724Wh, Timeline timeline, long j) {
        long j2;
        Object obj;
        int i;
        C4YM c4ym = c4yn.A02;
        boolean z = c4ym.A07;
        C4WX c4wx = c4ym.A04;
        if (z) {
            int A06 = timeline.A06(c4wx.A04);
            C4WJ c4wj = c96724Wh.A09;
            C96604Vv c96604Vv = c96724Wh.A0A;
            int A05 = timeline.A05(c4wj, c96604Vv, A06, c96724Wh.A01, c96724Wh.A08);
            if (A05 == -1) {
                return null;
            }
            int i2 = timeline.A0D(c4wj, A05, true).A00;
            Object obj2 = c4wj.A05;
            long j3 = c4ym.A04.A03;
            long j4 = 0;
            if (timeline.A0E(c96604Vv, i2, 0L).A00 == A05) {
                Pair A0A = timeline.A0A(c4wj, c96604Vv, i2, -9223372036854775807L, Math.max(0L, (c4yn.A00 + c4ym.A00) - j));
                if (A0A == null) {
                    return null;
                }
                obj2 = A0A.first;
                j4 = ((Number) A0A.second).longValue();
                C4YN c4yn2 = c4yn.A01;
                if (c4yn2 != null && c4yn2.A09.equals(obj2)) {
                    j3 = c4yn2.A02.A04.A03;
                } else {
                    j3 = c96724Wh.A02;
                    c96724Wh.A02 = 1 + j3;
                }
            }
            timeline.A0B(c4wj, obj2);
            C4WY c4wy = new C4WY(obj2, -1, -1, -1, j3);
            Object obj3 = c4wy.A04;
            timeline.A0B(c4wj, obj3);
            return A02(c96724Wh, timeline, obj3, j4, c4wy.A03);
        }
        Object obj4 = c4wx.A04;
        C4WJ c4wj2 = c96724Wh.A09;
        timeline.A0B(c4wj2, obj4);
        int i3 = c4wx.A00;
        if (i3 != -1) {
            C4WK c4wk = c4wj2.A03;
            int i4 = c4wx.A01;
            C4WL A00 = c4wk.A00(i3);
            do {
                i4++;
                int[] iArr = A00.A00;
                if (i4 < iArr.length) {
                    i = iArr[i4];
                    if (i == 0) {
                        break;
                    }
                } else {
                    break;
                }
            } while (i != 1);
            if (i4 < 0) {
                if (c4wk.A00[i3].A00[i4] == 0) {
                    return null;
                }
                return A01(c96724Wh, timeline, c4wx.A04, i3, i4, c4ym.A02, c4wx.A03);
            }
            obj = c4wx.A04;
            j2 = c4ym.A02;
        } else {
            j2 = c4ym.A01;
            if (j2 == Long.MIN_VALUE) {
                return null;
            }
            obj = c4wx.A04;
        }
        return A02(c96724Wh, timeline, obj, j2, c4wx.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.4WX, X.4WY] */
    public static C4YM A01(C96724Wh c96724Wh, Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        ?? c4wy = new C4WY(obj, i, i2, -1, j2);
        Object obj2 = c4wy.A04;
        C4WJ c4wj = c96724Wh.A09;
        timeline.A0B(c4wj, obj2);
        return new C4YM(c4wy, 0L, Long.MIN_VALUE, j, timeline.A0B(c4wj, obj2).A01(c4wy.A00, c4wy.A01), c96724Wh.A04(timeline, c4wy));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.4WX, X.4WY] */
    public static C4YM A02(C96724Wh c96724Wh, Timeline timeline, Object obj, long j, long j2) {
        ?? c4wy = new C4WY(obj, -1, -1, -1, j2);
        Object obj2 = c4wy.A04;
        C4WJ c4wj = c96724Wh.A09;
        timeline.A0B(c4wj, obj2);
        timeline.A0B(c4wj, obj2);
        return new C4YM(c4wy, j, Long.MIN_VALUE, -9223372036854775807L, c4wj.A01, c96724Wh.A04(timeline, c4wy));
    }

    public final boolean A09(C4YN c4yn) {
        boolean z = false;
        boolean z2 = false;
        if (c4yn != null) {
            z2 = true;
        }
        C4B8.A04(z2);
        this.A04 = c4yn;
        while (c4yn.A01 != null) {
            c4yn = c4yn.A01;
            if (c4yn == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c4yn.A03();
            this.A00--;
        }
        C4YN c4yn2 = this.A04;
        if (null != c4yn2.A01) {
            c4yn2.A01 = null;
        }
        return z;
    }

    public static boolean A03(C96724Wh c96724Wh, Timeline timeline) {
        C4YN c4yn;
        C4YN c4yn2 = c96724Wh.A05;
        if (c4yn2 == null) {
            c4yn2 = c96724Wh.A04;
        }
        if (c4yn2 == null) {
            return true;
        }
        int A06 = timeline.A06(c4yn2.A09);
        while (true) {
            A06 = timeline.A05(c96724Wh.A09, c96724Wh.A0A, A06, c96724Wh.A01, c96724Wh.A08);
            while (true) {
                c4yn = c4yn2.A01;
                if (c4yn == null || c4yn2.A02.A07) {
                    break;
                }
                c4yn2 = c4yn;
            }
            if (A06 == -1 || c4yn == null || timeline.A06(c4yn.A09) != A06) {
                break;
            }
            c4yn2 = c4yn;
        }
        boolean A09 = c96724Wh.A09(c4yn2);
        c4yn2.A02 = c96724Wh.A06(c4yn2.A02, timeline);
        if (!A09 || c96724Wh.A05 == null) {
            return true;
        }
        return false;
    }

    private boolean A04(Timeline timeline, C4WX c4wx) {
        int A06 = timeline.A06(c4wx.A04);
        C4WJ c4wj = this.A09;
        int i = timeline.A0D(c4wj, A06, false).A00;
        C96604Vv c96604Vv = this.A0A;
        if (!timeline.A0E(c96604Vv, i, 0L).A0D && timeline.A05(c4wj, c96604Vv, A06, this.A01, this.A08) == -1) {
            return true;
        }
        return false;
    }

    public final C4YN A05() {
        C4YN c4yn = this.A05;
        if (c4yn != null) {
            if (c4yn == this.A06) {
                this.A06 = c4yn.A01;
            }
            c4yn.A03();
            C4YN c4yn2 = this.A05.A01;
            this.A05 = c4yn2;
            int i = this.A00 - 1;
            this.A00 = i;
            if (i == 0) {
                this.A04 = null;
            }
            return c4yn2;
        }
        C4YN c4yn3 = this.A04;
        this.A05 = c4yn3;
        this.A06 = c4yn3;
        return c4yn3;
    }

    public final C4YM A06(C4YM c4ym, Timeline timeline) {
        long j;
        long j2 = c4ym.A01;
        C4WX c4wx = c4ym.A04;
        Object obj = c4wx.A04;
        C4WJ c4wj = this.A09;
        timeline.A0B(c4wj, obj);
        boolean A04 = A04(timeline, c4wx);
        timeline.A0B(c4wj, obj);
        int i = c4wx.A00;
        if (i != -1) {
            j = c4wj.A01(i, c4wx.A01);
        } else if (j2 == Long.MIN_VALUE) {
            j = c4wj.A01;
        } else {
            j = j2;
        }
        return new C4YM(c4wx, c4ym.A03, j2, c4ym.A02, j, A04);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.4WX, X.4WY] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004a -> B:14:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4WX A07(com.google.android.exoplayer2.Timeline r12, java.lang.Object r13) {
        /*
            r11 = this;
            X.4WJ r2 = r11.A09
            r5 = r13
            X.4WJ r0 = r12.A0B(r2, r13)
            int r4 = r0.A00
            java.lang.Object r0 = r11.A07
            r6 = -1
            if (r0 == 0) goto L2a
            int r1 = r12.A06(r0)
            if (r1 == r6) goto L2a
            r0 = 0
            X.4WJ r0 = r12.A0D(r2, r1, r0)
            int r0 = r0.A00
            if (r0 != r4) goto L2a
            long r9 = r11.A03
        L1f:
            r12.A0B(r2, r13)
            X.4WX r4 = new X.4WX
            r7 = r6
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L2a:
            X.4YN r3 = r11.A05
            if (r3 != 0) goto L42
            X.4YN r3 = r11.A04
        L30:
            if (r3 != 0) goto L42
            X.4YN r3 = r11.A05
            if (r3 != 0) goto L4d
            X.4YN r3 = r11.A04
        L38:
            if (r3 != 0) goto L4d
            long r9 = r11.A02
            r0 = 1
            long r0 = r0 + r9
            r11.A02 = r0
            goto L1f
        L42:
            java.lang.Object r0 = r3.A09
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L5e
            X.4YN r3 = r3.A01
            goto L30
        L4d:
            java.lang.Object r0 = r3.A09
            int r1 = r12.A06(r0)
            if (r1 == r6) goto L65
            r0 = 0
            X.4WJ r0 = r12.A0D(r2, r1, r0)
            int r0 = r0.A00
            if (r0 != r4) goto L65
        L5e:
            X.4YM r0 = r3.A02
            X.4WX r0 = r0.A04
            long r9 = r0.A03
            goto L1f
        L65:
            X.4YN r3 = r3.A01
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96724Wh.A07(com.google.android.exoplayer2.Timeline, java.lang.Object):X.4WX");
    }

    public final void A08(boolean z) {
        Object obj;
        C4YN c4yn = this.A05;
        if (c4yn == null) {
            c4yn = this.A04;
        }
        if (c4yn != null) {
            if (z) {
                obj = c4yn.A09;
            } else {
                obj = null;
            }
            this.A07 = obj;
            this.A03 = c4yn.A02.A04.A03;
            c4yn.A03();
            A09(c4yn);
        } else if (!z) {
            this.A07 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }
}
