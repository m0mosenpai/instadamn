package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.NBl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52270NBl extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44461JlT(this.A00, this.A01);
    }

    public C52270NBl(Application application, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, application);
        this.A01 = userSession;
        this.A00 = application;
    }
}
