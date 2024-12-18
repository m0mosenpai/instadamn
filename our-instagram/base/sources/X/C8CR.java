package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8CR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8CR extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    public C8CR(Application application, UserSession userSession) {
        C14360o3.A0B(application, 1);
        C14360o3.A0B(userSession, 2);
        this.A00 = application;
        this.A01 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C8CS(this.A00, this.A01);
    }
}
