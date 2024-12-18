package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HSd extends C17T implements JML {
    public User A00;

    @Override // X.JML
    public final User Bny() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'reposter' field.");
    }

    @Override // X.JML
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40210HsZ.A00(this));
    }

    @Override // X.JML
    public final String Bno() {
        return A0i(1285435075);
    }

    @Override // X.JML
    public final String Bnq() {
        return A0k(640522819);
    }

    @Override // X.JML
    public final String Bnr() {
        return A0k(-352405625);
    }

    @Override // X.JML
    public final long Bnu() {
        return A03(646001248);
    }

    @Override // X.JML
    public final JML E9n(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, -427009728);
        return this;
    }

    @Override // X.JML
    public final H50 Ez9(C1DY c1dy) {
        return new H50((User) AbstractC37303Gc4.A07(c1dy, this, -427009728), A0i(1285435075), A0k(640522819), A0k(-352405625), A03(646001248));
    }

    @Override // X.JML
    public final H50 EzA(C1DV c1dv) {
        return Ez9(AbstractC25235BEs.A0b(c1dv));
    }
}
