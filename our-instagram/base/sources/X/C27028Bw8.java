package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.Bw8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27028Bw8 extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final String A02;

    public C27028Bw8(Application application, UserSession userSession) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = "";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25801BbI(this.A00, this.A01, this.A02);
    }
}
