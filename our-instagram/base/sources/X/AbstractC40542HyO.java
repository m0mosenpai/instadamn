package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.camera.effect.models.ThumbnailImage;
import java.io.IOException;

/* renamed from: X.HyO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40542HyO {
    public static O7A parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ThumbnailImage thumbnailImage = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC43591JPw.A00(780);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("thumbnail_image".equals(A0s)) {
                    thumbnailImage = AbstractC40543HyP.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "AttributedEffect");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (thumbnailImage == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("thumbnail_image", c16l, "AttributedEffect");
                } else {
                    return new O7A(thumbnailImage, str, str2);
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "AttributedEffect");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
