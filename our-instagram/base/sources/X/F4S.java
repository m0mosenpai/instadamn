package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4S {
    public static C32067E6t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32067E6t c32067E6t = new C32067E6t();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Y(A0s)) {
                    c32067E6t.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("item_id".equals(A0s)) {
                    c32067E6t.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("end_timestamp_s".equals(A0s)) {
                    c32067E6t.A00 = AbstractC31173DnH.A0h(c16l);
                } else if ("grid_view_url".equals(A0s)) {
                    c32067E6t.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("has_creator_replied".equals(A0s)) {
                    c32067E6t.A05 = c16l.A0d();
                } else if ("has_submissions".equals(A0s)) {
                    c32067E6t.A06 = c16l.A0d();
                } else if ("has_viewer_contributed".equals(A0s)) {
                    c32067E6t.A07 = c16l.A0d();
                } else if ("text".equals(A0s)) {
                    c32067E6t.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c32067E6t;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
