package X;

import com.instagram.model.shopping.ProductTag;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gob, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38048Gob {
    public static final Product A01(ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf) {
        C14360o3.A0B(productDetailsProductItemDictIntf, 0);
        return new Product(null, productDetailsProductItemDictIntf.F7T(null));
    }

    public static final List A03(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(A01((ProductDetailsProductItemDictIntf) it.next()));
        }
        return A0q;
    }

    public static final List A05(List list) {
        C14360o3.A0B(list, 0);
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Product A0L = AbstractC37300Gc1.A0L(it);
            C14360o3.A0B(A0L, 0);
            A0q.add(A0L.A01);
        }
        return A0q;
    }

    public static Product A00(ProductTag productTag) {
        return A01(productTag.A02);
    }

    public static final List A04(List list) {
        if (list != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(A01((ProductDetailsProductItemDictIntf) it.next()));
            }
            return A0q;
        }
        return null;
    }

    public static final ProductDetailsProductItemDict A02() {
        ProductDetailsProductItemDict A00 = C41681IdA.A00();
        C14360o3.A0B(A00, 1);
        return new AbstractC41215IMe(A00).A00();
    }
}
