package X;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes10.dex */
public abstract class S2Y {
    public static boolean A00(Iterable iterable, Comparator comparator) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = RM8.A00;
            }
        } else if (iterable instanceof InterfaceC65680TrA) {
            obj = ((RM4) ((InterfaceC65680TrA) iterable)).A02;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }
}
