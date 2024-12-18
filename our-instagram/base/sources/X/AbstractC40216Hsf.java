package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40216Hsf {
    public static Map A00(JLV jlv) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlv.AaG() != null) {
            A1I.put("ads_toggled_on", jlv.AaG());
        }
        if (jlv.Ai0() != null) {
            A1I.put("brand_safety_status_for_media_edit", jlv.Ai0());
        }
        if (jlv.CYA() != null) {
            A1I.put("is_media_eligible_for_inserting_ads", jlv.CYA());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
