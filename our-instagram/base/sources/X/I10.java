package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I10 {
    public static C41011IEg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41011IEg c41011IEg = new C41011IEg();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    c41011IEg.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_picture".equals(A0q)) {
                    c41011IEg.A00 = AbstractC40667I0z.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c41011IEg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}