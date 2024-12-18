package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.00j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC001900j extends AbstractC002300n {
    public static final int A04(CharSequence charSequence, char c, int i) {
        C14360o3.A0B(charSequence, 0);
        if (!(charSequence instanceof String)) {
            return A09(charSequence, new char[]{c}, i);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final int A05(CharSequence charSequence, char c, int i) {
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            int length = charSequence.length() - 1;
            if (i > length) {
                i = length;
            }
            while (-1 < i) {
                if (cArr[0] != charSequence.charAt(i)) {
                    i--;
                } else {
                    return i;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int A07(CharSequence charSequence, String str, int i) {
        C14360o3.A0B(str, 1);
        if (!(charSequence instanceof String)) {
            return A06(charSequence, str, i, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static final int A08(CharSequence charSequence, String str, int i, boolean z) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(str, 1);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return A06(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int A09(CharSequence charSequence, char[] cArr, int i) {
        int i2;
        C14360o3.A0B(cArr, 1);
        if (cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        do {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (c == charAt) {
                    return i;
                }
            }
            i2 = i;
            i++;
        } while (i2 != length);
        return -1;
    }

    public static final Boolean A0A(String str) {
        boolean z = false;
        C14360o3.A0B(str, 0);
        if (str.equals("true")) {
            z = true;
        } else if (!str.equals("false")) {
            return null;
        }
        return Boolean.valueOf(z);
    }

    public static final CharSequence A0B(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A01 = C11K.A01(charSequence.charAt(i2));
            if (!z) {
                if (!A01) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A01) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final CharSequence A0C(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!C11K.A01(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i >= 0) {
                length = i;
            } else {
                return "";
            }
        }
    }

    public static final CharSequence A0D(CharSequence charSequence, CharSequence charSequence2) {
        C14360o3.A0B(charSequence2, 1);
        boolean A0X = A0X(charSequence, charSequence2);
        int length = charSequence.length();
        if (A0X) {
            length -= charSequence2.length();
        }
        return charSequence.subSequence(0, length);
    }

    public static final String A0F(CharSequence charSequence, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(charSequence, 1);
        if (A0Y(str, charSequence)) {
            String substring = str.substring(charSequence.length());
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }

    public static final String A0G(CharSequence charSequence, String str) {
        if (A0X(str, charSequence)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }

    public static final String A0I(String str, String str2, char c) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        int length = str.length();
        int A05 = A05(str, c, length - 1);
        if (A05 != -1) {
            String substring = str.substring(A05 + 1, length);
            C14360o3.A07(substring);
            return substring;
        }
        return str2;
    }

    public static final String A0J(String str, String str2, char c) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 2);
        int A04 = A04(str, c, 0);
        if (A04 != -1) {
            String substring = str.substring(0, A04);
            C14360o3.A07(substring);
            return substring;
        }
        return str2;
    }

    public static final String A0K(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        int A08 = A08(str, str2, 0, false);
        if (A08 != -1) {
            String substring = str.substring(A08 + str2.length(), str.length());
            C14360o3.A07(substring);
            return substring;
        }
        return str3;
    }

    public static final String A0L(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 2);
        int A08 = A08(str, str2, 0, false);
        if (A08 != -1) {
            String substring = str.substring(0, A08);
            C14360o3.A07(substring);
            return substring;
        }
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r1 < 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A0M(java.lang.String r7, char... r8) {
        /*
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            r0 = 1
            int r6 = r7.length()
            int r6 = r6 - r0
            r5 = 0
            r4 = 0
        Lc:
            if (r5 > r6) goto L33
            r0 = r6
            if (r4 != 0) goto L12
            r0 = r5
        L12:
            char r3 = r7.charAt(r0)
            int r2 = r8.length
            r1 = 0
        L18:
            if (r1 >= r2) goto L21
            char r0 = r8[r1]
            if (r3 != r0) goto L30
            r0 = 1
            if (r1 >= 0) goto L22
        L21:
            r0 = 0
        L22:
            if (r4 != 0) goto L2b
            if (r0 != 0) goto L28
            r4 = 1
            goto Lc
        L28:
            int r5 = r5 + 1
            goto Lc
        L2b:
            if (r0 == 0) goto L33
            int r6 = r6 + (-1)
            goto Lc
        L30:
            int r1 = r1 + 1
            goto L18
        L33:
            int r0 = r6 + 1
            java.lang.CharSequence r0 = r7.subSequence(r5, r0)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC001900j.A0M(java.lang.String, char[]):java.lang.String");
    }

    public static final StringBuilder A0N(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(charSequence2, 3);
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A0n("End index (", ") is less than start index (", ").", i2, i));
    }

    public static final List A0O(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        List asList = Arrays.asList("\r\n", "\n", "\r");
        C14360o3.A07(asList);
        return AbstractC224517h.A02(new C225017m(new C06Q(charSequence), new C224317f(charSequence, new C06R(asList), 0)));
    }

    public static final List A0P(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int A08 = A08(charSequence, str, 0, false);
        if (A08 != -1 && i != 1) {
            boolean z = false;
            int i3 = 10;
            if (i > 0) {
                z = true;
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, A08).toString());
                i2 = str.length() + A08;
                if (z && arrayList.size() == i - 1) {
                    break;
                }
                A08 = A08(charSequence, str, i2, false);
            } while (A08 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        List singletonList = Collections.singletonList(charSequence.toString());
        C14360o3.A07(singletonList);
        return singletonList;
    }

    public static final List A0Q(CharSequence charSequence, char[] cArr, int i) {
        C14360o3.A0B(charSequence, 0);
        if (cArr.length == 1) {
            return A0P(charSequence, String.valueOf(cArr[0]), i);
        }
        MUL A08 = AbstractC224517h.A08(A0S(charSequence, cArr, i));
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            C17v c17v = (C17v) it.next();
            C14360o3.A0B(c17v, 1);
            arrayList.add(charSequence.subSequence(c17v.A00, c17v.A01 + 1).toString());
        }
        return arrayList;
    }

    public static final List A0R(CharSequence charSequence, String[] strArr, int i) {
        C14360o3.A0B(charSequence, 0);
        String str = strArr[0];
        if (str.length() == 0) {
            List asList = Arrays.asList(strArr);
            C14360o3.A07(asList);
            MUL A08 = AbstractC224517h.A08(new C224317f(charSequence, new C06R(asList), i));
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A08, 10));
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C17v c17v = (C17v) it.next();
                C14360o3.A0B(c17v, 1);
                arrayList.add(charSequence.subSequence(c17v.A00, c17v.A01 + 1).toString());
            }
            return arrayList;
        }
        return A0P(charSequence, str, i);
    }

    public static final boolean A0T(CharSequence charSequence) {
        C14360o3.A0B(charSequence, 0);
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C11K.A01(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0U(CharSequence charSequence, char c) {
        C14360o3.A0B(charSequence, 0);
        return A04(charSequence, c, 0) >= 0;
    }

    public static final boolean A0V(CharSequence charSequence, char c) {
        C14360o3.A0B(charSequence, 0);
        if (charSequence.length() > 0 && charSequence.charAt(charSequence.length() - 1) == c) {
            return true;
        }
        return false;
    }

    public static final boolean A0W(CharSequence charSequence, char c) {
        if (charSequence.length() <= 0 || charSequence.charAt(0) != c) {
            return false;
        }
        return true;
    }

    public static final boolean A0X(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return AbstractC002300n.A0f((String) charSequence, (String) charSequence2, false);
        }
        return A0Z(charSequence, charSequence2, charSequence.length() - charSequence2.length(), 0, charSequence2.length(), false);
    }

    public static final boolean A0Y(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return AbstractC002300n.A0h((String) charSequence, (String) charSequence2, false);
        }
        return A0Z(charSequence, charSequence2, 0, 0, charSequence2.length(), false);
    }

    public static final boolean A0Z(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!AbstractC131335wM.A02(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A0a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A06;
        C14360o3.A0B(charSequence, 0);
        C14360o3.A0B(charSequence2, 1);
        if (charSequence2 instanceof String) {
            A06 = A08(charSequence, (String) charSequence2, 0, z);
        } else {
            A06 = A06(charSequence, charSequence2, 0, charSequence.length(), z, false);
        }
        if (A06 >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean A0b(String str) {
        C14360o3.A0B(str, 0);
        if (str.equals("true")) {
            return true;
        }
        if (str.equals("false")) {
            return false;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0R("The string doesn't represent a boolean value: ", str));
    }

    public static final int A06(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        int i3;
        C17v c17v;
        int i4;
        boolean regionMatches;
        int i5;
        if (!z2) {
            i3 = 0;
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            c17v = new C17u(i, i2);
        } else {
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i = length2;
            }
            i3 = 0;
            if (i2 < 0) {
                i2 = 0;
            }
            c17v = new C17v(i, i2, -1);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i6 = c17v.A00;
            int i7 = c17v.A01;
            int i8 = c17v.A02;
            if (i8 <= 0 ? !(i8 >= 0 || i7 > i6) : i6 <= i7) {
                do {
                    String str = (String) charSequence2;
                    String str2 = (String) charSequence;
                    int length3 = charSequence2.length();
                    C14360o3.A0B(str, i3);
                    C14360o3.A0B(str2, 2);
                    if (!z) {
                        regionMatches = str.regionMatches(i3, str2, i6, length3);
                    } else {
                        regionMatches = str.regionMatches(z, i3, str2, i6, length3);
                    }
                    if (regionMatches) {
                        return i6;
                    }
                    i5 = i6;
                    i6 += i8;
                } while (i5 != i7);
            }
        } else {
            int i9 = c17v.A00;
            int i10 = c17v.A01;
            int i11 = c17v.A02;
            if (i11 <= 0 ? !(i11 >= 0 || i10 > i9) : i9 <= i10) {
                do {
                    i4 = i9;
                    if (A0Z(charSequence2, charSequence, i3, i4, charSequence2.length(), z)) {
                        return i9;
                    }
                    i9 += i11;
                } while (i4 != i10);
            }
        }
        return -1;
    }

    public static final String A0H(String str, int i) {
        CharSequence charSequence;
        C14360o3.A0B(str, 0);
        int length = str.length();
        if (i <= length) {
            charSequence = str.subSequence(0, length);
        } else {
            StringBuilder sb = new StringBuilder(i);
            int i2 = i - length;
            int i3 = 1;
            if (1 <= i2) {
                while (true) {
                    sb.append('0');
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static /* synthetic */ InterfaceC224417g A0S(CharSequence charSequence, char[] cArr, int i) {
        return new C224317f(charSequence, new C06S(cArr), i);
    }

    public static final String A0E(CharSequence charSequence, CharSequence charSequence2, String str) {
        int length = str.length();
        if (length >= charSequence.length() + charSequence2.length() && A0Y(str, charSequence) && A0X(str, charSequence2)) {
            String substring = str.substring(charSequence.length(), length - charSequence2.length());
            C14360o3.A07(substring);
            return substring;
        }
        return str;
    }
}
