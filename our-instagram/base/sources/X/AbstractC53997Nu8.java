package X;

import java.io.IOException;

/* renamed from: X.Nu8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53997Nu8 {
    public static OAG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            OAG oag = new OAG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    oag.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("token".equals(A0s)) {
                    oag.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("image".equals(A0s)) {
                    oag.A00 = AbstractC53996Nu7.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return oag;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
