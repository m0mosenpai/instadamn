package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: X.016, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class AnonymousClass016 extends C01T {
    public static final Object A13(List list) {
        C14360o3.A0B(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static final Object A15(List list) {
        C14360o3.A0B(list, 0);
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    public static final void A16(Iterable iterable, Collection collection) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(iterable, 1);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void A17(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(iterable, 0);
        A19(iterable, interfaceC16660sJ, true);
    }

    public static final void A18(Collection collection, Object[] objArr) {
        C14360o3.A0B(collection, 0);
        C14360o3.A0B(objArr, 1);
        List asList = Arrays.asList(objArr);
        C14360o3.A07(asList);
        collection.addAll(asList);
    }

    public static final boolean A1A(List list, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(interfaceC16660sJ, 1);
        return A1B(list, interfaceC16660sJ, true);
    }

    public static final boolean A1B(List list, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC15590qF) && !(list instanceof InterfaceC16560s2)) {
                C15500q5.A07(list, "kotlin.collections.MutableIterable");
                throw C00O.createAndThrow();
            }
            return A19(list, interfaceC16660sJ, z);
        }
        int size = list.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i2);
                if (((Boolean) interfaceC16660sJ.invoke(obj)).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int size2 = list.size() - 1;
        if (i > size2) {
            return true;
        }
        while (true) {
            list.remove(size2);
            if (size2 != i) {
                size2--;
            } else {
                return true;
            }
        }
    }

    public static final Object A14(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final boolean A19(Iterable iterable, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) interfaceC16660sJ.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
