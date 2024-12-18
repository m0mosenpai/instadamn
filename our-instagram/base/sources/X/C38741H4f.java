package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H4f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38741H4f extends C0T6 implements JLU {
    public final C38321qM A00;
    public final String A01;

    @Override // X.JLU
    public final C38741H4f EyJ(C1DY c1dy) {
        return this;
    }

    @Override // X.JLU
    public final C38741H4f EyK(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38741H4f) {
                C38741H4f c38741H4f = (C38741H4f) obj;
                if (!C14360o3.A0K(this.A01, c38741H4f.A01) || !C14360o3.A0K(this.A00, c38741H4f.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLU
    public final String BEA() {
        return this.A01;
    }

    @Override // X.JLU
    public final C38321qM BQN() {
        return this.A00;
    }

    @Override // X.JLU
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTProductDetailsMediaContent", AbstractC40164Hrc.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public C38741H4f(C38321qM c38321qM, String str) {
        AbstractC167017dG.A1P(str, c38321qM);
        this.A01 = str;
        this.A00 = c38321qM;
    }

    @Override // X.JLU
    public final JLU E9f(C1DY c1dy) {
        return this;
    }
}
