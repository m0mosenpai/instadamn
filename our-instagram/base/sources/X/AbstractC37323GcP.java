package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import java.io.IOException;

/* renamed from: X.GcP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37323GcP {
    public static SimpleUserStoryTarget parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        String str = null;
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return C37324GcR.A01(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
