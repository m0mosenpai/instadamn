package X;

import com.instagram.common.session.UserSession;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.97m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054197m {
    public final UserSession A00;

    public C2054197m(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final void A00(EnumC222659s6 enumC222659s6, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("nta_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), enumC222659s6);
            jSONObject.put("nta_eligibility", optJSONObject);
        } catch (JSONException e) {
            C0K8.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    public static final void A01(EnumC222659s6 enumC222659s6, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("nta_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), enumC222659s6);
            jSONObject.put("nta_super_eligibility", optJSONObject);
        } catch (JSONException e) {
            C0K8.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    public static final void A02(EnumC222659s6 enumC222659s6, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("sso_eligibility");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put(String.valueOf(3), enumC222659s6);
            jSONObject.put("sso_eligibility", optJSONObject);
        } catch (JSONException e) {
            C0K8.A0F("FXIGAccessLibrarySSOAndRegFlagAppJob", "Failed when saving SSO Eligibility", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0100, code lost:
    
        if (r23 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0028, code lost:
    
        if (r9.length() == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (r23 != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.BD7 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2054197m.A03(X.BD7, boolean):void");
    }
}
