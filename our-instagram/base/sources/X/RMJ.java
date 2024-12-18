package X;

/* loaded from: classes10.dex */
public class RMJ extends RMK {
    public final byte[] A00;

    @Override // X.AbstractC64537TIt
    public final boolean equals(Object obj) {
        int A02;
        int i;
        int i2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC64537TIt) || (A02 = A02()) != ((AbstractC64537TIt) obj).A02()) {
            return false;
        }
        if (A02 == 0) {
            return true;
        }
        if (obj instanceof RMJ) {
            RMJ rmj = (RMJ) obj;
            int i3 = super.A00;
            int i4 = ((AbstractC64537TIt) rmj).A00;
            if (i3 != 0 && i4 != 0 && i3 != i4) {
                return false;
            }
            if (A02 <= rmj.A02()) {
                byte[] bArr = this.A00;
                byte[] bArr2 = rmj.A00;
                if (this instanceof RMI) {
                    i = ((RMI) this).A00;
                } else {
                    i = 0;
                }
                int i5 = i + A02;
                if (rmj instanceof RMI) {
                    i2 = ((RMI) rmj).A00;
                } else {
                    i2 = 0;
                }
                while (i < i5) {
                    if (bArr[i] != bArr2[i2]) {
                        return false;
                    }
                    i++;
                    i2++;
                }
                return true;
            }
            throw AbstractC58321PtD.A0j(A02);
        }
        return obj.equals(this);
    }

    public RMJ(byte[] bArr) {
        this.A00 = bArr;
    }
}
