package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.0WI, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0WI {
    public static final Field A00;
    public static final Method A01;

    static {
        Method method;
        Field field = null;
        try {
            method = Trace.class.getDeclaredMethod("nativeGetEnabledTags", new Class[0]);
            method.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        A01 = method;
        try {
            Field declaredField = Trace.class.getDeclaredField("sEnabledTags");
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException unused2) {
        }
        A00 = field;
    }
}
