package X;

/* loaded from: classes10.dex */
public final class RaP extends AbstractC62743SOk {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public RaP(int i, int[] iArr, int i2) {
        super(i, i2);
        this.A01 = i;
        this.A00 = i2;
        int i3 = i * i2;
        byte[] bArr = new byte[i3];
        this.A02 = bArr;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr[i4];
            bArr[i4] = (byte) (((((i5 >> 16) & 255) + ((i5 >> 7) & 510)) + (i5 & 255)) / 4);
        }
    }
}
