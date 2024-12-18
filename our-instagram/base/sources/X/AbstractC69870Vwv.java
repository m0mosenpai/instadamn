package X;

import java.io.IOException;

/* renamed from: X.Vwv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69870Vwv {
    public static UR4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alpha".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("blur_radius_px".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("bottom_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("top_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new UR4(f, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, UR4 ur4) {
        anonymousClass182.A0d();
        Float f = ur4.A00;
        if (f != null) {
            anonymousClass182.A0P("alpha", f.floatValue());
        }
        Integer num = ur4.A01;
        if (num != null) {
            anonymousClass182.A0Q("blur_radius_px", num.intValue());
        }
        String str = ur4.A02;
        if (str != null) {
            anonymousClass182.A0S("bottom_color", str);
        }
        String str2 = ur4.A03;
        if (str2 != null) {
            anonymousClass182.A0S("top_color", str2);
        }
        anonymousClass182.A0a();
    }
}
