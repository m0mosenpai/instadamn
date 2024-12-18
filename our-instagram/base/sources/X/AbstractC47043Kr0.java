package X;

import java.io.IOException;

/* renamed from: X.Kr0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47043Kr0 {
    public static C47636L1v parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47636L1v c47636L1v = new C47636L1v();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("instagram_user_id".equals(A0s)) {
                    c47636L1v.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31187DnW.A01().equals(A0s)) {
                    c47636L1v.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_picture".equals(A0s)) {
                    c47636L1v.A00 = AbstractC47042Kqz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c47636L1v;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
