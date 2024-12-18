package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.invite.repository.InviteContactRepository;
import com.instagram.request.InviteContactApi;

/* loaded from: classes6.dex */
public final class EWB extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        return new C25805BbM(application, userSession, new InviteContactRepository(userSession, new InviteContactApi(userSession)));
    }

    public EWB(Application application, UserSession userSession) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
    }
}
