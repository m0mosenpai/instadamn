package X;

import java.util.Locale;

/* renamed from: X.11K, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C11K {
    public static final String A00(Locale locale, char c) {
        C14360o3.A0B(locale, 1);
        String valueOf = String.valueOf(c);
        C14360o3.A0C(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        C14360o3.A07(upperCase);
        if (upperCase.length() > 1) {
            if (c != 329) {
                char charAt = upperCase.charAt(0);
                String substring = upperCase.substring(1);
                C14360o3.A07(substring);
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                return AnonymousClass001.A0D(lowerCase, charAt);
            }
            return upperCase;
        }
        String upperCase2 = valueOf.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase2);
        if (!upperCase.equals(upperCase2)) {
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }

    public static final boolean A01(char c) {
        if (!Character.isWhitespace(c) && !Character.isSpaceChar(c)) {
            return false;
        }
        return true;
    }
}
