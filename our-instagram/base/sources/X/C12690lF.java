package X;

/* renamed from: X.0lF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12690lF implements InterfaceC20420zJ {
    public int A00;

    @Override // X.InterfaceC20420zJ
    public final int AIK(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = bArr[i4];
            if (i5 == 64) {
                if ((bArr[i4 + 1] & 192) != 0) {
                    i4 += 4;
                }
                int i6 = i4 + 1;
                int i7 = i4 + 2;
                int i8 = i4 + 3;
                int i9 = (((((((i5 & 255) << 24) | ((bArr[i6] & 255) << 16)) | ((bArr[i7] & 255) << 8)) | (bArr[i8] & 255)) << 2) - ((this.A00 + i4) - i)) >>> 2;
                int i10 = (i9 & 4194303) | (((-((i9 >>> 22) & 1)) << 22) & 1073741823) | AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                bArr[i4] = (byte) (i10 >>> 24);
                bArr[i6] = (byte) (i10 >>> 16);
                bArr[i7] = (byte) (i10 >>> 8);
                bArr[i8] = (byte) i10;
                i4 += 4;
            } else {
                if (i5 == 127) {
                    if ((bArr[i4 + 1] & 192) != 192) {
                    }
                    int i62 = i4 + 1;
                    int i72 = i4 + 2;
                    int i82 = i4 + 3;
                    int i92 = (((((((i5 & 255) << 24) | ((bArr[i62] & 255) << 16)) | ((bArr[i72] & 255) << 8)) | (bArr[i82] & 255)) << 2) - ((this.A00 + i4) - i)) >>> 2;
                    int i102 = (i92 & 4194303) | (((-((i92 >>> 22) & 1)) << 22) & 1073741823) | AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                    bArr[i4] = (byte) (i102 >>> 24);
                    bArr[i62] = (byte) (i102 >>> 16);
                    bArr[i72] = (byte) (i102 >>> 8);
                    bArr[i82] = (byte) i102;
                }
                i4 += 4;
            }
        }
        int i11 = i4 - i;
        this.A00 += i11;
        return i11;
    }
}
