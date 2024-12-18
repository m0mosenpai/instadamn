package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4CV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4CV extends C0T6 implements C4CW {
    public final C4CS A00;
    public final InterfaceC116715Qa A01;
    public final C4CP A02;
    public final C116725Qb A03;

    @Override // X.C4CW
    public final C4CV Eqs() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4CV) {
                C4CV c4cv = (C4CV) obj;
                if (!C14360o3.A0K(this.A00, c4cv.A00) || !C14360o3.A0K(this.A01, c4cv.A01) || !C14360o3.A0K(this.A02, c4cv.A02) || !C14360o3.A0K(this.A03, c4cv.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C4CS c4cs = this.A00;
        int hashCode = (c4cs == null ? 0 : c4cs.hashCode()) * 31;
        InterfaceC116715Qa interfaceC116715Qa = this.A01;
        int hashCode2 = (hashCode + (interfaceC116715Qa == null ? 0 : interfaceC116715Qa.hashCode())) * 31;
        C4CP c4cp = this.A02;
        int hashCode3 = (hashCode2 + (c4cp == null ? 0 : c4cp.hashCode())) * 31;
        C116725Qb c116725Qb = this.A03;
        return hashCode3 + (c116725Qb != null ? c116725Qb.hashCode() : 0);
    }

    @Override // X.C4CW
    public final /* bridge */ /* synthetic */ C41119IIk AKF() {
        return new C41119IIk(this);
    }

    @Override // X.C4CW
    public final C4CS ApW() {
        return this.A00;
    }

    @Override // X.C4CW
    public final InterfaceC116715Qa BaO() {
        return this.A01;
    }

    @Override // X.C4CW
    public final C4CP BdB() {
        return this.A02;
    }

    @Override // X.C4CW
    public final /* bridge */ /* synthetic */ InterfaceC116735Qc CC9() {
        return this.A03;
    }

    @Override // X.C4CW
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationEntryPointContainer", AbstractC37379GdL.A00(this));
    }

    public C4CV(C4CS c4cs, InterfaceC116715Qa interfaceC116715Qa, C4CP c4cp, C116725Qb c116725Qb) {
        this.A00 = c4cs;
        this.A01 = interfaceC116715Qa;
        this.A02 = c4cp;
        this.A03 = c116725Qb;
    }
}
