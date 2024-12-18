package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Kr2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47045Kr2 {
    public static L0E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L0E l0e = new L0E();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    l0e.A00 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    l0e.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return l0e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
