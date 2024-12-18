package X;

/* renamed from: X.0nn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14230nn extends AbstractC20580zb {
    public static final long[] A01;
    public long A00 = -1;

    static {
        long[] jArr = new long[256];
        A01 = jArr;
        for (int i = 0; i < 256; i++) {
            long j = i;
            int i2 = 0;
            do {
                long j2 = j & 1;
                j >>>= 1;
                if (j2 == 1) {
                    j ^= -3932672073523589310L;
                }
                i2++;
            } while (i2 < 8);
            jArr[i] = j;
        }
    }

    @Override // X.AbstractC20580zb
    public final void A00(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            long[] jArr = A01;
            byte b = bArr[i];
            long j = this.A00;
            this.A00 = (j >>> 8) ^ jArr[(b ^ ((int) j)) & 255];
            i++;
        }
    }

    @Override // X.AbstractC20580zb
    public final byte[] A01() {
        long j = this.A00 ^ (-1);
        this.A00 = -1L;
        byte[] bArr = new byte[8];
        int i = 0;
        do {
            bArr[i] = (byte) (j >> (i * 8));
            i++;
        } while (i < 8);
        return bArr;
    }

    public C14230nn() {
        super.A00 = 8;
        this.A01 = "CRC64";
    }
}
