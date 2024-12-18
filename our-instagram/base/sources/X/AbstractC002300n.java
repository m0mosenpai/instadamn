package X;

/* renamed from: X.00n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC002300n extends AbstractC003100w {
    public static final String A0c(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = 1;
        if (i >= 0) {
            if (i == 0) {
                return "";
            }
            if (i != 1) {
                int length = charSequence.length();
                if (length == 0) {
                    return "";
                }
                if (length != 1) {
                    StringBuilder sb = new StringBuilder(charSequence.length() * i);
                    while (true) {
                        sb.append(charSequence);
                        if (i3 != i) {
                            i3++;
                        } else {
                            String obj = sb.toString();
                            C14360o3.A0A(obj);
                            return obj;
                        }
                    }
                } else {
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    do {
                        cArr[i2] = charAt;
                        i2++;
                    } while (i2 < i);
                    return new String(cArr);
                }
            } else {
                return charSequence.toString();
            }
        } else {
            throw new IllegalArgumentException(AnonymousClass001.A0I("Count 'n' must be non-negative, but was ", '.', i));
        }
    }

    public static final String A0d(String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 2);
        int i = 0;
        int A08 = AbstractC001900j.A08(str, str2, 0, z);
        if (A08 >= 0) {
            int length = str2.length();
            int i2 = length;
            if (length < 1) {
                i2 = 1;
            }
            int length2 = str.length();
            int length3 = (length2 - length) + str3.length();
            if (length3 >= 0) {
                StringBuilder sb = new StringBuilder(length3);
                do {
                    sb.append((CharSequence) str, i, A08);
                    sb.append(str3);
                    i = A08 + length;
                    if (A08 >= length2) {
                        break;
                    }
                    A08 = AbstractC001900j.A08(str, str2, A08 + i2, z);
                } while (A08 > 0);
                sb.append((CharSequence) str, i, length2);
                String obj = sb.toString();
                C14360o3.A07(obj);
                return obj;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean A0f(String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        if (!z) {
            return str.endsWith(str2);
        }
        int length = str.length();
        int length2 = str2.length();
        return str.regionMatches(true, length - length2, str2, 0, length2);
    }

    public static final boolean A0h(String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        if (!z) {
            return str.startsWith(str2);
        }
        return str.regionMatches(z, 0, str2, 0, str2.length());
    }

    public static final boolean A0e(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (charSequence != charSequence2) {
            if (charSequence != null && charSequence2 != null && charSequence.length() == charSequence2.length()) {
                int length = charSequence.length();
                for (int i = 0; i < length; i++) {
                    if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean A0g(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 != null) {
                return false;
            }
            return true;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }
}
