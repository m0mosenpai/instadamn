package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.S3p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract /* synthetic */ class AbstractC62244S3p {
    public static Map A00(C3NM c3nm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c3nm.Aeo() != null) {
            A1I.put("avg_core_sessions_per_day", AnonymousClass010.A0m(String.valueOf(c3nm.Aeo())));
        }
        if (c3nm.B7I() != null) {
            A1I.put("follow_count", c3nm.B7I());
        }
        if (c3nm.CVp() != null) {
            A1I.put("is_high_me_user", c3nm.CVp());
        }
        if (c3nm.CVr() != null) {
            A1I.put("is_high_usage_likelihood", c3nm.CVr());
        }
        if (c3nm.CeH() != null) {
            A1I.put("is_teen", c3nm.CeH());
        }
        if (c3nm.BO7() != null) {
            A1I.put("lness28_score", c3nm.BO7());
        }
        if (c3nm.C10() != null) {
            A1I.put("stories_imp_bucket", c3nm.C10());
        }
        if (c3nm.CGL() != null) {
            A1I.put("viewer_swipe_preload_count", c3nm.CGL());
        }
        if (c3nm.CGM() != null) {
            A1I.put("viewer_tap_preload_count", c3nm.CGM());
        }
        if (c3nm.CHC() != null) {
            A1I.put("warm_start_refresh_timer_in_seconds", c3nm.CHC());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
