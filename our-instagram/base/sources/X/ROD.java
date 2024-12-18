package X;

/* loaded from: classes10.dex */
public final class ROD extends ROE {
    public final int A00;

    @Override // X.ROE, X.AbstractC64539TIv
    public final int A05() {
        return this.A00;
    }

    @Override // X.ROE, X.AbstractC64539TIv
    public final byte A02(int i) {
        int i2 = this.A00;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw AbstractC58322PtE.A0g(i);
            }
            throw AbstractC58323PtF.A0d(i, i2);
        }
        return ((ROE) this).A00[i];
    }

    public ROD(byte[] bArr, int i) {
        super(bArr);
        AbstractC64539TIv.A00(0, i, bArr.length);
        this.A00 = i;
    }
}
