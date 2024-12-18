package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOT {
    public static Map A00(InterfaceC72034XFw interfaceC72034XFw) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC72034XFw.Aep() != null) {
            linkedHashMap.put("avg_rating", AbstractC166997dE.A0f(interfaceC72034XFw.Aep()));
        }
        if (interfaceC72034XFw.BpC() != null) {
            linkedHashMap.put("review_count", interfaceC72034XFw.BpC());
        }
        if (interfaceC72034XFw.BqE() != null) {
            linkedHashMap.put(AbstractC111324zv.A00(1241), AbstractC166997dE.A0f(interfaceC72034XFw.BqE()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
