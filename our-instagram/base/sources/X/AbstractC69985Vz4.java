package X;

import java.io.IOException;

/* renamed from: X.Vz4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69985Vz4 {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.W2t] */
    public static W2t parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_left".equals(A0s)) {
                    obj.A01 = (float) c16l.A0U();
                } else if ("background_top".equals(A0s)) {
                    obj.A04 = (float) c16l.A0U();
                } else if ("background_right".equals(A0s)) {
                    obj.A02 = (float) c16l.A0U();
                } else if ("background_bottom".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                } else if ("text_size".equals(A0s)) {
                    obj.A03 = (float) c16l.A0U();
                } else if ("leaning_angle".equals(A0s)) {
                    obj.A05 = Double.valueOf(c16l.A0U());
                } else if ("is_RTL".equals(A0s)) {
                    obj.A06 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, W2t w2t) {
        anonymousClass182.A0d();
        anonymousClass182.A0P("background_left", w2t.A01);
        anonymousClass182.A0P("background_top", w2t.A04);
        anonymousClass182.A0P("background_right", w2t.A02);
        anonymousClass182.A0P("background_bottom", w2t.A00);
        anonymousClass182.A0P("text_size", w2t.A03);
        Double d = w2t.A05;
        if (d != null) {
            anonymousClass182.A0O("leaning_angle", d.doubleValue());
        }
        anonymousClass182.A0T("is_RTL", w2t.A06);
        anonymousClass182.A0a();
    }
}
