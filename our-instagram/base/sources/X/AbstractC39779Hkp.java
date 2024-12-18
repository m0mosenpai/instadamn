package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import java.io.IOException;

/* renamed from: X.Hkp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39779Hkp {
    public static BrandedContentGatingCountryMinimumAgeImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country_code".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "minimum_age");
                }
                c16l.A0z();
            }
            return new BrandedContentGatingCountryMinimumAgeImpl(str, num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
