package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.HMj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39181HMj extends C17T implements InterfaceC104774nh {
    public List A00;

    @Override // X.InterfaceC104774nh
    public final List B22() {
        List list = this.A00;
        if (list == null) {
            return A08(-1926923365, ImmutablePandoProductDetailsProductItemDict.class);
        }
        return list;
    }

    @Override // X.InterfaceC104774nh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39733Hk3.A00(this));
    }

    @Override // X.InterfaceC104774nh
    public final InterfaceC104774nh E8h(C1DY c1dy) {
        ArrayList arrayList;
        List<ProductDetailsProductItemDictIntf> B22 = B22();
        if (B22 != null) {
            arrayList = AbstractC167017dG.A0q(B22);
            for (ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf : B22) {
                productDetailsProductItemDictIntf.ECE(c1dy);
                arrayList.add(productDetailsProductItemDictIntf);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    @Override // X.InterfaceC104774nh
    public final C114555Fb Eqf(C1DY c1dy) {
        ArrayList arrayList;
        List B22 = B22();
        if (B22 != null) {
            arrayList = AbstractC167017dG.A0q(B22);
            Iterator it = B22.iterator();
            while (it.hasNext()) {
                AbstractC37304Gc5.A1D(c1dy, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        return new C114555Fb(arrayList);
    }
}
