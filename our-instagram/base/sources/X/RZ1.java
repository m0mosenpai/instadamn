package X;

/* loaded from: classes10.dex */
public class RZ1 extends RZ2 {
    public final byte[] A00;

    @Override // X.AbstractC64535TIr
    public final boolean equals(Object obj) {
        int A00;
        AbstractC64535TIr abstractC64535TIr;
        int A002;
        int i;
        if (obj == this) {
            return true;
        }
        int i2 = 0;
        if ((obj instanceof AbstractC64535TIr) && (A00 = A00()) == (A002 = (abstractC64535TIr = (AbstractC64535TIr) obj).A00())) {
            if (A00 == 0) {
                return true;
            }
            if (obj instanceof RZ1) {
                int i3 = super.A00;
                int i4 = abstractC64535TIr.A00;
                if (i3 == 0 || i4 == 0 || i3 == i4) {
                    if (A00 <= A002) {
                        if (abstractC64535TIr instanceof RZ1) {
                            RZ1 rz1 = (RZ1) abstractC64535TIr;
                            byte[] bArr = this.A00;
                            byte[] bArr2 = rz1.A00;
                            if (this instanceof RZ0) {
                                i2 = ((RZ0) this).A01;
                            }
                            int i5 = A00 + i2;
                            if (rz1 instanceof RZ0) {
                                i = ((RZ0) rz1).A01;
                            } else {
                                i = 0;
                            }
                            while (i2 < i5) {
                                if (bArr[i2] != bArr2[i]) {
                                    return false;
                                }
                                i2++;
                                i++;
                            }
                            return true;
                        }
                        return abstractC64535TIr.A01(A00).equals(A01(A00));
                    }
                    throw AbstractC58321PtD.A0j(A00);
                }
            } else {
                return obj.equals(this);
            }
        }
        return false;
    }

    public RZ1(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
