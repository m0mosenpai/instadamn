package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.DvX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31667DvX {
    public final C18920wW A00;

    public C31667DvX(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public static final void A00(C31667DvX c31667DvX, String str, String str2) {
        HashMap A1G = AbstractC166987dD.A1G();
        if (str2 != null) {
            A1G.put("message_type", str2);
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c31667DvX.A00, "direct_bulk_reply_events");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1C(A0f, str);
            A0f.A9M("event_data", A1G);
            A0f.Cht();
        }
    }
}
