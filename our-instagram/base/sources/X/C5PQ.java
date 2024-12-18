package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.common.collect.ImmutableList;

/* renamed from: X.5PQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PQ {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C4YN A04;
    public C4YN A05;
    public C4YN A06;
    public Object A07;
    public boolean A08;
    public final int A09;
    public final C4WJ A0A = new C4WJ();
    public final C96604Vv A0B = new C96604Vv();
    public final C4W8 A0C;
    public final InterfaceC96774Wm A0D;

    /* JADX WARN: Type inference failed for: r6v0, types: [X.4WX, X.4WY] */
    public static C4YM A01(C5PQ c5pq, Timeline timeline, Object obj, int i, int i2, long j, long j2) {
        long j3;
        ?? c4wy = new C4WY(obj, i, i2, -1, j2);
        long A01 = timeline.A0B(c5pq.A0A, c4wy.A04).A01(c4wy.A00, c4wy.A01);
        if (A01 != -9223372036854775807L && 0 >= A01) {
            j3 = Math.max(0L, A01 - 1);
        } else {
            j3 = 0;
        }
        return new C4YM(c4wy, j3, j, -9223372036854775807L, A01, false, false, false, false);
    }

    public final boolean A0A(C4YN c4yn) {
        boolean z = false;
        boolean z2 = false;
        if (c4yn != null) {
            z2 = true;
        }
        C4B8.A04(z2);
        if (!c4yn.equals(this.A04)) {
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
            A03(this);
        }
        return z;
    }

    public static C4YM A00(C4YN c4yn, C5PQ c5pq, Timeline timeline, long j) {
        int i;
        long j2;
        C4YM c4ym = c4yn.A02;
        long j3 = c4yn.A00;
        long j4 = c4ym.A00;
        long j5 = (j3 + j4) - j;
        if (c4ym.A07) {
            C4WX c4wx = c4ym.A04;
            Object obj = c4wx.A04;
            int A06 = timeline.A06(obj);
            C4WJ c4wj = c5pq.A0A;
            C96604Vv c96604Vv = c5pq.A0B;
            int A05 = timeline.A05(c4wj, c96604Vv, A06, c5pq.A01, c5pq.A08);
            if (A05 == -1) {
                return null;
            }
            int i2 = timeline.A0D(c4wj, A05, true).A00;
            Object obj2 = c4wj.A05;
            obj2.getClass();
            long j6 = c4wx.A03;
            long j7 = 0;
            if (timeline.A0E(c96604Vv, i2, 0L).A00 == A05) {
                Pair A0A = timeline.A0A(c4wj, c96604Vv, i2, -9223372036854775807L, Math.max(0L, j5));
                if (A0A == null) {
                    return null;
                }
                obj2 = A0A.first;
                j7 = ((Number) A0A.second).longValue();
                C4YN c4yn2 = c4yn.A01;
                if (c4yn2 != null && c4yn2.A09.equals(obj2)) {
                    j6 = c4yn2.A02.A04.A03;
                } else {
                    j6 = c5pq.A02;
                    c5pq.A02 = 1 + j6;
                }
                j2 = -9223372036854775807L;
            } else {
                j2 = 0;
            }
            timeline.A0B(c4wj, obj2);
            timeline.A0E(c96604Vv, c4wj.A00, 0L);
            timeline.A06(obj2);
            timeline.A0B(c4wj, obj2);
            C4WY c4wy = new C4WY(obj2, -1, -1, -1, j6);
            if (j2 != -9223372036854775807L && c4ym.A02 != -9223372036854775807L) {
                timeline.A0B(c4wj, obj);
            }
            Object obj3 = c4wy.A04;
            timeline.A0B(c4wj, obj3);
            return A02(c5pq, timeline, obj3, j7, j2, c4wy.A03);
        }
        C4WX c4wx2 = c4ym.A04;
        Object obj4 = c4wx2.A04;
        C4WJ c4wj2 = c5pq.A0A;
        timeline.A0B(c4wj2, obj4);
        int i3 = c4wx2.A00;
        if (i3 != -1) {
            C4WK c4wk = c4wj2.A03;
            int i4 = c4wx2.A01;
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
                return A01(c5pq, timeline, obj4, i3, i4, c4ym.A02, c4wx2.A03);
            }
            long j8 = c4ym.A02;
            if (j8 == -9223372036854775807L) {
                Pair A0A2 = timeline.A0A(c4wj2, c5pq.A0B, c4wj2.A00, -9223372036854775807L, Math.max(0L, j5));
                if (A0A2 == null) {
                    return null;
                }
                j8 = ((Number) A0A2.second).longValue();
            }
            timeline.A0B(c4wj2, obj4);
            return A02(c5pq, timeline, obj4, Math.max(0L, j8), j8, c4wx2.A03);
        }
        int i5 = c4wx2.A02;
        int A002 = c4wj2.A00(i5);
        if (A002 != 0) {
            return A01(c5pq, timeline, obj4, i5, A002, j4, c4wx2.A03);
        }
        timeline.A0B(c4wj2, obj4);
        return A02(c5pq, timeline, obj4, 0L, j4, c4wx2.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.4WX, X.4WY] */
    public static C4YM A02(C5PQ c5pq, Timeline timeline, Object obj, long j, long j2, long j3) {
        long j4 = j;
        C4WJ c4wj = c5pq.A0A;
        timeline.A0B(c4wj, obj);
        ?? c4wy = new C4WY(obj, -1, -1, -1, j3);
        boolean z = false;
        Object obj2 = c4wy.A04;
        int i = timeline.A0B(c4wj, obj2).A00;
        if (timeline.A0E(c5pq.A0B, i, 0L).A01 == timeline.A06(obj2)) {
            z = true;
        }
        boolean A05 = c5pq.A05(timeline, c4wy, true);
        long j5 = c4wj.A01;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = Math.max(0L, j5 - 1);
        }
        return new C4YM(c4wy, j4, j2, -9223372036854775807L, j5, false, true, z, A05);
    }

    public static boolean A04(C5PQ c5pq, Timeline timeline) {
        C4YN c4yn;
        C4YN c4yn2 = c5pq.A05;
        if (c4yn2 == null) {
            return true;
        }
        int A06 = timeline.A06(c4yn2.A09);
        while (true) {
            A06 = timeline.A05(c5pq.A0A, c5pq.A0B, A06, c5pq.A01, c5pq.A08);
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
        boolean A0A = c5pq.A0A(c4yn2);
        c4yn2.A02 = c5pq.A07(c4yn2.A02, timeline);
        return !A0A;
    }

    private boolean A05(Timeline timeline, C4WX c4wx, boolean z) {
        int A06 = timeline.A06(c4wx.A04);
        C4WJ c4wj = this.A0A;
        int i = timeline.A0D(c4wj, A06, false).A00;
        C96604Vv c96604Vv = this.A0B;
        if (!timeline.A0E(c96604Vv, i, 0L).A0D && timeline.A05(c4wj, c96604Vv, A06, this.A01, this.A08) == -1 && z) {
            return true;
        }
        return false;
    }

    public final C4YN A06() {
        C4YN c4yn = this.A05;
        if (c4yn == null) {
            return null;
        }
        if (c4yn == this.A06) {
            this.A06 = c4yn.A01;
        }
        c4yn.A03();
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            this.A04 = null;
            C4YN c4yn2 = this.A05;
            this.A07 = c4yn2.A09;
            this.A03 = c4yn2.A02.A04.A03;
        }
        this.A05 = this.A05.A01;
        A03(this);
        return this.A05;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r11 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r12.A02 != (-1)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r12.A02 != (-1)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4YM A07(X.C4YM r26, com.google.android.exoplayer2.Timeline r27) {
        /*
            r25 = this;
            r3 = r26
            X.4WX r12 = r3.A04
            int r5 = r12.A00
            r4 = -1
            r11 = 0
            if (r5 == r4) goto Lb
            r11 = 1
        Lb:
            if (r11 != 0) goto L12
            int r0 = r12.A02
            r2 = 1
            if (r0 == r4) goto L13
        L12:
            r2 = 0
        L13:
            if (r5 != r4) goto L1a
            int r0 = r12.A02
            r1 = 1
            if (r0 == r4) goto L1b
        L1a:
            r1 = 0
        L1b:
            r23 = 0
            r10 = r25
            r9 = r27
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r12.A04
            X.4WJ r0 = r10.A0A
            X.4WJ r0 = r9.A0B(r0, r1)
            int r8 = r0.A00
            int r7 = r9.A06(r1)
            X.4Vv r6 = r10.A0B
            r0 = 0
            X.4Vv r0 = r9.A0E(r6, r8, r0)
            int r0 = r0.A01
            if (r0 != r7) goto L3f
            r23 = 1
        L3f:
            boolean r24 = r10.A05(r9, r12, r2)
            java.lang.Object r0 = r12.A04
            X.4WJ r6 = r10.A0A
            r9.A0B(r6, r0)
            if (r11 != 0) goto L66
            int r1 = r12.A02
            if (r1 == r4) goto L66
            r17 = 0
            r0 = 0
        L54:
            int r5 = r12.A02
        L56:
            r21 = 0
            long r13 = r3.A03
            long r15 = r3.A02
            X.4YM r11 = new X.4YM
            r22 = r2
            r19 = r0
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r11
        L66:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r11 == 0) goto L76
            int r0 = r12.A01
            long r0 = r6.A01(r5, r0)
        L73:
            if (r11 == 0) goto L54
            goto L56
        L76:
            long r0 = r6.A01
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5PQ.A07(X.4YM, com.google.android.exoplayer2.Timeline):X.4YM");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [X.4WX, X.4WY] */
    public final C4WX A08(Timeline timeline, Object obj) {
        long j;
        int A06;
        C4WJ c4wj = this.A0A;
        int i = timeline.A0B(c4wj, obj).A00;
        Object obj2 = this.A07;
        if (obj2 != null && (A06 = timeline.A06(obj2)) != -1 && timeline.A0D(c4wj, A06, false).A00 == i) {
            j = this.A03;
        } else {
            C4YN c4yn = this.A05;
            while (true) {
                if (c4yn != null) {
                    if (c4yn.A09.equals(obj)) {
                        break;
                    }
                    c4yn = c4yn.A01;
                } else {
                    c4yn = this.A05;
                    while (c4yn != null) {
                        int A062 = timeline.A06(c4yn.A09);
                        if (A062 == -1 || timeline.A0D(c4wj, A062, false).A00 != i) {
                            c4yn = c4yn.A01;
                        }
                    }
                    j = this.A02;
                    this.A02 = 1 + j;
                    if (this.A05 == null) {
                        this.A07 = obj;
                        this.A03 = j;
                    }
                }
            }
            j = c4yn.A02.A04.A03;
        }
        timeline.A0B(c4wj, obj);
        int i2 = c4wj.A00;
        C96604Vv c96604Vv = this.A0B;
        timeline.A0E(c96604Vv, i2, 0L);
        for (int A063 = timeline.A06(obj); A063 >= c96604Vv.A00; A063--) {
            timeline.A0D(c4wj, A063, true);
        }
        timeline.A0B(c4wj, obj);
        timeline.A0E(c96604Vv, c4wj.A00, 0L);
        timeline.A06(obj);
        timeline.A0B(c4wj, obj);
        return new C4WY(obj, -1, -1, -1, j);
    }

    public final void A09() {
        if (this.A00 != 0) {
            C4YN c4yn = this.A05;
            C4B8.A01(c4yn);
            this.A07 = c4yn.A09;
            this.A03 = c4yn.A02.A04.A03;
            do {
                c4yn.A03();
                c4yn = c4yn.A01;
            } while (c4yn != null);
            this.A05 = null;
            this.A04 = null;
            this.A06 = null;
            this.A00 = 0;
            A03(this);
        }
    }

    public C5PQ(C4W8 c4w8, InterfaceC96774Wm interfaceC96774Wm) {
        this.A0C = c4w8;
        this.A0D = interfaceC96774Wm;
        int A00 = C2C5.A00(C2C6.A03);
        this.A09 = A00 >= 0 ? Math.min(A00, 100) : 100;
    }

    public static void A03(final C5PQ c5pq) {
        final C4WX c4wx;
        final ImmutableList.Builder builder = ImmutableList.builder();
        for (C4YN c4yn = c5pq.A05; c4yn != null; c4yn = c4yn.A01) {
            builder.add((Object) c4yn.A02.A04);
        }
        C4YN c4yn2 = c5pq.A06;
        if (c4yn2 == null) {
            c4wx = null;
        } else {
            c4wx = c4yn2.A02.A04;
        }
        InterfaceC96774Wm interfaceC96774Wm = c5pq.A0D;
        ((C96764Wl) interfaceC96774Wm).A00.post(new Runnable() { // from class: X.5Pz
            @Override // java.lang.Runnable
            public final void run() {
                builder.build();
            }
        });
    }
}
