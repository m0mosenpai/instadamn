package X;

import com.instagram.model.payments.CurrencyAmountInfoImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I7Y {
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.IDF] */
    public static IDF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CurrencyAmountInfoImpl currencyAmountInfoImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("free_shipping_order_value".equals(AbstractC166997dE.A0s(c16l))) {
                    currencyAmountInfoImpl = AbstractC41329IQz.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            if (currencyAmountInfoImpl != null) {
                obj.A00 = currencyAmountInfoImpl;
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
