package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NBQ extends AbstractC61132qb {
    public final UserSession A00;

    public NBQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C147836l8 c147836l8 = AbstractC147826l7.A0K;
        UserSession userSession = this.A00;
        AbstractC147826l7 A00 = c147836l8.A00(userSession, EnumC142806cg.A03);
        return new C52882Nad(userSession, A00.A01(), A00.A02(), A00.A03(), C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36318024411846458L));
    }
}
