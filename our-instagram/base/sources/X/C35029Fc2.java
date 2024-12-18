package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Fc2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35029Fc2 {
    public static final void A00(AbstractC12990ll abstractC12990ll, Integer num, String str, String str2, String str3, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "caa_aymh_client_events_ig");
        if (A0f.isSampled()) {
            Integer A00 = AbstractC34030F0j.A00(abstractC12990ll, num, "CAALoginAymhIgNativeLogger");
            C17280tP A0y = AbstractC166987dD.A0y();
            C0Zx c0Zx = new C0Zx();
            AbstractC31179DnN.A1B(c0Zx, str, "aymh", str2, str3);
            c0Zx.A06(AbstractC111324zv.A00(712), AbstractC33637Etn.A00(A00));
            c0Zx.A06("waterfall_id", A0y.A08());
            c0Zx.A08("extra_client_data", map);
            A0f.AAQ(c0Zx, "core");
            A0f.AAQ(new C0Zx(), "aymh_params");
            A0f.Cht();
        }
    }

    public final void A02(AbstractC12990ll abstractC12990ll, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("credential_type", str);
        A1G.put("error", str2);
        A00(abstractC12990ll, C05F.A00, MSV.A00(1255), "home_page", "prefill_login_signal", A1G);
    }

    public final void A01(AbstractC12990ll abstractC12990ll, String str) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("credential_type", str);
        A00(abstractC12990ll, C05F.A00, "ig_aymh_load_account_attempted", "home_page", "prefill_login_signal", A1G);
    }

    public final void A03(AbstractC12990ll abstractC12990ll, String str, List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("profile_uid", list.toString());
        A1G.put("credential_type", str);
        A00(abstractC12990ll, C05F.A00, MSV.A00(1256), "home_page", "prefill_login_signal", A1G);
    }
}
