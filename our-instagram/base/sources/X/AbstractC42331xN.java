package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42331xN {
    public static C38011pl A00(InterfaceC39571se interfaceC39571se, Boolean bool, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, List list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((JK6) it.next()).F7D());
            }
        } else {
            arrayList = null;
        }
        return new C38011pl(interfaceC39571se != null ? interfaceC39571se.Eyq() : null, bool, f, num, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14, arrayList);
    }
}
