package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HnO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39933HnO {
    public static Map A00(JLP jlp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlp.Aey() != null) {
            A1I.put("background_height", jlp.Aey());
        }
        if (jlp.Af8() != null) {
            A1I.put("background_url", jlp.Af8());
        }
        if (jlp.AfA() != null) {
            A1I.put("background_width", jlp.AfA());
        }
        if (jlp.getText() != null) {
            AbstractC37300Gc1.A15(jlp.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
