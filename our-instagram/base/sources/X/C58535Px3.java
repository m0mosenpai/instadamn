package X;

/* renamed from: X.Px3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58535Px3 extends AbstractC60804RTp {
    public final byte[] A00;

    @Override // X.AbstractC58536Px4
    public final boolean equals(Object other) {
        int A02;
        AbstractC58536Px4 abstractC58536Px4;
        int A022;
        if (other == this) {
            return true;
        }
        if ((other instanceof AbstractC58536Px4) && (A02 = A02()) == (A022 = (abstractC58536Px4 = (AbstractC58536Px4) other).A02())) {
            if (A02 == 0) {
                return true;
            }
            if (other instanceof C58535Px3) {
                int i = super.A00;
                int i2 = abstractC58536Px4.A00;
                if (i == 0 || i2 == 0 || i == i2) {
                    if (A02 <= A022) {
                        if (abstractC58536Px4 instanceof C58535Px3) {
                            C58535Px3 c58535Px3 = (C58535Px3) abstractC58536Px4;
                            byte[] bArr = this.A00;
                            byte[] bArr2 = c58535Px3.A00;
                            int A05 = A05();
                            int i3 = A02 + A05;
                            int A052 = c58535Px3.A05();
                            while (A05 < i3) {
                                if (bArr[A05] != bArr2[A052]) {
                                    return false;
                                }
                                A05++;
                                A052++;
                            }
                            return true;
                        }
                        return abstractC58536Px4.A03(A02).equals(A03(A02));
                    }
                    throw AbstractC58321PtD.A0j(A02);
                }
            } else {
                return other.equals(this);
            }
        }
        return false;
    }

    public final int A05() {
        if (this instanceof C60803RTo) {
            return ((C60803RTo) this).A01;
        }
        return 0;
    }

    public C58535Px3(byte[] bytes) {
        bytes.getClass();
        this.A00 = bytes;
    }
}
