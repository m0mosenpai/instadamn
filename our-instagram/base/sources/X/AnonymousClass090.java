package X;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: X.090, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass090 extends AbstractC16830sb {
    public static final LinkedHashSet A00(Iterable iterable, java.util.Set set) {
        int size;
        C14360o3.A0B(set, 0);
        C14360o3.A0B(iterable, 1);
        if (iterable instanceof Collection) {
            int size2 = ((Collection) iterable).size();
            if (Integer.valueOf(size2) != null) {
                size = set.size() + size2;
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(size));
                linkedHashSet.addAll(set);
                AnonymousClass016.A16(iterable, linkedHashSet);
                return linkedHashSet;
            }
        }
        size = set.size() * 2;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC16850sd.A0L(size));
        linkedHashSet2.addAll(set);
        AnonymousClass016.A16(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static final LinkedHashSet A01(Object obj, java.util.Set set) {
        C14360o3.A0B(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final java.util.Set A02(Iterable iterable, java.util.Set set) {
        C14360o3.A0B(set, 0);
        C14360o3.A0B(iterable, 1);
        if (!(iterable instanceof Collection)) {
            iterable = AbstractC001800i.A0a(iterable);
        }
        Collection<?> collection = (Collection) iterable;
        if (collection.isEmpty()) {
            return AbstractC001800i.A0k(set);
        }
        if (collection instanceof java.util.Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!collection.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(collection);
        return linkedHashSet2;
    }

    public static final java.util.Set A03(Object obj, java.util.Set set) {
        C14360o3.A0B(set, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC16850sd.A0L(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            if (!z && C14360o3.A0K(obj2, obj)) {
                z = true;
            } else {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }
}
