package X;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EOW extends AbstractC68258VJv {
    public final /* synthetic */ C35229FgM A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC68258VJv
    public final void A00(List list) {
        Object obj;
        long j;
        String str;
        C35229FgM c35229FgM = this.A00;
        if (c35229FgM.A0H) {
            c35229FgM.A0B.finish();
        }
        C006802i c006802i = c35229FgM.A04;
        if (c006802i == null) {
            C14360o3.A0F("qpl");
            throw C00O.createAndThrow();
        }
        c006802i.markerPoint(896612552, "endClientDataFetch");
        c006802i.markerPoint(896612552, 0, AnonymousClass001.A0R("join_request_", RealtimeSubscription.GRAPHQL_MQTT_VERSION));
        C07270a1 c07270a1 = c35229FgM.A0D;
        FragmentActivity fragmentActivity = c35229FgM.A0B;
        C14360o3.A0C(fragmentActivity, MSV.A00(9));
        C62862tP A01 = C62862tP.A01(null, fragmentActivity, (InterfaceC11380iw) fragmentActivity, c07270a1);
        List list2 = list;
        JSONObject jSONObject = new JSONObject(C36700GFv.A00(c35229FgM.A08, c07270a1, C35229FgM.A0I));
        HashMap A1G = AbstractC166987dD.A1G();
        C19740y2 A0Q = AbstractC31171DnF.A0Q();
        Bundle bundle = c35229FgM.A09;
        if (!bundle.containsKey("active_logged_in_user_id")) {
            obj = "";
        } else {
            obj = bundle.getString("active_logged_in_user_id");
            if (obj == null) {
                obj = "";
            }
            if (c35229FgM.A06 && bundle.containsKey("last_logged_in_ig_access_token")) {
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC31171DnF.A12(A0b, bundle.getString("last_logged_in_ig_access_token", null));
                UserSession A07 = C023409i.A0A.A07(A0b);
                if (A07 != null) {
                    ArrayList A012 = C23132AMt.A01(c07270a1.A00.A06(), A07, "active_account", "caa_bloks_access_library_spc_account_linking", "BloksSignedOutFragmentActivity");
                    if (!A012.isEmpty()) {
                        Object obj2 = A012.get(0);
                        if (obj2 instanceof Map) {
                            ArrayList A1E = AbstractC166987dD.A1E();
                            for (Object obj3 : list) {
                                AbstractC25232BEp.A1Q(((Map) obj3).get("uid"), obj, obj3, A1E);
                            }
                            Object obj4 = ((Map) obj2).get("auth_token");
                            AbstractC25225BEi.A1S(obj4);
                            list2 = AbstractC001800i.A0S(A1E, AbstractC166987dD.A1J(AbstractC25232BEp.A1F("token", obj4, AbstractC166987dD.A1L("uid", obj), AbstractC166987dD.A1L("credential_type", "spc_local_auth"))));
                        }
                    }
                }
            }
        }
        try {
            JSONArray A0p = AbstractC31171DnF.A0p();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0p.put(new JSONObject((Map) it.next()));
            }
            jSONObject.put("is_from_logged_in_switcher", c35229FgM.A06);
            jSONObject.put("switcher_logged_in_uid", obj);
            jSONObject.put("account_list", A0p);
            jSONObject.put("blocked_uid", new JSONArray((Collection) AbstractC166987dD.A0y().A09()));
            jSONObject.put("INTERNAL_INFRA_THEME", AbstractC25291Lj.A00.C73().name());
            String string = bundle.getString("launched_url", "");
            jSONObject.put("launched_url", string);
            C14360o3.A0B(string, 0);
            InterfaceC19610xo A0P = AbstractC31171DnF.A0P(A0Q);
            A0P.E7K("auto_login_launched_url", string);
            A0P.apply();
        } catch (JSONException unused) {
        }
        A1G.put("params", jSONObject.toString());
        java.util.Set A09 = AbstractC166987dD.A0y().A09();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        for (Object obj5 : list) {
            AbstractC25228BEl.A1Q(obj5, A1E2, A09.contains(((Map) obj5).get("uid")) ? 1 : 0);
        }
        List A0a = AbstractC001800i.A0a(A1E2);
        if (C1AD.A06(C06090Tz.A06, 18309905144361048L)) {
            C35229FgM.A02(c35229FgM, "always_show_fallback_screen MC on");
            return;
        }
        Handler handler = c35229FgM.A0A;
        Runnable runnable = c35229FgM.A0E;
        if (AbstractC167007dF.A1Z(c35229FgM.A0G)) {
            j = 7000;
        } else {
            j = StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
        }
        handler.postDelayed(runnable, j);
        if (A0a.isEmpty()) {
            str = "ig_login_home_shown";
        } else {
            str = "ig_aymh_shown";
        }
        C14360o3.A0B(c07270a1, 0);
        C35029Fc2.A00(c07270a1, C05F.A00, str, "home_page", "prefill_login_signal", null);
        C5LD c5ld = C5LD.A00;
        AbstractC192798gL A02 = C192108fB.A02(c35229FgM.A0C.A00, c07270a1, "com.bloks.www.bloks.caa.login.process_client_data_and_redirect", A1G);
        C32394EOv.A00(A02, A01, c35229FgM, 7);
        c5ld.schedule(A02);
    }

    public EOW(C35229FgM c35229FgM) {
        this.A00 = c35229FgM;
    }
}
