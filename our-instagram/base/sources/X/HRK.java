package X;

/* loaded from: classes7.dex */
public final class HRK extends C17T implements InterfaceC43509JJv {
    public JK1 A00;

    @Override // X.InterfaceC43509JJv
    public final JK1 C3s() {
        JK1 jk1 = this.A00;
        if (jk1 == null) {
            return (JK1) A05(1407902941, HUo.class);
        }
        return jk1;
    }

    @Override // X.InterfaceC43509JJv
    public final InterfaceC43509JJv E9R(C1DY c1dy) {
        JK1 C3s = C3s();
        if (C3s != null) {
            C3s.EAw(c1dy);
        } else {
            C3s = null;
        }
        this.A00 = C3s;
        return this;
    }

    @Override // X.InterfaceC43509JJv
    public final C38237Grg ExG(C1DY c1dy) {
        C38236Grf c38236Grf;
        JK1 C3s = C3s();
        if (C3s != null) {
            c38236Grf = C3s.F2a(c1dy);
        } else {
            c38236Grf = null;
        }
        return new C38237Grg(c38236Grf);
    }
}
