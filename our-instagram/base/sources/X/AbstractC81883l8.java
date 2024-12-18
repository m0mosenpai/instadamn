package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.model.hashtag.HashtagImpl;
import java.io.IOException;

/* renamed from: X.3l8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81883l8 {
    public static C81923lC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            HashtagImpl hashtagImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C81903lA c81903lA = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("hashtag".equals(A0q)) {
                    hashtagImpl = AbstractC109614wn.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    c81903lA = AbstractC81893l9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C81923lC(c81903lA, hashtagImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
