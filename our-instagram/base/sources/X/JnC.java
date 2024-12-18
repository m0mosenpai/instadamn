package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JnC extends C53432cR {
    public final Application A00;
    public final UserSession A01;
    public final InterfaceC114705Ga A02;

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C44451JlJ(application, AbstractC25651Mw.A00(userSession), userSession, this.A02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JnC(Application application, UserSession userSession, InterfaceC114705Ga interfaceC114705Ga) {
        super(application);
        AbstractC167027dH.A13(application, userSession, interfaceC114705Ga);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = interfaceC114705Ga;
    }
}
