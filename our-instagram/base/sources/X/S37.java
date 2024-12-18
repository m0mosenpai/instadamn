package X;

import com.google.common.collect.NaturalOrdering;
import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class S37 {
    public static boolean A00(Iterable comparator, Comparator elements) {
        Comparator comparator2;
        elements.getClass();
        comparator.getClass();
        if (comparator instanceof SortedSet) {
            comparator2 = ((SortedSet) comparator).comparator();
            if (comparator2 == null) {
                comparator2 = NaturalOrdering.A00;
            }
        } else if (comparator instanceof InterfaceC65681TrB) {
            comparator2 = ((InterfaceC65681TrB) comparator).comparator();
        } else {
            return false;
        }
        return elements.equals(comparator2);
    }
}
