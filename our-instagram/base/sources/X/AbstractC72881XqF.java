package X;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.XqF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72881XqF {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Y0F, java.lang.Object, X.XS3] */
    public static XS3 A00(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ?? obj = new Object();
            Y0F.A00(obj, jSONObject);
            obj.A00 = Y4K.A00("contexts", jSONObject);
            obj.A01 = Y4K.A00("monitors", jSONObject);
            obj.A02 = Y4K.A03(jSONObject);
            obj.A03 = Y4K.A02("vector", jSONObject);
            obj.A04 = Y4K.A02("vectorDefaults", jSONObject);
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.Xlk] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.Y0F, java.lang.Object, X.XS4] */
    public static XS4 A01(String str) {
        List asList;
        try {
            JSONObject jSONObject = new JSONObject(str);
            ?? obj = new Object();
            Y0F.A00(obj, jSONObject);
            obj.A00 = Y4K.A00("contexts", jSONObject);
            obj.A02 = Y4K.A00("monitors", jSONObject);
            obj.A03 = Y4K.A03(jSONObject);
            if (jSONObject.isNull("table")) {
                asList = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("table");
                int length = jSONArray.length();
                C72712Xlk[] c72712XlkArr = new C72712Xlk[length];
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    ?? obj2 = new Object();
                    obj2.A00 = jSONObject2.optString("bucket", null);
                    obj2.A01 = Y4K.A01("values", jSONObject2);
                    c72712XlkArr[i] = obj2;
                }
                asList = Arrays.asList(c72712XlkArr);
            }
            obj.A04 = asList;
            obj.A01 = Y4K.A01("defaults", jSONObject);
            return obj;
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
