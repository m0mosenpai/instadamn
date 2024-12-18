package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7jL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170687jL {
    public Map A00;

    public final void A00(Object obj, String str) {
        Map map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            this.A00 = map;
        }
        map.put(str, obj);
    }
}
