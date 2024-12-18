package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.0XP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XP {
    public static final C0XP A07 = new C0XP();
    public final AwakeTimeSinceBootClock A00;
    public final AbstractC208510h A01;
    public final C11C A02;
    public final C16040qz A03;
    public final C10390h6 A04;
    public final C0R9 A05;
    public final C0Xc[] A06;

    public final void A00(C0X2 c0x2, C0XJ c0xj, C0XX c0xx, String str, int i, long j, long j2, boolean z) {
        C0Xc[] c0XcArr;
        long nowNanos;
        C16040qz c16040qz = this.A03;
        if (c16040qz != null) {
            long A02 = c16040qz.A02(c0xx.getMarkerId(), c0xx.B6x());
            if (A02 != 0 && (c0XcArr = c16040qz.A02) != null) {
                long j3 = 1;
                if (c0x2 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = c16040qz.A01.nowNanos();
                }
                int i2 = 0;
                while (i2 < c0XcArr.length) {
                    if ((A02 & j3) != 0) {
                        c0XcArr[i2].onMarkerPoint(c0xx, str, c0xj, j, j2, z, i);
                        if (c0x2 != null) {
                            long nowNanos2 = c16040qz.A01.nowNanos();
                            c0x2.A00(c0XcArr[i2].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i2++;
                    j3 <<= 1;
                }
            }
        }
    }

    public final void A01(C0X2 c0x2, C0XX c0xx) {
        long A02;
        C0Xc[] c0XcArr;
        long nowNanos;
        C16040qz c16040qz = this.A03;
        if (c16040qz != null) {
            C0XG BdP = c0xx.BdP();
            if (BdP == null) {
                A02 = c16040qz.A02(c0xx.getMarkerId(), c0xx.B6x());
            } else {
                A02 = c16040qz.A02(BdP.A00, c0xx.B6x()) | c16040qz.A02(BdP.A01, c0xx.B6x());
            }
            if (A02 != 0 && (c0XcArr = c16040qz.A02) != null) {
                long j = 1;
                if (c0x2 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = c16040qz.A01.nowNanos();
                }
                int i = 0;
                while (i < c0XcArr.length) {
                    if ((A02 & j) != 0) {
                        c0XcArr[i].onMarkerAnnotate(c0xx);
                        if (c0x2 != null) {
                            long nowNanos2 = c16040qz.A01.nowNanos();
                            c0x2.A00(c0XcArr[i].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i++;
                    j <<= 1;
                }
            }
        }
    }

    public final void A02(C0X2 c0x2, RunnableC16080r6 runnableC16080r6) {
        long A01;
        C0Xc[] c0XcArr;
        long nowNanos;
        C16040qz c16040qz = this.A03;
        if (c16040qz != null) {
            C0XG c0xg = runnableC16080r6.A0F;
            if (c0xg == null) {
                A01 = c16040qz.A01(runnableC16080r6.getMarkerId());
            } else {
                A01 = c16040qz.A01(c0xg.A00) | c16040qz.A01(c0xg.A01);
            }
            if (A01 != 0 && (c0XcArr = c16040qz.A02) != null) {
                long j = 1;
                if (c0x2 == null) {
                    nowNanos = 0;
                } else {
                    nowNanos = c16040qz.A01.nowNanos();
                }
                int i = 0;
                while (i < c0XcArr.length) {
                    if ((A01 & j) != 0) {
                        c0XcArr[i].onMarkEvent(runnableC16080r6);
                        if (c0x2 != null) {
                            long nowNanos2 = c16040qz.A01.nowNanos();
                            c0x2.A00(c0XcArr[i].getName(), nowNanos2 - nowNanos);
                            nowNanos = nowNanos2;
                        }
                    }
                    i++;
                    j <<= 1;
                }
            }
        }
    }

    public final boolean A03(C0XG c0xg, int i) {
        C11C c11c = this.A02;
        if (c11c == null) {
            return false;
        }
        if (c11c.A02(i, 0) == 0 && (c0xg == null || c11c.A02(c0xg.A00, 0) == 0)) {
            return false;
        }
        return true;
    }

    public final boolean A04(C0XG c0xg, int i, int i2) {
        C11C c11c;
        C16040qz c16040qz = this.A03;
        if (c16040qz == null || (c11c = this.A02) == null) {
            return false;
        }
        if (c16040qz.A02(i, i2) == 0 && ((c0xg == null || c16040qz.A02(c0xg.A00, i2) == 0) && c11c.A02(i, 0) == 0 && (c0xg == null || c11c.A02(c0xg.A00, 0) == 0))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.11C, X.0Ww] */
    public C0XP(AwakeTimeSinceBootClock awakeTimeSinceBootClock, AbstractC208510h abstractC208510h, C10390h6 c10390h6, C0R9 c0r9, C0Xc[] c0XcArr) {
        this.A00 = awakeTimeSinceBootClock;
        this.A06 = c0XcArr;
        this.A04 = c10390h6;
        this.A05 = c0r9;
        this.A01 = abstractC208510h;
        this.A03 = new C16040qz(awakeTimeSinceBootClock, abstractC208510h, c10390h6, c0r9, c0XcArr);
        this.A02 = new AbstractC06620Ww(c10390h6, c0r9, c0XcArr);
    }

    public C0XP() {
        this.A00 = null;
        this.A06 = null;
        this.A04 = null;
        this.A05 = null;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
    }
}
