package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.XFBYPRequestStatus;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Evk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33758Evk {
    public static Map A00(C5F2 c5f2) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5f2.Avz() != null) {
            A1I.put(AbstractC111324zv.A00(866), c5f2.Avz());
        }
        if (c5f2.BAI() != null) {
            A1I.put(AbstractC111324zv.A00(964), c5f2.BAI());
        }
        if (c5f2.getId() != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c5f2.getId());
        }
        if (c5f2.C0J() != null) {
            XFBYPRequestStatus C0J = c5f2.C0J();
            if (C0J != null) {
                str = C0J.A00;
            } else {
                str = null;
            }
            A1I.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
