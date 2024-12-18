package X;

/* renamed from: X.0lL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12740lL extends AbstractC20430zK {
    public int A02 = 0;
    public int A01 = 0;
    public int A03 = 0;
    public int A00 = 0;
    public final byte[] A04 = new byte[65531];

    public final int A00(short[] sArr, int i) {
        A01();
        short s = sArr[i];
        int i2 = this.A03;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.A00;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.A03 = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.A03 = i2 - i3;
        this.A00 = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    public final void A01() {
        int i = this.A03;
        if (((-16777216) & i) == 0) {
            try {
                int i2 = this.A00 << 8;
                byte[] bArr = this.A04;
                int i3 = this.A02;
                this.A02 = i3 + 1;
                this.A00 = i2 | (bArr[i3] & 255);
                this.A03 = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C14800ou();
            }
        }
    }
}
