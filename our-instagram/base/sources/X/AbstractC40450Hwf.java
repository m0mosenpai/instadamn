package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hwf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40450Hwf {
    public static Map A00(JME jme) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jme.AgO() != null) {
            A1I.put("bloks_app", jme.AgO());
        }
        Map AgZ = jme.AgZ();
        if (AgZ != null) {
            A1I.put("bloks_parameters", AgZ);
        }
        if (jme.getId() != null) {
            AbstractC37300Gc1.A12(jme.getId(), A1I);
        }
        if (jme.BYQ() != null) {
            A1I.put("nux_tooltip_text", jme.BYQ());
        }
        if (jme.BvJ() != null) {
            A1I.put("should_preload", jme.BvJ());
        }
        if (jme.Bx0() != null) {
            A1I.put("show_tooltip_count", jme.Bx0());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
