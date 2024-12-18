package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;

/* renamed from: X.1CC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1CC {
    public static volatile long A00 = -1;
    public static volatile String A01 = "not set";
    public static volatile String A02 = "not set";
    public static AnonymousClass523 A03;
    public static volatile int A04;
    public static volatile int A05;
    public static volatile long A06;
    public static volatile long A07;
    public static volatile long A08;
    public static volatile C1CA A09 = C1CA.A07;

    public static final int A00() {
        return A01(AwakeTimeSinceBootClock.INSTANCE.now());
    }

    public static final int A01(long j) {
        long j2 = (j - A08) / 1000;
        if (j2 < 1) {
            return 0;
        }
        if (j2 < 5) {
            return 1;
        }
        if (j2 < 30) {
            return 2;
        }
        if (j2 >= 120) {
            return 4;
        }
        return 3;
    }

    public static final long A02() {
        return AwakeTimeSinceBootClock.INSTANCE.now() - A08;
    }

    public static final void A03() {
        AnonymousClass523 anonymousClass523 = A03;
        if (anonymousClass523 != null) {
            C19L c19l = anonymousClass523.A04;
            AbstractC23641Du.A05(AnonymousClass191.A00, new PYs(anonymousClass523, null, 47), c19l);
        }
    }

    public static final void A04(C1CA c1ca, long j) {
        A08 = j;
        A09 = c1ca;
        A07 = System.currentTimeMillis();
        AnonymousClass523 anonymousClass523 = A03;
        if (anonymousClass523 != null) {
            C19L c19l = anonymousClass523.A04;
            C9D1 c9d1 = new C9D1(c1ca, anonymousClass523, null, 5);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d1, c19l);
        }
    }
}
