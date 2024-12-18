package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VyV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69955VyV {
    public static V42 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            V42 v42 = new V42();
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
                        v42.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("survey_session".equals(A0s)) {
                        v42.A00 = VV8.parseFromJson(c16l);
                    }
                    c16l.A0z();
                }
            }
            return v42;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
