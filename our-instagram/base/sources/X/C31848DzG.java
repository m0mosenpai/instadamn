package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.DzG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31848DzG extends C53432cR {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31848DzG(Application application, UserSession userSession, String str) {
        super(application);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C44459JlR(application, userSession, F7Q.A00(userSession), C25A.A00(userSession), this.A02);
    }
}
