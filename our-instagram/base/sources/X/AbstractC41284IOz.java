package X;

import java.io.IOException;

/* renamed from: X.IOz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41284IOz {
    public static H5K parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Integer num = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("bloks_app".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("should_preload".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else {
                    num = AbstractC31178DnM.A0V(c16l, num, A0s, "show_tooltip_count");
                }
                c16l.A0z();
            }
            return new H5K(bool, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H5K h5k) {
        anonymousClass182.A0d();
        String str = h5k.A02;
        if (str != null) {
            anonymousClass182.A0S("bloks_app", str);
        }
        AbstractC37301Gc2.A1D(anonymousClass182, h5k.A03);
        Boolean bool = h5k.A00;
        if (bool != null) {
            anonymousClass182.A0T("should_preload", bool.booleanValue());
        }
        Integer num = h5k.A01;
        if (num != null) {
            anonymousClass182.A0Q("show_tooltip_count", num.intValue());
        }
        anonymousClass182.A0a();
    }
}
