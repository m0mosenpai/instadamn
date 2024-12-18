package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9zJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226619zJ {
    public static final JSONObject A00(List list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                US9 us9 = (US9) it.next();
                if (us9 != null) {
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    AbstractC69932Vxx.A00(A0A, us9);
                    A0A.close();
                    jSONArray.put(new JSONObject(stringWriter.toString()));
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("textCaptionData", jSONArray);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
