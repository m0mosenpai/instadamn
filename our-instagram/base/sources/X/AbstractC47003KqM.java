package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KqM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47003KqM {
    public static final void A00(EnumC46272Ke4 enumC46272Ke4, UserSession userSession, String str) {
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "business_inbox_thread_nudge";
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_professional_thread_nudge_events");
        if (A0f.isSampled()) {
            A0f.A8R(enumC46272Ke4, "action");
            A0f.A9M("event_data", null);
            A0f.AAk("participant_ids", AbstractC166987dD.A1J(str));
            A0f.Cht();
        }
    }
}
