package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class OXf {
    public static final TreeMap A01(String str) {
        Object[] array = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0).toArray(new String[0]);
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(array.length));
        for (Object obj : array) {
            String str2 = (String) obj;
            int A08 = AbstractC001900j.A08(str2, ":", 0, false);
            String A1A = AbstractC25228BEl.A1A(AbstractC25227BEk.A0w(str2, 0, A08));
            String A1A2 = AbstractC25228BEl.A1A(AbstractC25227BEk.A0w(str2, A08 + 1, str2.length()));
            A18.put(AbstractC25227BEk.A0w(A1A, 1, A1A.length() - 1), AbstractC25227BEk.A0w(A1A2, 1, A1A2.length() - 1));
        }
        return new TreeMap(A18);
    }

    public static final LinkedHashMap A00(Map map, boolean z) {
        String str;
        LinkedHashMap A0y = AbstractC43594JPz.A0y(map);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            StringBuilder A1C = AbstractC166987dD.A1C();
            String A17 = AbstractC31172DnG.A17(A1K);
            if (z) {
                A1C.append(A17);
                str = "/parameter";
            } else {
                A1C.append(A17);
                str = "/value";
            }
            A0y.put(AbstractC166997dE.A0x(str, A1C), A1K.getValue());
        }
        LinkedHashMap A0y2 = AbstractC43594JPz.A0y(A0y);
        Iterator A14 = AbstractC166997dE.A14(A0y);
        while (A14.hasNext()) {
            Map.Entry A1K2 = AbstractC166987dD.A1K(A14);
            A0y2.put(A1K2.getKey(), AnonymousClass001.A0N("FLOAT_RANGE:float:", AbstractC166987dD.A09(A1K2.getValue())));
        }
        return A0y2;
    }

    public static final JSONObject A02(String str) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "avatar_edit_event");
        JSONObject A0q2 = AbstractC31171DnF.A0q();
        A0q2.put("event_name", "avatar_load_status");
        A0q2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str);
        A0q.put("data", A0q2);
        return A0q;
    }
}
