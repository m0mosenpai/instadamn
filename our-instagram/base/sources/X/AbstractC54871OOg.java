package X;

import java.io.IOException;

/* renamed from: X.OOg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54871OOg {
    public static C51710Msf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("target".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("surface_element".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("target", c16l, "StackedTimelineAction");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("surface_element", c16l, "StackedTimelineAction");
                } else {
                    return new C51710Msf(str, str2, str3);
                }
            } else {
                AbstractC166997dE.A1V("action", c16l, "StackedTimelineAction");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C51710Msf c51710Msf) {
        anonymousClass182.A0d();
        String str = c51710Msf.A02;
        if (str != null) {
            anonymousClass182.A0S("target", str);
        }
        String str2 = c51710Msf.A00;
        if (str2 != null) {
            anonymousClass182.A0S("action", str2);
        }
        String str3 = c51710Msf.A01;
        if (str3 != null) {
            anonymousClass182.A0S("surface_element", str3);
        }
        anonymousClass182.A0a();
    }
}
