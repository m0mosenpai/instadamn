package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27051BwV extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final C28374Cfc A02;
    public final EnumC193878i8 A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        Application application = this.A00;
        UserSession userSession = this.A01;
        EnumC193878i8 enumC193878i8 = this.A03;
        return new C25803BbK(application, userSession, this.A02, enumC193878i8, this.A04, this.A06, this.A05);
    }

    public C27051BwV(Application application, UserSession userSession, C28374Cfc c28374Cfc, EnumC193878i8 enumC193878i8, String str, boolean z, boolean z2) {
        AbstractC167017dG.A1P(application, userSession);
        this.A00 = application;
        this.A01 = userSession;
        this.A03 = enumC193878i8;
        this.A02 = c28374Cfc;
        this.A06 = z;
        this.A04 = str;
        this.A05 = z2;
    }
}
