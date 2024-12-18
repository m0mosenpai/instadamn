package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

/* renamed from: X.HWq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39301HWq extends C17T implements InterfaceC43546JLg {
    public ProductDetailsProductItemDictIntf A00;

    @Override // X.InterfaceC43546JLg
    public final JLH BcS() {
        return (JLH) A05(-517618225, C39302HWr.class);
    }

    @Override // X.InterfaceC43546JLg
    public final ProductDetailsProductItemDictIntf Bgl() {
        return AbstractC37303Gc4.A0I(this, this.A00);
    }

    @Override // X.InterfaceC43546JLg
    public final InterfaceC43546JLg EBp(C1DY c1dy) {
        this.A00 = AbstractC37304Gc5.A0Q(c1dy, AbstractC37303Gc4.A0I(this, this.A00));
        return this;
    }

    @Override // X.InterfaceC43546JLg
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I3W.A00(this));
    }

    @Override // X.InterfaceC43546JLg
    public final C38818H7j F63(C1DY c1dy) {
        C38819H7k c38819H7k;
        JLH BcS = BcS();
        ProductDetailsProductItemDict productDetailsProductItemDict = null;
        if (BcS != null) {
            c38819H7k = BcS.F65();
        } else {
            c38819H7k = null;
        }
        ProductDetailsProductItemDictIntf A0I = AbstractC37303Gc4.A0I(this, this.A00);
        if (A0I != null) {
            productDetailsProductItemDict = A0I.F7S(c1dy);
        }
        return new C38818H7j(c38819H7k, productDetailsProductItemDict);
    }

    @Override // X.InterfaceC43546JLg
    public final C38818H7j F64(C1DV c1dv) {
        return F63(AbstractC25235BEs.A0b(c1dv));
    }
}
