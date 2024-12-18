package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Htd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40273Htd {
    public static Map A00(JMU jmu) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmu.AXx() != null) {
            A1I.put("accessibility_hint", jmu.AXx());
        }
        if (jmu.AYf() != null) {
            A1I.put("action_tooltip_text", jmu.AYf());
        }
        if (jmu.AgO() != null) {
            A1I.put("bloks_app", jmu.AgO());
        }
        Map AgZ = jmu.AgZ();
        if (AgZ != null) {
            A1I.put("bloks_parameters", AgZ);
        }
        if (jmu.getId() != null) {
            AbstractC37300Gc1.A12(jmu.getId(), A1I);
        }
        if (jmu.BYQ() != null) {
            A1I.put("nux_tooltip_text", jmu.BYQ());
        }
        if (jmu.BvJ() != null) {
            A1I.put("should_preload", jmu.BvJ());
        }
        if (jmu.Bx0() != null) {
            A1I.put("show_tooltip_count", jmu.Bx0());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
