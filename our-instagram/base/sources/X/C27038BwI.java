package X;

import android.app.Application;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27038BwI extends AbstractC61132qb {
    public final Application A00;
    public final Rect A01;
    public final UserSession A02;
    public final C28374Cfc A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A02;
        return new C25808BbP(application, this.A01, userSession, this.A03, new CQM(userSession));
    }

    public C27038BwI(Application application, Rect rect, UserSession userSession, C28374Cfc c28374Cfc) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A02 = userSession;
        this.A03 = c28374Cfc;
        this.A01 = rect;
    }
}
