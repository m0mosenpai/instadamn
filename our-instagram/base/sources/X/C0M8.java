package X;

import android.os.SystemProperties;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.0M8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0M8 {
    public static final Map A00 = new HashMap<String, String>() { // from class: X.0M7
        {
            put("31", "build.version.extensions.r");
            put("32", "build.version.extensions.s");
            put("33", "build.version.extensions.tiramisu");
        }
    };

    public static JSONObject A00() {
        JSONObject jSONObject = new JSONObject();
        try {
            Map map = (Map) Class.forName("android.os.ext.SdkExtensions").getMethod("getAllExtensionVersions", new Class[0]).invoke(null, new Object[0]);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put(((Integer) entry.getKey()).toString(), ((Integer) entry.getValue()).toString());
                }
            }
        } catch (ClassNotFoundException e) {
            C0PC.A00().DEh("SdkExtVer", e, null);
        } catch (NoSuchMethodException e2) {
            C0PC.A00().DEh("SdkExtVer", e2, null);
        } catch (Throwable th) {
            C0PC.A00().DEh("SdkExtVer", th, null);
        }
        if (jSONObject.length() == 0) {
            jSONObject = new JSONObject();
            try {
                for (Map.Entry entry2 : A00.entrySet()) {
                    String str = SystemProperties.get((String) entry2.getValue(), "");
                    if (str != null && !str.equals("")) {
                        jSONObject.put((String) entry2.getKey(), str);
                    }
                }
            } catch (Throwable th2) {
                C0PC.A00().DEh("SdkExtVerSysProp", th2, null);
            }
        }
        return jSONObject;
    }
}
