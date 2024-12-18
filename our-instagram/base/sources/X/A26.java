package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A26 {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Ok, X.1OW] */
    public static C26031Ok parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c1ow = new C1OW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("media_id".equals(A0s)) {
                    c1ow.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("question_id".equals(A0s)) {
                    c1ow.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE.equals(A0s)) {
                    c1ow.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(51).equals(A0s)) {
                    c1ow.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC43591JPw.A00(83).equals(A0s)) {
                    c1ow.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_session_id".equals(A0s)) {
                    c1ow.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("tray_position".equals(A0s)) {
                    c1ow.A00 = c16l.A1D();
                } else if (AbstractC43591JPw.A00(399).equals(A0s)) {
                    c1ow.A07 = c16l.A0d();
                } else {
                    AbstractC43669JTd.A01(c16l, c1ow, A0s);
                }
                c16l.A0z();
            }
            return c1ow;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
