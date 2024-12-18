package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68376VOk {
    public static Map A00(XGC xgc) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xgc.AhM() != null) {
            linkedHashMap.put("border_color", xgc.AhM());
        }
        if (xgc.AhO() != null) {
            linkedHashMap.put("border_width_float", AbstractC166997dE.A0f(xgc.AhO()));
        }
        if (xgc.Ars() != null) {
            linkedHashMap.put("corner_radius", AbstractC166997dE.A0f(xgc.Ars()));
        }
        if (xgc.BDS() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, xgc.BDS());
        }
        if (xgc.getUrl() != null) {
            linkedHashMap.put("url", xgc.getUrl());
        }
        if (xgc.CHg() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, xgc.CHg());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
