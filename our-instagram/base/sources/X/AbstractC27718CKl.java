package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CKl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27718CKl {
    public static final Float A00(Object obj, Map map) {
        Object obj2;
        Iterator A15 = AbstractC166997dE.A15(map);
        while (true) {
            if (A15.hasNext()) {
                obj2 = A15.next();
                if (C14360o3.A0K(((Map.Entry) obj2).getValue(), obj)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }
}
