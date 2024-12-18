package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.opal.impl.data.OpalEditRepository;

/* loaded from: classes9.dex */
public final class NC5 extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public NC5(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C50922Mer(userSession, new OpalEditRepository(this.A00, userSession));
    }
}
