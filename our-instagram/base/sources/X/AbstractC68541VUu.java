package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VUu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68541VUu {
    public static C69002Vfe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69002Vfe c69002Vfe = new C69002Vfe();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c69002Vfe.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("template".equals(A0s)) {
                    c69002Vfe.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69002Vfe;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
