package X;

import java.io.IOException;

/* renamed from: X.3vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87763vk {
    public static C46o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("should_show_ig_only_user_disclosure_in_3dot_menu".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("should_show_ig_only_user_disclosure_through_cta_click".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C46o(bool, bool2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
