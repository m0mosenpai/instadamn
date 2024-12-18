package X;

import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class A3D {
    /* JADX WARN: Type inference failed for: r0v12, types: [X.8yV, java.lang.Object] */
    public static final C203138yV A00(String str) {
        Integer num;
        Integer num2;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - jSONObject.optLong("timestamp", currentTimeMillis) <= TimeUnit.DAYS.toMillis(45L)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("sso_eligibility");
                        if (optJSONObject != null) {
                            num2 = C05F.A0C;
                            String optString = optJSONObject.optString("3", "2");
                            C14360o3.A07(optString);
                            num = AbstractC23053AEj.A00(optString);
                        } else {
                            num = C05F.A0C;
                            num2 = num;
                        }
                    } else {
                        num = C05F.A0C;
                        num2 = num;
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("nta_eligibility");
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("3", "2");
                        C14360o3.A07(optString2);
                        num2 = AbstractC23053AEj.A00(optString2);
                    }
                    String A01 = AbstractC23053AEj.A01(num);
                    String A012 = AbstractC23053AEj.A01(num2);
                    ?? obj = new Object();
                    obj.A01 = A01;
                    obj.A00 = A012;
                    return obj;
                }
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
        num = C05F.A0C;
        num2 = num;
        String A013 = AbstractC23053AEj.A01(num);
        String A0122 = AbstractC23053AEj.A01(num2);
        ?? obj2 = new Object();
        obj2.A01 = A013;
        obj2.A00 = A0122;
        return obj2;
    }
}
