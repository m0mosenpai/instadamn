package X;

import android.location.Location;
import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FVU {
    /* JADX WARN: Type inference failed for: r0v10, types: [X.42m, X.E4z] */
    public static final C32021E4z A00(EnumC33443EqF enumC33443EqF, C32023E5b c32023E5b, UserSession userSession, String str, String str2) {
        Object obj;
        boolean z;
        Location lastLocation;
        JSONObject jSONObject = null;
        C14360o3.A0B(userSession, 0);
        JSONObject A0q = AbstractC31171DnF.A0q();
        if (str != null) {
            try {
                A0q.put("prompt_id", str);
            } catch (JSONException unused) {
            }
        }
        if (c32023E5b != null) {
            try {
                A0q.put("meta_ai_response_to_persist", c32023E5b.A00);
            } catch (JSONException unused2) {
            }
        }
        if (str2 != null) {
            try {
                A0q.put("qpl_join_id", str2);
            } catch (JSONException unused3) {
            }
        }
        Double d = null;
        if (!C18U.A06(C06090Tz.A05, userSession, 36319368742771998L)) {
            z = false;
        } else {
            C1VW c1vw = C1VW.A00;
            if (c1vw != null && (lastLocation = c1vw.getLastLocation(userSession, "GenAiLocationUtil")) != null && AbstractC103794ly.A00(lastLocation)) {
                d = Double.valueOf(lastLocation.getLatitude());
                obj = Double.valueOf(lastLocation.getLongitude());
            } else {
                obj = null;
            }
            JSONObject A0q2 = AbstractC31171DnF.A0q();
            try {
                if (d == null) {
                    A0q2.put(com.facebook.location.platform.api.Location.LATITUDE, JSONObject.NULL);
                } else {
                    A0q2.put(com.facebook.location.platform.api.Location.LATITUDE, d);
                }
            } catch (JSONException unused4) {
            }
            if (obj == null) {
                try {
                    obj = JSONObject.NULL;
                } catch (JSONException unused5) {
                }
            }
            A0q2.put("longitude", obj);
            try {
                A0q2.put("has_previous_perm_prompt", (Object) false);
            } catch (JSONException unused6) {
            }
            z = true;
            jSONObject = A0q2;
        }
        Object obj2 = jSONObject;
        if (!z) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException unused7) {
            }
        }
        A0q.put("location_extras", obj2);
        try {
            A0q.put("prompt_type", enumC33443EqF.toString());
        } catch (JSONException unused8) {
        }
        return new AbstractC907342m(A0q);
    }

    public static final String A01(EnumC33443EqF enumC33443EqF, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        return A00(enumC33443EqF, null, userSession, str, str2).A00.toString();
    }
}
