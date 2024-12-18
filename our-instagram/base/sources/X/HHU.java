package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHU extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public HHU(Application application, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C52678NSa A00 = CK4.A00(userSession);
        return new Gt4(this.A00, userSession, new C40957ICe(AbstractC12220kQ.A02(userSession)), A00, this.A02);
    }
}
