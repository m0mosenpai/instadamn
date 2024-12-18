package X;

import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class AFY {
    public static C22734A1e A00;

    static {
        TimeUnit.SECONDS.toMillis(10L);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.A1e, java.lang.Object] */
    public static final C1ON A00(UserSession userSession, QuickPromotionSlot quickPromotionSlot, Integer num, int i) {
        AbstractC167017dG.A1O(userSession, quickPromotionSlot);
        EnumMap enumMap = new EnumMap(QuickPromotionSurface.class);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            EnumSet A002 = AbstractC61082qW.A00(quickPromotionSlot, quickPromotionSurface);
            if (!A002.isEmpty()) {
                enumMap.put((EnumMap) quickPromotionSurface, (QuickPromotionSurface) A002);
            }
        }
        if (A00 == null) {
            A00 = new Object();
        }
        JSONObject jSONObject = new JSONObject();
        Iterator A14 = AbstractC166997dE.A14(enumMap);
        while (A14.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A14);
            QuickPromotionSurface quickPromotionSurface2 = (QuickPromotionSurface) A1K.getKey();
            java.util.Set set = (java.util.Set) A1K.getValue();
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Trigger) it.next()).A01);
            }
            try {
                jSONObject.put(String.valueOf(quickPromotionSurface2.A00), jSONArray);
            } catch (JSONException e) {
                C0K8.A0L("QuickPromotionApi", AbstractC111324zv.A00(1623), e, AbstractC111324zv.A00(3197));
            }
        }
        String A19 = AbstractC166987dD.A19(jSONObject);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("qp/batch_fetch/");
        A0c.A9s("vc_policy", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A0c.A9s("version", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0c.A9s(AbstractC111324zv.A00(3197), A19);
        A0c.A9s("scale", String.valueOf(i));
        A0c.A0A = AbstractC166997dE.A0z("%s%s/%s", Arrays.copyOf(new Object[]{"qp/batch_fetch/", "d0d0df20f1f4fcc942cd21b5181a6a9f0f554364b0e20671791f50beb40b97bf", A19}, 3));
        A0c.A07 = num;
        C17280tP A0y = AbstractC166987dD.A0y();
        String str = (String) A0y.A2P.CES(A0y, C17280tP.A4G[212]);
        if (str != null && str.length() != 0) {
            A0c.A9s("qp_override_ip", str);
        }
        C52073N1y c52073N1y = C52073N1y.A00;
        C222015v c222015v = AbstractC221915u.A00;
        C14360o3.A08(c222015v);
        A0c.A02 = new C25581Mo(c222015v, C4OY.class);
        A0c.A0R = true;
        return A0c.A0N();
    }
}
