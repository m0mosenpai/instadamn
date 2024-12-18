package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class Y0F {
    public long A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public static void A00(Y0F y0f, JSONObject jSONObject) {
        Integer num;
        Integer num2;
        y0f.A04 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
        y0f.A03 = jSONObject.optString("cctype", null);
        y0f.A05 = jSONObject.optString("policy_id", null);
        if (jSONObject.has("version")) {
            num = Integer.valueOf(jSONObject.getInt("version"));
        } else {
            num = null;
        }
        y0f.A02 = num;
        String A00 = MSV.A00(117);
        if (jSONObject.has(A00)) {
            num2 = Integer.valueOf(jSONObject.getInt(A00));
        } else {
            num2 = null;
        }
        y0f.A01 = num2;
        y0f.A00 = jSONObject.optLong("timestamp");
    }
}
