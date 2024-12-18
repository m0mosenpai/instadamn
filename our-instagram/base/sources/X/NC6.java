package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;

/* loaded from: classes9.dex */
public final class NC6 extends AbstractC61132qb {
    public final IGRevShareProductType A00;
    public final UserSession A01;

    public NC6(IGRevShareProductType iGRevShareProductType, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = iGRevShareProductType;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserMonetizationProductType userMonetizationProductType;
        OTV otv;
        IGRevShareProductType iGRevShareProductType = this.A00;
        int A05 = AbstractC25227BEk.A05(iGRevShareProductType, 0);
        if (A05 != 2) {
            if (A05 != 1) {
                userMonetizationProductType = UserMonetizationProductType.A0I;
            } else {
                userMonetizationProductType = UserMonetizationProductType.A0D;
            }
        } else {
            userMonetizationProductType = UserMonetizationProductType.A0G;
        }
        UserSession userSession = this.A01;
        MonetizationRepository A00 = AbstractC63302u8.A00(userSession);
        synchronized (OTV.A02) {
            C14360o3.A0B(userSession, 0);
            otv = new OTV(userSession);
        }
        return new C50977Mfk(iGRevShareProductType, userMonetizationProductType, userSession, A00, AbstractC454427e.A00(userSession), otv);
    }
}
