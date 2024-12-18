package X;

import android.util.SparseArray;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L9Q {
    public final SparseArray A00 = new SparseArray();

    public final LinkedHashSet A00(String str) {
        Collection collection;
        C14360o3.A0B(str, 0);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (map != null && map.containsKey(str) && (collection = (Collection) map.get(str)) != null) {
                A0l.addAll(collection);
            }
        }
        return A0l;
    }

    public final LinkedHashSet A01(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        if (str.length() != 0) {
            Map map = (Map) this.A00.get(str.charAt(0));
            if (map != null) {
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    String A17 = AbstractC31172DnG.A17(A1K);
                    Collection collection = (Collection) A1K.getValue();
                    C14360o3.A0B(A17, 0);
                    if (A17.startsWith(str)) {
                        A0l.addAll(collection);
                    }
                }
            }
        }
        return A0l;
    }

    public final void A02(String str, Object obj) {
        C14360o3.A0B(str, 0);
        char charAt = str.charAt(0);
        SparseArray sparseArray = this.A00;
        Map map = (Map) sparseArray.get(charAt);
        if (map == null) {
            map = AbstractC166987dD.A1I();
            sparseArray.put(charAt, map);
        }
        java.util.Set set = (java.util.Set) map.get(str);
        if (set == null) {
            set = AbstractC31171DnF.A0l();
            map.put(str, set);
        }
        set.add(obj);
    }
}
