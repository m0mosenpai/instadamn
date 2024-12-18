package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class U77 {
    public static final Object A00(C6FW c6fw) {
        Object obj;
        Object obj2;
        int A0D = AbstractC65702TsY.A0D(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A00;
        Map map = (Map) c6fw.A00.get(3);
        if (map != null) {
            obj = map.get("points");
        } else {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            Iterator A15 = AbstractC166997dE.A15(map2);
            while (A15.hasNext()) {
                Map.Entry entry = (Map.Entry) A15.next();
                U4N.A03((Long) entry.getValue(), str, AnonymousClass001.A0T(str2, (String) entry.getKey(), '_'), AbstractC06930Yk.A0E(), A0D);
            }
        }
        if (map != null) {
            obj2 = map.get("annotations");
        } else {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            LinkedHashMap A0y = AbstractC43594JPz.A0y(map3);
            Iterator A152 = AbstractC166997dE.A15(map3);
            while (A152.hasNext()) {
                Map.Entry entry2 = (Map.Entry) A152.next();
                A0y.put(AnonymousClass001.A0T(str2, (String) entry2.getKey(), '_'), entry2.getValue());
            }
            InterfaceC72008XEw A002 = U4N.A00(str, A0D);
            if (A002 != null) {
                U4N.A02(A002, A0y);
            }
        }
        return null;
    }
}
