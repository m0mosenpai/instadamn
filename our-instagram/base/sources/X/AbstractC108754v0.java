package X;

import java.io.IOException;

/* renamed from: X.4v0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108754v0 {
    public static C108764v1 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            Boolean bool3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("tap_state_animation_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("tap_state_bottom_call_controls_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("tap_to_show_pill_enabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("tap_state_animation_enabled", "IGLiveHaloCallControlsImpl");
            } else if (bool2 != null || !(c16l instanceof C07950bF)) {
                if (bool3 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("tap_to_show_pill_enabled", "IGLiveHaloCallControlsImpl");
                } else {
                    return new C108764v1(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00("tap_state_bottom_call_controls_enabled", "IGLiveHaloCallControlsImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
