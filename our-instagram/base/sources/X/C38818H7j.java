package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.H7j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38818H7j extends C0T6 implements InterfaceC43546JLg {
    public final C38819H7k A00;
    public final ProductDetailsProductItemDict A01;

    @Override // X.InterfaceC43546JLg
    public final C38818H7j F63(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43546JLg
    public final C38818H7j F64(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38818H7j) {
                C38818H7j c38818H7j = (C38818H7j) obj;
                if (!C14360o3.A0K(this.A00, c38818H7j.A00) || !C14360o3.A0K(this.A01, c38818H7j.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43546JLg
    public final /* bridge */ /* synthetic */ JLH BcS() {
        return this.A00;
    }

    @Override // X.InterfaceC43546JLg
    public final /* bridge */ /* synthetic */ ProductDetailsProductItemDictIntf Bgl() {
        return this.A01;
    }

    @Override // X.InterfaceC43546JLg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShoppingFeaturedProduct", I3W.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38818H7j(C38819H7k c38819H7k, ProductDetailsProductItemDict productDetailsProductItemDict) {
        this.A00 = c38819H7k;
        this.A01 = productDetailsProductItemDict;
    }

    @Override // X.InterfaceC43546JLg
    public final InterfaceC43546JLg EBp(C1DY c1dy) {
        return this;
    }
}
