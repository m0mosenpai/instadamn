package X;

import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.PagerSheetLaunchConfig;
import com.instagram.friendmap.data.FriendMapRepository;

/* loaded from: classes8.dex */
public final class KG6 extends AbstractC61132qb {
    public final UserSession A00;
    public final PagerSheetLaunchConfig A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        PagerSheetLaunchConfig pagerSheetLaunchConfig = this.A01;
        FriendMapRepository A00 = AbstractC92954Eo.A00(userSession);
        AbstractC167027dH.A13(userSession, pagerSheetLaunchConfig, A00);
        JQC jqc = new JQC(new C45288K2q(AbstractC47862LCi.A00(userSession, pagerSheetLaunchConfig.A04), C5HZ.A01, true));
        AbstractC166987dD.A1Z(new MCL(userSession, A00, jqc, null, 48), AbstractC141776au.A00(jqc));
        return jqc;
    }

    public KG6(UserSession userSession, PagerSheetLaunchConfig pagerSheetLaunchConfig) {
        AbstractC167017dG.A1P(userSession, pagerSheetLaunchConfig);
        this.A00 = userSession;
        this.A01 = pagerSheetLaunchConfig;
    }
}
