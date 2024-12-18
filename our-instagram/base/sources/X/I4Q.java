package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.simpleplace.SimplePlace;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I4Q {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.instagram.model.simpleplace.SimplePlace, java.lang.Object] */
    public static SimplePlace parseFromJson(C16L c16l) {
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
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("lat".equals(A0q)) {
                    obj.A01 = Double.valueOf(c16l.A0U());
                } else if ("lng".equals(A0q)) {
                    obj.A02 = Double.valueOf(c16l.A0U());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A0q)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("category".equals(A0q)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("linked_account".equals(A0q)) {
                    obj.A00 = AbstractC31171DnF.A0S(c16l, false);
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
