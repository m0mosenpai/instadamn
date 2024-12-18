package X;

import java.util.Locale;

/* renamed from: X.0kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12370kf {
    public static final Integer A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            if (upperCase.equals("C1")) {
                return C05F.A00;
            }
            if (upperCase.equals("C2")) {
                return C05F.A01;
            }
            if (upperCase.equals("CANARY")) {
                return C05F.A0C;
            }
            if (upperCase.equals("UNKNOWN")) {
                return C05F.A0N;
            }
            throw new IllegalArgumentException(upperCase);
        } catch (IllegalArgumentException unused) {
            return C05F.A0N;
        }
    }
}
