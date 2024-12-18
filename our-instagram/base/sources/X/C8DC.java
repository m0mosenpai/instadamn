package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8DC, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8DC {
    public static final ArrayList A00(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C8DD(((Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
