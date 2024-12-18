package X;

import java.util.Comparator;
import java.util.List;

/* renamed from: X.4H5, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4H5 {
    public static int A01(C4H4 c4h4, C93444Gx c93444Gx, List list) {
        C2E0 c2e0 = c4h4.A00;
        Object obj = c2e0.A01;
        Object obj2 = c4h4.A01;
        if (obj.equals(obj2)) {
            return 0;
        }
        if (c2e0.A00.equals(obj2)) {
            return list.size();
        }
        int A00 = A00(c93444Gx.A00, obj2, c93444Gx.A01.A02, list);
        if (A00 >= 0) {
            return A00;
        }
        return A00 ^ (-1);
    }

    public static int A02(C4H4 c4h4, C93444Gx c93444Gx, List list) {
        C2E0 c2e0 = c4h4.A00;
        Object obj = c2e0.A01;
        Object obj2 = c4h4.A02;
        if (obj.equals(obj2)) {
            return 0;
        }
        if (c2e0.A00.equals(obj2)) {
            return list.size();
        }
        int A00 = A00(c93444Gx.A00, obj2, c93444Gx.A01.A02, list);
        int i = A00 ^ (-1);
        if (A00 < 0) {
            return i;
        }
        return A00 + 1;
    }

    public static List A03(C4H4 c4h4, C93444Gx c93444Gx, List list) {
        boolean z = false;
        if (c4h4.A00 == c93444Gx.A01) {
            z = true;
        }
        C18C.A0E(z);
        int A02 = A02(c4h4, c93444Gx, list);
        int A01 = A01(c4h4, c93444Gx, list);
        if (A02 <= A01) {
            return list.subList(A02, A01);
        }
        return list.subList(0, 0);
    }

    public static int A00(C2n2 c2n2, Object obj, Comparator comparator, List list) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(c2n2.apply(list.get(i2)), obj);
            if (compare < 0) {
                i = i2 + 1;
            } else if (compare > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }
}
