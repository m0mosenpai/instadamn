package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1vE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41061vE implements InterfaceC13000lm {
    public final C18920wW A00;
    public final UserSession A01;

    public C41061vE(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = new C18920wW(C12180kM.A02, userSession);
    }

    public final void A00(String str, String str2) {
        A05("access_control_failure", str, null, AbstractC06930Yk.A02(new C09530e4("caller_class", str2)));
    }

    public final void A01(String str, String str2) {
        A05("cache_access", str, null, AbstractC06930Yk.A02(new C09530e4("caller_class", str2)));
    }

    public final void A02(String str, String str2) {
        A05("manual_fetch_success", str, null, AbstractC06930Yk.A02(new C09530e4("caller_class", str2)));
    }

    public final void A03(String str, String str2, String str3) {
        A05("manual_fetch_failure", str, null, AbstractC06930Yk.A02(new C09530e4("caller_class", str2), new C09530e4("error_message", str3)));
    }

    public final void A04(String str, String str2, List list) {
        A05("service_cache_access", str, list, AbstractC06930Yk.A02(new C09530e4("caller_class", str2)));
    }

    public final void A05(String str, String str2, List list, Map map) {
        C18920wW c18920wW = this.A00;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "fx_master_account_client_cache"), 160);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            c25531Mh.A0R("event_name", str);
            c25531Mh.A0R("use_case", str2);
            c25531Mh.A0S("services", list);
            ((AbstractC02600Aj) c25531Mh).A00.A9M("debug_data", map);
            c25531Mh.Cht();
        }
    }

    public final void A06(String str, Map map, Map map2, double d, boolean z, boolean z2) {
        String str2;
        C18920wW c18920wW = this.A00;
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "fx_linkage_cache_metrics"), 159);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            for (Map.Entry entry : map.entrySet()) {
                String lowerCase = ((String) entry.getKey()).toLowerCase(Locale.ROOT);
                C14360o3.A07(lowerCase);
                map2.put(AnonymousClass001.A0R(lowerCase, "AccountCount"), String.valueOf(((Number) entry.getValue()).intValue()));
            }
            c25531Mh.A0Q("num_linked_accounts", Long.valueOf(AbstractC001800i.A02(map.values())));
            c25531Mh.A0O("is_rtdd", Boolean.valueOf(z));
            c25531Mh.A0R("caller_name", str);
            if (z2) {
                str2 = NetInfoModule.CONNECTION_TYPE_NONE;
            } else {
                str2 = "ready";
            }
            c25531Mh.A0R("msys_cache_status", str2);
            c25531Mh.A0P("time_elapsed_since_app_start_in_sec", Double.valueOf(d));
            ((AbstractC02600Aj) c25531Mh).A00.A9M("debug_data", map2);
            c25531Mh.Cht();
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A03(C41061vE.class);
    }

    public C41061vE() {
    }
}
