package X;

import android.content.Context;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: X.3pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84213pD {
    public static C15N A01;
    public static C15N A02;
    public static C15M A03;
    public static C84203pC A04;
    public final Object A00;

    static {
        C15M c15m = new C15M("com.qualcomm.qti.Performance");
        A03 = c15m;
        C15M.A00(c15m, new Class[0], false);
        A04 = C15M.A00(A03, new Class[]{Context.class}, true);
        A01 = A03.A02("perfLockAcquire", Integer.TYPE, int[].class);
        A02 = A03.A02("perfLockRelease", new Class[0]);
    }

    public static boolean A00() {
        if (A04.A00 == null) {
            return false;
        }
        return true;
    }

    public static boolean A01() {
        if (!new File("/system/framework/QPerformance.jar").exists()) {
            return false;
        }
        return A03.A05(new PathClassLoader("/system/framework/QPerformance.jar", ClassLoader.getSystemClassLoader()));
    }

    public C84213pD(Context context) {
        Object obj;
        Constructor constructor = A04.A00;
        if (constructor != null) {
            obj = null;
            try {
                obj = constructor.newInstance(context);
            } catch (Throwable unused) {
            }
        } else {
            Class cls = A03.A01;
            obj = null;
            if (cls != null) {
                obj = cls.newInstance();
            }
        }
        this.A00 = obj;
    }
}
