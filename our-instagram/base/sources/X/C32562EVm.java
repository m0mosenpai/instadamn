package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32562EVm extends AbstractC61132qb {
    public final UserSession A00;

    public C32562EVm(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C31838Dyx(userSession, (C33091Eir) userSession.A01(C33091Eir.class, new C37058GUs(userSession, 27)));
    }
}
