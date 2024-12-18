package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4BJ, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4BJ {
    public static void A00(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, Map map, int i, int i2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (String) value);
                } else if (value instanceof Integer) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Number) value).intValue());
                } else if (value instanceof Double) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Number) value).doubleValue());
                } else if (value instanceof Long) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Number) value).longValue());
                } else if (value instanceof Boolean) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, ((Boolean) value).booleanValue());
                } else if (value instanceof String[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (String[]) value);
                } else if (value instanceof int[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (int[]) value);
                } else if (value instanceof double[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (double[]) value);
                } else if (value instanceof long[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (long[]) value);
                } else if (value instanceof boolean[]) {
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, (boolean[]) value);
                } else {
                    C0w9.A03("VideoQpl", String.format(Locale.US, "Failed to annotate marker: markerId %d instanceId %d key %s value %s class %s", Integer.valueOf(i), Integer.valueOf(i2), str, value, value.getClass().getSimpleName()));
                }
            }
        }
    }
}
