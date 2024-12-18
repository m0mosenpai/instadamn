package X;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Sit, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63379Sit {
    public static final char[] A09 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.TWX, java.lang.Object] */
    public static String A01(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                ?? obj = new Object();
                obj.A0G(str, i, i3);
                while (i3 < i2) {
                    int codePointAt = str.codePointAt(i3);
                    if (codePointAt == 37) {
                        int i4 = i3 + 2;
                        if (i4 < i2) {
                            int A00 = AbstractC63404SjZ.A00(str.charAt(i3 + 1));
                            int A002 = AbstractC63404SjZ.A00(str.charAt(i4));
                            if (A00 != -1 && A002 != -1) {
                                obj.A0B((A00 << 4) + A002);
                                i3 = i4;
                            }
                        }
                        obj.A0E(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            obj.A0B(32);
                        }
                        obj.A0E(codePointAt);
                    }
                    i3 += Character.charCount(codePointAt);
                }
                return obj.A05();
            }
            i3++;
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.TWX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.TWX] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static String A02(String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        String str3;
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1)) {
                if (codePointAt == 37) {
                    if (z) {
                        if (z2 && !A05(str, i3, i2)) {
                        }
                        i3 += Character.charCount(codePointAt);
                    }
                } else {
                    if (codePointAt == 43 && z3) {
                    }
                    i3 += Character.charCount(codePointAt);
                }
            }
            ?? obj = new Object();
            obj.A0G(str, i, i3);
            ?? r5 = 0;
            while (i3 < i2) {
                int codePointAt2 = str.codePointAt(i3);
                if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                    if (codePointAt2 == 43 && z3) {
                        if (z) {
                            str3 = "+";
                        } else {
                            str3 = "%2B";
                        }
                        obj.A0G(str3, 0, str3.length());
                    } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !A05(str, i3, i2)))))) {
                        if (r5 == 0) {
                            r5 = new Object();
                        }
                        r5.A0E(codePointAt2);
                        while (!r5.ATd()) {
                            int readByte = r5.readByte() & 255;
                            obj.A0B(37);
                            char[] cArr = A09;
                            obj.A0B(cArr[(readByte >> 4) & 15]);
                            obj.A0B(cArr[readByte & 15]);
                        }
                    } else {
                        obj.A0E(codePointAt2);
                    }
                }
                i3 += Character.charCount(codePointAt2);
                r5 = r5;
            }
            return obj.A05();
        }
        return str.substring(i, i2);
    }

    public static int A00(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (!str.equals("https")) {
            return -1;
        }
        return 443;
    }

    public static boolean A05(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && str.charAt(i) == '%' && AbstractC63404SjZ.A00(str.charAt(i + 1)) != -1 && AbstractC63404SjZ.A00(str.charAt(i3)) != -1) {
            return true;
        }
        return false;
    }

    public final String A06() {
        if (this.A05.isEmpty()) {
            return "";
        }
        String str = this.A04;
        return str.substring(str.indexOf(58, this.A03.length() + 3) + 1, str.indexOf(64));
    }

    public final String A07() {
        String str = this.A04;
        int indexOf = str.indexOf(47, this.A03.length() + 3);
        return str.substring(indexOf, AbstractC63404SjZ.A01(str, "?#", indexOf, str.length()));
    }

    public final String A08() {
        if (this.A08 == null) {
            return null;
        }
        String str = this.A04;
        int indexOf = str.indexOf(63) + 1;
        int length = str.length();
        int i = indexOf;
        byte[] bArr = AbstractC63404SjZ.A07;
        while (true) {
            if (i < length) {
                if (str.charAt(i) == '#') {
                    break;
                }
                i++;
            } else {
                i = length;
                break;
            }
        }
        return str.substring(indexOf, i);
    }

    public final String A09() {
        if (this.A06.isEmpty()) {
            return "";
        }
        int length = this.A03.length() + 3;
        String str = this.A04;
        return str.substring(length, AbstractC63404SjZ.A01(str, ":@", length, str.length()));
    }

    public final String A0A() {
        C62754SPl c62754SPl;
        try {
            c62754SPl = new C62754SPl();
            c62754SPl.A02("/...", this);
        } catch (IllegalArgumentException unused) {
            c62754SPl = null;
        }
        int length = "".length();
        c62754SPl.A03 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, true);
        c62754SPl.A02 = A02("", " \"':;<=>@[]^`{}|/\\?#", 0, length, false, false, false, true);
        return c62754SPl.A00().toString();
    }

    public final java.net.URI A0B() {
        String A0g;
        C62754SPl c62754SPl = new C62754SPl();
        String str = this.A03;
        c62754SPl.A05 = str;
        c62754SPl.A03 = A09();
        c62754SPl.A02 = A06();
        c62754SPl.A04 = this.A02;
        int i = this.A00;
        if (i == A00(str)) {
            i = -1;
        }
        c62754SPl.A00 = i;
        List list = c62754SPl.A07;
        list.clear();
        list.addAll(A0C());
        c62754SPl.A01(A08());
        if (this.A01 == null) {
            A0g = null;
        } else {
            String str2 = this.A04;
            A0g = AbstractC58318PtA.A0g(str2.indexOf(35), str2);
        }
        c62754SPl.A01 = A0g;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String A0s = AbstractC31173DnH.A0s(list, i2);
            list.set(i2, A02(A0s, "[]", 0, A0s.length(), true, true, false, true));
        }
        List list2 = c62754SPl.A06;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String A0s2 = AbstractC31173DnH.A0s(c62754SPl.A06, i3);
                if (A0s2 != null) {
                    c62754SPl.A06.set(i3, A02(A0s2, "\\^`{|}", 0, A0s2.length(), true, true, true, true));
                }
            }
        }
        String str3 = c62754SPl.A01;
        if (str3 != null) {
            c62754SPl.A01 = A02(str3, " \"#<>\\^`{|}", 0, str3.length(), true, true, false, false);
        }
        String obj = c62754SPl.toString();
        try {
            return new java.net.URI(obj);
        } catch (URISyntaxException e) {
            try {
                return java.net.URI.create(obj.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw AbstractC58318PtA.A0f(e);
            }
        }
    }

    public final ArrayList A0C() {
        String str = this.A04;
        int indexOf = str.indexOf(47, this.A03.length() + 3);
        int A01 = AbstractC63404SjZ.A01(str, "?#", indexOf, str.length());
        ArrayList A1E = AbstractC166987dD.A1E();
        while (indexOf < A01) {
            int i = indexOf + 1;
            indexOf = i;
            while (true) {
                if (indexOf < A01) {
                    if (str.charAt(indexOf) != '/') {
                        indexOf++;
                    }
                } else {
                    indexOf = A01;
                    break;
                }
            }
            A1E.add(str.substring(i, indexOf));
        }
        return A1E;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C63379Sit) && ((C63379Sit) obj).A04.equals(this.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A04.hashCode();
    }

    public final String toString() {
        return this.A04;
    }

    public C63379Sit(C62754SPl c62754SPl) {
        List list;
        this.A03 = c62754SPl.A05;
        String str = c62754SPl.A03;
        this.A06 = A01(str, 0, str.length(), false);
        String str2 = c62754SPl.A02;
        this.A05 = A01(str2, 0, str2.length(), false);
        this.A02 = c62754SPl.A04;
        int i = c62754SPl.A00;
        this.A00 = i == -1 ? A00(c62754SPl.A05) : i;
        this.A07 = A04(c62754SPl.A07, false);
        List list2 = c62754SPl.A06;
        if (list2 != null) {
            list = A04(list2, true);
        } else {
            list = null;
        }
        this.A08 = list;
        String str3 = c62754SPl.A01;
        this.A01 = str3 != null ? A01(str3, 0, str3.length(), false) : null;
        this.A04 = c62754SPl.toString();
    }

    public static ArrayList A03(String str) {
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i <= length) {
                int indexOf = str.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = length;
                }
                int indexOf2 = str.indexOf(61, i);
                if (indexOf2 != -1 && indexOf2 <= indexOf) {
                    A1E.add(str.substring(i, indexOf2));
                    str2 = str.substring(indexOf2 + 1, indexOf);
                } else {
                    A1E.add(str.substring(i, indexOf));
                    str2 = null;
                }
                A1E.add(str2);
                i = indexOf + 1;
            } else {
                return A1E;
            }
        }
    }

    public static List A04(List list, boolean z) {
        String str;
        int size = list.size();
        ArrayList A17 = AbstractC25225BEi.A17(size);
        for (int i = 0; i < size; i++) {
            String A1I = AbstractC25226BEj.A1I(list, i);
            if (A1I != null) {
                str = A01(A1I, 0, A1I.length(), z);
            } else {
                str = null;
            }
            A17.add(str);
        }
        return Collections.unmodifiableList(A17);
    }
}
