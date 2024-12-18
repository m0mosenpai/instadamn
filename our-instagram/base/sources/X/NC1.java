package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NC1 extends AbstractC61132qb {
    public final UserMonetizationProductType A00;
    public final UserSession A01;

    public NC1(UserMonetizationProductType userMonetizationProductType, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = userMonetizationProductType;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C51016MgO(this.A00, userSession, AbstractC63302u8.A00(userSession));
    }
}
