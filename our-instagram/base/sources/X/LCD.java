package X;

import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class LCD {
    public static C50679MYx parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C50679MYx c50679MYx = new C50679MYx(39);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("prompt_type".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c50679MYx.A01 = A0m;
                } else if ("prompt_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c50679MYx.A00 = A0m2;
                }
                c16l.A0z();
            }
            return c50679MYx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C50679MYx c50679MYx, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c50679MYx.A01;
        if (str != null) {
            anonymousClass182.A0S("prompt_type", str);
        }
        String str2 = c50679MYx.A00;
        if (str2 != null) {
            anonymousClass182.A0S("prompt_id", str2);
        }
        anonymousClass182.A0a();
    }
}
