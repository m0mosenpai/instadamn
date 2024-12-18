package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VyU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69954VyU {
    public static V41 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            V41 v41 = new V41();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                        v41.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("survey_flow".equals(A0s)) {
                        v41.A00 = AbstractC69952VyS.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
            }
            return v41;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
