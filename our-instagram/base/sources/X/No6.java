package X;

import java.util.Map;

/* loaded from: classes9.dex */
public abstract class No6 {
    public static Object A00(String str, Map map) {
        if (map.get("metadata") != null) {
            Map map2 = (Map) map.get("metadata");
            if (map2.containsKey("graphql")) {
                Map map3 = (Map) map2.get("graphql");
                if (map3.containsKey(str)) {
                    return map3.get(str);
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
