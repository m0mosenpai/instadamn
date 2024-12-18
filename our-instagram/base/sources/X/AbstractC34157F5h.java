package X;

import java.io.IOException;

/* renamed from: X.F5h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34157F5h {
    public static C29251b2 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29251b2 c29251b2 = new C29251b2();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("group_profile_id".equals(A0s)) {
                    c29251b2.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_share_type".equals(A0s)) {
                    c29251b2.A01 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29251b2, A0s);
                }
                c16l.A0z();
            }
            return c29251b2;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
