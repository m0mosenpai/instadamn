package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H6h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38792H6h extends C0T6 implements InterfaceC99414dE {
    public final List A00;

    @Override // X.InterfaceC99414dE
    public final C38792H6h F32(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC99414dE
    public final C38792H6h F33(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38792H6h) && C14360o3.A0K(this.A00, ((C38792H6h) obj).A00));
    }

    @Override // X.InterfaceC99414dE
    public final List B8X() {
        return this.A00;
    }

    @Override // X.InterfaceC99414dE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppTextFragments", AbstractC40397Hvk.A00(this));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38792H6h(List list) {
        this.A00 = list;
    }

    @Override // X.InterfaceC99414dE
    public final InterfaceC99414dE EB4(C1DY c1dy) {
        return this;
    }
}
