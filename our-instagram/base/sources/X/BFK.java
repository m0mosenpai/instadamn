package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFK {
    public static Map A00(InterfaceC87483vG interfaceC87483vG) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC87483vG.AYX() != null) {
            linkedHashMap.put("action_data", interfaceC87483vG.AYX());
        }
        if (interfaceC87483vG.AYY() != null) {
            linkedHashMap.put("action_id", interfaceC87483vG.AYY());
        }
        if (interfaceC87483vG.CVs() != null) {
            linkedHashMap.put("is_high_value", interfaceC87483vG.CVs());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
