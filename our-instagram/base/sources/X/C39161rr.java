package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39161rr {
    public Y3S A00;
    public java.util.Set A01;
    public java.util.Set A02;
    public final C38951rU A03;
    public final UserSession A04;

    /* JADX WARN: Type inference failed for: r4v2, types: [X.4pj, java.lang.Object] */
    public C39161rr(C38951rU c38951rU, UserSession userSession, String str) {
        C105724pj c105724pj;
        this.A04 = userSession;
        this.A03 = c38951rU;
        this.A01 = new HashSet();
        this.A02 = new HashSet();
        synchronized (C105724pj.A03) {
            C105724pj c105724pj2 = C105724pj.A02;
            c105724pj = c105724pj2;
            if (c105724pj2 == null) {
                ?? obj = new Object();
                obj.A00 = new HashSet();
                obj.A01 = new HashSet();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                try {
                } catch (JSONException e) {
                    C0K8.A0M("IgFederatedAnalyticsEventManager", "Exception when de-serializing federated analytics config: %s", e, str);
                }
                if (str.length() != 0) {
                    JSONObject jSONObject = new JSONObject(AbstractC38511qf.A00(str));
                    if (jSONObject.has("fully_federated_events")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("fully_federated_events");
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            String string = jSONArray.getString(i);
                            C14360o3.A07(string);
                            hashSet.add(string);
                        }
                    }
                    if (jSONObject.has("partially_federated_events")) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("partially_federated_events");
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            String string2 = jSONArray2.getString(i2);
                            C14360o3.A07(string2);
                            hashSet2.add(string2);
                        }
                    }
                    obj.A00 = hashSet;
                    obj.A01 = hashSet2;
                }
                C105724pj.A02 = obj;
                c105724pj = obj;
            }
            C14360o3.A0C(c105724pj, "null cannot be cast to non-null type com.instagram.analytics.analytics2.federatedanalytics.IgFederatedAnalyticsEventManager");
        }
        this.A01 = c105724pj.A00;
        this.A02 = c105724pj.A01;
    }
}
