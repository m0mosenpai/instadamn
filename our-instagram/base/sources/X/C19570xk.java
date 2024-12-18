package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.0xk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19570xk {
    public static final Integer A00(String str, String str2, String str3, int i) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger;
        if (C17320tT.A06 == 0) {
            return null;
        }
        Random random = C17320tT.A09;
        if (random.nextInt() % C17320tT.A06 != 0 || (lightweightQuickPerformanceLogger = C17320tT.A07) == null) {
            return null;
        }
        int nextInt = random.nextInt();
        lightweightQuickPerformanceLogger.markerStart(i, nextInt);
        lightweightQuickPerformanceLogger.markerAnnotate(i, nextInt, "thread_name", Thread.currentThread().getName());
        lightweightQuickPerformanceLogger.markerAnnotate(i, nextInt, "method_name", str);
        lightweightQuickPerformanceLogger.markerAnnotate(i, nextInt, "key_name", str3);
        lightweightQuickPerformanceLogger.markerAnnotate(i, nextInt, "attribution_id", C17320tT.A05);
        lightweightQuickPerformanceLogger.markerAnnotate(i, nextInt, "store_identifier", str2);
        return Integer.valueOf(nextInt);
    }

    public static final String A01(Object obj, Object obj2) {
        if (obj == null) {
            return "NULL";
        }
        if (C14360o3.A0K(obj2, obj)) {
            return "EQUALS_DEFAULT";
        }
        return "NOT_EQUALS_DEFAULT";
    }

    public static final void A02(int i, int i2) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = C17320tT.A07;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerEnd(i, i2, (short) 2);
        }
    }

    public static final void A03(int i, String str, int i2) {
        int i3;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = C17320tT.A07;
        if (lightweightQuickPerformanceLogger != null) {
            if (str != null) {
                i3 = str.length() * 2;
            } else {
                i3 = 0;
            }
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "byte_size_of_pref_value", i3);
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = C17320tT.A07;
        if (lightweightQuickPerformanceLogger2 != null) {
            lightweightQuickPerformanceLogger2.markerEnd(i, i2, (short) 2);
        }
    }

    public final void A04(java.util.Set set, int i, int i2) {
        int i3;
        int i4;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = C17320tT.A07;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerPoint(i, "prefs_loaded");
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = C17320tT.A07;
        if (lightweightQuickPerformanceLogger2 != null) {
            if (set != null) {
                i4 = set.size();
            } else {
                i4 = 0;
            }
            lightweightQuickPerformanceLogger2.markerAnnotate(i, i2, "size_of_pref_value", i4);
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = C17320tT.A07;
        if (lightweightQuickPerformanceLogger3 != null) {
            int i5 = 0;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        i3 = str.length() * 2;
                    } else {
                        i3 = 0;
                    }
                    i5 += i3;
                }
            }
            lightweightQuickPerformanceLogger3.markerAnnotate(i, i2, "byte_size_of_pref_value", i5);
        }
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger4 = C17320tT.A07;
        if (lightweightQuickPerformanceLogger4 != null) {
            lightweightQuickPerformanceLogger4.markerEnd(i, i2, (short) 2);
        }
    }
}
