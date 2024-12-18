package X;

import com.instagram.api.schemas.ShoppingIGFundedIncentivesShopAdsBannerStyles;
import java.io.IOException;

/* renamed from: X.Hl1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39791Hl1 {
    public static H2W parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ShoppingIGFundedIncentivesShopAdsBannerStyles shoppingIGFundedIncentivesShopAdsBannerStyles = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("description_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(901).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    shoppingIGFundedIncentivesShopAdsBannerStyles = (ShoppingIGFundedIncentivesShopAdsBannerStyles) ShoppingIGFundedIncentivesShopAdsBannerStyles.A01.get(A1P);
                    if (shoppingIGFundedIncentivesShopAdsBannerStyles == null) {
                        shoppingIGFundedIncentivesShopAdsBannerStyles = ShoppingIGFundedIncentivesShopAdsBannerStyles.A08;
                    }
                } else if ("incentive_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("terms_and_conditions_body".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("terms_and_conditions_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H2W(shoppingIGFundedIncentivesShopAdsBannerStyles, str, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
