package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.HRy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39250HRy extends C17T implements JLU {
    public C38321qM A00;

    @Override // X.JLU
    public final C38321qM BQN() {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            return c38321qM;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'media' field.");
    }

    @Override // X.JLU
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40164Hrc.A00(this));
    }

    @Override // X.JLU
    public final String BEA() {
        return A0k(-1854772798);
    }

    @Override // X.JLU
    public final JLU E9f(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0E(c1dy, this, 103772132);
        return this;
    }

    @Override // X.JLU
    public final C38741H4f EyJ(C1DY c1dy) {
        return new C38741H4f((C38321qM) c1dy.A00(AbstractC37304Gc5.A0E(c1dy, this, 103772132)), A0k(-1854772798));
    }

    @Override // X.JLU
    public final C38741H4f EyK(C1DV c1dv) {
        return EyJ(AbstractC37304Gc5.A09(c1dv));
    }
}
