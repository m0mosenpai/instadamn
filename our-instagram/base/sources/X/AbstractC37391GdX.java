package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37391GdX {
    public static Map A00(InterfaceC39501sV interfaceC39501sV) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC39501sV.Aq7() != null) {
            List<InterfaceC39481sT> Aq7 = interfaceC39501sV.Aq7();
            ArrayList arrayList = null;
            if (Aq7 != null) {
                arrayList = new ArrayList();
                for (InterfaceC39481sT interfaceC39481sT : Aq7) {
                    if (interfaceC39481sT != null) {
                        arrayList.add(interfaceC39481sT.F7o());
                    }
                }
            }
            linkedHashMap.put("conditions", arrayList);
        }
        if (interfaceC39501sV.BxF() != null) {
            linkedHashMap.put("signal", interfaceC39501sV.BxF());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
