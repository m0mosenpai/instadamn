package X;

import java.io.IOException;

/* renamed from: X.4gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101364gt {
    public static C101374gu parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Float f = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("font_size".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C101374gu(f, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C101374gu c101374gu) {
        anonymousClass182.A0d();
        Integer num = c101374gu.A01;
        if (num != null) {
            anonymousClass182.A0Q("count", num.intValue());
        }
        Float f = c101374gu.A00;
        if (f != null) {
            anonymousClass182.A0P("font_size", f.floatValue());
        }
        String str = c101374gu.A02;
        if (str != null) {
            anonymousClass182.A0S("text", str);
        }
        anonymousClass182.A0a();
    }
}
