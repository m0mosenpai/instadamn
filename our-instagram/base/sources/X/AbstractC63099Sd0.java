package X;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: X.Sd0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63099Sd0 {
    public static final Charset A00 = AbstractC58318PtA.A0u();

    public static String A00(byte[] bArr) {
        int i;
        try {
            int length = bArr.length;
            byte[] bArr2 = RVN.A00;
            int i2 = (length / 3) * 4;
            if (length % 3 > 0) {
                i2 += 4;
            }
            byte[] bArr3 = new byte[i2];
            int i3 = -1;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 3;
                if (i6 > length) {
                    break;
                }
                int i7 = ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4] & 255) << 16) | (bArr[i4 + 2] & 255);
                bArr3[i5] = bArr2[(i7 >> 18) & 63];
                bArr3[i5 + 1] = bArr2[(i7 >> 12) & 63];
                bArr3[i5 + 2] = bArr2[(i7 >> 6) & 63];
                bArr3[i5 + 3] = bArr2[i7 & 63];
                i5 += 4;
                i3--;
                if (i3 == 0) {
                    bArr3[i5] = 10;
                    i5++;
                    i4 = i6;
                    i3 = 19;
                } else {
                    i4 = i6;
                }
            }
            if (i4 == length - 1) {
                int i8 = (bArr[i4] & 255) << 4;
                int i9 = i5 + 1;
                bArr3[i5] = bArr2[(i8 >> 6) & 63];
                int i10 = i9 + 1;
                bArr3[i9] = bArr2[i8 & 63];
                i = i10 + 1;
                bArr3[i10] = 61;
            } else {
                if (i4 == length - 2) {
                    int i11 = ((bArr[i4] & 255) << 10) | ((bArr[i4 + 1] & 255) << 2);
                    int i12 = i5 + 1;
                    bArr3[i5] = bArr2[(i11 >> 12) & 63];
                    int i13 = i12 + 1;
                    bArr3[i12] = bArr2[(i11 >> 6) & 63];
                    i = i13 + 1;
                    bArr3[i13] = bArr2[i11 & 63];
                }
                return new String(bArr3, "US-ASCII");
            }
            bArr3[i] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AbstractC58318PtA.A0W(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r2 == r4) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        r1 = new byte[r2];
        java.lang.System.arraycopy(r3, 0, r1, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0108, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x006b, code lost:
    
        if (r13 != 4) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] A01(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC63099Sd0.A01(java.lang.String):byte[]");
    }
}
