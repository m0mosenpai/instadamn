package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.consideration.FanClubCustomizedBenefitsRepository;
import java.util.List;

/* renamed from: X.EWd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32578EWd extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final C99694dm A02;
    public final FanClubCustomizedBenefitsRepository A03;
    public final String A04;
    public final List A05;

    public /* synthetic */ C32578EWd(Application application, UserSession userSession, String str, List list) {
        FanClubCustomizedBenefitsRepository fanClubCustomizedBenefitsRepository = new FanClubCustomizedBenefitsRepository(userSession);
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        AbstractC25233BEq.A0w(2, list, userSession, str);
        C14360o3.A0B(A00, 6);
        this.A00 = application;
        this.A05 = list;
        this.A01 = userSession;
        this.A04 = str;
        this.A03 = fanClubCustomizedBenefitsRepository;
        this.A02 = A00;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        String str = this.A04;
        List list = this.A05;
        return new C31792DyB(application, userSession, this.A02, this.A03, str, list);
    }
}
