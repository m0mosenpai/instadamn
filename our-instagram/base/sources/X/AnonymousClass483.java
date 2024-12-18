package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.483, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass483 {
    public static final Object A00(InterfaceC28041Xi interfaceC28041Xi, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC28041Xi, 1);
        for (Object obj : list) {
            if (interfaceC28041Xi.apply(obj)) {
                return obj;
            }
        }
        return null;
    }

    public static final Object A01(InterfaceC28041Xi interfaceC28041Xi, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC28041Xi, 1);
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object previous = listIterator.previous();
            if (interfaceC28041Xi.apply(previous)) {
                return previous;
            }
        }
        return null;
    }

    public static final ArrayList A02(Comparator comparator, List list, List list2) {
        C14360o3.A0B(list2, 1);
        C14360o3.A0B(comparator, 2);
        int size = list.size();
        int size2 = list2.size();
        ArrayList arrayList = new ArrayList(size + size2);
        int i = 0;
        int i2 = 0;
        while (i < size && i2 < size2) {
            Object obj = list.get(i);
            Object obj2 = list2.get(i2);
            int compare = comparator.compare(obj, obj2);
            if (compare == 0) {
                arrayList.add(obj);
                i++;
            } else if (compare < 0) {
                arrayList.add(obj);
                i++;
            } else {
                arrayList.add(obj2);
            }
            i2++;
        }
        while (i < size) {
            arrayList.add(list.get(i));
            i++;
        }
        while (i2 < size2) {
            arrayList.add(list2.get(i2));
            i2++;
        }
        return arrayList;
    }

    public static final List A03(InterfaceC28041Xi interfaceC28041Xi, List list) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC28041Xi, 1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (interfaceC28041Xi.apply(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean A04(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }
}
