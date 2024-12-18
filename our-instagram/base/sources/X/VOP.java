package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOP {
    public static Map A00(InterfaceC104854ns interfaceC104854ns) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC104854ns.Ahg() != null) {
            linkedHashMap.put("bounding_box_bottom_right_x", AbstractC166997dE.A0f(interfaceC104854ns.Ahg()));
        }
        if (interfaceC104854ns.Ahh() != null) {
            linkedHashMap.put("bounding_box_bottom_right_y", AbstractC166997dE.A0f(interfaceC104854ns.Ahh()));
        }
        if (interfaceC104854ns.Ahi() != null) {
            linkedHashMap.put("bounding_box_top_left_x", AbstractC166997dE.A0f(interfaceC104854ns.Ahi()));
        }
        if (interfaceC104854ns.Ahj() != null) {
            linkedHashMap.put("bounding_box_top_left_y", AbstractC166997dE.A0f(interfaceC104854ns.Ahj()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
