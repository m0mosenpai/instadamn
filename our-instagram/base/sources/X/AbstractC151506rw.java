package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.search.common.analytics.SearchContext;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC151506rw {
    public static final C1ON A01(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A05();
        c25621Ms.A0B("friendships/create_many/async/");
        c25621Ms.A9s("user_ids", str);
        c25621Ms.A0H("nav_chain", C1QM.A00.A02.A00);
        c25621Ms.A0Q(new C56150OwG(new C07510aQ(userSession), new C36016FvE(userSession)));
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }

    public static final C1ON A02(UserSession userSession, String str, boolean z) {
        C14360o3.A0B(str, 0);
        String A06 = AbstractC13670mt.A06("friendships/show/%s/", str);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B(A06);
        c25621Ms.A0I("is_external_deeplink_profile_view", z);
        c25621Ms.A0P(null, C151516rx.class, C151526ry.class, false);
        return c25621Ms.A0N();
    }

    public static final C1ON A04(UserSession userSession, List list, long j, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 1);
        String A0P = AbstractC001800i.A0P(", ", "", "", list, GW0.A00);
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B("friendships/show_many/");
        c25621Ms.A9s("user_ids", A0P);
        c25621Ms.A0I("include_followed_by", z2);
        c25621Ms.A0Q(new C56150OwG(new C07510aQ(userSession), new C36015FvD(userSession)));
        if (j > 0) {
            ((AbstractC23721Ec) c25621Ms).A01 = j;
            c25621Ms.A08(C05F.A0N);
            c25621Ms.A0A = "friendships/show_many/";
        } else if (z) {
            c25621Ms.A0A = AnonymousClass001.A0R("friendships/show_many/", A0P);
            c25621Ms.A08(C05F.A0Y);
            ((AbstractC23721Ec) c25621Ms).A00 = 3000L;
        }
        return c25621Ms.A0N();
    }

    public static final C1ON A03(UserSession userSession, List list) {
        return A04(userSession, list, 0L, false, false);
    }

    public static final String A05(List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        String obj = jSONArray.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final C1ON A00(Context context, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, Boolean bool, Boolean bool2, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject) {
        C38321qM A1e;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        String str8 = C1QM.A00.A02.A00;
        String str9 = null;
        C25621Ms c25621Ms = new C25621Ms(userSession, -2);
        c25621Ms.A09(C05F.A01);
        c25621Ms.A0B(AbstractC13670mt.A06("friendships/%s/%s/", str2, str));
        c25621Ms.A9s(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        c25621Ms.A9s("radio_type", AbstractC15820qc.A09(context));
        c25621Ms.A9s("container_module", str3);
        c25621Ms.A0H("nav_chain", str8);
        c25621Ms.A0H("ndid", str5);
        c25621Ms.A9s("include_follow_friction_check", C14360o3.A0K(bool2, true) ? RealtimeSubscription.GRAPHQL_MQTT_VERSION : "0");
        if (c38321qM != null) {
            c25621Ms.A0H("media_id_attribution", c38321qM.getId());
            c25621Ms.A0H("media_id", c38321qM.getId());
            c25621Ms.A0H("ranking_info_token", c38321qM.A0C.getLoggingInfoToken());
            c25621Ms.A0H("inventory_source", c38321qM.A0C.BJN());
        }
        if (str4 != null) {
            c25621Ms.A0H("media_id_attribution", str4);
        }
        if (c75113Zb != null) {
            c25621Ms.A0A(Integer.valueOf(c75113Zb.A0W), "recs_ix");
            c25621Ms.A0A(Integer.valueOf(c75113Zb.getPosition()), "client_position");
        }
        if ("create".equals(str2)) {
            c25621Ms.A9s(AbstractC31186DnV.A01(0, 9, 92), C16030qx.A00(context));
        }
        if (jSONObject != null) {
            c25621Ms.AA6("entrypoint", jSONObject.toString());
        }
        if (searchContext != null) {
            c25621Ms.A0H("search_session_id", searchContext.A05);
            c25621Ms.A0H("query_text", searchContext.A02);
            c25621Ms.A0H("rank_token", searchContext.A03);
        }
        if (C14360o3.A0K(bool, true)) {
            c25621Ms.A9s("is_suggested_user", "true");
        }
        if (str6 != null && str6.length() != 0) {
            C38801rC c38801rC = C38321qM.A0h;
            c25621Ms.A9s("barcelona_source_reply_id", C38801rC.A06(str6));
        }
        if (str7 != null && str7.length() != 0) {
            C38801rC c38801rC2 = C38321qM.A0h;
            c25621Ms.A9s("barcelona_source_quote_id", C38801rC.A06(str7));
        }
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != -1) {
                c25621Ms.A0E("carousel_index", longValue);
                C38801rC c38801rC3 = C38321qM.A0h;
                if (c38321qM != null && (A1e = c38321qM.A1e((int) longValue)) != null) {
                    str9 = A1e.getId();
                }
                c25621Ms.A9s("carousel_media_id", C38801rC.A05(str9));
            }
        }
        c25621Ms.A0P(null, EDR.class, C34858FXs.class, false);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }
}
