package X;

/* renamed from: X.S5e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62285S5e {
    public static void A00(THO tho, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = tho.A05;
            int i2 = tho.A01;
            int i3 = tho.A00;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            long j2 = tho.A02;
            if (j2 != tho.A03.A00) {
                if (j2 == -1) {
                    j = 0;
                } else {
                    j = j2 + (i3 - i2);
                }
            } else {
                throw AbstractC58318PtA.A0Z();
            }
        } while (tho.A00(j) != -1);
    }
}
