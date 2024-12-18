package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16960so extends C0eM {
    public static final int A1K(Comparable comparable, List list, int i) {
        int i2 = 0;
        A1V(list.size(), i);
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int A00 = C2BS.A00((Comparable) list.get(i4), comparable);
            if (A00 < 0) {
                i2 = i4 + 1;
            } else if (A00 > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i2 + 1);
    }

    public static final int A1L(List list, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2 = 0;
        A1V(list.size(), i);
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int intValue = ((Number) interfaceC16660sJ.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i2 = i4 + 1;
            } else if (intValue > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i2 + 1);
    }

    public static final ArrayList A1M(Object... objArr) {
        return new ArrayList(new C17000ss(objArr, true));
    }

    public static final ArrayList A1N(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C17000ss(objArr, true));
    }

    public static final List A1P(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                List singletonList = Collections.singletonList(list.get(0));
                C14360o3.A07(singletonList);
                return singletonList;
            }
            return list;
        }
        return C16930sl.A00;
    }

    public static final List A1Q(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            C14360o3.A07(asList);
            return asList;
        }
        return C16930sl.A00;
    }

    public static final List A1R(Object... objArr) {
        C14360o3.A0B(objArr, 0);
        return AbstractC009903n.A0I(objArr);
    }

    public static final C17u A1S(Collection collection) {
        C14360o3.A0B(collection, 0);
        return new C17u(0, collection.size() - 1);
    }

    public static final void A1V(int i, int i2) {
        if (0 <= i2) {
            if (i2 <= i) {
                return;
            } else {
                throw new IndexOutOfBoundsException(AnonymousClass001.A0n("toIndex (", ") is greater than size (", ").", i2, i));
            }
        }
        throw new IllegalArgumentException(AnonymousClass001.A0n("fromIndex (", ") is greater than toIndex (", ").", 0, i2));
    }

    public static final List A1O(Object obj) {
        if (obj != null) {
            List singletonList = Collections.singletonList(obj);
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return C16930sl.A00;
    }

    public static final void A1T() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static final void A1U() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
