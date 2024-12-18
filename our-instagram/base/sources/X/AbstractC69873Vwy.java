package X;

import java.io.IOException;

/* renamed from: X.Vwy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69873Vwy {
    public static URC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("border_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("border_width".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("thumbnail_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new URC(f, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, URC urc) {
        anonymousClass182.A0d();
        String str = urc.A01;
        if (str != null) {
            anonymousClass182.A0S("border_color", str);
        }
        Float f = urc.A00;
        if (f != null) {
            anonymousClass182.A0P("border_width", f.floatValue());
        }
        String str2 = urc.A02;
        if (str2 != null) {
            anonymousClass182.A0S("thumbnail_url", str2);
        }
        anonymousClass182.A0a();
    }
}
