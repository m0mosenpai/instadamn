package X;

/* loaded from: classes10.dex */
public final class RaO extends AbstractC62743SOk {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public RaO(byte[] bArr, int i, int i2, int i3, int i4) {
        super(i3, i4);
        if (i3 <= i && i4 <= i2) {
            this.A02 = bArr;
            this.A01 = i;
            this.A00 = i2;
            return;
        }
        throw AbstractC166987dD.A12("Crop rectangle does not fit within image data.");
    }
}
