package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.VNv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68361VNv {
    public static UP8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            Float f2 = null;
            Float f3 = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("number_media_to_fetch".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("posts_aspect_ratio".equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("reels_aspect_ratio".equals(A0s)) {
                    f2 = AbstractC167007dF.A0b(c16l);
                } else if ("shimmer_aspect_ratio".equals(A0s)) {
                    f3 = AbstractC167007dF.A0b(c16l);
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("number_media_to_fetch", c16l, "AccountHCMMetadata");
            } else if (f != null || !(c16l instanceof C07950bF)) {
                if (f2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reels_aspect_ratio", c16l, "AccountHCMMetadata");
                } else if (f3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("shimmer_aspect_ratio", c16l, "AccountHCMMetadata");
                } else if (user == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "AccountHCMMetadata");
                } else {
                    return new UP8(user, f.floatValue(), f2.floatValue(), f3.floatValue(), num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("posts_aspect_ratio", c16l, "AccountHCMMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
