package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68382VOq {
    public static Map A00(XGA xga) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xga.BEp() != null) {
            linkedHashMap.put("icon_location", xga.BEp());
        }
        if (xga.BEw() != null) {
            linkedHashMap.put("icon_type", xga.BEw());
        }
        if (xga.getText() != null) {
            linkedHashMap.put("text", xga.getText());
        }
        if (xga.getTextColor() != null) {
            linkedHashMap.put("text_color", xga.getTextColor());
        }
        if (xga.C6F() != null) {
            linkedHashMap.put("text_font_size", AbstractC166997dE.A0f(xga.C6F()));
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
