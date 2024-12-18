package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HTX extends C17T implements JMA {
    public InterfaceC43549JLj A00;
    public User A01;

    @Override // X.JMA
    public final User AnB() {
        return this.A01;
    }

    @Override // X.JMA
    public final InterfaceC43549JLj Ayv() {
        InterfaceC43549JLj interfaceC43549JLj = this.A00;
        if (interfaceC43549JLj == null) {
            return (InterfaceC43549JLj) A05(1550150433, HXQ.class);
        }
        return interfaceC43549JLj;
    }

    @Override // X.JMA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40287Htr.A00(this));
    }

    @Override // X.JMA
    public final String AbX() {
        return A0i(200535999);
    }

    @Override // X.JMA
    public final JMA EAD(C1DY c1dy) {
        this.A01 = AbstractC37303Gc4.A0J(c1dy, this, 739065240);
        InterfaceC43549JLj Ayv = Ayv();
        if (Ayv != null) {
            Ayv.EC2(c1dy);
        } else {
            Ayv = null;
        }
        this.A00 = Ayv;
        return this;
    }

    @Override // X.JMA
    public final C38765H5f F0a(C1DY c1dy) {
        User user;
        String A0i = A0i(200535999);
        User A0J = AbstractC37303Gc4.A0J(c1dy, this, 739065240);
        C38825H7t c38825H7t = null;
        if (A0J != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0J);
        } else {
            user = null;
        }
        InterfaceC43549JLj Ayv = Ayv();
        if (Ayv != null) {
            c38825H7t = Ayv.F6r(c1dy);
        }
        return new C38765H5f(c38825H7t, user, A0i, A0j(-761937713));
    }

    @Override // X.JMA
    public final C38765H5f F0b(C1DV c1dv) {
        return F0a(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.JMA
    public final String getFundraiserId() {
        return A0j(-761937713);
    }
}
