package X;

import java.io.IOException;

/* renamed from: X.Vx3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69878Vx3 {
    public static URK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            Boolean bool = null;
            Float f4 = null;
            Float f5 = null;
            Float f6 = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color_hex".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("button_height_pct".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("button_x".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("button_y".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("is_dark_mode".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("label_height_pct".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                } else if ("label_width_pct".equals(A0s)) {
                    f5 = AbstractC167007dF.A0a(c16l);
                } else if ("padding_pct".equals(A0s)) {
                    f6 = AbstractC167007dF.A0a(c16l);
                } else if ("text_color_hex".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new URK(bool, f, f2, f3, f4, f5, f6, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URK urk, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = urk.A07;
        if (str != null) {
            anonymousClass182.A0S("background_color_hex", str);
        }
        Float f = urk.A01;
        if (f != null) {
            anonymousClass182.A0P("button_height_pct", f.floatValue());
        }
        Float f2 = urk.A02;
        if (f2 != null) {
            anonymousClass182.A0P("button_x", f2.floatValue());
        }
        Float f3 = urk.A03;
        if (f3 != null) {
            anonymousClass182.A0P("button_y", f3.floatValue());
        }
        Boolean bool = urk.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_dark_mode", bool.booleanValue());
        }
        Float f4 = urk.A04;
        if (f4 != null) {
            anonymousClass182.A0P("label_height_pct", f4.floatValue());
        }
        Float f5 = urk.A05;
        if (f5 != null) {
            anonymousClass182.A0P("label_width_pct", f5.floatValue());
        }
        Float f6 = urk.A06;
        if (f6 != null) {
            anonymousClass182.A0P("padding_pct", f6.floatValue());
        }
        String str2 = urk.A08;
        if (str2 != null) {
            anonymousClass182.A0S("text_color_hex", str2);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
