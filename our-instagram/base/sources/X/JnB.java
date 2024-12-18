package X;

import android.app.Application;
import com.google.android.gms.common.GoogleApiAvailability;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JnB extends C53432cR {
    public final Application A00;
    public final UserSession A01;
    public final Integer A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JnB(Application application, UserSession userSession, Integer num) {
        super(application);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = num;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        LAF A00 = AbstractC46732Klp.A00(application, userSession, this.A02);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        C14360o3.A07(googleApiAvailability);
        return new C25804BbL(application, new JSW(googleApiAvailability), userSession, A00);
    }
}
