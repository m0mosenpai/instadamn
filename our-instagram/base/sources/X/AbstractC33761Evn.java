package X;

import java.io.IOException;

/* renamed from: X.Evn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33761Evn {
    public static C32071E6x parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("city_key".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("city_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("city_key", c16l, "UnifiedAudienceGeolocationCity");
                throw C00O.createAndThrow();
            }
            return new C32071E6x(num.intValue(), str, 6);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
