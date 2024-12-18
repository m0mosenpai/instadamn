package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.VUn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68534VUn {
    public static C69000Vfc parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69000Vfc c69000Vfc = new C69000Vfc();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("field_key".equals(A0s)) {
                    c69000Vfc.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("input_type".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    c69000Vfc.A01 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69000Vfc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
