package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCZ extends AbstractC61132qb {
    public final UserMonetizationProductType A00;
    public final UserSession A01;
    public final String A02;

    public NCZ(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = userMonetizationProductType;
        this.A02 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50923Mes(this.A00, this.A01, this.A02);
    }
}
