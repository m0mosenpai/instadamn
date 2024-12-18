package X;

/* loaded from: classes7.dex */
public final class HSc extends C17T implements JKT {
    public JJS A00;
    public InterfaceC43573JMh A01;
    public JK0 A02;

    @Override // X.JKT
    public final InterfaceC43573JMh BTj() {
        InterfaceC43573JMh interfaceC43573JMh = this.A01;
        if (interfaceC43573JMh == null) {
            return (InterfaceC43573JMh) A05(1055112536, HRA.class);
        }
        return interfaceC43573JMh;
    }

    @Override // X.JKT
    public final JK0 C3C() {
        JK0 jk0 = this.A02;
        if (jk0 == null) {
            return (JK0) A05(3682, HUn.class);
        }
        return jk0;
    }

    @Override // X.JKT
    public final JKT E9m(C1DY c1dy) {
        InterfaceC43573JMh BTj = BTj();
        JK0 jk0 = null;
        if (BTj != null) {
            BTj.E9J(c1dy);
        } else {
            BTj = null;
        }
        this.A01 = BTj;
        JJS jjs = this.A00;
        if (jjs == null) {
            jjs = (JJS) A05(-2007984445, C27255C0y.class);
        }
        if (jjs != null) {
            jjs.E9K(c1dy);
        } else {
            jjs = null;
        }
        this.A00 = jjs;
        JK0 C3C = C3C();
        if (C3C != null) {
            C3C.EAv(c1dy);
            jk0 = C3C;
        }
        this.A02 = jk0;
        return this;
    }

    @Override // X.JKT
    public final C38758H4y Ez7(C1DY c1dy) {
        H4H h4h;
        C26136BhN Ewo;
        InterfaceC43573JMh BTj = BTj();
        H6N h6n = null;
        if (BTj != null) {
            h4h = BTj.Ewn(c1dy);
        } else {
            h4h = null;
        }
        JJS jjs = this.A00;
        if (jjs == null && (jjs = (JJS) A05(-2007984445, C27255C0y.class)) == null) {
            Ewo = null;
        } else {
            Ewo = jjs.Ewo(c1dy);
        }
        JK0 C3C = C3C();
        if (C3C != null) {
            h6n = C3C.F2Z(c1dy);
        }
        return new C38758H4y(h4h, Ewo, h6n);
    }
}
