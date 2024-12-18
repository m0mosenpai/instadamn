package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalAudienceSelectorRepository;

/* loaded from: classes9.dex */
public final class NC4 extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public NC4(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        Application application = this.A00;
        OpalAudienceSelectorRepository opalAudienceSelectorRepository = new OpalAudienceSelectorRepository(application, userSession);
        new MV3(userSession);
        return new C25807BbO(application, userSession, opalAudienceSelectorRepository);
    }
}
