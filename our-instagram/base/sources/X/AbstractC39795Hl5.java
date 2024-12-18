package X;

import com.instagram.api.schemas.CallAdsInfoDictImpl;
import java.io.IOException;

/* renamed from: X.Hl5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39795Hl5 {
    public static CallAdsInfoDictImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("parsed_phone_number".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "should_render_phone_number_to_cta");
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("should_render_phone_number_to_cta", c16l, "CallAdsInfoDictImpl");
                throw C00O.createAndThrow();
            }
            return new CallAdsInfoDictImpl(str, bool.booleanValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
