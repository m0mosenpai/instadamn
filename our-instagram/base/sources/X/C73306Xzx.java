package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Xzx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73306Xzx {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.XmT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, X.Xzx] */
    public static C73306Xzx A00(JSONObject jSONObject) {
        List asList;
        if (jSONObject == null) {
            return null;
        }
        ?? obj = new Object();
        obj.A00 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
        obj.A02 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, null);
        jSONObject.optBoolean("callsite");
        if (jSONObject.isNull("buckets")) {
            asList = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("buckets");
            int length = jSONArray.length();
            C72752XmT[] c72752XmTArr = new C72752XmT[length];
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                ?? obj2 = new Object();
                obj2.A00 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, null);
                obj2.A01 = jSONObject2.optString("strategy", null);
                obj2.A02 = Y4K.A02("values", jSONObject2);
                c72752XmTArr[i] = obj2;
            }
            asList = Arrays.asList(c72752XmTArr);
        }
        obj.A03 = asList;
        obj.A01 = jSONObject.optString(QuickExperimentDumperPlugin.OVERRIDE_CMD, null);
        return obj;
    }
}
