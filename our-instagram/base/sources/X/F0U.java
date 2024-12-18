package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F0U {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.FRF] */
    public static FRF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("extra_info".equals(A0s)) {
                    obj.A00 = F0T.parseFromJson(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
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
