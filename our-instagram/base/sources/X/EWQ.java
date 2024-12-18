package X;

import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWQ extends AbstractC61132qb {
    public final UserSession A00;
    public final C99694dm A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44507JmD(this.A00, this.A01, this.A02);
    }

    public /* synthetic */ EWQ(UserSession userSession) {
        String str;
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC166997dE.A0Y(userSession));
        if (A0M != null) {
            str = A0M.getFanClubId();
        } else {
            str = null;
        }
        AbstractC167017dG.A1P(userSession, A00);
        this.A00 = userSession;
        this.A01 = A00;
        this.A02 = str;
    }
}
