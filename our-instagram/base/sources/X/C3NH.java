package X;

import java.io.IOException;

/* renamed from: X.3NH, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3NH {
    public static C3NK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            Integer num5 = null;
            Integer num6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("avg_core_sessions_per_day".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("follow_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("is_high_me_user".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_high_usage_likelihood".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_teen".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("lness28_score".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("stories_imp_bucket".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("viewer_swipe_preload_count".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                } else if ("viewer_tap_preload_count".equals(A0q)) {
                    num5 = Integer.valueOf(c16l.A1D());
                } else if ("warm_start_refresh_timer_in_seconds".equals(A0q)) {
                    num6 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C3NK(bool, bool2, bool3, f, num, num2, num3, num4, num5, num6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
