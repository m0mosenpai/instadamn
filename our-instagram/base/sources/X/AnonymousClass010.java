package X;

import java.math.BigInteger;

/* renamed from: X.010, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass010 extends AnonymousClass018 {
    public static final Double A0m(String str) {
        C14360o3.A0B(str, 0);
        try {
            if (!AbstractC22804A3x.A00.A08(str)) {
                return null;
            }
            return Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final Float A0n(String str) {
        C14360o3.A0B(str, 0);
        try {
            if (!AbstractC22804A3x.A00.A08(str)) {
                return null;
            }
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static final BigInteger A0o(String str) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        if (length != 1) {
            if (str.charAt(0) == '-') {
                i = 1;
            }
            while (i < length) {
                if (Character.digit((int) str.charAt(i), 10) < 0) {
                    return null;
                }
                i++;
            }
        } else if (Character.digit((int) str.charAt(0), 10) < 0) {
            return null;
        }
        return new BigInteger(str, 10);
    }
}
