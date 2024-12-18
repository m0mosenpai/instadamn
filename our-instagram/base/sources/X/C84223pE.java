package X;

import org.codeaurora.Performance;

/* renamed from: X.3pE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84223pE {
    public static C15M A02;
    public static C15N A03;
    public static C15N A04;
    public final Object A00;
    public final Performance A01;

    static {
        C15M c15m = new C15M("org.codeaurora.Performance");
        A02 = c15m;
        C15M.A00(c15m, new Class[0], false);
        A03 = A02.A02("perfLockAcquire", Integer.TYPE, int[].class);
        A04 = A02.A02("perfLockRelease", new Class[0]);
    }

    public final int A00(int i, int... iArr) {
        Performance performance = this.A01;
        if (performance != null) {
            return performance.perfLockAcquire(i, iArr);
        }
        return A03.A00(new Object[]{Integer.valueOf(i), iArr}, this.A00);
    }

    public final void A01() {
        Performance performance = this.A01;
        if (performance != null) {
            performance.perfLockRelease();
        } else {
            A04.A00(new Object[0], this.A00);
        }
    }

    public C84223pE() {
        C15M c15m = A02;
        if (c15m.A03) {
            this.A01 = new Performance();
            return;
        }
        Class cls = c15m.A01;
        Object obj = null;
        if (cls != null) {
            try {
                obj = cls.newInstance();
            } catch (Throwable unused) {
            }
        }
        this.A00 = obj;
    }
}
