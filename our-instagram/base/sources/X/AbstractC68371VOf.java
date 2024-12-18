package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.VOf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC68371VOf {
    public static Map A00(XG4 xg4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xg4.AbR() != null) {
            linkedHashMap.put("alpha", AbstractC166997dE.A0f(xg4.AbR()));
        }
        if (xg4.Agi() != null) {
            linkedHashMap.put("blur_radius_px", xg4.Agi());
        }
        if (xg4.AhU() != null) {
            linkedHashMap.put("bottom_color", xg4.AhU());
        }
        if (xg4.C9T() != null) {
            linkedHashMap.put("top_color", xg4.C9T());
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
