package X;

import java.io.IOException;

/* renamed from: X.Hnt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39964Hnt {
    public static H3Y parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1190);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_owner_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("merchant_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("media_owner_id", c16l, "HouseAdContextImpl");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "HouseAdContextImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("profile_pic_url", c16l, "HouseAdContextImpl");
                } else {
                    return new H3Y(str, str2, str3, str4);
                }
            } else {
                AbstractC166997dE.A1V("merchant_name", c16l, "HouseAdContextImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
