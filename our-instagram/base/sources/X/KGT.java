package X;

import com.instagram.appreciation.analytics.creator.CreatorLoggingData;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGT extends AbstractC61132qb {
    public final LLN A00;
    public final CreatorLoggingData A01;
    public final UserSession A02;
    public final String A03;

    public KGT(LLN lln, CreatorLoggingData creatorLoggingData, UserSession userSession, String str) {
        AbstractC167027dH.A0a(1, userSession, lln, str, creatorLoggingData);
        this.A02 = userSession;
        this.A00 = lln;
        this.A03 = str;
        this.A01 = creatorLoggingData;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        String str = this.A03;
        AbstractC167017dG.A1N(userSession, str);
        return new C44521JmR(this.A00, this.A01, new C43893Jb2(userSession), new C47702L4j(new OIK(userSession, AbstractC40691uc.A01(userSession), str)), C27S.A00().A03(), userSession);
    }
}
