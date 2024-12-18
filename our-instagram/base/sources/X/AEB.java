package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEB {
    public static C184758Hq parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C184758Hq c184758Hq = new C184758Hq();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c184758Hq.A01 = A0m;
                } else if ("merchant_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c184758Hq.A00 = A0m2;
                }
                c16l.A0z();
            }
            return c184758Hq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C184758Hq c184758Hq) {
        anonymousClass182.A0d();
        String str = c184758Hq.A01;
        if (str != null) {
            anonymousClass182.A0S("product_id", str);
        }
        String str2 = c184758Hq.A00;
        if (str2 != null) {
            anonymousClass182.A0S("merchant_id", str2);
        }
        anonymousClass182.A0a();
    }
}
