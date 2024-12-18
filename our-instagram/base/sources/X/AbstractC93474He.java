package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import java.io.IOException;

/* renamed from: X.4He, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC93474He {
    public static EffectThumbnailImageDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            SimpleImageUrl simpleImageUrl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("uri".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return new EffectThumbnailImageDict(simpleImageUrl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
