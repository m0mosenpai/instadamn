package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hmc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39889Hmc {
    public static Map A00(JLN jln) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jln.B4c() != null) {
            A1I.put("fb_crosspost_deeplink_profile_id", jln.B4c());
        }
        if (jln.B4d() != null) {
            A1I.put("fb_crosspost_fbid", jln.B4d());
        }
        if (jln.C70() != null) {
            A1I.put("th_unified_feedback_row_tap_target_url", jln.C70());
        }
        if (jln.CCY() != null) {
            A1I.put("unified_feedback_enabled", jln.CCY());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
