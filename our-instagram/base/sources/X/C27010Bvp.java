package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27010Bvp extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C27010Bvp(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C25880Bcg(this.A00, userSession, new CUN(userSession));
    }
}
