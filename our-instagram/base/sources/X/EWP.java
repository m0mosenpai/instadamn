package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;

/* loaded from: classes6.dex */
public final class EWP extends AbstractC61132qb {
    public final UserSession A00;
    public final SubscribedAndRecommendedCreatorListRepository A01;
    public final boolean A02;

    public EWP(UserSession userSession, SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = subscribedAndRecommendedCreatorListRepository;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31846DzE(this.A00, this.A01, this.A02);
    }
}
