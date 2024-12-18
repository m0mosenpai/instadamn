package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapAudienceListRepository;

/* loaded from: classes8.dex */
public final class KG4 extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC92974Es A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        EnumC92974Es enumC92974Es = this.A01;
        AbstractC167017dG.A1N(userSession, enumC92974Es);
        return new C45997KXl(new FriendMapAudienceListRepository(userSession, new C92964Eq(userSession), enumC92974Es));
    }

    public KG4(UserSession userSession, EnumC92974Es enumC92974Es) {
        AbstractC167017dG.A1P(userSession, enumC92974Es);
        this.A00 = userSession;
        this.A01 = enumC92974Es;
    }
}
