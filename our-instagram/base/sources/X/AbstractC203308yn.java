package X;

import java.io.IOException;

/* renamed from: X.8yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203308yn {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8yo, java.lang.Object] */
    public static C203318yo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("serialized_sticker_client_model".equals(A0q)) {
                    obj.A00 = C5NK.parseFromJson(c16l);
                } else if ("sticker_transform".equals(A0q)) {
                    obj.A02 = AbstractC203328yp.parseFromJson(c16l);
                } else if ("drawable_config".equals(A0q)) {
                    obj.A01 = AbstractC203338yq.parseFromJson(c16l);
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

    public static void A00(AnonymousClass182 anonymousClass182, C203318yo c203318yo) {
        anonymousClass182.A0d();
        if (c203318yo.A00 != null) {
            anonymousClass182.A0r("serialized_sticker_client_model");
            C5NK.A00(anonymousClass182, c203318yo.A00);
        }
        if (c203318yo.A02 != null) {
            anonymousClass182.A0r("sticker_transform");
            AbstractC203328yp.A00(anonymousClass182, c203318yo.A02);
        }
        if (c203318yo.A01 != null) {
            anonymousClass182.A0r("drawable_config");
            AbstractC203338yq.A00(anonymousClass182, c203318yo.A01);
        }
        anonymousClass182.A0a();
    }
}
