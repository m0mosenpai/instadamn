package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F81 {
    public static FJC parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            FJC fjc = new FJC();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    fjc.A00 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    fjc.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return fjc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
