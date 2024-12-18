package X;

import com.instagram.model.coupon.PromoteAdsCouponUseCase;
import com.instagram.model.coupon.PromoteCouponCurrencyAmount;
import com.instagram.model.coupon.PromoteCouponType;
import java.io.IOException;

/* renamed from: X.TuJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65801TuJ {
    public static C26086BgF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            PromoteCouponType promoteCouponType = null;
            PromoteCouponCurrencyAmount promoteCouponCurrencyAmount = null;
            PromoteAdsCouponUseCase promoteAdsCouponUseCase = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("coupon_offer_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("coupon_value_string".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("promotion_type".equals(A0q)) {
                    promoteCouponType = PromoteCouponType.valueOf(c16l.A1Q());
                } else if ("sxgy_spend_requirement".equals(A0q)) {
                    promoteCouponCurrencyAmount = VVW.parseFromJson(c16l);
                } else if ("coupon_use_case".equals(A0q)) {
                    promoteAdsCouponUseCase = PromoteAdsCouponUseCase.valueOf(c16l.A1Q());
                }
                c16l.A0z();
            }
            return new C26086BgF(promoteAdsCouponUseCase, promoteCouponCurrencyAmount, promoteCouponType, str, str2, 10);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
