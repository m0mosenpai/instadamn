package X;

/* renamed from: X.0lG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12700lG implements InterfaceC20420zJ {
    public int A00;

    @Override // X.InterfaceC20420zJ
    public final int AIK(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = bArr[i4];
            if ((i5 & 252) == 72) {
                int i6 = i4 + 3;
                int i7 = bArr[i6];
                if ((i7 & 3) == 1) {
                    int i8 = i4 + 1;
                    int i9 = ((i5 & 3) << 24) | ((bArr[i8] & 255) << 16);
                    int i10 = i4 + 2;
                    int i11 = ((i9 | ((bArr[i10] & 255) << 8)) | (i7 & 252)) - ((this.A00 + i4) - i);
                    bArr[i4] = (byte) (((i11 >>> 24) & 3) | 72);
                    bArr[i8] = (byte) (i11 >>> 16);
                    bArr[i10] = (byte) (i11 >>> 8);
                    bArr[i6] = (byte) (i11 | (bArr[i6] & 3));
                }
            }
            i4 += 4;
        }
        int i12 = i4 - i;
        this.A00 += i12;
        return i12;
    }
}
