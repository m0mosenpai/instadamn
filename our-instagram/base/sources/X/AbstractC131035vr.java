package X;

import java.io.IOException;

/* renamed from: X.5vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC131035vr {
    public static C131045vs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("p_comment_button_tap_LOGGING_ONLY_DO_NOT_USE".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("p_reshare_button_tap".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("should_force_new_preload_chaining".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_prefetch_comments".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("should_prefetch_profile".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("should_preload_chaining".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C131045vs(bool, bool2, bool3, bool4, f, f2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
