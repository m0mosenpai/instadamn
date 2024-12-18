package X;

import java.util.Comparator;

/* loaded from: classes10.dex */
public abstract class TSC implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this instanceof RM7) {
            return ((RM7) this).A00.compare(obj2, obj);
        }
        if (this instanceof RM9) {
            Comparable comparable = (Comparable) obj2;
            obj.getClass();
            if (obj == comparable) {
                return 0;
            }
            return comparable.compareTo(obj);
        }
        if (this instanceof RM8) {
            Comparable comparable2 = (Comparable) obj;
            comparable2.getClass();
            obj2.getClass();
            return comparable2.compareTo(obj2);
        }
        return ((RM6) this).A00.compare(obj, obj2);
    }
}
