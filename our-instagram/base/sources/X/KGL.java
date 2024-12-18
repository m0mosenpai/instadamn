package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGL extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final InterfaceC16820sZ A02;

    public /* synthetic */ KGL(Application application, UserSession userSession) {
        C50255MHk A02 = C50255MHk.A02(userSession, 41);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = A02;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44449JlH(this.A00, this.A01, (KPI) this.A02.invoke());
    }
}
