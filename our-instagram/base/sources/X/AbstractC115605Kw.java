package X;

import java.io.IOException;

/* renamed from: X.5Kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC115605Kw {
    public static C115615Kx parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C115615Kx c115615Kx = new C115615Kx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("sub_share_id".equals(A0q)) {
                    c115615Kx.A00 = c16l.A1D();
                } else if ("is_configured_in_server".equals(A0q)) {
                    c115615Kx.A03 = c16l.A0d();
                } else if ("clips_share_preview_to_feed".equals(A0q)) {
                    c115615Kx.A05 = c16l.A0d();
                } else if ("cover_photo_square_crop".equals(A0q)) {
                    c115615Kx.A01 = AbstractC88283wd.parseFromJson(c16l);
                } else if (MSV.A00(1209).equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c115615Kx.A02 = A1P;
                }
                c16l.A0z();
            }
            return c115615Kx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
