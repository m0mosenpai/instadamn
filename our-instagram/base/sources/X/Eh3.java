package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes6.dex */
public final class Eh3 extends C17T implements InterfaceC37271GbO {
    public InterfaceC87503vI A00;

    @Override // X.InterfaceC37271GbO
    public final InterfaceC87503vI BlA() {
        InterfaceC87503vI interfaceC87503vI = this.A00;
        if (interfaceC87503vI == null) {
            return (InterfaceC87503vI) A05(-1489053500, BU7.class);
        }
        return interfaceC87503vI;
    }

    @Override // X.InterfaceC37271GbO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC33667EuH.A00(this));
    }

    @Override // X.InterfaceC37271GbO
    public final List BNG() {
        return A0n(-788151224);
    }

    @Override // X.InterfaceC37271GbO
    public final InterfaceC37271GbO E8k(C1DY c1dy) {
        InterfaceC87503vI BlA = BlA();
        if (BlA != null) {
            BlA.E9t(c1dy);
        } else {
            BlA = null;
        }
        this.A00 = BlA;
        return this;
    }

    @Override // X.InterfaceC37271GbO
    public final E7a ErF(C1DY c1dy) {
        C87493vH c87493vH;
        List A0n = A0n(-788151224);
        InterfaceC87503vI BlA = BlA();
        if (BlA != null) {
            c87493vH = BlA.Ezd(c1dy);
        } else {
            c87493vH = null;
        }
        return new E7a(c87493vH, A0n);
    }

    @Override // X.InterfaceC37271GbO
    public final E7a ErG(C1DV c1dv) {
        return ErF(AbstractC25235BEs.A0b(c1dv));
    }
}
