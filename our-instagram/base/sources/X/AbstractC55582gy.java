package X;

import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.2gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC55582gy {
    public static final Map A01 = AbstractC06930Yk.A07(new C09530e4(4715, 1200L), new C09530e4(5858, 1200L), new C09530e4(5734, 1200L), new C09530e4(8972, 1200L));
    public static final Map A00 = AbstractC06930Yk.A07(new C09530e4("personal_profile", 1200L), new C09530e4("main_feed", 1200L), new C09530e4("direct_app_inbox", 1200L), new C09530e4("direct_inbox", 1200L), new C09530e4("activity_feed", 1200L), new C09530e4("other_profile", 1200L), new C09530e4("explore", 1200L), new C09530e4("hashtag_feed", 1200L), new C09530e4("shopping_product_details", 1200L), new C09530e4("save_home", 1200L), new C09530e4("location_page_info", 1200L), new C09530e4("share_post", 1200L), new C09530e4("survey", 1200L), new C09530e4("login_interstitial", 0L));

    public static final Map A00(UserSession userSession, String str, Map map, InterfaceC16820sZ interfaceC16820sZ) {
        Integer num;
        StringBuilder sb;
        String str2;
        try {
            return (Map) interfaceC16820sZ.invoke();
        } catch (NumberFormatException e) {
            e = e;
            num = C05F.A0N;
            sb = new StringBuilder();
            sb.append("Cooldown Parse");
            sb.append(str);
            str2 = ": Unable to parse  ";
            sb.append(str2);
            sb.append(e.getMessage());
            AbstractC31546DtW.A00(userSession, num, sb.toString(), e);
            return map;
        } catch (Exception e2) {
            e = e2;
            num = C05F.A0N;
            sb = new StringBuilder();
            sb.append("Cooldown Parse");
            sb.append(str);
            str2 = ": Unable to parse ";
            sb.append(str2);
            sb.append(e.getMessage());
            AbstractC31546DtW.A00(userSession, num, sb.toString(), e);
            return map;
        }
    }

    public static final JSONArray A01(String str, Map map) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, key);
            jSONObject.put("cooldown", longValue);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
