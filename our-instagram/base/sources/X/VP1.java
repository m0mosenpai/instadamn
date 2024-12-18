package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class VP1 {
    public static Map A00(XGG xgg) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgg.Aev() != null) {
            linkedHashMap.put("background_color_hex", xgg.Aev());
        }
        if (xgg.Aj2() != null) {
            linkedHashMap.put("button_height_pct", AbstractC166997dE.A0f(xgg.Aj2()));
        }
        if (xgg.AjF() != null) {
            linkedHashMap.put("button_x", AbstractC166997dE.A0f(xgg.AjF()));
        }
        if (xgg.AjG() != null) {
            linkedHashMap.put("button_y", AbstractC166997dE.A0f(xgg.AjG()));
        }
        if (xgg.CSK() != null) {
            linkedHashMap.put("is_dark_mode", xgg.CSK());
        }
        if (xgg.BKy() != null) {
            linkedHashMap.put("label_height_pct", AbstractC166997dE.A0f(xgg.BKy()));
        }
        if (xgg.BL2() != null) {
            linkedHashMap.put("label_width_pct", AbstractC166997dE.A0f(xgg.BL2()));
        }
        if (xgg.Bav() != null) {
            linkedHashMap.put("padding_pct", AbstractC166997dE.A0f(xgg.Bav()));
        }
        if (xgg.C6B() != null) {
            linkedHashMap.put("text_color_hex", xgg.C6B());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
