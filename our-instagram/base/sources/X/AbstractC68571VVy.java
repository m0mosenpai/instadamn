package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.VVy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68571VVy {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.ViZ] */
    public static C69144ViZ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    obj.A00 = C5Rx.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
