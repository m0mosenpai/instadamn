package X;

import com.instagram.model.shopping.ProductGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ip5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42343Ip5 implements InterfaceC13000lm {
    public final LinkedHashMap A00 = new M9t(2);

    public final void A00(ProductGroup productGroup, String str) {
        C14360o3.A0B(str, 0);
        if (productGroup != null) {
            LinkedHashMap linkedHashMap = this.A00;
            if (linkedHashMap.containsKey(str)) {
                LinkedHashMap A18 = AbstractC25225BEi.A18(25);
                java.util.Set entrySet = linkedHashMap.entrySet();
                C14360o3.A07(entrySet);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(it);
                    if (!str.equals(A1K.getKey())) {
                        A18.put(A1K.getKey(), A1K.getValue());
                    }
                }
                linkedHashMap.clear();
                linkedHashMap.putAll(A18);
            }
            linkedHashMap.put(str, productGroup);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
