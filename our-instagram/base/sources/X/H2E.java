package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H2E extends C0T6 implements JK7 {
    public final InterfaceC106354qp A00;
    public final InterfaceC43499JJl A01;

    @Override // X.JK7
    public final H2E Eqm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2E) {
                H2E h2e = (H2E) obj;
                if (!C14360o3.A0K(this.A01, h2e.A01) || !C14360o3.A0K(this.A00, h2e.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JK7
    public final InterfaceC43499JJl B3i() {
        return this.A01;
    }

    @Override // X.JK7
    public final InterfaceC106354qp BgF() {
        return this.A00;
    }

    @Override // X.JK7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAfiInterestsPostSelectionCta", Hk9.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H2E(InterfaceC106354qp interfaceC106354qp, InterfaceC43499JJl interfaceC43499JJl) {
        this.A01 = interfaceC43499JJl;
        this.A00 = interfaceC106354qp;
    }
}
