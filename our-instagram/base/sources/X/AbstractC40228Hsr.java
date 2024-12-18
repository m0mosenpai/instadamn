package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40228Hsr {
    public static Map A00(C5H7 c5h7) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5h7.Baa() != null) {
            A1I.put("overlay_subtitle", c5h7.Baa());
        }
        if (c5h7.Bac() != null) {
            A1I.put("overlay_title", c5h7.Bac());
        }
        if (c5h7.Bae() != null) {
            A1I.put("overlay_upper_subtitle", c5h7.Bae());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
