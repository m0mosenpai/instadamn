package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02650Ap {
    public static final Method A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static volatile boolean A06;

    public static Object A02(Method method, Object... objArr) {
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke(null, objArr);
                return obj;
            } catch (IllegalAccessException unused) {
                A06 = false;
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (!(targetException instanceof RuntimeException)) {
                    if (!(targetException instanceof Error)) {
                        return obj;
                    }
                    throw targetException;
                }
                throw targetException;
            }
        }
        return obj;
    }

    static {
        boolean z;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            Method method2 = cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            Method method3 = cls.getMethod("getInt", String.class, Integer.TYPE);
            Method method4 = cls.getMethod("getLong", String.class, Long.TYPE);
            Method method5 = cls.getMethod("set", String.class, String.class);
            A00 = cls.getMethod("addChangeCallback", Runnable.class);
            A02 = method;
            A01 = method2;
            A03 = method3;
            A04 = method4;
            A05 = method5;
            z = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z = false;
        }
        A06 = z;
    }

    public static long A01(String str) {
        Number number;
        if (!A06 || (number = (Number) A02(A04, str, 0L)) == null) {
            return 0L;
        }
        return number.longValue();
    }

    public static String A03(String str) {
        String str2;
        if (!A06 || (str2 = (String) A02(A02, str)) == null) {
            return "";
        }
        return str2;
    }

    public static int A00() {
        Number number;
        if (!A06 || (number = (Number) A02(A03, "ro.build.version.oneui", 0)) == null) {
            return 0;
        }
        return number.intValue();
    }
}
