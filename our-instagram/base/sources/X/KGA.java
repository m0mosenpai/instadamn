package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.onboarding.repository.OnboardingRepository;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes8.dex */
public final class KGA extends AbstractC61132qb {
    public final LLN A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.Kji] */
    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        String str = this.A02;
        AbstractC167017dG.A1N(userSession, str);
        C47702L4j c47702L4j = new C47702L4j(new OIK(userSession, AbstractC40691uc.A01(userSession), str));
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        OnboardingRepository A002 = IRO.A00(userSession, AbstractC166987dD.A1G());
        return new C44550Jmu(this.A00, new Object(), c47702L4j, C27S.A00().A03(), userSession, A002, A00);
    }

    public KGA(LLN lln, UserSession userSession, String str) {
        AbstractC167027dH.A13(userSession, lln, str);
        this.A01 = userSession;
        this.A00 = lln;
        this.A02 = str;
    }
}
