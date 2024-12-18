package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFN {
    public static Map A00(InterfaceC107774tM interfaceC107774tM) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC107774tM.AZh() != null) {
            List<InterfaceC107754tK> AZh = interfaceC107774tM.AZh();
            ArrayList arrayList = null;
            if (AZh != null) {
                arrayList = new ArrayList();
                for (InterfaceC107754tK interfaceC107754tK : AZh) {
                    if (interfaceC107754tK != null) {
                        arrayList.add(interfaceC107754tK.F7o());
                    }
                }
            }
            linkedHashMap.put("added_to", arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
