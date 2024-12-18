package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.KoC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46869KoC {
    public static final String A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        JSONObject A0q = AbstractC31171DnF.A0q();
        try {
            C06090Tz c06090Tz = C06090Tz.A05;
            A0q.put("experiment_0", C18U.A06(c06090Tz, userSession, 36321769623136065L));
            A0q.put("experiment_1", C18U.A06(c06090Tz, userSession, 36321769623201602L));
            A0q.put("experiment_2", C18U.A06(c06090Tz, userSession, 36321769623267139L));
            A0q.put("experiment_3", C18U.A06(c06090Tz, userSession, 36321769623332676L));
            A0q.put("experiment_4", C18U.A06(c06090Tz, userSession, 36321769623398213L));
        } catch (JSONException e) {
            C0f5 AEp = C18950wb.A01.AEp("JSONException", 20134884);
            AEp.ABW("JSONException", e.getMessage());
            AEp.report();
        }
        return AbstractC166987dD.A19(A0q);
    }
}
