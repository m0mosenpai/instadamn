package X;

import java.util.Arrays;

/* renamed from: X.0o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14360o3 {
    public static int A00(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int A01(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static boolean A0J(Float f, Float f2) {
        return f == null ? f2 == null : f2 != null && f.floatValue() == f2.floatValue();
    }

    public static String A03(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    public static void A04(Object obj) {
        if (obj == null) {
            A0E("ARRAY_ELEMENT");
            throw C00O.createAndThrow();
        }
    }

    public static void A05(Object obj) {
        if (obj == null) {
            A0E("CHECK_CAST");
            throw C00O.createAndThrow();
        }
    }

    public static void A06(Object obj) {
        if (obj == null) {
            A0E("INSTANCE_FIELD");
            throw C00O.createAndThrow();
        }
    }

    public static void A07(Object obj) {
        if (obj == null) {
            A0E("INVOKE_RETURN");
            throw C00O.createAndThrow();
        }
    }

    public static void A08(Object obj) {
        if (obj == null) {
            A0E("STATIC_FIELD");
            throw C00O.createAndThrow();
        }
    }

    public static void A09(Object obj) {
        if (obj == null) {
            A0E("UNKNOWN");
            throw C00O.createAndThrow();
        }
    }

    public static void A0A(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A0G(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0B(Object obj, int i) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(A02(AnonymousClass001.A0R("param at index = ", Integer.toString(i))));
            A0G(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0C(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            A0G(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0D(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(A02(str));
            A0G(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0E(String str) {
        NullPointerException nullPointerException = new NullPointerException(AnonymousClass001.A0R(str, " must not be null"));
        A0G(nullPointerException);
        throw nullPointerException;
    }

    public static void A0G(Throwable th) {
        A0H(th, C14360o3.class.getName());
    }

    public static boolean A0I(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    public static boolean A0K(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        return obj.equals(obj2);
    }

    public static String A02(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C14360o3.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return AnonymousClass001.A13("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ", str);
    }

    public static void A0F(String str) {
        RuntimeException runtimeException = new RuntimeException(AnonymousClass001.A0g("lateinit property ", str, " has not been initialized"));
        A0G(runtimeException);
        throw runtimeException;
    }

    public static void A0H(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
