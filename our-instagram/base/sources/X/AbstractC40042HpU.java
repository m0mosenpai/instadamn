package X;

import java.io.IOException;

/* renamed from: X.HpU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40042HpU {
    public static H44 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            Integer num2 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ads_display_mode".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("disable_liker_list_navigation".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("display_mode".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("hide_view_count".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_daisy".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("is_in_daisy_controls".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("show_author_view_likes_button".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("show_count_in_likers_list".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                } else if ("show_daisy_liker_list_header".equals(A0s)) {
                    bool7 = AbstractC166997dE.A0d(c16l);
                } else if ("show_learn_more".equals(A0s)) {
                    bool8 = AbstractC166997dE.A0d(c16l);
                } else if ("show_view_count_in_likers_list".equals(A0s)) {
                    bool9 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new H44(bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
