package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0XD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XD {
    public C07G A00;
    public C10390h6 A01;
    public final AwakeTimeSinceBootClock A02;
    public final C06610Wt A03;
    public final C0XB A04;
    public final AtomicReference A05 = new AtomicReference();
    public final AbstractC208510h A06;
    public final C05600Rk A07;
    public final C0R9 A08;

    public static long A00(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    public static C05690Rt A01(C0X2 c0x2, C0XD c0xd, int i, int i2, long j) {
        long nowNanos;
        C07G c07g = c0xd.A00;
        C05690Rt c05690Rt = null;
        if (c07g != null && j != 0) {
            C24991Kb c24991Kb = new C24991Kb();
            if (c0x2 == null) {
                nowNanos = 0;
            } else {
                nowNanos = c0xd.A02.nowNanos();
            }
            int[] iArr = c07g.A00;
            int i3 = 0;
            do {
                int i4 = iArr[i3];
                if ((j & (1 << (i4 - 1))) != 0) {
                    InterfaceC06630Wx A00 = c07g.A00(i4);
                    if (A00.CTn(c24991Kb)) {
                        if (c05690Rt == null) {
                            c05690Rt = new C05690Rt();
                        }
                        c05690Rt.put(A00.Biy(), A00.Emc(i, i2));
                        if (c0x2 != null) {
                            long nowNanos2 = c0xd.A02.nowNanos();
                            c0x2.A0Q.add(Integer.valueOf(i4));
                            c0x2.A0R.add(Long.valueOf(nowNanos2 - nowNanos));
                            nowNanos = nowNanos2;
                        }
                    }
                }
                i3++;
            } while (i3 < 15);
        }
        return c05690Rt;
    }

    public static void A02(C0XD c0xd, RunnableC16080r6 runnableC16080r6, TimeUnit timeUnit, long j, short s) {
        C0XB c0xb = c0xd.A04;
        c0xb.E7e(null, runnableC16080r6);
        try {
            runnableC16080r6.A06 = timeUnit.toNanos(j) - runnableC16080r6.A09;
            runnableC16080r6.A0M = s;
        } finally {
            c0xb.E7f(null, runnableC16080r6);
        }
    }

    public static void A03(C0XD c0xd, InterfaceC07540aT interfaceC07540aT, long j) {
        Object obj;
        C07G c07g = c0xd.A00;
        if (c07g != null && j != 0) {
            C24991Kb c24991Kb = new C24991Kb();
            int[] iArr = c07g.A00;
            int i = 0;
            do {
                int i2 = iArr[i];
                if (((1 << (i2 - 1)) & j) != 0) {
                    InterfaceC06630Wx A00 = c07g.A00(i2);
                    if (A00.CTn(c24991Kb)) {
                        int Biy = A00.Biy();
                        if (interfaceC07540aT != null) {
                            obj = interfaceC07540aT.get(Biy);
                        } else {
                            obj = null;
                        }
                        A00.EoT(obj);
                    }
                }
                i++;
            } while (i < 15);
        }
    }

    public final C05690Rt A06(C0X2 c0x2, int i, int i2, long j) {
        long nowNanos;
        C07G c07g = this.A00;
        if (c07g != null && j != 0) {
            C05690Rt c05690Rt = new C05690Rt();
            if (c0x2 == null) {
                nowNanos = 0;
            } else {
                nowNanos = this.A02.nowNanos();
            }
            int[] iArr = c07g.A00;
            int i3 = 0;
            do {
                int i4 = iArr[i3];
                C24991Kb c24991Kb = new C24991Kb();
                if ((j & (1 << (i4 - 1))) != 0) {
                    InterfaceC06630Wx A00 = c07g.A00(i4);
                    if (A00.CTn(c24991Kb)) {
                        c05690Rt.put(A00.Biy(), A00.EmJ(i, i2));
                        if (c0x2 != null) {
                            long nowNanos2 = this.A02.nowNanos();
                            c0x2.A0Q.add(Integer.valueOf(i4));
                            c0x2.A0R.add(Long.valueOf(nowNanos2 - nowNanos));
                            nowNanos = nowNanos2;
                        }
                    }
                }
                i3++;
            } while (i3 < 15);
            return c05690Rt;
        }
        return null;
    }

    public final ArrayList A07(final int i) {
        final ArrayList arrayList = new ArrayList();
        try {
            C0XB c0xb = this.A04;
            c0xb.CIx(null);
            C06610Wt c06610Wt = this.A03;
            c06610Wt.A00.AWM(new C0XY() { // from class: X.10t
                @Override // X.C0XY
                public final void ATK(RunnableC16080r6 runnableC16080r6) {
                    C0XG c0xg;
                    C0XD c0xd = C0XD.this;
                    int i2 = i;
                    List list = arrayList;
                    C0XB c0xb2 = c0xd.A04;
                    c0xb2.E7e(null, runnableC16080r6);
                    try {
                        if (runnableC16080r6.getMarkerId() == i2 || ((c0xg = runnableC16080r6.A0F) != null && c0xg.A00 == i2)) {
                            list.add(Integer.valueOf(runnableC16080r6.A02));
                        }
                    } finally {
                        c0xb2.E7f(null, runnableC16080r6);
                    }
                }
            });
            c0xb.CIy(null);
            return arrayList;
        } catch (Throwable th) {
            this.A04.CIy(null);
            throw th;
        }
    }

    public final void A08(C0X2 c0x2, C0XJ c0xj, C0XP c0xp, RunnableC16080r6 runnableC16080r6, String str, TimeUnit timeUnit, int i, int i2, long j, boolean z) {
        boolean z2;
        C0XB c0xb = this.A04;
        c0xb.CIx(c0x2);
        c0xb.E7e(c0x2, runnableC16080r6);
        try {
            long nanos = timeUnit.toNanos(j) - runnableC16080r6.A09;
            long j2 = runnableC16080r6.A07;
            if (j2 != 0 && i2 != 0) {
                z2 = true;
            } else {
                runnableC16080r6.A01(c0xj, null, str, TimeUnit.NANOSECONDS, i, nanos);
                c0xp.A00(c0x2, c0xj, runnableC16080r6, str, i, timeUnit.toMillis(j), timeUnit.toNanos(j), z);
                z2 = false;
            }
            if (c0x2 != null) {
                c0x2.A0N = true;
            }
            if (z2) {
                C05690Rt A06 = A06(c0x2, runnableC16080r6.A03, runnableC16080r6.A02, j2);
                c0xb.CIx(c0x2);
                c0xb.E7e(c0x2, runnableC16080r6);
                runnableC16080r6.A01(c0xj, A06, str, TimeUnit.NANOSECONDS, i, nanos);
                c0xp.A00(c0x2, c0xj, runnableC16080r6, str, i, timeUnit.toMillis(j), timeUnit.toNanos(j), z);
            }
        } finally {
            c0xb.E7f(c0x2, runnableC16080r6);
            c0xb.CIy(c0x2);
        }
    }

    public final void A09(C0X2 c0x2, C0XJ c0xj, C0XP c0xp, String str, TimeUnit timeUnit, int i, int i2, int i3, int i4, long j, boolean z) {
        long j2;
        long j3;
        boolean z2;
        int i5;
        boolean z3;
        long A00 = A00(i, i2);
        C0XB c0xb = this.A04;
        c0xb.CIx(c0x2);
        try {
            C06610Wt c06610Wt = this.A03;
            RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
            if (c0x2 != null) {
                c0x2.A03 = this.A02.nowNanos();
            }
            if (A01 != null) {
                c0xb.E7e(c0x2, A01);
                try {
                    j2 = timeUnit.toNanos(j) - A01.A09;
                    j3 = A01.A07;
                    i5 = A01.A05;
                    if (c0x2 != null) {
                        c0x2.A0C = this.A02.nowNanos();
                    }
                    if (j3 != 0 && i4 != 0) {
                        z3 = true;
                        z2 = true;
                    } else {
                        z3 = true;
                        A01.A01(c0xj, null, str, TimeUnit.NANOSECONDS, i3, j2);
                        if (c0x2 != null) {
                            c0x2.A0A = this.A02.nowNanos();
                        }
                        c0xp.A00(c0x2, c0xj, A01, str, i3, timeUnit.toMillis(j), timeUnit.toNanos(j), z);
                        if (c0x2 != null) {
                            c0x2.A05 = this.A02.nowNanos();
                        }
                        z2 = false;
                    }
                    if (c0x2 != null) {
                        c0x2.A0N = z3;
                    }
                    c0xb.E7f(c0x2, A01);
                } catch (Throwable th) {
                    c0xb.E7f(c0x2, A01);
                    throw th;
                }
            } else {
                j2 = 0;
                j3 = 0;
                z2 = false;
                i5 = 0;
            }
            if (z2) {
                C05690Rt A06 = A06(c0x2, i, i2, j3);
                c0xb.CIx(c0x2);
                A01 = c06610Wt.A01(c0x2, A00);
                if (A01 != null) {
                    c0xb.E7e(c0x2, A01);
                    if (A01.A05 == i5 && C06610Wt.A00(c0xp, A01)) {
                        A01.A01(c0xj, A06, str, TimeUnit.NANOSECONDS, i3, j2);
                        c0xp.A00(c0x2, c0xj, A01, str, i3, timeUnit.toMillis(j), timeUnit.toNanos(j), z);
                    }
                    c0xb.E7f(c0x2, A01);
                }
            }
        } finally {
            c0xb.CIy(c0x2);
        }
    }

    public final void A0A(C0X2 c0x2, C0XP c0xp, RunnableC16080r6 runnableC16080r6, String str, String str2) {
        C0XB c0xb = this.A04;
        c0xb.CIx(c0x2);
        c0xb.E7e(c0x2, runnableC16080r6);
        try {
            runnableC16080r6.ABZ(str, str2);
            c0xp.A01(c0x2, runnableC16080r6);
            if (c0x2 != null) {
                c0x2.A0N = true;
            }
        } finally {
            c0xb.E7f(c0x2, runnableC16080r6);
            c0xb.CIy(c0x2);
        }
    }

    public final void A0D(C0XP c0xp, int i) {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A02;
        RunnableC16080r6 A00 = RunnableC16080r6.A00(awakeTimeSinceBootClock, TimeUnit.NANOSECONDS, 36315086, 0, 0, 0, awakeTimeSinceBootClock.nowNanos(), true, false);
        A00.A0W.A05("original_marker_id", i);
        C0XB c0xb = this.A04;
        c0xb.CIx(null);
        c0xb.E7e(null, A00);
        try {
            c0xp.A02(null, A00);
        } finally {
            c0xb.E7f(null, A00);
            c0xb.CIy(null);
        }
    }

    public final void A0F(final C0XY c0xy) {
        C0XY c0xy2 = new C0XY() { // from class: X.10u
            @Override // X.C0XY
            public final void ATK(RunnableC16080r6 runnableC16080r6) {
                C0XD c0xd = C0XD.this;
                C0XY c0xy3 = c0xy;
                C0XB c0xb = c0xd.A04;
                c0xb.E7e(null, runnableC16080r6);
                try {
                    c0xy3.ATK(runnableC16080r6);
                } finally {
                    c0xb.E7f(null, runnableC16080r6);
                }
            }
        };
        C0XB c0xb = this.A04;
        c0xb.CIx(null);
        try {
            this.A03.A00.AWM(c0xy2);
        } finally {
            c0xb.CIy(null);
        }
    }

    public C0XD(AwakeTimeSinceBootClock awakeTimeSinceBootClock, AbstractC208510h abstractC208510h, C0XB c0xb, InterfaceC06770Xt interfaceC06770Xt, C05600Rk c05600Rk, C0R9 c0r9) {
        this.A04 = c0xb;
        this.A02 = awakeTimeSinceBootClock;
        this.A06 = abstractC208510h;
        this.A07 = c05600Rk;
        this.A08 = c0r9;
        this.A03 = new C06610Wt(interfaceC06770Xt);
    }

    public static boolean A04(RunnableC16080r6 runnableC16080r6, long j) {
        int i;
        long BUq = j - runnableC16080r6.BUq();
        C0X7 c0x7 = runnableC16080r6.A0E;
        if (c0x7 != null && (i = c0x7.A01) > 0) {
            BUq -= TimeUnit.NANOSECONDS.toMillis(c0x7.A03[i - 1]);
        }
        if (BUq > runnableC16080r6.A0C) {
            return true;
        }
        return false;
    }

    public final RunnableC16080r6 A05(C0XP c0xp, TimeUnit timeUnit, int i, int i2, long j) {
        long A00 = A00(i, i2);
        C0XB c0xb = this.A04;
        c0xb.CIx(null);
        try {
            RunnableC16080r6 EEo = this.A03.A00.EEo(null, A00);
            if (EEo != null) {
                c0xb.E7e(null, EEo);
                try {
                    InterfaceC07540aT interfaceC07540aT = EEo.A0G;
                    if (interfaceC07540aT != null) {
                        A03(this, interfaceC07540aT, EEo.A07);
                    }
                    EEo.A08 = timeUnit.toNanos(j);
                    C16040qz c16040qz = c0xp.A03;
                    if (c16040qz != null) {
                        C16040qz.A00(null, EEo, c16040qz, 4);
                    }
                    c0xb.E7f(null, EEo);
                } catch (Throwable th) {
                    c0xb.E7f(null, EEo);
                    throw th;
                }
            }
            return EEo;
        } finally {
            c0xb.CIy(null);
        }
    }

    public final void A0B(C0X2 c0x2, C0XP c0xp, String str, int i, int i2, int i3) {
        long A00 = A00(i, i2);
        C06610Wt c06610Wt = this.A03;
        if (!c06610Wt.A03(c0x2, c0xp, A00)) {
            if (c0x2 != null) {
                c0x2.A04 = this.A02.nowNanos();
                return;
            }
            return;
        }
        if (c0x2 != null) {
            c0x2.A03 = this.A02.nowNanos();
        }
        C0XB c0xb = this.A04;
        c0xb.CIx(c0x2);
        try {
            RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
            if (A01 == null) {
                if (c0x2 != null) {
                    c0x2.A0B = this.A02.nowNanos();
                }
            } else {
                c0xb.E7e(c0x2, A01);
                try {
                    if (!C06610Wt.A00(c0xp, A01)) {
                        c0xb.E7f(c0x2, A01);
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = this.A02.nowNanos();
                        }
                        A01.A0W.A05(str, i3);
                        if (c0x2 != null) {
                            c0x2.A01 = this.A02.nowNanos();
                        }
                        c0xp.A01(c0x2, A01);
                        if (c0x2 != null) {
                            c0x2.A0N = true;
                            c0x2.A05 = this.A02.nowNanos();
                        }
                    }
                } finally {
                    c0xb.E7f(c0x2, A01);
                }
            }
        } finally {
            c0xb.CIy(c0x2);
        }
    }

    public final void A0C(C0X2 c0x2, C0XP c0xp, String str, String str2, int i, int i2) {
        long A00 = A00(i, i2);
        C06610Wt c06610Wt = this.A03;
        if (!c06610Wt.A03(c0x2, c0xp, A00)) {
            if (c0x2 != null) {
                c0x2.A04 = this.A02.nowNanos();
                return;
            }
            return;
        }
        if (c0x2 != null) {
            c0x2.A03 = this.A02.nowNanos();
        }
        C0XB c0xb = this.A04;
        c0xb.CIx(c0x2);
        try {
            RunnableC16080r6 A01 = c06610Wt.A01(c0x2, A00);
            if (A01 == null) {
                if (c0x2 != null) {
                    c0x2.A0B = this.A02.nowNanos();
                }
            } else {
                c0xb.E7e(c0x2, A01);
                try {
                    if (!C06610Wt.A00(c0xp, A01)) {
                        c0xb.E7f(c0x2, A01);
                    } else {
                        if (c0x2 != null) {
                            c0x2.A0C = this.A02.nowNanos();
                        }
                        A01.ABZ(str, str2);
                        if (c0x2 != null) {
                            c0x2.A01 = this.A02.nowNanos();
                        }
                        c0xp.A01(c0x2, A01);
                        if (c0x2 != null) {
                            c0x2.A0N = true;
                            c0x2.A05 = this.A02.nowNanos();
                        }
                    }
                } finally {
                    c0xb.E7f(c0x2, A01);
                }
            }
        } finally {
            c0xb.CIy(c0x2);
        }
    }

    public final void A0E(C0XP c0xp, String str, int i, int i2) {
        long A00 = A00(i, i2);
        C06610Wt c06610Wt = this.A03;
        if (!c06610Wt.A03(null, c0xp, A00)) {
            return;
        }
        C0XB c0xb = this.A04;
        c0xb.CIx(null);
        try {
            RunnableC16080r6 A01 = c06610Wt.A01(null, A00);
            if (A01 != null) {
                try {
                    c0xb.E7e(null, A01);
                    if (!C06610Wt.A00(c0xp, A01)) {
                        c0xb.E7f(null, A01);
                    } else {
                        A01.A0Y.add(str);
                    }
                } finally {
                    c0xb.E7f(null, A01);
                }
            }
        } finally {
            c0xb.CIy(null);
        }
    }
}
