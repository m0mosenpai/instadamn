package X;

import com.instagram.common.lispy.lang.BloksScript;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1338762v {
    public static final C1338862w A00(Map map) {
        C14360o3.A0B(map, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new BloksScript(null, (String) entry.getValue(), null, -1));
        }
        return new C1338862w(linkedHashMap);
    }
}
