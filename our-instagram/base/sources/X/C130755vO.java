package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5vO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130755vO implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "IgPresenceLogger";
    public final C18920wW A00;
    public final UserSession A01;

    public C130755vO(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    public final void A01(Integer num, boolean z, boolean z2) {
        Long A01;
        C4PM A00 = C4PM.A00();
        if (z) {
            A01 = A00.A02(false);
        } else {
            A01 = A00.A01(false);
        }
        C14360o3.A0A(A01);
        long longValue = A01.longValue();
        if (num.intValue() != 0) {
            String valueOf = String.valueOf(longValue);
            Boolean valueOf2 = Boolean.valueOf(z);
            C18920wW c18920wW = this.A00;
            InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "msgr_presence_update");
            if (A002.isSampled()) {
                if (C18U.A06(C06090Tz.A05, this.A01, 36312080176907146L)) {
                    A002.AAP("event_type", "setting_update");
                    A002.A7v("is_co_presence_enabled", valueOf2);
                    A002.AAP("client_request_id", valueOf);
                    A002.Cht();
                    return;
                }
                return;
            }
            return;
        }
        A00(this, null, Boolean.valueOf(z), Boolean.valueOf(z2), "setting_update", String.valueOf(longValue));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(C130755vO c130755vO, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2) {
        C18920wW c18920wW = c130755vO.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "msgr_presence_update");
        if (A00.isSampled()) {
            if (C18U.A06(C06090Tz.A05, c130755vO.A01, 36312080176907146L)) {
                A00.AAP("event_type", str);
                A00.AAP("client_request_id", str2);
                A00.A7v("is_foregrounded", bool);
                A00.A7v("is_presence_enabled", bool2);
                A00.A7v("is_new_ls_presence_reporting", bool3);
                A00.Cht();
            }
        }
    }

    public final void A02(Map map) {
        String str;
        String str2;
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "msgr_presence_update");
        if (A00.isSampled()) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36312080176972683L)) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    C42321xM c42321xM = (C42321xM) entry.getValue();
                    if (c42321xM != null && (str = c42321xM.A03) != null && str.length() != 0 && !"None".equals(str) && !"0".equals(str)) {
                        Object key = entry.getKey();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c42321xM.A04).put("is_active", c42321xM.A05).put("lastActivityAtMs", c42321xM.A01).put("appTitle", c42321xM.A02).put("capabilities", c42321xM.A00).put("correlationId", str).put("is_close_friend", c42321xM.A06);
                            str2 = jSONObject.toString();
                            C14360o3.A07(str2);
                        } catch (JSONException e) {
                            C0K8.A0F("PresenceState", "Failed to generate content", e);
                            str2 = "";
                        }
                        hashMap.put(key, str2);
                    }
                }
                if (!hashMap.isEmpty()) {
                    A00.AAP("event_type", "batch_received");
                    A00.A9M("presence_data", hashMap);
                    A00.Cht();
                }
            }
        }
    }
}
