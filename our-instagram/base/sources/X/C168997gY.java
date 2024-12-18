package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.7gY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168997gY {
    public java.util.Set A00 = C16910sj.A00;

    public final void A00(Map map, Map map2, int i, int i2) {
        C14360o3.A0B(map, 0);
        C14360o3.A0B(map2, 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = new C17u(i, i2).iterator();
        while (it.hasNext()) {
            Collection collection = (Collection) map.get(Integer.valueOf(((AbstractC16880sg) it).A00()));
            if (collection != null) {
                linkedHashSet.addAll(collection);
            }
        }
        java.util.Set A0k = AbstractC001800i.A0k(linkedHashSet);
        Iterator it2 = AnonymousClass090.A02(this.A00, A0k).iterator();
        while (it2.hasNext()) {
            map2.get(it2.next());
        }
        this.A00 = A0k;
    }
}
