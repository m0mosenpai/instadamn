package X;

import java.util.NoSuchElementException;

/* renamed from: X.00Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C00Q extends AbstractC001700h {
    public static final char A00(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        if (charSequence.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        return charSequence.charAt(charSequence.length() - 1);
    }

    public static final char A01(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        int length = charSequence.length();
        if (length != 0) {
            if (length == 1) {
                return charSequence.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String A02(String str, int i) {
        C14360o3.A0B(str, 0);
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(i);
            C14360o3.A07(substring);
            return substring;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested character count ", " is less than zero.", i));
    }

    public static final String A03(String str, int i) {
        C14360o3.A0B(str, 0);
        if (i >= 0) {
            int length = str.length();
            if (i > length) {
                i = length;
            }
            String substring = str.substring(0, i);
            C14360o3.A07(substring);
            return substring;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0c("Requested character count ", " is less than zero.", i));
    }
}
