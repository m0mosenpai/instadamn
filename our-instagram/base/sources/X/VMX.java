package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.shopify.checkout.models.Address;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class VMX {
    public static final Address A00(Map map) {
        return new Address((String) map.get("referenceId"), (String) map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), (String) map.get("firstName"), (String) map.get("lastName"), (String) map.get("postalCode"), (String) map.get("address1"), (String) map.get("address2"), (String) map.get(ServerW3CShippingAddressConstants.CITY), (String) map.get("countryCode"), (String) map.get("zoneCode"), (String) map.get("phone"));
    }
}
