package X;

import java.io.IOException;

/* renamed from: X.Vwx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69872Vwx {
    public static URB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            String str = null;
            String str2 = null;
            Float f = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("icon_location".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("icon_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("text_font_size".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                }
                c16l.A0z();
            }
            return new URB(f, num, num2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URB urb) {
        anonymousClass182.A0d();
        Integer num = urb.A01;
        if (num != null) {
            anonymousClass182.A0Q("icon_location", num.intValue());
        }
        Integer num2 = urb.A02;
        if (num2 != null) {
            anonymousClass182.A0Q("icon_type", num2.intValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, urb.A03);
        String str = urb.A04;
        if (str != null) {
            anonymousClass182.A0S("text_color", str);
        }
        Float f = urb.A00;
        if (f != null) {
            anonymousClass182.A0P("text_font_size", f.floatValue());
        }
        anonymousClass182.A0a();
    }
}
