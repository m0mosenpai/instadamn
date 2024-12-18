package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalRepository;

/* loaded from: classes9.dex */
public final class NCW extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C51030Mgd(userSession, new OpalRepository(this.A00, userSession, AbstractC40691uc.A01(userSession), this.A02));
    }

    public NCW(Application application, UserSession userSession, String str) {
        AbstractC167017dG.A1P(str, userSession);
        this.A02 = str;
        this.A01 = userSession;
        this.A00 = application;
    }
}
