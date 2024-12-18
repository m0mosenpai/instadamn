package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gcn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37345Gcn {
    public static Map A00(InterfaceC39681sr interfaceC39681sr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC39681sr.AgQ() != null) {
            linkedHashMap.put("bloks_app_url", interfaceC39681sr.AgQ());
        }
        if (interfaceC39681sr.BuU() != null) {
            linkedHashMap.put("sharing_friction_payload", interfaceC39681sr.BuU());
        }
        interfaceC39681sr.getShouldHaveSharingFriction();
        linkedHashMap.put("should_have_sharing_friction", Boolean.valueOf(interfaceC39681sr.getShouldHaveSharingFriction()));
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
