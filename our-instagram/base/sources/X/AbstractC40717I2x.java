package X;

import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I2x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40717I2x {
    public static C38811H7b parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            String str = null;
            C38813H7d c38813H7d = null;
            ProductDetailsProductItemDict productDetailsProductItemDict = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("card_modifier_label".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cta".equals(A0s)) {
                    c38813H7d = IR3.parseFromJson(c16l);
                } else if ("micro_product".equals(A0s)) {
                    productDetailsProductItemDict = AbstractC111134zU.parseFromJson(c16l);
                } else if ("product_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("shoppable_media".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38741H4f parseFromJson = AbstractC40165Hrd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (c38813H7d == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cta", c16l, "DeepLinkProduct");
            } else if (productDetailsProductItemDict == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("micro_product", c16l, "DeepLinkProduct");
            } else {
                return new C38811H7b(c38813H7d, productDetailsProductItemDict, l, str, str2, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
