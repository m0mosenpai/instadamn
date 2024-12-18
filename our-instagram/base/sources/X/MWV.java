package X;

import com.instagram.api.schemas.ACRType;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MWV {
    public static C26086BgF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C26086BgF c26086BgF = new C26086BgF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("collection_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c26086BgF.A03 = str;
                } else if ("media_id".equals(A0q)) {
                    c26086BgF.A01 = Long.valueOf(c16l.A0y());
                } else if ("medium_id".equals(A0q)) {
                    c26086BgF.A02 = Long.valueOf(c16l.A0y());
                } else if ("acr_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c26086BgF.A00 = C9JF.A00(str);
                } else if ("template_clips_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c26086BgF.A04 = str;
                }
                c16l.A0z();
            }
            return c26086BgF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C26086BgF c26086BgF, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c26086BgF.A03;
        if (str != null) {
            anonymousClass182.A0S("collection_id", str);
        }
        Number number = (Number) c26086BgF.A01;
        if (number != null) {
            anonymousClass182.A0R("media_id", number.longValue());
        }
        Number number2 = (Number) c26086BgF.A02;
        if (number2 != null) {
            anonymousClass182.A0R("medium_id", number2.longValue());
        }
        ACRType aCRType = (ACRType) c26086BgF.A00;
        if (aCRType != null) {
            anonymousClass182.A0S("acr_type", aCRType.A00);
        }
        String str2 = c26086BgF.A04;
        if (str2 != null) {
            anonymousClass182.A0S("template_clips_media_id", str2);
        }
        anonymousClass182.A0a();
    }
}
