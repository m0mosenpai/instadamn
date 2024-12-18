package X;

/* loaded from: classes11.dex */
public final class W4L {
    public static final long[] A03 = {128, 64, 32, 16, 8, 4, 2, 1};
    public int A00;
    public int A01;
    public final byte[] A02 = new byte[8];

    public final long A00(InterfaceC98284b7 interfaceC98284b7, int i, boolean z, boolean z2) {
        if (this.A01 == 0) {
            byte[] bArr = this.A02;
            if (!interfaceC98284b7.E88(bArr, 0, 1, z)) {
                return -1L;
            }
            int i2 = bArr[0] & 255;
            int i3 = 0;
            while (true) {
                long[] jArr = A03;
                if (i3 < 8) {
                    long j = jArr[i3] & i2;
                    i3++;
                    if (j != 0) {
                        break;
                    }
                } else {
                    i3 = -1;
                    break;
                }
            }
            this.A00 = i3;
            if (i3 != -1) {
                this.A01 = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i4 = this.A00;
        if (i4 > i) {
            this.A01 = 0;
            return -2L;
        }
        if (i4 != 1) {
            interfaceC98284b7.readFully(this.A02, 1, i4 - 1);
        }
        this.A01 = 0;
        byte[] bArr2 = this.A02;
        int i5 = this.A00;
        long j2 = bArr2[0] & 255;
        if (z2) {
            j2 &= A03[i5 - 1] ^ (-1);
        }
        for (int i6 = 1; i6 < i5; i6++) {
            j2 = (j2 << 8) | (bArr2[i6] & 255);
        }
        return j2;
    }
}
