package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Kmi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46787Kmi {
    public static C206419By parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C206419By c206419By = new C206419By();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c206419By.A02 = A1P;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    Integer A01 = AbstractC47853LBw.A01(c16l.A1D());
                    C14360o3.A0B(A01, 0);
                    c206419By.A01 = A01;
                } else if ("modified_at".equals(A0s)) {
                    c206419By.A00 = c16l.A0y();
                }
                c16l.A0z();
            }
            return c206419By;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
