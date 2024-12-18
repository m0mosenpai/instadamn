package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F67 {
    public static C34231jN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C34231jN c34231jN = new C34231jN();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fundraiser_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34231jN.A02 = A0m;
                } else if ("fundraiser_name".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34231jN.A03 = A0m2;
                } else if ("fundraiser_attribution".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c34231jN.A00 = A0m3;
                } else if ("details".equals(A0s)) {
                    c34231jN.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("cover_photo_url".equals(A0s)) {
                    c34231jN.A04 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c34231jN, A0s);
                }
                c16l.A0z();
            }
            return c34231jN;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
