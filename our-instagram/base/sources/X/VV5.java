package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV5 {
    public static C69009Vfl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69009Vfl c69009Vfl = new C69009Vfl();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    c69009Vfl.A01 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("survey_flow".equals(A0q)) {
                    c69009Vfl.A00 = AbstractC69952VyS.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69009Vfl;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
