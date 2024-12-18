package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45578KFs extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C45578KFs(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        C47514Kyh c47514Kyh = new C47514Kyh(interfaceC11380iw, userSession);
        C14360o3.A0B(userSession, 0);
        return new C44506JmC(c47514Kyh, (C47249KuM) userSession.A01(C47249KuM.class, new C50162MDp(userSession, 32)), interfaceC11380iw);
    }
}
