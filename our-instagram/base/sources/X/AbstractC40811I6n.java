package X;

import java.io.IOException;

/* renamed from: X.I6n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40811I6n {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IJl] */
    public static C41146IJl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("default_text".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("out_of_stock_text".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("in_cart_text".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("destination".equals(A0s)) {
                    obj.A01 = I8A.A00(AbstractC167017dG.A0m(c16l));
                } else if ("secondary_cta_info".equals(A0s)) {
                    obj.A00 = I8C.parseFromJson(c16l);
                } else if ("is_item_in_cart".equals(A0s)) {
                    obj.A05 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
