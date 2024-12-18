package X;

/* loaded from: classes10.dex */
public final class RZ0 extends RZ1 {
    public final int A00;
    public final int A01;

    public RZ0(byte[] bArr, int i, int i2) {
        super(bArr);
        int i3 = i + i2;
        int length = bArr.length;
        if ((i | i3 | (i3 - i) | (length - i3)) < 0) {
            if (i >= 0) {
                if (i3 < i) {
                    throw AbstractC25229BEm.A0l("Beginning index larger than ending index: ", ", ", i, i3);
                }
                throw AbstractC25229BEm.A0l("End index: ", " >= ", i3, length);
            }
            throw AbstractC58320PtC.A0q(i);
        }
        this.A01 = i;
        this.A00 = i2;
    }
}
