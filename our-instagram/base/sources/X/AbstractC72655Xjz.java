package X;

/* renamed from: X.Xjz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72655Xjz {
    public static final byte[] A00(byte[] bArr, int i, int i2, int i3, int i4) {
        if (i3 <= i) {
            if (i4 <= i2) {
                int i5 = ((i3 * i4) * 3) / 2;
                byte[] bArr2 = new byte[i5];
                int i6 = ((i2 / 2) - (i4 / 2)) * i;
                int i7 = (i5 / 3) * 2;
                for (int i8 = 0; i8 < i7; i8++) {
                    bArr2[i8] = bArr[i8 + i6];
                }
                int length = (bArr.length / 3) * 2;
                int i9 = i6 / 2;
                int i10 = i5 - i7;
                for (int i11 = 0; i11 < i10; i11++) {
                    bArr2[i11 + i7] = bArr[i11 + length + i9];
                }
                return bArr2;
            }
            throw AbstractC166987dD.A12(AnonymousClass001.A0J("outputH>inputH: ", ',', i4, i2));
        }
        throw AbstractC166987dD.A12(AnonymousClass001.A0J("outputW>inputW: ", ',', i3, i));
    }
}
