package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public abstract class I7S {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, UnavailableProduct unavailableProduct, String str, String str2) {
        String str3;
        String str4 = "";
        if (AbstractC166997dE.A1Z(unavailableProduct.BSW().A03.Bwt(), true)) {
            C1XJ c1xj = C1XJ.A00;
            User BSW = unavailableProduct.BSW();
            if (BSW == null) {
                str3 = "";
            } else {
                str3 = BSW.getId();
            }
            User BSW2 = unavailableProduct.BSW();
            if (BSW2 != null) {
                str4 = BSW2.getUsername();
            }
            c1xj.A0N(fragmentActivity, AbstractC37300Gc1.A08(unavailableProduct.BSW()), userSession, interfaceC60442pS, str, str2, "unavailable_product_card", str3, str4).A05();
            return;
        }
        String productId = unavailableProduct.getProductId();
        C14360o3.A0B(productId, 0);
        C32U.A0K(userSession, new C42544IsN(str2, interfaceC60442pS, 1), C65.BRAND, new C42552IsV(productId), interfaceC60442pS, new C43052J1s(str), null, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, false);
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        C28431Ze A02 = AbstractC31364DqT.A02();
        User BSW3 = unavailableProduct.BSW();
        if (BSW3 != null) {
            str4 = BSW3.getUsername();
        }
        C31368DqX A022 = AbstractC31402Dr6.A02(userSession, str4, "shopping_saved_product", interfaceC60442pS.getModuleName());
        A022.A0L = str;
        A0r.A0B(null, C31368DqX.A00(userSession, A02, A022));
        A0r.A04();
    }
}
