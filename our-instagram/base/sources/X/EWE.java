package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWE extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public EWE(Application application, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = application;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31793DyD(this.A00, this.A01);
    }
}
