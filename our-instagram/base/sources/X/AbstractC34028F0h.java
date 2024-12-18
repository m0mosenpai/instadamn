package X;

import java.util.Map;

/* renamed from: X.F0h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34028F0h {
    public static void A00(AbstractC12990ll abstractC12990ll, Integer num, String str, String str2, String str3, String str4, Map map) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "caa_account_recovery_client_events_ig");
        if (A0f.isSampled()) {
            Integer A00 = AbstractC34030F0j.A00(abstractC12990ll, num, "CAAAccountRecoveryIgNativeLogger");
            C17280tP A0y = AbstractC166987dD.A0y();
            C0Zx c0Zx = new C0Zx();
            AbstractC31179DnN.A1B(c0Zx, str, "account_recovery", str2, "start_account_recovery");
            c0Zx.A06(AbstractC111324zv.A00(712), AbstractC33637Etn.A00(A00));
            c0Zx.A06("logged_out_identifier", str3);
            c0Zx.A06("waterfall_id", A0y.A08());
            c0Zx.A06("event_request_id", str4);
            c0Zx.A08("extra_client_data", map);
            A0f.AAQ(c0Zx, "core");
            C0Zx c0Zx2 = new C0Zx();
            c0Zx2.A06("event_source", "reset_password_link");
            A0f.AAQ(c0Zx2, "account_recovery_params");
            A0f.Cht();
        }
    }
}
