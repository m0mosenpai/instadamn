package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VPB {
    public static Map A00(InterfaceC31126Dm9 interfaceC31126Dm9) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC31126Dm9.getDark() != null) {
            linkedHashMap.put("dark", interfaceC31126Dm9.getDark());
        }
        if (interfaceC31126Dm9.getLight() != null) {
            linkedHashMap.put("light", interfaceC31126Dm9.getLight());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
