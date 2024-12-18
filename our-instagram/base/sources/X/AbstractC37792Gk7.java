package X;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Gk7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37792Gk7 {
    public static String A00(String str, String str2, String str3, String str4, boolean z) {
        if (z) {
            return new JSONObject(A01(str, str3, str2, str4, z)).toString();
        }
        return null;
    }

    public static LinkedHashMap A01(Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        return AbstractC06930Yk.A06(new C09530e4("serve_from_server_cache", Boolean.valueOf(z)), new C09530e4("cohort_to_ttl_map", obj), new C09530e4("serve_on_foreground_prefetch", obj2), new C09530e4("serve_on_background_prefetch", obj3), new C09530e4("meta", obj4));
    }

    public static Map A02(String str, String str2, String str3, String str4, boolean z) {
        return A01(str, str3, str2, str4, z);
    }
}
