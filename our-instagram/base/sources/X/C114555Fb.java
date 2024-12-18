package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.5Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114555Fb extends C0T6 implements InterfaceC104774nh {
    public final List A00;

    @Override // X.InterfaceC104774nh
    public final InterfaceC104774nh E8h(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC104774nh
    public final C114555Fb Eqf(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114555Fb) && C14360o3.A0K(this.A00, ((C114555Fb) obj).A00));
    }

    public final int hashCode() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // X.InterfaceC104774nh
    public final List B22() {
        return this.A00;
    }

    @Override // X.InterfaceC104774nh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsShoppingInfoDict", AbstractC39733Hk3.A00(this));
    }

    public C114555Fb(List list) {
        this.A00 = list;
    }
}
