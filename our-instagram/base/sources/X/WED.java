package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes11.dex */
public final class WED {
    public static ThreadLocal A00 = new X1w();

    public static double A01(String str, double d) {
        try {
            if (str.endsWith("%")) {
                return (Double.parseDouble(str.substring(0, str.length() - 1)) * d) / 100.0d;
            }
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            AbstractC65702TsY.A1U("Invalid translate value: ", str);
            return 0.0d;
        }
    }

    public static double A00(ReadableMap readableMap, String str) {
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            double parseFloat = Float.parseFloat(string);
            if (!z) {
                return (parseFloat * 3.141592653589793d) / 180.0d;
            }
            return parseFloat;
        }
        return readableMap.getDouble(str);
    }
}
