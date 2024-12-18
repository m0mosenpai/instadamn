package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HT3 extends C17T implements InterfaceC102194ip {
    public User A00;

    @Override // X.InterfaceC102194ip
    public final User BzF() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'sponsor' field.");
    }

    @Override // X.InterfaceC102194ip
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40255HtL.A00(this));
    }

    @Override // X.InterfaceC102194ip
    public final Boolean BcT() {
        return getOptionalBooleanValueByHashCode(-517618225);
    }

    @Override // X.InterfaceC102194ip
    public final String BzG() {
        return A0j(722276448);
    }

    @Override // X.InterfaceC102194ip
    public final Boolean Ca9() {
        return getOptionalBooleanValueByHashCode(817722242);
    }

    @Override // X.InterfaceC102194ip
    public final InterfaceC102194ip E9u(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, -1998892262);
        return this;
    }

    @Override // X.InterfaceC102194ip
    public final C102184io Ezk(C1DY c1dy) {
        return new C102184io((User) AbstractC37303Gc4.A07(c1dy, this, -1998892262), getOptionalBooleanValueByHashCode(817722242), getOptionalBooleanValueByHashCode(-517618225), A0j(722276448), AbstractC37301Gc2.A0m(this));
    }

    @Override // X.InterfaceC102194ip
    public final C102184io Ezl(C1DV c1dv) {
        return Ezk(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC102194ip
    public final String getUsername() {
        return AbstractC37301Gc2.A0m(this);
    }
}
