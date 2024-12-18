package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FLE {
    public final C18920wW A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    public FLE(UserSession userSession) {
        this.A02 = userSession;
        C19270xB A0D = AbstractC31171DnF.A0D("BusinessLinkingLogger");
        this.A01 = A0D;
        this.A00 = AbstractC12220kQ.A01(A0D, userSession);
    }
}
