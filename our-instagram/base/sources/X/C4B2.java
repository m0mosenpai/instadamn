package X;

/* renamed from: X.4B2, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4B2 {
    public static String A00(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            char charAt = string.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'A' && c <= 'Z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static String A01(String string) {
        int length = string.length();
        int i = 0;
        while (i < length) {
            char charAt = string.charAt(i);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = string.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return string;
    }

    public static boolean A02(CharSequence s1, CharSequence s2) {
        char c;
        int length = s1.length();
        if (s1 != s2) {
            if (length == s2.length()) {
                for (int i = 0; i < length; i++) {
                    if (s1.charAt(i) == s2.charAt(i) || ((c = (char) ((r0 | ' ') - 97)) < 26 && c == ((char) ((r2 | ' ') - 97)))) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
