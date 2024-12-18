package X;

import com.instagram.api.schemas.PaymentInfo;
import com.instagram.api.schemas.PaymentMethodImpl;
import java.io.IOException;

/* renamed from: X.Hr4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40136Hr4 {
    public static PaymentInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Integer num = null;
            Integer num2 = null;
            String str = null;
            PaymentMethodImpl paymentMethodImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("budget_limit_with_offset".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("budget_spent_with_offset".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("footer_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("from_facebook".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("payment_method".equals(A0s)) {
                    paymentMethodImpl = AbstractC40137Hr5.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("from_facebook", c16l, "PaymentInfo");
                throw C00O.createAndThrow();
            }
            return new PaymentInfo(paymentMethodImpl, num, num2, str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
