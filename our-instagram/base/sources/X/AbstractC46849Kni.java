package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* renamed from: X.Kni, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46849Kni {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.L4E, java.lang.Object] */
    public static L4E parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("link".equals(A0q)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("content_url".equals(A0q)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("app_action_text".equals(A0q)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("app_icon_url".equals(A0q)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
