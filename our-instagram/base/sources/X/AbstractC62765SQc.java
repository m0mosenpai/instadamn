package X;

import com.facebook.AccessToken;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SQc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62765SQc {
    public static final AccessToken A00(JSONObject jSONObject) {
        if (jSONObject.getInt("version") > 1) {
            return null;
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString(CacheBehaviorLogger.SOURCE);
        C14360o3.A07(string2);
        Integer A00 = AbstractC62766SQd.A00(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        try {
            C14360o3.A0A(jSONArray);
            ArrayList A1E = AbstractC166987dD.A1E();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string5 = jSONArray.getString(i);
                C14360o3.A07(string5);
                A1E.add(string5);
            }
            C14360o3.A0A(jSONArray2);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String string6 = jSONArray2.getString(i2);
                C14360o3.A07(string6);
                A1E2.add(string6);
            }
            return new AccessToken(A00, string, string3, string4, A1E, A1E2, date, date2);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final JSONObject A01(AccessToken accessToken) {
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put("version", 1);
        A0q.put("token", accessToken.A02);
        A0q.put("expires_at", accessToken.A04.getTime());
        A0q.put("permissions", new JSONArray((Collection) accessToken.A07));
        A0q.put("declined_permissions", new JSONArray((Collection) accessToken.A06));
        A0q.put("last_refresh", accessToken.A05.getTime());
        A0q.put(CacheBehaviorLogger.SOURCE, AbstractC62766SQd.A01(accessToken.A00));
        A0q.put("application_id", accessToken.A01);
        A0q.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, accessToken.A03);
        return A0q;
    }
}
