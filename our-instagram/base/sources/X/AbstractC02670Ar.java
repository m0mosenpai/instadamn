package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC02670Ar {
    public static final long A00;
    public static final Method A01;
    public static final Method A02;
    public static volatile boolean A03;

    static {
        try {
            Class<?> cls = Long.TYPE;
            Method method = Trace.class.getMethod("isTagEnabled", cls);
            Method method2 = Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE);
            Field field = Trace.class.getField("TRACE_TAG_APP");
            if (field.getType() == cls) {
                long j = field.getLong(null);
                A01 = method;
                A02 = method2;
                A00 = j;
                A03 = true;
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException unused) {
        }
    }

    public static Object A00(Method method, Object... objArr) {
        Object obj = null;
        try {
            obj = method.invoke(null, objArr);
            return obj;
        } catch (IllegalAccessException unused) {
            A03 = false;
            return obj;
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
}
