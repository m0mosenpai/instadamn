package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class Hp8 {
    public static Map A00(JLR jlr) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jlr.AaG() != null) {
            A1I.put("ads_toggled_on", jlr.AaG());
        }
        if (jlr.Ai0() != null) {
            A1I.put("brand_safety_status_for_media_edit", jlr.Ai0());
        }
        if (jlr.Cfk() != null) {
            A1I.put("is_video_eligible_for_inserting_ads", jlr.Cfk());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
