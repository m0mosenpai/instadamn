package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository;

/* renamed from: X.EVr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32567EVr extends AbstractC61132qb {
    public final UserSession A00;

    public C32567EVr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C32941EeM(C12L.A00, userSession, (FanClubMemberListCategoryRepository) userSession.A01(FanClubMemberListCategoryRepository.class, new C37049GUf(userSession, 45)));
    }
}
