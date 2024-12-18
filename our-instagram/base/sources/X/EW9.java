package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;

/* loaded from: classes6.dex */
public final class EW9 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new FanClubMemberListViewModel(userSession, (FanClubMemberListRepository) userSession.A01(FanClubMemberListRepository.class, new C37049GUf(userSession, 46)), this.A01);
    }

    public EW9(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
