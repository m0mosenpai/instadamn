package X;

import java.io.IOException;

/* renamed from: X.Nqg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53790Nqg {
    public static URW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("cooldown".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("key".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cooldown", c16l, "ZeroCarrierSignalUrlConfig");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("url", c16l, "ZeroCarrierSignalUrlConfig");
                } else {
                    return new URW(num.intValue(), str, str2);
                }
            } else {
                AbstractC166997dE.A1V("key", c16l, "ZeroCarrierSignalUrlConfig");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
