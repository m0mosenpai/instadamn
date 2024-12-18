package X;

import java.io.IOException;

/* renamed from: X.Knp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46856Knp {
    public static C26069Bfx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26069Bfx c26069Bfx = new C26069Bfx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    c26069Bfx.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("interactive_user_id".equals(A0s)) {
                    c26069Bfx.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("interactive_sticker_id".equals(A0s)) {
                    c26069Bfx.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("interactive_sticker_type".equals(A0s)) {
                    c26069Bfx.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c26069Bfx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
