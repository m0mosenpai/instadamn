package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F4B {
    public static C31200Dnj parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31200Dnj c31200Dnj = new C31200Dnj(19);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(AbstractC166997dE.A0s(c16l))) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31200Dnj.A00 = A1P;
                }
                c16l.A0z();
            }
            return c31200Dnj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
