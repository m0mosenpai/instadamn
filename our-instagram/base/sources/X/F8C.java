package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8C {
    public static C33451i7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33451i7 c33451i7 = new C33451i7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c33451i7.A02 = A0m;
                } else if ("referral_param".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c33451i7.A01 = A0m2;
                } else if ("recipientId".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c33451i7.A00 = A0m3;
                } else {
                    AbstractC43669JTd.A01(c16l, c33451i7, A0q);
                }
                c16l.A0z();
            }
            return c33451i7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
