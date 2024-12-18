package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IPE {
    public static C38784H5y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("hint_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("is_hint_row".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C38784H5y(bool, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38784H5y c38784H5y) {
        anonymousClass182.A0d();
        Integer num = c38784H5y.A01;
        if (num != null) {
            anonymousClass182.A0Q("count", num.intValue());
        }
        String str = c38784H5y.A02;
        if (str != null) {
            anonymousClass182.A0S("hint_text", str);
        }
        Boolean bool = c38784H5y.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_hint_row", bool.booleanValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c38784H5y.A03);
        anonymousClass182.A0a();
    }
}
