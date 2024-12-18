package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7RB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RB {
    public final C18920wW A00;
    public final UserSession A01;

    public final void A00(String str, String str2) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_message_multi_react_overflow_pill");
        if (A00.isSampled()) {
            A00.AAP("message_id", str);
            A00.AAP("open_thread_id", str2);
            A00.AAP("action", "tap");
            A00.Cht();
        }
    }

    public C7RB(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AbstractC12220kQ.A01(new C19270xB("direct_thread"), userSession);
    }
}
