package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I0U {
    public static C114645Fu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(429).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_open_carousel".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_parent_media".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_prompt_page".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(475).equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C114645Fu(bool, bool2, bool3, bool4, bool5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
