package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H6U extends C0T6 implements InterfaceC43516JKc {
    public final H6W A00;
    public final C38611qr A01;

    @Override // X.InterfaceC43516JKc
    public final H6U F2j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6U) {
                H6U h6u = (H6U) obj;
                if (!C14360o3.A0K(this.A00, h6u.A00) || !C14360o3.A0K(this.A01, h6u.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43516JKc
    public final /* bridge */ /* synthetic */ InterfaceC43567JMb BjW() {
        return this.A00;
    }

    @Override // X.InterfaceC43516JKc
    public final /* bridge */ /* synthetic */ InterfaceC38621qt BxU() {
        return this.A01;
    }

    @Override // X.InterfaceC43516JKc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSurveyDataDict", AbstractC40372HvJ.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H6U(H6W h6w, C38611qr c38611qr) {
        this.A00 = h6w;
        this.A01 = c38611qr;
    }
}
