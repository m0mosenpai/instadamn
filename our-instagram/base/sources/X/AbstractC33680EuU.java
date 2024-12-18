package X;

import java.io.IOException;

/* renamed from: X.EuU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33680EuU {
    public static E7e parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            Long l = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country_code".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("cp_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("full_cp_value".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("national_number".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cp_type", c16l, "CpContentImpl");
                throw C00O.createAndThrow();
            }
            return new E7e(num2, l, str, num.intValue());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
