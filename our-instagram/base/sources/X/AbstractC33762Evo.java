package X;

import com.instagram.api.schemas.ISOCountryCode;
import java.io.IOException;

/* renamed from: X.Evo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33762Evo {
    public static C45127Jxw parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ISOCountryCode iSOCountryCode = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country_code".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iSOCountryCode = (ISOCountryCode) ISOCountryCode.A01.get(A1P);
                    if (iSOCountryCode == null) {
                        iSOCountryCode = ISOCountryCode.A3p;
                    }
                } else if (AbstractC58317Pt9.A00(748).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (iSOCountryCode == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("country_code", c16l, "UnifiedAudienceGeolocationCountryImpl");
                throw C00O.createAndThrow();
            }
            return new C45127Jxw(iSOCountryCode, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
