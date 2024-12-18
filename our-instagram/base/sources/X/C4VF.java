package X;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* renamed from: X.4VF, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4VF implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object left, Object right) {
        return ((ComparatorOrdering) this).comparator.compare(left, right);
    }

    public static C4VF A00(Comparator comparator) {
        if (comparator instanceof C4VF) {
            return (C4VF) comparator;
        }
        return new ComparatorOrdering(comparator);
    }

    public C4VF A01() {
        return new ReverseOrdering(this);
    }
}
