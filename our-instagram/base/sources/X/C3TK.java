package X;

/* renamed from: X.3TK, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3TK {
    public static final byte[] A00;
    public static final char[] A01;

    static {
        char[] cArr = new char[117];
        A01 = cArr;
        byte[] bArr = new byte[126];
        A00 = bArr;
        int i = 0;
        do {
            i++;
        } while (i < 32);
        cArr[98] = '\b';
        cArr[116] = '\t';
        cArr[110] = '\n';
        cArr[102] = '\f';
        cArr[114] = '\r';
        cArr[47] = '/';
        cArr[34] = '\"';
        cArr[92] = '\\';
        int i2 = 0;
        do {
            bArr[i2] = Byte.MAX_VALUE;
            i2++;
        } while (i2 < 33);
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }
}
