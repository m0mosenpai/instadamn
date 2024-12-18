package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H6S extends C0T6 implements InterfaceC43514JKa {
    public final H6U A00;
    public final String A01;

    @Override // X.InterfaceC43514JKa
    public final H6S F2h() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6S) {
                H6S h6s = (H6S) obj;
                if (!C14360o3.A0K(this.A00, h6s.A00) || !C14360o3.A0K(this.A01, h6s.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43514JKa
    public final /* bridge */ /* synthetic */ InterfaceC43516JKc AvZ() {
        return this.A00;
    }

    @Override // X.InterfaceC43514JKa
    public final String CBn() {
        return this.A01;
    }

    @Override // X.InterfaceC43514JKa
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyAttachmentDict", AbstractC40370HvG.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H6S(H6U h6u, String str) {
        this.A00 = h6u;
        this.A01 = str;
    }
}
