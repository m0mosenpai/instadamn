package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I2z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40719I2z {
    public static C38812H7c parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            C38813H7d c38813H7d = null;
            User user = null;
            String str = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("cta".equals(A0s)) {
                    c38813H7d = IR3.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    user = AbstractC31171DnF.A0S(c16l, false);
                } else if ("merchant_details".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("product_image_urls".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (c38813H7d == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cta", c16l, "DeepLinkShop");
            } else if (user != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("merchant_details", c16l, "DeepLinkShop");
                } else if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("product_image_urls", c16l, "DeepLinkShop");
                } else {
                    return new C38812H7c(c38813H7d, user, l, str, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("merchant", c16l, "DeepLinkShop");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
