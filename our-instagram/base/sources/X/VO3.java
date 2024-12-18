package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VO3 {
    public static Map A00(XG8 xg8) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xg8.CDI() != null) {
            linkedHashMap.put("upsell_button_text", xg8.CDI());
        }
        xg8.CDK();
        linkedHashMap.put("upsell_position", Integer.valueOf(xg8.CDK()));
        if (xg8.CDL() != null) {
            linkedHashMap.put("upsell_subtitle", xg8.CDL());
        }
        if (xg8.CDM() != null) {
            linkedHashMap.put("upsell_title", xg8.CDM());
        }
        if (xg8.CDN() != null) {
            linkedHashMap.put("upsell_type", xg8.CDN());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
