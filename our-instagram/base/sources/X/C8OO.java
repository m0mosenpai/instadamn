package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.8OO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OO extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C8OP(this.A00, this.A01);
    }

    public C8OO(Application application, UserSession userSession) {
        this.A00 = application;
        this.A01 = userSession;
    }
}
