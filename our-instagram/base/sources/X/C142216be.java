package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.6be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142216be {
    public static C66084TzL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66084TzL c66084TzL = new C66084TzL();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("__typename".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c66084TzL.A01 = str;
                } else if ("document".equals(A0q)) {
                    c66084TzL.A00 = VTR.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c66084TzL;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
