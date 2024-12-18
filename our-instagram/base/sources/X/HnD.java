package X;

import com.instagram.model.shopping.ProductTagDictIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class HnD {
    public static C111154zc A00(List list) {
        ArrayList arrayList = null;
        C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ProductTagDictIntf) it.next()).F5x(A0b));
            }
        }
        return new C111154zc(arrayList);
    }
}
