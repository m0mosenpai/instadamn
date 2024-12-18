package X;

import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.user.model.Product;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ILD {
    public final Map A00;

    public final boolean A00(Product product) {
        List list = product.A0O;
        if (list != null) {
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!this.A00.containsKey(((ProductVariantPossibleValueDictIntf) it.next()).getId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public ILD(Map map) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        this.A00 = A1I;
        if (map != null) {
            A1I.putAll(map);
        }
    }
}
