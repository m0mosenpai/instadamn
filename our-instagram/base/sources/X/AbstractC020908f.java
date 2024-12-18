package X;

import android.os.Build;
import android.os.Trace;
import com.facebook.common.dextricks.StringTreeSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.08f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC020908f {
    public static long A00;
    public static Method A01;

    public static boolean A01() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC021108h.A00();
        }
        boolean z = false;
        try {
            Method method = A01;
            if (method == null) {
                A00 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                A01 = method;
            }
            z = ((Boolean) method.invoke(null, Long.valueOf(A00))).booleanValue();
            return z;
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return z;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            throw new RuntimeException(cause);
        }
    }

    public static void A00(String str) {
        if (str.length() > 127) {
            str = str.substring(0, StringTreeSet.MAX_SYMBOL_COUNT);
        }
        AbstractC09790fc.A01(str, -1442799994);
    }
}
