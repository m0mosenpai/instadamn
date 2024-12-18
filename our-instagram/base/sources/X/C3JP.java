package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3JP, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3JP {
    public static final String A00(String str, Map map) {
        Object obj;
        List list;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = (String) ((Map.Entry) obj).getKey();
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (list = (List) entry.getValue()) == null) {
            return null;
        }
        return (String) AbstractC001800i.A0J(list);
    }
}
