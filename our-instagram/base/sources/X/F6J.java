package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class F6J {
    public static C29801bv parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C29801bv c29801bv = new C29801bv();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("p2b_order".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1O(c16l, arrayList);
                        }
                    }
                    c29801bv.A07 = arrayList;
                } else if ("order_id".equals(A0s)) {
                    c29801bv.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    c29801bv.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("customer_id".equals(A0s)) {
                    c29801bv.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("currency_code".equals(A0s)) {
                    c29801bv.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("amount".equals(A0s)) {
                    c29801bv.A00 = AbstractC167017dG.A0m(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    c29801bv.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("order_notes".equals(A0s)) {
                    c29801bv.A05 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c29801bv, A0s);
                }
                c16l.A0z();
            }
            return c29801bv;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
