package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.S2i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62213S2i {
    public static boolean A00(Collection collection, java.util.Set set) {
        boolean z;
        collection.getClass();
        if ((collection instanceof java.util.Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        } else {
            Iterator it2 = collection.iterator();
            z = false;
            while (it2.hasNext()) {
                z |= set.remove(it2.next());
            }
        }
        return z;
    }
}
