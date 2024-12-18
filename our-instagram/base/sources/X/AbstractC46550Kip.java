package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Kip, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46550Kip {
    public static final HashMap A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            C14360o3.A07(keys);
            C225017m A09 = AbstractC224517h.A09(new C65075Td4(jSONObject, 0), AbstractC224517h.A04(new C57560PgY(jSONObject, 49), AbstractC224717j.A0A(keys)));
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            AbstractC06930Yk.A0G(A1I, A09);
            return new HashMap(AbstractC06930Yk.A0A(A1I));
        } catch (JSONException e) {
            C0K8.A0F("ArmadilloNotificationPayloadHelper", "Failed to parse notification payload into HashMap.", e);
            return null;
        }
    }
}
