package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VU6 {
    public static C68988VfQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68988VfQ c68988VfQ = new C68988VfQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    c68988VfQ.A00 = c16l.A1D();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c68988VfQ.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c68988VfQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
