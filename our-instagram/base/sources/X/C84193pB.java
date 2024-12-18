package X;

import android.content.Context;
import android.util.BoostFramework;
import java.lang.reflect.Constructor;

/* renamed from: X.3pB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84193pB {
    public static C15M A02;
    public static C84203pC A03;
    public static C15N A04;
    public static C15N A05;
    public final BoostFramework A00;
    public final Object A01;

    static {
        C15M c15m = new C15M("android.util.BoostFramework");
        A02 = c15m;
        C15M.A00(c15m, new Class[0], false);
        A03 = C15M.A00(A02, new Class[]{Context.class}, true);
        A04 = A02.A02("perfLockAcquire", Integer.TYPE, int[].class);
        A05 = A02.A02("perfLockRelease", new Class[0]);
    }

    public static boolean A00() {
        if (A03.A00 == null) {
            return false;
        }
        return true;
    }

    public static boolean A01() {
        return A02.A05(null);
    }

    public final int A02(int i, int... iArr) {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            return boostFramework.perfLockAcquire(i, iArr);
        }
        return A04.A00(new Object[]{Integer.valueOf(i), iArr}, this.A01);
    }

    public final void A03() {
        BoostFramework boostFramework = this.A00;
        if (boostFramework != null) {
            boostFramework.perfLockRelease();
        } else {
            A05.A00(new Object[0], this.A01);
        }
    }

    public C84193pB(Context context) {
        Object obj;
        BoostFramework boostFramework;
        C15M c15m = A02;
        boolean z = c15m.A03;
        C84203pC c84203pC = A03;
        if (z) {
            if (c84203pC.A00 != null) {
                boostFramework = new BoostFramework(context);
            } else {
                boostFramework = new BoostFramework();
            }
            this.A00 = boostFramework;
            return;
        }
        Constructor constructor = c84203pC.A00;
        if (constructor != null) {
            obj = null;
            try {
                obj = constructor.newInstance(context);
            } catch (Throwable unused) {
            }
        } else {
            Class cls = c15m.A01;
            obj = null;
            if (cls != null) {
                obj = cls.newInstance();
            }
        }
        this.A01 = obj;
    }
}
