package X;

import java.io.IOException;

/* renamed from: X.Nyg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54261Nyg {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.OCP, java.lang.Object] */
    public static OCP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC58317Pt9.A00(20).equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("comment_id".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("like_count".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if (AbstractC111324zv.A00(428).equals(A0s)) {
                    obj.A03 = c16l.A0d();
                } else if ("has_liked_user_id".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
