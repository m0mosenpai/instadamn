package X;

import java.io.IOException;

/* renamed from: X.Kja, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46597Kja {
    public static C51749MtY parseFromJson(C16L c16l) {
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
            Boolean bool6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("enable_likes".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("enable_push".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_quote_posts".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_replies".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_reposts".equals(A0s)) {
                    bool5 = AbstractC166997dE.A0d(c16l);
                } else if ("enable_view_milestones".equals(A0s)) {
                    bool6 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new C51749MtY(1, bool, bool2, bool3, bool4, bool5, bool6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
