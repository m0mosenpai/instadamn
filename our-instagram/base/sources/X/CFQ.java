package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CFQ {
    public static Map A00(InterfaceC31131DmE interfaceC31131DmE) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC31131DmE.getAttributionAppId() != null) {
            A1I.put("attribution_app_id", interfaceC31131DmE.getAttributionAppId());
        }
        if (interfaceC31131DmE.getAttributionAppName() != null) {
            A1I.put(AbstractC111324zv.A00(1946), interfaceC31131DmE.getAttributionAppName());
        }
        if (interfaceC31131DmE.BdT() != null) {
            A1I.put(AbstractC111324zv.A00(2875), interfaceC31131DmE.BdT().F7o());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
