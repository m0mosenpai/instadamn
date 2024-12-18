package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1W {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9i, X.1um, X.1ul] */
    public static C38860H9i parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"show_follow_button".equals(A0s) && !"show_save_button".equals(A0s) && !AbstractC111324zv.A00(3104).equals(A0s)) {
                    C55702hA.A01(c16l, c40791um, A0s);
                } else {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
