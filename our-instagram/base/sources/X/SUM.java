package X;

import java.io.UnsupportedEncodingException;

/* loaded from: classes10.dex */
public abstract class SUM {
    public static final byte[] A00 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String A00(byte[] bArr) {
        int i;
        byte[] bArr2 = A00;
        int length = bArr.length;
        byte[] bArr3 = new byte[((length + 2) / 3) * 4];
        int i2 = length % 3;
        int i3 = length - i2;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5 += 3) {
            int i6 = i4 + 1;
            bArr3[i4] = bArr2[(bArr[i5] & 255) >> 2];
            int i7 = i6 + 1;
            int i8 = i5 + 1;
            bArr3[i6] = bArr2[((bArr[i5] & 3) << 4) | ((bArr[i8] & 255) >> 4)];
            int i9 = i7 + 1;
            int i10 = (bArr[i8] & 15) << 2;
            int i11 = i5 + 2;
            bArr3[i7] = bArr2[i10 | ((bArr[i11] & 255) >> 6)];
            i4 = i9 + 1;
            bArr3[i9] = bArr2[bArr[i11] & 63];
        }
        try {
            if (i2 != 1) {
                if (i2 == 2) {
                    int i12 = i4 + 1;
                    bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
                    int i13 = i12 + 1;
                    int i14 = i3 + 1;
                    bArr3[i12] = bArr2[((bArr[i14] & 255) >> 4) | ((bArr[i3] & 3) << 4)];
                    i = i13 + 1;
                    bArr3[i13] = bArr2[(bArr[i14] & 15) << 2];
                }
                return new String(bArr3, "US-ASCII");
            }
            int i15 = i4 + 1;
            bArr3[i4] = bArr2[(bArr[i3] & 255) >> 2];
            int i16 = i15 + 1;
            bArr3[i15] = bArr2[(bArr[i3] & 3) << 4];
            i = i16 + 1;
            bArr3[i16] = 61;
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw AbstractC58318PtA.A0W(e);
        }
        bArr3[i] = 61;
    }
}
