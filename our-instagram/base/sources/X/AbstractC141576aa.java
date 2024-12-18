package X;

/* renamed from: X.6aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC141576aa {
    public static void A00(C56562ip c56562ip, float[] fArr, float f, float f2, int i) {
        int i2;
        byte[] bArr = c56562ip.A02;
        int length = bArr.length;
        int min = Math.min(i, length - 1);
        if (min >= 0 && min < length) {
            i2 = 0;
            for (int i3 = 0; i3 < min; i3++) {
                byte b = bArr[i3];
                if (b != 0 && b != 1) {
                    if (b != 2) {
                        if (b == 3) {
                            i2 += 6;
                        }
                    } else {
                        i2 += 4;
                    }
                } else {
                    i2 += 2;
                }
            }
        } else {
            i2 = -1;
        }
        float[] fArr2 = c56562ip.A03;
        fArr[0] = fArr2[i2] * f;
        fArr[1] = fArr2[i2 + 1] * f2;
    }
}
