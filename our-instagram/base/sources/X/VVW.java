package X;

import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVW {
    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.model.coupon.PromoteCouponCurrencyAmount, java.lang.Object] */
    public static PromoteCouponCurrencyAmount parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("currency".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A02 = A0m;
                } else if ("formatted_amount".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    obj.A03 = A0m2;
                } else if ("amount_with_offset".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("offset".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
