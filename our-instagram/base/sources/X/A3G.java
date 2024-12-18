package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class A3G {
    public static ACJ A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject.has("generic_data")) {
            jSONObject2 = jSONObject.getJSONObject("generic_data");
        }
        HashMap A1G = AbstractC166987dD.A1G();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String A1B = AbstractC166987dD.A1B(keys);
            A1G.put(A1B, jSONObject2.getString(A1B));
        }
        return new ACJ(jSONObject.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID), jSONObject.getString("auth_token"), jSONObject.getString("account_type"), A1G, EnumC200808uN.valueOf(jSONObject.getString("app_source")), EnumC200938ua.valueOf(jSONObject.getString("credential_source")));
    }
}
