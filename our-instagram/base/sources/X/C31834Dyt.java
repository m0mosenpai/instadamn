package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository;
import com.instagram.fanclub.settings.repository.FanClubSettingsRepository;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.Dyt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31834Dyt extends AbstractC52922bZ {
    public final UserSession A00;
    public final C99694dm A01;
    public final FanClubSettingsRepository A02;
    public final C55002OVf A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C05A A06;
    public final C0UO A07;

    public /* synthetic */ C31834Dyt(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        String str2 = userSession.userId;
        FanClubApi fanClubApi = new FanClubApi(userSession);
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        FanClubSettingsRepository fanClubSettingsRepository = new FanClubSettingsRepository(fanClubApi, F7Q.A00(userSession), (FanClubSettingsRecommendationsRepository) userSession.A01(FanClubSettingsRecommendationsRepository.class, new J7K(userSession, 19)), A00, AbstractC149676oK.A00(userSession), str2);
        C99694dm A002 = AbstractC99684dl.A00(userSession);
        C55002OVf c55002OVf = new C55002OVf(userSession, str);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(A002, 4);
        this.A00 = userSession;
        this.A02 = fanClubSettingsRepository;
        this.A01 = A002;
        this.A03 = c55002OVf;
        C008002u A003 = C10E.A00(C32948Eef.A00);
        this.A05 = A003;
        this.A07 = A003;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A06 = A1A;
        this.A04 = new C31199Dni(19, new InterfaceC19390xP[]{A1A, fanClubSettingsRepository.A03.A0F, fanClubSettingsRepository.A05, fanClubSettingsRepository.A06, fanClubSettingsRepository.A02.A01, fanClubSettingsRepository.A01.A02}, this);
    }

    public static final void A00(C31834Dyt c31834Dyt, String str) {
        AbstractC166987dD.A1Z(new MCF(c31834Dyt, str, null, 29), AbstractC141776au.A00(c31834Dyt));
    }
}
