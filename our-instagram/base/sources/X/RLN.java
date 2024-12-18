package X;

/* loaded from: classes10.dex */
public class RLN extends RLO {
    public final byte[] A00;

    @Override // X.AbstractC64536TIs
    public final boolean equals(Object obj) {
        int A01;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof AbstractC64536TIs) || (A01 = A01()) != ((AbstractC64536TIs) obj).A01()) {
            return false;
        }
        if (A01 == 0) {
            return true;
        }
        if (obj instanceof RLN) {
            RLN rln = (RLN) obj;
            int i2 = super.A00;
            int i3 = ((AbstractC64536TIs) rln).A00;
            if (i2 != 0 && i3 != 0 && i2 != i3) {
                return false;
            }
            if (A01 <= rln.A01()) {
                byte[] bArr = this.A00;
                byte[] bArr2 = rln.A00;
                int i4 = 0;
                while (i4 < A01) {
                    if (bArr[i4] != bArr2[i]) {
                        return false;
                    }
                    i4++;
                    i++;
                }
                return true;
            }
            throw AbstractC58321PtD.A0j(A01);
        }
        return obj.equals(this);
    }

    public RLN(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
