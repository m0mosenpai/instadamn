package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.JUx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43712JUx {
    public static final void A00(UserSession userSession, C5lP c5lP, String str) {
        C14360o3.A0B(str, 2);
        AbstractC125215lS.A01(((C4K6) userSession.A01(C4K6.class, C4K5.A00)).A00, c5lP, "persist_message_fail_reason", str);
    }

    public static final void A01(UserSession userSession, C5lP c5lP, String str, String str2, boolean z) {
        if (!z || c5lP.A07) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(null, userSession), "direct_e2e_message_delivery_waterfall");
            A0f.A7v("realtime", Boolean.valueOf(c5lP.A06));
            AbstractC31171DnF.A1F(A0f, str);
            A0f.AAP("sender_id", str2);
            A0f.AAP("event", "persisted_in_memory");
            String str3 = c5lP.A03;
            if (str3 != null) {
                A0f.AAP("client_context", str3);
            }
            String str4 = c5lP.A04;
            if (str4 != null) {
                A0f.AAP("mutation_token", str4);
            }
            A0f.Cht();
        }
        AbstractC125215lS.A00(((C4K6) userSession.A01(C4K6.class, C4K5.A00)).A00, c5lP, "persist_message_success");
    }
}
