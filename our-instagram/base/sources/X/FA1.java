package X;

import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FA1 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FL0] */
    public static FL0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"longitude".equals(A0s) && !Location.LATITUDE.equals(A0s)) {
                    if ("fullAddress".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("zipCode".equals(A0s)) {
                        obj.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (ServerW3CShippingAddressConstants.CITY.equals(A0s)) {
                        obj.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (ServerW3CShippingAddressConstants.REGION.equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("street".equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    }
                } else {
                    c16l.A0U();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
