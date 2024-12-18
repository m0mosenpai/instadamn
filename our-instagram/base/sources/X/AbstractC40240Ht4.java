package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ht4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40240Ht4 {
    public static Map A00(JLW jlw) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlw.AYe() != null) {
            A1I.put("action_text", jlw.AYe());
        }
        if (jlw.C3Z() != null) {
            A1I.put("subtext", jlw.C3Z());
        }
        if (jlw.C3r() != null) {
            A1I.put("suggested_product_ids", jlw.C3r());
        }
        if (jlw.getText() != null) {
            AbstractC37300Gc1.A15(jlw.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
