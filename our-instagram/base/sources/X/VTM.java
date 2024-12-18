package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTM {
    public static C69230Vjy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69230Vjy c69230Vjy = new C69230Vjy();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("linkType".equals(A0s)) {
                    c69230Vjy.A00 = c16l.A1D();
                } else if ("app_package".equals(A0s)) {
                    c69230Vjy.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("deeplinkUri".equals(A0s)) {
                    c69230Vjy.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("webUri".equals(A0s)) {
                    c69230Vjy.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69230Vjy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
