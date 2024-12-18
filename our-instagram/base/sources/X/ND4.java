package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;

/* loaded from: classes9.dex */
public final class ND4 extends AbstractC61132qb {
    public final UserSession A00;
    public final O7i A01;
    public final FanClubSettingsRecommendationsRepository A02;
    public final C55002OVf A03;

    public /* synthetic */ ND4(UserSession userSession, String str) {
        O7i o7i = new O7i(userSession);
        FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository = new FanClubSettingsRecommendationsRepository(new FanClubApi(userSession));
        C55002OVf c55002OVf = new C55002OVf(userSession, str);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = o7i;
        this.A02 = fanClubSettingsRecommendationsRepository;
        this.A03 = c55002OVf;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50952MfL(this.A01, this.A02, this.A03);
    }
}
