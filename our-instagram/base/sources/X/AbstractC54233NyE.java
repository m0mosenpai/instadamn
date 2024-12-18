package X;

import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import java.io.IOException;

/* renamed from: X.NyE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54233NyE {
    /* JADX WARN: Type inference failed for: r0v4, types: [com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer, java.lang.Object] */
    public static MediaSuggestedProductTagProductItemContainer parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("product_item".equals(A0s)) {
                    obj.A01 = AbstractC111134zU.parseFromJson(c16l);
                } else if ("confidence_level".equals(A0s)) {
                    obj.A00 = (float) c16l.A0U();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
