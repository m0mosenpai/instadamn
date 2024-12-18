package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4zc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111154zc extends C0T6 implements InterfaceC111164zd {
    public final List A00;

    @Override // X.InterfaceC111164zd
    public final InterfaceC111164zd E93(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC111164zd
    public final C111154zc Eta(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC111164zd
    public final C111154zc Etb(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C111154zc) && C14360o3.A0K(this.A00, ((C111154zc) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC111164zd
    public final List CIr() {
        return this.A00;
    }

    @Override // X.InterfaceC111164zd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedItemProductTagsContainerDict", AbstractC39922HnC.A00(this));
    }

    public C111154zc(List list) {
        this.A00 = list;
    }
}
