package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOV {
    public static Map A00(XG3 xg3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xg3.AxR() != null) {
            linkedHashMap.put("dimension", xg3.AxR());
        }
        if (xg3.BkT() != null) {
            linkedHashMap.put("rating_text", xg3.BkT());
        }
        if (xg3.BqF() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1242), xg3.BqF());
        }
        if (xg3.BqG() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1243), xg3.BqG());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
