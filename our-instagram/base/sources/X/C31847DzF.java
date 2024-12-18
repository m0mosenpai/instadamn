package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.DzF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31847DzF extends C53432cR {
    public final Application A00;
    public final UserSession A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31847DzF(Application application, UserSession userSession) {
        super(application);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.C53432cR, X.C53442cS, X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        return new C44453JlL(this.A00, this.A01);
    }
}
