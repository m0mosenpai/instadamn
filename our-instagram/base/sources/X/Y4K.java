package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public abstract class Y4K {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.XmT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.XmU, java.lang.Object] */
    public static List A03(JSONObject jSONObject) {
        C72752XmT obj;
        if (jSONObject.isNull("outputs")) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("outputs");
        int length = jSONArray.length();
        C72753XmU[] c72753XmUArr = new C72753XmU[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            ?? obj2 = new Object();
            obj2.A01 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
            obj2.A02 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null);
            if (jSONObject2.isNull("range")) {
                obj = 0;
            } else {
                obj = new Object();
                obj.A00 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
                obj.A01 = jSONObject2.optString("strategy", null);
                obj.A02 = A02("values", jSONObject2);
            }
            obj2.A00 = obj;
            c72753XmUArr[i] = obj2;
        }
        return Arrays.asList(c72753XmUArr);
    }

    public static List A00(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        C73306Xzx[] c73306XzxArr = new C73306Xzx[length];
        for (int i = 0; i < length; i++) {
            c73306XzxArr[i] = C73306Xzx.A00(jSONArray.getJSONObject(i));
        }
        return Arrays.asList(c73306XzxArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Xll] */
    public static List A01(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        C72713Xll[] c72713XllArr = new C72713Xll[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            ?? obj = new Object();
            obj.A00 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
            obj.A01 = jSONObject2.optString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, null);
            c72713XllArr[i] = obj;
        }
        return Arrays.asList(c72713XllArr);
    }

    public static List A02(String str, JSONObject jSONObject) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return Arrays.asList(strArr);
    }
}
