package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80533ii {
    public static final ArrayList A00(C006802i c006802i, Integer num, Integer num2, List list, List list2) {
        C14360o3.A0B(list, 0);
        if (num != null && num2 != null && c006802i != null) {
            c006802i.markerPoint(num.intValue(), num2.intValue(), "FEED_ITEM_FILTERING_START");
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Iterator it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((InterfaceC28041Xi) it.next()).apply(obj)) {
                        break;
                    }
                } else {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        if (num != null && num2 != null && c006802i != null) {
            c006802i.markerPoint(num.intValue(), num2.intValue(), "FEED_ITEM_FILTERING_END");
        }
        return arrayList;
    }
}
