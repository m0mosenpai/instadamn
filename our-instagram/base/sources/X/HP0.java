package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.ImmutablePandoProductTagDict;
import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HP0 extends C17T implements InterfaceC111164zd {
    public List A00;

    @Override // X.InterfaceC111164zd
    public final List CIr() {
        List list = this.A00;
        if (list == null) {
            return A08(3365, ImmutablePandoProductTagDict.class);
        }
        return list;
    }

    @Override // X.InterfaceC111164zd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39922HnC.A00(this));
    }

    @Override // X.InterfaceC111164zd
    public final InterfaceC111164zd E93(C1DY c1dy) {
        ArrayList arrayList;
        List<ProductTagDictIntf> CIr = CIr();
        if (CIr != null) {
            arrayList = AbstractC167017dG.A0q(CIr);
            for (ProductTagDictIntf productTagDictIntf : CIr) {
                productTagDictIntf.EBm(c1dy);
                arrayList.add(productTagDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC111164zd
    public final C111154zc Eta(C1DY c1dy) {
        ArrayList arrayList;
        List CIr = CIr();
        if (CIr != null) {
            arrayList = AbstractC167017dG.A0q(CIr);
            Iterator it = CIr.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductTagDictIntf) it.next()).F5x(c1dy));
            }
        } else {
            arrayList = null;
        }
        return new C111154zc(arrayList);
    }

    @Override // X.InterfaceC111164zd
    public final C111154zc Etb(C1DV c1dv) {
        return Eta(AbstractC25235BEs.A0b(c1dv));
    }
}
