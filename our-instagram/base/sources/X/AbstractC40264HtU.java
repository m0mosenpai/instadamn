package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40264HtU {
    public static Map A00(JLY jly) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jly.AgO() != null) {
            A1I.put("bloks_app", jly.AgO());
        }
        if (jly.getId() != null) {
            AbstractC37300Gc1.A12(jly.getId(), A1I);
        }
        if (jly.BvJ() != null) {
            A1I.put("should_preload", jly.BvJ());
        }
        if (jly.Bx0() != null) {
            A1I.put("show_tooltip_count", jly.Bx0());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
