package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.SKf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62646SKf {
    public final Map A00;

    public final HashMap A00(Collection collection) {
        java.util.Set unmodifiableSet;
        HashMap A1G = AbstractC166987dD.A1G();
        Map map = this.A00;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            Object next = A12.next();
            if (!map.containsKey(next)) {
                unmodifiableSet = Collections.emptySet();
            } else {
                HashSet A1H = AbstractC166987dD.A1H();
                Iterator A15 = AbstractC166997dE.A15((Map) map.get(next));
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    if (collection.contains(A1K.getKey())) {
                        A1H.add(A1K.getValue());
                    }
                }
                unmodifiableSet = Collections.unmodifiableSet(A1H);
            }
            A1G.put(next, unmodifiableSet);
        }
        return A1G;
    }
}
