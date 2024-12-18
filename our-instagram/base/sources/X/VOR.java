package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VOR {
    public static Map A00(InterfaceC104864nt interfaceC104864nt) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC104864nt.Ahg() != null) {
            linkedHashMap.put("bounding_box_bottom_right_x", AbstractC166997dE.A0f(interfaceC104864nt.Ahg()));
        }
        if (interfaceC104864nt.Ahh() != null) {
            linkedHashMap.put("bounding_box_bottom_right_y", AbstractC166997dE.A0f(interfaceC104864nt.Ahh()));
        }
        if (interfaceC104864nt.Ahi() != null) {
            linkedHashMap.put("bounding_box_top_left_x", AbstractC166997dE.A0f(interfaceC104864nt.Ahi()));
        }
        if (interfaceC104864nt.Ahj() != null) {
            linkedHashMap.put("bounding_box_top_left_y", AbstractC166997dE.A0f(interfaceC104864nt.Ahj()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
