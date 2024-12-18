package X;

import java.util.AbstractCollection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AK5 {
    public final String A00;
    public final EnumC200808uN A01;
    public final EnumC200938ua A02;

    public AK5(String str, EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        this.A01 = enumC200808uN;
        this.A02 = enumC200938ua;
        this.A00 = str;
    }

    public static void A00(AbstractCollection abstractCollection, JSONArray jSONArray, int i) {
        JSONObject jSONObject = jSONArray.getJSONObject(i);
        abstractCollection.add(new AK5(jSONObject.getString("target_user_id"), EnumC200808uN.valueOf(jSONObject.getString("app_source")), EnumC200938ua.valueOf(jSONObject.getString("credential_source"))));
    }

    public AK5(EnumC200808uN enumC200808uN, EnumC200938ua enumC200938ua) {
        this.A01 = enumC200808uN;
        this.A02 = enumC200938ua;
        this.A00 = "";
    }
}
