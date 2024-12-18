package X;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Method;

@Deprecated
/* renamed from: X.02M, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C02M {
    public static long A00;
    public static Method A01;
    public static Method A02;
    public static Method A03;
    public static Method A04;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                A00 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                A03 = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                A01 = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                A02 = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                A04 = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C02L.A00();
        }
        try {
            return ((Boolean) A03.invoke(null, Long.valueOf(A00))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
