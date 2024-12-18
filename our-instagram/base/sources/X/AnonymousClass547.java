package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.547, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass547 {
    public static C9CD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CD c9cd = new C9CD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9cd.A01 = str;
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9cd.A02 = str;
                } else if ("has_viewer_voted".equals(A0q)) {
                    c9cd.A03 = c16l.A0d();
                } else if ("timestamp_s".equals(A0q)) {
                    c9cd.A00 = Long.valueOf(c16l.A0y());
                }
                c16l.A0z();
            }
            return c9cd;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
