package X;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: X.WhO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70808WhO implements InterfaceC13000lm {
    public final Map A00 = new LinkedHashMap();

    public static final void A00(C51757Mtg c51757Mtg, C70808WhO c70808WhO, String str, String str2) {
        Map map = c70808WhO.A00;
        synchronized (map) {
            Object obj = map.get(str);
            if (obj == null) {
                obj = new LinkedHashMap();
                map.put(str, obj);
            }
            Map map2 = (Map) obj;
            Object obj2 = map2.get(str2);
            if (obj2 == null) {
                obj2 = new LinkedHashSet();
                map2.put(str2, obj2);
            }
            ((java.util.Set) obj2).add(c51757Mtg);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Map map = this.A00;
        synchronized (map) {
            map.clear();
        }
    }
}
