package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTL {
    public static C69117Vi7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69117Vi7 c69117Vi7 = new C69117Vi7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("base_url".equals(A0s)) {
                    c69117Vi7.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("logging_token".equals(A0s)) {
                    c69117Vi7.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("sources".equals(A0s)) {
                    c69117Vi7.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69117Vi7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
