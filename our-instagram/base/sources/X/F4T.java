package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4T {
    public static E6W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            E6W e6w = new E6W();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1Y(A0s)) {
                    e6w.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("text".equals(A0s)) {
                    e6w.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("end_timestamp_s".equals(A0s)) {
                    e6w.A01 = AbstractC31173DnH.A0h(c16l);
                } else if ("is_active".equals(A0s)) {
                    e6w.A07 = c16l.A0d();
                } else if ("grid_view_url".equals(A0s)) {
                    e6w.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("prize".equals(A0s)) {
                    e6w.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("submission_count".equals(A0s)) {
                    e6w.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("has_viewer_contributed".equals(A0s)) {
                    e6w.A06 = c16l.A0d();
                }
                c16l.A0z();
            }
            return e6w;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
