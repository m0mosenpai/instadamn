package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Sbt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63071Sbt {
    public static ArrayList A00(AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        ArrayList arrayList = new ArrayList();
        A02(arrayList, it);
        return arrayList;
    }

    public static void A01(InterfaceC28041Xi removeFrom, Iterator predicate) {
        removeFrom.getClass();
        while (predicate.hasNext()) {
            if (removeFrom.apply(predicate.next())) {
                predicate.remove();
            }
        }
    }

    public static boolean A02(Collection addTo, Iterator iterator) {
        iterator.getClass();
        boolean z = false;
        while (iterator.hasNext()) {
            z |= addTo.add(iterator.next());
        }
        return z;
    }
}
