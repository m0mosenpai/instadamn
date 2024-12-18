package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27039BwJ extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final C28374Cfc A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25810BbR(this.A00, this.A01, this.A02, this.A03);
    }

    public C27039BwJ(Application application, UserSession userSession, C28374Cfc c28374Cfc, String str) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = c28374Cfc;
        this.A03 = str;
    }
}
