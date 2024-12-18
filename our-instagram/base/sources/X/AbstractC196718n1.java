package X;

/* renamed from: X.8n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196718n1 {
    public static int A00(byte[] bArr) {
        String str;
        String str2;
        if (bArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 3;
                int length = bArr.length;
                boolean z = true;
                if (i2 >= length) {
                    break;
                }
                int i3 = i + 1;
                if ((bArr[i] & 255) != 255) {
                    break;
                }
                int i4 = bArr[i3] & 255;
                if (i4 != 255) {
                    i3++;
                    if (i4 != 216 && i4 != 1) {
                        if (i4 == 217 || i4 == 218) {
                            break;
                        }
                        int A01 = A01(bArr, i3, 2, false);
                        if (A01 < 2 || (i = i3 + A01) > length) {
                            break;
                        }
                        if (i4 == 225 && A01 >= 8 && A01(bArr, i3 + 2, 4, false) == 1165519206 && A01(bArr, i3 + 6, 2, false) == 0) {
                            int i5 = i3 + 8;
                            int i6 = A01 - 8;
                            if (i6 > 8) {
                                int A012 = A01(bArr, i5, 4, false);
                                if (A012 != 1229531648) {
                                    if (A012 != 1296891946) {
                                        str = "ExifUtil";
                                        str2 = "Invalid byte order";
                                    } else {
                                        z = false;
                                    }
                                }
                                int A013 = A01(bArr, i5 + 4, 4, z) + 2;
                                if (A013 >= 10 && A013 <= i6) {
                                    int i7 = i5 + A013;
                                    int i8 = i6 - A013;
                                    int A014 = A01(bArr, i7 - 2, 2, z);
                                    while (true) {
                                        int i9 = A014 - 1;
                                        if (A014 <= 0 || i8 < 12) {
                                            break;
                                        }
                                        if (A01(bArr, i7, 2, z) != 274) {
                                            i7 += 12;
                                            i8 -= 12;
                                            A014 = i9;
                                        } else {
                                            switch (A01(bArr, i7 + 8, 2, z)) {
                                                case 3:
                                                case 4:
                                                    return 180;
                                                case 5:
                                                case 8:
                                                    return 270;
                                                case 6:
                                                case 7:
                                                    return 90;
                                                default:
                                                    return 0;
                                            }
                                        }
                                    }
                                } else {
                                    str = "ExifUtil";
                                    str2 = "Invalid offset";
                                }
                            }
                        }
                    }
                }
                i = i3;
            }
            str = "ExifUtil";
            str2 = "Invalid length";
            android.util.Log.e(str, str2);
        }
        return 0;
    }

    public static int A01(byte[] bArr, int i, int i2, boolean z) {
        int i3 = 1;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        }
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 > 0) {
                i4 = (bArr[i] & 255) | (i4 << 8);
                i += i3;
                i2 = i5;
            } else {
                return i4;
            }
        }
    }
}
