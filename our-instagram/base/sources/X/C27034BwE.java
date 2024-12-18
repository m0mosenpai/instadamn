package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.BwE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27034BwE extends AbstractC61132qb {
    public final Application A00;
    public final UserSession A01;
    public final EnumC39549HdL A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        HYD hyd = (HYD) userSession.A01(HYD.class, new J8Z(userSession, 34));
        return new C53063Ndc(this.A00, userSession, new C27831COu(), CK4.A00(userSession), this.A02, hyd);
    }

    public C27034BwE(Application application, UserSession userSession, EnumC39549HdL enumC39549HdL) {
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = enumC39549HdL;
    }
}
