package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBH extends AbstractC61132qb {
    public final UserSession A00;

    public NBH(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50914Mej(userSession, AbstractC63302u8.A00(userSession));
    }
}