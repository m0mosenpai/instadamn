package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.01S, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C01S extends AbstractC023009e {
    public static final List A00(Map map) {
        C14360o3.A0B(map, 0);
        if (map.size() != 0) {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    List singletonList = Collections.singletonList(new C09530e4(entry.getKey(), entry.getValue()));
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
                ArrayList arrayList = new ArrayList(map.size());
                arrayList.add(new C09530e4(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C09530e4(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return C16930sl.A00;
    }
}
