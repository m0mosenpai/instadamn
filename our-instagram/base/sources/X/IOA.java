package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IOA {
    public static H3P parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_height".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("background_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("background_width".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H3P(num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H3P h3p) {
        anonymousClass182.A0d();
        Integer num = h3p.A00;
        if (num != null) {
            anonymousClass182.A0Q("background_height", num.intValue());
        }
        String str = h3p.A02;
        if (str != null) {
            anonymousClass182.A0S("background_url", str);
        }
        Integer num2 = h3p.A01;
        if (num2 != null) {
            anonymousClass182.A0Q("background_width", num2.intValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, h3p.A03);
        anonymousClass182.A0a();
    }
}
