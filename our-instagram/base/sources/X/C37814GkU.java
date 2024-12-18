package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GkU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37814GkU {
    public static java.util.Set A00;
    public static final C37814GkU A01 = new Object();

    public static final C1ON A00(Context context, C9CJ c9cj, InterfaceC116925Qy interfaceC116925Qy, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        AbstractC25234BEr.A1P(str, str2, c9cj);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/async_ads/");
        A0c.A0H("seed_ad_id", c9cj.A00);
        A0c.A0H("seed_ad_token", c9cj.A02);
        AbstractC37300Gc1.A0y(A0c, str3);
        A0c.AA6("organic_item_ids", AbstractC31175DnJ.A0b(C16930sl.A00));
        A0c.A9s("chaining_session_id", str);
        A0c.A9s("viewer_session_id", str2);
        A0c.A0H("client_view_state_media_list", str4);
        A0c.A0R(C38961HDn.class, C41300IPp.class);
        A0c.A0R = true;
        AbstractC37301Gc2.A0t(context, A0c, userSession);
        if (map != null) {
            A0c.AA6("ad_and_netego_request_information", C85753s4.A00(map));
        }
        Map AUS = interfaceC116925Qy.AUS("ads/async_ads/");
        Map A002 = AbstractC85703rz.A00(AUS);
        A00 = AbstractC85703rz.A01(AUS);
        Iterator A15 = AbstractC166997dE.A15(A002);
        while (A15.hasNext()) {
            AbstractC37303Gc4.A16(A0c, A15);
        }
        EnumC74603Ws enumC74603Ws = EnumC74603Ws.A06;
        java.util.Set set = A00;
        if (set != null) {
            interfaceC116925Qy.FCF(enumC74603Ws, set);
        }
        return A0c.A0N();
    }

    public final C1ON A01(Context context, InterfaceC116925Qy interfaceC116925Qy, C37801GkG c37801GkG, C37682GiJ c37682GiJ, UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Collection collection, List list, Map map, Map map2, boolean z, boolean z2, boolean z3) {
        String A002;
        String str8;
        Map map3 = map;
        AbstractC167017dG.A1P(str, str2);
        AbstractC25229BEm.A1O(map3, 13, c37682GiJ);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/async_ads/");
        A0c.A0H("seed_item_id", str3);
        A0c.A0H("seed_ad_id", str4);
        A0c.A0H("seed_ad_token", str5);
        AbstractC37300Gc1.A0y(A0c, str6);
        A0c.AA6("organic_item_ids", AbstractC31175DnJ.A0b(collection));
        A0c.A9s("chaining_session_id", str);
        A0c.A9s("viewer_session_id", str2);
        A0c.A0R(C37850Gl4.class, C37849Gl3.class);
        if (l != null && str7 != null && num != null) {
            A0c.A0A = str7;
            A0c.A07 = num;
            ((AbstractC23721Ec) A0c).A01 = l.longValue();
            AbstractC37302Gc3.A1M(A0c, userSession, C37849Gl3.class);
        }
        if (z3) {
            A0c.A9s("is_prefetch", "true");
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36318565577595198L)) {
            if (map2 != null) {
                str8 = C85753s4.A00(map2);
            } else {
                str8 = null;
            }
            A0c.AA6("ad_and_netego_request_information", str8);
        }
        if (!AbstractC167007dF.A1Z(c37801GkG.A05)) {
            if (z2) {
                A002 = c37801GkG.A01();
            } else {
                A002 = c37801GkG.A00();
            }
            A0c.A9s("paging_token", A002);
        }
        if (z) {
            A0c.A9s("is_overlay", "true");
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C206239Bg c206239Bg = (C206239Bg) it.next();
                    C120985dq c120985dq = (C120985dq) c206239Bg.A03;
                    C40861ut c40861ut = (C40861ut) c206239Bg.A04;
                    JSONObject jSONObject = new JSONObject();
                    if (c40861ut != null) {
                        try {
                            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c120985dq.getId());
                            jSONObject.put("index", c40861ut.A09());
                        } catch (JSONException e) {
                            C0K8.A0F("ClipsApiUtil createSponsoredContentTask", "can't build json object for ad", e);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            A0c.A9s("current_page_ad_positions", jSONArray.toString());
        }
        if (C18U.A06(c06090Tz, userSession, 36313712265136340L)) {
            A0c.A0I("has_user_set_breaks", AnonymousClass280.A01.A06(userSession).getBoolean("HAS_USER_EVER_SET_BREAKS", false));
            A0c.A0E("take_a_break_nudge_last_seen_time", AbstractC23021Ah.A00(userSession).A0A());
            long currentTimeMillis = System.currentTimeMillis();
            long j = C50612Ug.A00;
            long j2 = 0;
            if (j > 0 && currentTimeMillis >= j) {
                j2 = (currentTimeMillis - j) / 1000;
            }
            A0c.A0E("session_time_spent", j2);
            long currentTimeMillis2 = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            A0c.A0E("current_time_in_seconds_since_midnight", (currentTimeMillis2 - calendar.getTimeInMillis()) / 1000);
        }
        if (!C18U.A06(c06090Tz, userSession, 36330084680090289L)) {
            map3 = interfaceC116925Qy.AUS("ads/async_ads/");
        }
        Iterator A15 = AbstractC166997dE.A15(AbstractC85703rz.A00(map3));
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            A0c.A9s((String) entry.getKey(), (String) entry.getValue());
        }
        String A003 = c37682GiJ.A00();
        if (A003 != null) {
            A0c.A9s("client_view_state_media_list", A003);
        }
        A0c.A0R = true;
        AbstractC37301Gc2.A0t(context, A0c, userSession);
        return A0c.A0N();
    }
}
