package X;

import java.util.LinkedHashMap;

/* renamed from: X.JxQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45096JxQ extends C0T6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public final int A06;

    public C45096JxQ(AbstractC47570Kzg abstractC47570Kzg, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3, int i4) {
        this.A06 = 0;
        this.A02 = i;
        this.A00 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A05 = abstractC47570Kzg;
        this.A04 = interfaceC16820sZ;
    }

    public final boolean equals(Object obj) {
        C45096JxQ c45096JxQ;
        if (this.A06 != 0) {
            if (this != obj) {
                if (obj instanceof C45096JxQ) {
                    c45096JxQ = (C45096JxQ) obj;
                    if (c45096JxQ.A06 != 1 || this.A01 != c45096JxQ.A01 || this.A03 != c45096JxQ.A03 || !C14360o3.A0K(this.A05, c45096JxQ.A05) || this.A00 != c45096JxQ.A00 || this.A02 != c45096JxQ.A02) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else if (this != obj) {
            if (!(obj instanceof C45096JxQ)) {
                return false;
            }
            c45096JxQ = (C45096JxQ) obj;
            if (c45096JxQ.A06 != 0 || this.A02 != c45096JxQ.A02 || this.A00 != c45096JxQ.A00 || this.A03 != c45096JxQ.A03 || this.A01 != c45096JxQ.A01 || !C14360o3.A0K(this.A05, c45096JxQ.A05)) {
                return false;
            }
        } else {
            return true;
        }
        if (!C14360o3.A0K(this.A04, c45096JxQ.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0I;
        if (this.A06 != 0) {
            A0I = ((AbstractC166997dE.A0J(this.A05, ((this.A01 * 31) + this.A03) * 31) + this.A00) * 31) + this.A02;
        } else {
            A0I = AbstractC166987dD.A0I(this.A05, ((((((this.A02 * 31) + this.A00) * 31) + this.A03) * 31) + this.A01) * 31);
        }
        return AbstractC166987dD.A0I(this.A04, A0I * 31);
    }

    public C45096JxQ() {
        this.A06 = 1;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        this.A06 = 1;
        this.A01 = 0;
        this.A03 = 0;
        this.A05 = A1I;
        this.A00 = 0;
        this.A02 = 0;
        this.A04 = A1I2;
    }
}
