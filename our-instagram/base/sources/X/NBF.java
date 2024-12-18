package X;

import com.instagram.common.session.UserSession;
import com.instagram.reels.party.data.StoryPartyRepository;

/* loaded from: classes9.dex */
public final class NBF extends AbstractC61132qb {
    public final UserSession A00;

    public NBF(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50906Meb(userSession, new StoryPartyRepository(new O48(userSession)));
    }
}
