package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.direct.stickerstore.TypedImageUrl;
import java.io.IOException;

/* renamed from: X.LCr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47871LCr {
    public static TypedImageUrl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            SimpleImageUrl simpleImageUrl = null;
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("image_url".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("mime_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, "is_animated");
                }
                c16l.A0z();
            }
            if (simpleImageUrl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("image_url", c16l, "TypedImageUrl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_animated", c16l, "TypedImageUrl");
                } else {
                    return new TypedImageUrl(simpleImageUrl, str, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("mime_type", c16l, "TypedImageUrl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, TypedImageUrl typedImageUrl) {
        anonymousClass182.A0d();
        ImageUrl imageUrl = typedImageUrl.A00;
        if (imageUrl != null) {
            anonymousClass182.A0r("image_url");
            AbstractC222616c.A01(anonymousClass182, imageUrl);
        }
        String str = typedImageUrl.A01;
        if (str != null) {
            anonymousClass182.A0S("mime_type", str);
        }
        anonymousClass182.A0T("is_animated", typedImageUrl.A02);
        anonymousClass182.A0a();
    }
}
