package X;

/* renamed from: X.40l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC902640l {
    public static final byte[] A00;
    public static final String[] A01;

    public static final void A00(StringBuilder sb, String str) {
        C14360o3.A0B(str, 1);
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String[] strArr = A01;
            if (charAt < ']' && strArr[charAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, length);
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    static {
        String[] strArr = new String[93];
        int i = 0;
        int i2 = 0;
        do {
            int i3 = (i2 >> 12) & 15;
            int i4 = i3 + 48;
            if (i3 >= 10) {
                i4 = (i3 - 10) + 97;
            }
            char c = (char) i4;
            int i5 = (i2 >> 8) & 15;
            int i6 = i5 + 48;
            if (i5 >= 10) {
                i6 = (i5 - 10) + 97;
            }
            char c2 = (char) i6;
            int i7 = (i2 >> 4) & 15;
            int i8 = i7 + 48;
            if (i7 >= 10) {
                i8 = (i7 - 10) + 97;
            }
            char c3 = (char) i8;
            int i9 = i2 & 15;
            int i10 = i9 + 48;
            if (i9 >= 10) {
                i10 = (i9 - 10) + 97;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\\u");
            sb.append(c);
            sb.append(c2);
            sb.append(c3);
            sb.append((char) i10);
            strArr[i2] = sb.toString();
            i2++;
        } while (i2 < 32);
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        A01 = strArr;
        byte[] bArr = new byte[93];
        do {
            bArr[i] = 1;
            i++;
        } while (i < 32);
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        A00 = bArr;
    }
}
