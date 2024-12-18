package X;

/* renamed from: X.0lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12720lI implements InterfaceC20420zJ {
    public int A00;

    @Override // X.InterfaceC20420zJ
    public final int AIK(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = i4 + 1;
            int i6 = bArr[i5];
            if ((i6 & 248) == 240) {
                int i7 = i4 + 3;
                int i8 = bArr[i7];
                if ((i8 & 248) == 248) {
                    int i9 = ((i6 & 7) << 19) | ((bArr[i4] & 255) << 11) | ((i8 & 7) << 8);
                    int i10 = i4 + 2;
                    int i11 = (((i9 | (bArr[i10] & 255)) << 1) - ((this.A00 + i4) - i)) >>> 1;
                    bArr[i5] = (byte) (240 | ((i11 >>> 19) & 7));
                    bArr[i4] = (byte) (i11 >>> 11);
                    bArr[i7] = (byte) (((i11 >>> 8) & 7) | 248);
                    bArr[i10] = (byte) i11;
                    i4 = i10;
                }
            }
            i4 += 2;
        }
        int i12 = i4 - i;
        this.A00 += i12;
        return i12;
    }
}
