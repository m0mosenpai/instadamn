package X;

import java.io.IOException;

/* renamed from: X.Nu5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53994Nu5 {
    public static OAF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OAF oaf = new OAF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("instagram_user_id".equals(A0s)) {
                    oaf.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31187DnW.A01().equals(A0s)) {
                    oaf.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_picture".equals(A0s)) {
                    oaf.A00 = AbstractC53993Nu4.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return oaf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
