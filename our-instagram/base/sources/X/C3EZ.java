package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3EZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3EZ {
    public final C18920wW A00;

    public C3EZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
    }

    public final void A00(C8m c8m) {
        C18920wW c18920wW = this.A00;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_dogfooding_first_event");
        if (A00.isSampled()) {
            A00.A8R(c8m, "event_name");
            A00.Cht();
        }
    }
}
