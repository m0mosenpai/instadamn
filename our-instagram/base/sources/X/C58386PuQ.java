package X;

/* renamed from: X.PuQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C58386PuQ extends Q7N {
    public final byte[] A00;

    @Override // X.AbstractC58387PuR
    public final boolean equals(Object obj) {
        int A01;
        AbstractC58387PuR abstractC58387PuR;
        int A012;
        Object q7m;
        Object q7m2;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC58387PuR) && (A01 = A01()) == (A012 = (abstractC58387PuR = (AbstractC58387PuR) obj).A01())) {
            if (A01 == 0) {
                return true;
            }
            if (obj instanceof C58386PuQ) {
                int i = super.A00;
                int i2 = abstractC58387PuR.A00;
                if (i == 0 || i2 == 0 || i == i2) {
                    if (A01 <= A012) {
                        boolean z = abstractC58387PuR instanceof C58386PuQ;
                        C58386PuQ c58386PuQ = (C58386PuQ) abstractC58387PuR;
                        if (z) {
                            byte[] bArr = this.A00;
                            byte[] bArr2 = c58386PuQ.A00;
                            int A02 = A02();
                            int i3 = A01 + A02;
                            int A022 = c58386PuQ.A02();
                            while (A02 < i3) {
                                if (bArr[A02] != bArr2[A022]) {
                                    return false;
                                }
                                A02++;
                                A022++;
                            }
                            return true;
                        }
                        int A00 = AbstractC58387PuR.A00(0, A01, c58386PuQ.A01());
                        if (A00 == 0) {
                            q7m = AbstractC58387PuR.A02;
                        } else {
                            q7m = new Q7M(c58386PuQ.A00, c58386PuQ.A02(), A00);
                        }
                        int A002 = AbstractC58387PuR.A00(0, A01, A01);
                        if (A002 == 0) {
                            q7m2 = AbstractC58387PuR.A02;
                        } else {
                            q7m2 = new Q7M(this.A00, A02(), A002);
                        }
                        return q7m.equals(q7m2);
                    }
                    throw AbstractC58321PtD.A0j(A01);
                }
            } else {
                return obj.equals(this);
            }
        }
        return false;
    }

    public final int A02() {
        if (this instanceof Q7M) {
            return ((Q7M) this).A01;
        }
        return 0;
    }

    public C58386PuQ(byte[] bArr) {
        bArr.getClass();
        this.A00 = bArr;
    }
}
