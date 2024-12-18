package X;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Shb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63327Shb {
    public static final Object A00;
    public static final Method A01;
    public static final Method A02;
    public static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    static {
        Method method;
        Object obj = null;
        try {
            try {
                obj = AbstractC58318PtA.A0t(Class.forName(SHARED_SECRETS_CLASSNAME, false, null), "getJavaLangAccess").invoke(null, new Object[0]);
            } catch (ThreadDeath e) {
                throw e;
            }
        } catch (Throwable unused) {
        }
        A00 = obj;
        Method method2 = null;
        if (obj == null) {
            method = null;
        } else {
            method = null;
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (Throwable unused2) {
            }
        }
        A02 = method;
        if (obj != null) {
            try {
                Method method3 = null;
                try {
                    method3 = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
                } catch (ThreadDeath e2) {
                    throw e2;
                } catch (Throwable unused3) {
                }
                if (method3 != null) {
                    method3.invoke(obj, new Throwable());
                    method2 = method3;
                }
            } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
            }
        }
        A01 = method2;
    }

    public static Throwable A00(Throwable throwable) {
        boolean z = false;
        Throwable th = throwable;
        while (true) {
            Throwable cause = throwable.getCause();
            if (cause != null) {
                if (cause != th) {
                    if (z) {
                        th = th.getCause();
                    }
                    z = !z;
                    throwable = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                return throwable;
            }
        }
    }

    public static List A01(Throwable throwable) {
        ArrayList A17 = AbstractC25225BEi.A17(4);
        A17.add(throwable);
        boolean z = false;
        Throwable th = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable != null) {
                A17.add(throwable);
                if (throwable != th) {
                    if (z) {
                        th = th.getCause();
                    }
                    z = !z;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
                }
            } else {
                return Collections.unmodifiableList(A17);
            }
        }
    }

    @Deprecated
    public static void A03(Throwable th) {
        if (!IOException.class.isInstance(th)) {
            if (!(th instanceof RuntimeException)) {
                if (!(th instanceof Error)) {
                    return;
                } else {
                    throw th;
                }
            }
            throw th;
        }
        throw ((Throwable) IOException.class.cast(th));
    }

    @Deprecated
    public static void A02(Throwable throwable) {
        throwable.getClass();
        if (!(throwable instanceof RuntimeException)) {
            if (!(throwable instanceof Error)) {
                throw AbstractC58318PtA.A0f(throwable);
            }
            throw throwable;
        }
        throw throwable;
    }
}
