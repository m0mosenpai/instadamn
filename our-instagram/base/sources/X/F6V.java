package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F6V {
    public static C35131ks parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C35131ks c35131ks = new C35131ks();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31180DnO.A1W(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c35131ks.A03 = A0m;
                } else if ("item_id".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c35131ks.A01 = A0m2;
                } else if ("otid".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c35131ks.A02 = A0m3;
                } else if ("one_click_upsell".equals(A0q)) {
                    c35131ks.A00 = AbstractC126465nh.parseFromJson(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c35131ks, A0q);
                }
                c16l.A0z();
            }
            return c35131ks;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
