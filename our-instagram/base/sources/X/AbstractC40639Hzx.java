package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Hzx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40639Hzx {
    public static final void A00(List list, List list2, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IGU igu = (IGU) it.next();
            if (C14360o3.A0K(igu.A01.name(), str)) {
                list2.add(igu);
                list.remove(igu);
                return;
            }
        }
    }
}
