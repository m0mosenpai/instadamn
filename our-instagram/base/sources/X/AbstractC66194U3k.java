package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.U3k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66194U3k {
    public static C66195U3l parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66195U3l c66195U3l = new C66195U3l();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66195U3l.A00 = str;
                } else if ("uri".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66195U3l.A01 = str;
                }
                c16l.A0z();
            }
            return c66195U3l;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
