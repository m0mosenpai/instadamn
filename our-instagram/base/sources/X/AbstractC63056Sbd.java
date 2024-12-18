package X;

import android.util.ArrayMap;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sbd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63056Sbd {
    public static final int A00(String str, String str2) {
        C14360o3.A0B(str2, 1);
        if (str != null) {
            return AbstractC25226BEj.A03(str2, (str.hashCode() + 527) * 31);
        }
        return -1;
    }

    public static final Integer A01(String str) {
        int i;
        C14360o3.A0B(str, 0);
        Integer A0j = AbstractC003100w.A0j(str, 10);
        if (A0j != null) {
            int intValue = A0j.intValue();
            for (Integer num : C05F.A00(10)) {
                switch (num.intValue()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 1;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                        i = 0;
                        break;
                    case 5:
                        i = 10;
                        break;
                    case 6:
                        i = 11;
                        break;
                    case 7:
                        i = 12;
                        break;
                    case 8:
                        i = 13;
                        break;
                    case 9:
                        i = 14;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i == intValue) {
                    return num;
                }
            }
        }
        return C05F.A00;
    }

    public static final void A02(ArrayMap arrayMap, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, int i) {
        String str;
        double A00;
        C14360o3.A0B(arrayMap, 2);
        Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) AbstractC166997dE.A0l(it);
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    str = (String) value;
                } else if (value instanceof Boolean) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, AbstractC166987dD.A1a(value));
                } else if (value instanceof Integer) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, AbstractC166987dD.A0H(value));
                } else if (value instanceof Long) {
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, AbstractC166987dD.A0N(value));
                } else {
                    if (value instanceof Double) {
                        A00 = MSW.A00(value);
                    } else if (value instanceof Float) {
                        A00 = AbstractC166987dD.A09(value);
                    } else {
                        if (!(value instanceof Object[])) {
                            if (value instanceof int[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, (int[]) value);
                            } else if (value instanceof double[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, (double[]) value);
                            } else if (value instanceof long[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, (long[]) value);
                            } else if (value instanceof boolean[]) {
                                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, (boolean[]) value);
                            }
                        }
                        str = value.toString();
                    }
                    lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, A00);
                }
                lightweightQuickPerformanceLogger.markerAnnotate(1906462, i, str2, str);
            }
        }
    }
}
