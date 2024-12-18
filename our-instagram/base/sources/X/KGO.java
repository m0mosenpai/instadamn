package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGO extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C46859Kns A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Kns, java.lang.Object] */
    public /* synthetic */ KGO(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        ?? obj = new Object();
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = obj;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C2DS A00 = C2JD.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C44526JmW(userSession, new C47302KvD(this.A00, userSession), this.A02, (C47381KwW) userSession.A01(C47381KwW.class, new MHH(userSession, 22)), A00);
    }
}
