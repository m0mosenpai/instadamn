package X;

/* renamed from: X.SYf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62937SYf {
    public final int A00;
    public final String A01;
    public final EnumC61215RhF A02;

    public static C62937SYf A00(String str) {
        EnumC61215RhF enumC61215RhF;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    enumC61215RhF = EnumC61215RhF.HTTP_1_0;
                } else if (charAt == 1) {
                    enumC61215RhF = EnumC61215RhF.HTTP_1_1;
                } else {
                    throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
                }
            } else {
                throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
            }
        } else if (str.startsWith("ICY ")) {
            enumC61215RhF = EnumC61215RhF.HTTP_1_0;
            i = 4;
        } else {
            throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
        }
        int length = str.length();
        int i2 = i + 3;
        if (length >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (length > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
                    }
                } else {
                    str2 = "";
                }
                return new C62937SYf(str2, enumC61215RhF, parseInt);
            } catch (NumberFormatException unused) {
                throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
            }
        }
        throw AbstractC58322PtE.A0v("Unexpected status line: ", str);
    }

    public C62937SYf(String str, EnumC61215RhF enumC61215RhF, int i) {
        this.A02 = enumC61215RhF;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (this.A02 == EnumC61215RhF.HTTP_1_0) {
            str = "HTTP/1.0";
        } else {
            str = "HTTP/1.1";
        }
        A1C.append(str);
        A1C.append(' ');
        A1C.append(this.A00);
        String str2 = this.A01;
        if (str2 != null) {
            A1C.append(' ');
            A1C.append(str2);
        }
        return A1C.toString();
    }
}
