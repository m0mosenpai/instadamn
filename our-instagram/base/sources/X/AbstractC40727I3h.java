package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import com.instagram.model.payments.DeliveryWindowInfoImpl;
import com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata;
import java.io.IOException;

/* renamed from: X.I3h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40727I3h {
    public static ShippingAndReturnsMetadata parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            DeliveryWindowInfoImpl deliveryWindowInfoImpl = null;
            Boolean bool = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            Integer num = null;
            CurrencyAmountInfoImpl currencyAmountInfoImpl2 = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("estimated_delivery_window".equals(A0s)) {
                    deliveryWindowInfoImpl = I2P.parseFromJson(c16l);
                } else if ("is_final_sale".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("return_cost".equals(A0s)) {
                    currencyAmountInfoImpl = AbstractC41329IQz.parseFromJson(c16l);
                } else if ("return_policy_time".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("shipping_cost".equals(A0s)) {
                    currencyAmountInfoImpl2 = AbstractC41329IQz.parseFromJson(c16l);
                } else if ("shipping_cost_stripped".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new ShippingAndReturnsMetadata(currencyAmountInfoImpl, currencyAmountInfoImpl2, deliveryWindowInfoImpl, bool, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
