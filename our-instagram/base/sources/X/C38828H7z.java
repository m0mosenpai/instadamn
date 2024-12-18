package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.H7z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38828H7z extends C0T6 implements InterfaceC43526JKm {
    public final List A00;

    public C38828H7z(List list) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
    }

    @Override // X.InterfaceC43526JKm
    public final C38828H7z F77(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38828H7z) && C14360o3.A0K(this.A00, ((C38828H7z) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.InterfaceC43526JKm
    public final List C5l() {
        return this.A00;
    }

    @Override // X.InterfaceC43526JKm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTemplateInfoCollection", AbstractC40777I5f.A00(this));
    }

    @Override // X.InterfaceC43526JKm
    public final InterfaceC43526JKm ECC(C1DY c1dy) {
        return this;
    }
}
