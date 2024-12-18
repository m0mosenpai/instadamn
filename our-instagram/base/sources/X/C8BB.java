package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8BB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8BB {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C8BB(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    public final void A00(EnumC199338ra enumC199338ra) {
        UserSession userSession = this.A01;
        C18920wW A01 = AbstractC12220kQ.A01(this.A00, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "fb_branded_content_logger_event");
        if (A00.isSampled()) {
            A00.A8R(enumC199338ra, "event");
            String str = userSession.userId;
            C14360o3.A0B(str, 0);
            A00.A9K("ig_creator_igid", AbstractC003100w.A0k(10, str));
            A00.Cht();
        }
    }
}
