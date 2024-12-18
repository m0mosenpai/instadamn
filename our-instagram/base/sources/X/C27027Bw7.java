package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bw7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27027Bw7 extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        return new C25802BbJ(application, userSession, new C8CW(userSession), this.A02);
    }

    public C27027Bw7(Application application, UserSession userSession, String str) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }
}
