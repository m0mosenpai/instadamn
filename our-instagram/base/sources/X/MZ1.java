package X;

/* loaded from: classes9.dex */
public final class MZ1 implements InterfaceC55012g0 {
    public final /* synthetic */ C38P A00;

    public MZ1(C38P c38p) {
        this.A00 = c38p;
    }

    @Override // X.InterfaceC55012g0
    public final void DSU(C4NL c4nl) {
        C4NJ c4nj;
        C14360o3.A0B(c4nl, 0);
        C66095TzW c66095TzW = this.A00.A04;
        if (c66095TzW == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        if (c4nl instanceof C4NJ) {
            c4nj = (C4NJ) c4nl;
        } else {
            c4nj = null;
        }
        c66095TzW.A01 = c4nj;
        C66095TzW.A00(c66095TzW);
    }
}
