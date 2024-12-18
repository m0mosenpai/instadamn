package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VTZ {
    public static C69299Vl7 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69299Vl7 c69299Vl7 = new C69299Vl7();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("current_price".equals(A0s)) {
                    c69299Vl7.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("full_price_stripped".equals(A0s)) {
                    c69299Vl7.A03 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    c69299Vl7.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("main_image".equals(A0s)) {
                    c69299Vl7.A00 = VTV.parseFromJson(c16l);
                } else if ("merchant".equals(A0s)) {
                    c69299Vl7.A01 = VTY.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69299Vl7;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
