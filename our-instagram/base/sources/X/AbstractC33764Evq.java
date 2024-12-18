package X;

import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.IOException;

/* renamed from: X.Evq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33764Evq {
    public static E6R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            C32071E6x c32071E6x = null;
            C45127Jxw c45127Jxw = null;
            Float f2 = null;
            Float f3 = null;
            C32071E6x c32071E6x2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("address_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A0s)) {
                    c32071E6x = AbstractC33761Evn.parseFromJson(c16l);
                } else if ("country".equals(A0s)) {
                    c45127Jxw = AbstractC33762Evo.parseFromJson(c16l);
                } else if (Location.LATITUDE.equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("longitude".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("radius".equals(A0s)) {
                    f = Float.valueOf((float) c16l.A0U());
                } else if (ServerW3CShippingAddressConstants.REGION.equals(A0s)) {
                    c32071E6x2 = AbstractC33763Evp.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (f == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("radius", c16l, "UnifiedAudienceGeolocationUnit");
                throw C00O.createAndThrow();
            }
            return new E6R(c32071E6x, c32071E6x2, c45127Jxw, f2, f3, str, f.floatValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
