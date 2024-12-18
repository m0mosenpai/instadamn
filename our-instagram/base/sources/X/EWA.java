package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;

/* loaded from: classes6.dex */
public final class EWA extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C31813DyX((FanClubSettingsRecommendationsRepository) userSession.A01(FanClubSettingsRecommendationsRepository.class, new J7K(userSession, 19)), new C55002OVf(userSession, this.A01));
    }

    public EWA(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
