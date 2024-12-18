package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127005oe {
    public static final C5C8 A00;

    public static final List A00(C5C8 c5c8, int i, int i2) {
        List list;
        ArrayList arrayList = null;
        if (i != i2 && (list = c5c8.A03) != null) {
            if (i == 0 && i2 >= c5c8.A00.length()) {
                return list;
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C127015of c127015of = (C127015of) obj;
                if (A02(i, i2, c127015of.A01, c127015of.A00)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C127015of c127015of2 = (C127015of) arrayList2.get(i4);
                arrayList.add(new C127015of(c127015of2.A02, C17s.A03(c127015of2.A01, i, i2) - i, C17s.A03(c127015of2.A00, i, i2) - i));
            }
        }
        return arrayList;
    }

    public static final List A01(List list, int i, int i2) {
        if (i <= i2) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj = list.get(i3);
                    C127015of c127015of = (C127015of) obj;
                    if (A02(i, i2, c127015of.A01, c127015of.A00)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C127015of c127015of2 = (C127015of) arrayList.get(i4);
                    arrayList2.add(new C127015of(c127015of2.A02, c127015of2.A03, Math.max(i, c127015of2.A01) - i, Math.min(i2, c127015of2.A00) - i));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("start (", ") should be less than or equal to end (", ')', i, i2));
    }

    static {
        C16930sl c16930sl = C16930sl.A00;
        A00 = new C5C8(c16930sl, c16930sl, "");
    }

    public static final boolean A02(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4)) {
            if (i <= i3 && i4 <= i2) {
                if (i2 == i4) {
                    boolean z = false;
                    if (i3 == i4) {
                        z = true;
                    }
                    boolean z2 = false;
                    if (i == i2) {
                        z2 = true;
                    }
                    if (z == z2) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            if (i3 <= i && i2 <= i4) {
                if (i4 != i2) {
                    return true;
                }
                boolean z3 = false;
                if (i == i2) {
                    z3 = true;
                }
                boolean z4 = false;
                if (i3 == i4) {
                    z4 = true;
                }
                if (z3 == z4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
