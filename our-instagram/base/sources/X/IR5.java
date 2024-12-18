package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IR5 {
    public static C5FI parseFromJson(C16L c16l) {
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
            String str2 = null;
            Integer num = null;
            Float f4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("height_percentage".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("start_x_position_percentage".equals(A0s)) {
                    f2 = AbstractC167007dF.A0a(c16l);
                } else if ("start_y_position_percentage".equals(A0s)) {
                    f3 = AbstractC167007dF.A0a(c16l);
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("text_size".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("width_percentage".equals(A0s)) {
                    f4 = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new C5FI(f, f2, f3, f4, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5FI c5fi) {
        anonymousClass182.A0d();
        String str = c5fi.A05;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        Float f = c5fi.A00;
        if (f != null) {
            anonymousClass182.A0P("height_percentage", f.floatValue());
        }
        Float f2 = c5fi.A01;
        if (f2 != null) {
            anonymousClass182.A0P("start_x_position_percentage", f2.floatValue());
        }
        Float f3 = c5fi.A02;
        if (f3 != null) {
            anonymousClass182.A0P("start_y_position_percentage", f3.floatValue());
        }
        String str2 = c5fi.A06;
        if (str2 != null) {
            anonymousClass182.A0S("text_color", str2);
        }
        Integer num = c5fi.A04;
        if (num != null) {
            anonymousClass182.A0Q("text_size", num.intValue());
        }
        Float f4 = c5fi.A03;
        if (f4 != null) {
            anonymousClass182.A0P("width_percentage", f4.floatValue());
        }
        anonymousClass182.A0a();
    }
}
