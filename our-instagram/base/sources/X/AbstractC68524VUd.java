package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.VUd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68524VUd {
    public static C69444VnT parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69444VnT c69444VnT = new C69444VnT();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("__typename".equals(A0s)) {
                    c69444VnT.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("body".equals(A0s)) {
                    c69444VnT.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("button_text".equals(A0s)) {
                    c69444VnT.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("disqualify_subtitle".equals(A0s)) {
                    c69444VnT.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("disqualify_title".equals(A0s)) {
                    c69444VnT.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("disqualify_website_button_text".equals(A0s)) {
                    c69444VnT.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("disqualify_website_url".equals(A0s)) {
                    c69444VnT.A05 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(1200).equals(A0s)) {
                    c69444VnT.A06 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    c69444VnT.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("key".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    c69444VnT.A09 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(542).equals(A0s)) {
                    c69444VnT.A08 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c69444VnT;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
