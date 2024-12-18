package X;

/* loaded from: classes10.dex */
public class RWI extends RWJ {
    public final byte[] A00;

    @Override // X.AbstractC64538TIu
    public final boolean equals(Object obj) {
        int A02;
        AbstractC64538TIu abstractC64538TIu;
        int A022;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC64538TIu) && (A02 = A02()) == (A022 = (abstractC64538TIu = (AbstractC64538TIu) obj).A02())) {
            if (A02 == 0) {
                return true;
            }
            if (obj instanceof RWI) {
                int i = super.A00;
                int i2 = abstractC64538TIu.A00;
                if (i == 0 || i2 == 0 || i == i2) {
                    if (A02 <= A022) {
                        if (abstractC64538TIu instanceof RWI) {
                            RWI rwi = (RWI) abstractC64538TIu;
                            byte[] bArr = this.A00;
                            byte[] bArr2 = rwi.A00;
                            int A06 = A06();
                            int i3 = A02 + A06;
                            int A062 = rwi.A06();
                            while (A06 < i3) {
                                if (bArr[A06] != bArr2[A062]) {
                                    return false;
                                }
                                A06++;
                                A062++;
                            }
                            return true;
                        }
                        return abstractC64538TIu.A03(A02).equals(A03(A02));
                    }
                    throw AbstractC58321PtD.A0j(A02);
                }
            } else {
                return obj.equals(this);
            }
        }
        return false;
    }

    public final int A06() {
        if (this instanceof RWH) {
            return ((RWH) this).A01;
        }
        return 0;
    }

    public RWI(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
