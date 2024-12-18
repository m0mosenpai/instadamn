package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes8.dex */
public abstract class LCJ {
    public static final String A00(UserSession userSession) {
        if (userSession == null || !C18U.A06(C06090Tz.A05, userSession, 36319424571055529L)) {
            return null;
        }
        UUID A00 = C0HM.A00();
        C14360o3.A07(A00);
        return AbstractC167017dG.A0n(A00, "fake_", AbstractC166987dD.A1C());
    }

    public static final HashMap A01(C116155Nu c116155Nu) {
        String str;
        String str2;
        String str3;
        HashMap A00 = AbstractC46550Kip.A00(c116155Nu.A0P);
        if (A00 == null) {
            return null;
        }
        String A0q = AbstractC166997dE.A0q(AbstractC12290kX.A00.getApplicationContext().getResources(), 2131964151);
        String str4 = c116155Nu.A0Q;
        if (str4 == null) {
            str4 = A0q;
        }
        A00.put("account", str4);
        String str5 = c116155Nu.A0S;
        if (str5 != null) {
            A0q = str5;
        }
        A00.put("sn", A0q);
        String str6 = c116155Nu.A0R;
        String str7 = "";
        if (str6 == null) {
            str6 = "";
        }
        A00.put("su", str6);
        if (!c116155Nu.A1S || (str = c116155Nu.A0i) == null) {
            str = "";
        }
        A00.put("itt", str);
        A00.put("armadillo_is_thread_muted", String.valueOf(c116155Nu.A1Q));
        A00.put("armadillo_is_thread_hidden", String.valueOf(c116155Nu.A1P));
        A00.put("is_silent", String.valueOf(c116155Nu.A1M));
        A00.put(AbstractC111324zv.A00(5136), c116155Nu.A12);
        String str8 = c116155Nu.A0U;
        if (str8 != null) {
            A00.put("wa_push_id", str8);
        }
        if (c116155Nu.A1S) {
            str2 = c116155Nu.A0i;
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str2, "2")) {
            A00.put("feature_tags", "15");
        }
        if (c116155Nu.A1S) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        A00.put("is_instamadillo", str3);
        String str9 = c116155Nu.A1G;
        if (str9 != null || (str9 = c116155Nu.A1F) != null) {
            str7 = str9;
        }
        A00.put("thread_igid", str7);
        String str10 = c116155Nu.A0z;
        if (str10 == null) {
            return A00;
        }
        A00.put("atid", str10);
        return A00;
    }
}
