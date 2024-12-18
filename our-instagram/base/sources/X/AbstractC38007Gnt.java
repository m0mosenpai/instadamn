package X;

import java.io.IOException;

/* renamed from: X.Gnt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38007Gnt {
    public static C38008Gnu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38008Gnu c38008Gnu = new C38008Gnu();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("split_time".equals(A0q)) {
                    c38008Gnu.A00 = c16l.A1D();
                } else if ("is_split_point_at_start".equals(A0q)) {
                    c38008Gnu.A02 = c16l.A0d();
                } else if ("trimmed_duration_after_split".equals(A0q)) {
                    c38008Gnu.A01 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c38008Gnu;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
