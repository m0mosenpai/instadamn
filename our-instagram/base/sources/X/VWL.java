package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VWL {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VWJ] */
    public static VWJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(AbstractC166997dE.A0s(c16l))) {
                    AbstractC31178DnM.A1I(c16l);
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
}
