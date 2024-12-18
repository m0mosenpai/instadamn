package X;

import com.instagram.model.payments.DeliveryWindowInfoImpl;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I2P {
    public static DeliveryWindowInfoImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("maximum_date".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else {
                    l2 = AbstractC37303Gc4.A0O(c16l, l2, A0s, "minimum_date");
                }
                c16l.A0z();
            }
            if (l == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("maximum_date", c16l, "DeliveryWindowInfoImpl");
            } else if (l2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("minimum_date", c16l, "DeliveryWindowInfoImpl");
            } else {
                return new DeliveryWindowInfoImpl(l.longValue(), l2.longValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
