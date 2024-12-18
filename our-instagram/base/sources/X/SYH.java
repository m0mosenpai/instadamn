package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SYH {
    public final AutofillData A00;
    public final CardDetails A01;

    public SYH(AutofillData autofillData, CardDetails cardDetails) {
        this.A00 = autofillData;
        this.A01 = cardDetails;
    }

    public static void A00(Object obj, AbstractMap abstractMap, Map map) {
        if (map.get(obj) != null) {
            abstractMap.put(obj, map.get(obj));
        }
    }

    public final HashMap A01() {
        HashMap A1G = AbstractC166987dD.A1G();
        AutofillData autofillData = this.A00;
        if (autofillData != null) {
            Map map = autofillData.A00;
            Object obj = Collections.unmodifiableMap(map).get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (obj != null) {
                A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, obj);
                A1G.put("cc-name", obj);
            }
            if (map.get("given-name") != null) {
                A1G.put("given-name", map.get("given-name"));
                A1G.put("cc-given-name", map.get("given-name"));
            }
            if (map.get("family-name") != null) {
                A1G.put("family-name", map.get("family-name"));
                A1G.put("cc-family-name", map.get("family-name"));
            }
            A00("email", A1G, map);
            A00("tel", A1G, map);
            A00("address-line1", A1G, map);
            A00("address-line2", A1G, map);
            A00("address-level1", A1G, map);
            A00("address-level2", A1G, map);
            A00("postal-code", A1G, map);
        }
        return A1G;
    }
}
