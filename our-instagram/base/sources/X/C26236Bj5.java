package X;

/* renamed from: X.Bj5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26236Bj5 extends C0T6 implements InterfaceC30854DhT {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;

    public C26236Bj5(C5Hc c5Hc, C5Hc c5Hc2) {
        AbstractC167017dG.A1P(c5Hc, c5Hc2);
        this.A02 = c5Hc;
        this.A01 = c5Hc2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C26236Bj5) {
            C26236Bj5 c26236Bj5 = (C26236Bj5) obj;
            if (c26236Bj5.A00 != i || !C14360o3.A0K(this.A02, c26236Bj5.A02) || !C14360o3.A0K(this.A01, c26236Bj5.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A02));
    }

    public C26236Bj5(C5Hc c5Hc, InterfaceC65696TsI interfaceC65696TsI) {
        AbstractC167007dF.A1D(c5Hc, 1, interfaceC65696TsI);
        this.A02 = c5Hc;
        this.A01 = interfaceC65696TsI;
    }
}
