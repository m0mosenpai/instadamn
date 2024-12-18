package X;

import java.io.Serializable;

/* loaded from: classes10.dex */
public class T2Z implements InterfaceC65620ToB, Serializable {
    public final AbstractC910944l A00;
    public final TIH A01;
    public final C913945y A02;
    public final RBL A03;

    @Override // X.InterfaceC65620ToB
    public final C45H AVa(C45T c45t, Class cls) {
        RBL rbl;
        C45H c45h = ((C45S) c45t).A01.A00;
        C44W A00 = c45t.A00();
        if (A00 != null && (rbl = this.A03) != null) {
            return c45h.A00(A00.A06(rbl));
        }
        return c45h;
    }

    @Override // X.InterfaceC65620ToB
    public final C45U AVZ(C45T c45t, Class cls) {
        RBL rbl;
        C45U A04;
        C45U c45u = C45U.A07;
        C44W A00 = c45t.A00();
        if (A00 != null && (rbl = this.A03) != null && (A04 = A00.A04(rbl)) != null) {
            return c45u.A00(A04);
        }
        return c45u;
    }

    @Override // X.InterfaceC65620ToB
    public final C913945y B8w() {
        return this.A02;
    }

    @Override // X.InterfaceC65620ToB
    public final RBL BSA() {
        return this.A03;
    }

    @Override // X.InterfaceC65620ToB
    public final TIH BTQ() {
        return this.A01;
    }

    @Override // X.InterfaceC65620ToB
    public final AbstractC910944l CBP() {
        return this.A00;
    }

    @Override // X.InterfaceC65620ToB
    public final String getName() {
        return this.A02.A02;
    }

    public T2Z(AbstractC910944l abstractC910944l, TIH tih, C913945y c913945y, RBL rbl) {
        this.A02 = c913945y;
        this.A00 = abstractC910944l;
        this.A01 = tih;
        this.A03 = rbl;
    }
}
