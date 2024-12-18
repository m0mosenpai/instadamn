package X;

import com.instagram.api.schemas.IGRevShareProductType;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCY extends AbstractC61132qb {
    public final IGRevShareProductType A00;
    public final UserSession A01;
    public final String A02;

    public NCY(IGRevShareProductType iGRevShareProductType, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = iGRevShareProductType;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        C06090Tz c06090Tz;
        long j;
        Object obj;
        UserSession userSession = this.A01;
        C54437O3r c54437O3r = new C54437O3r(userSession);
        boolean A1W = AbstractC167007dF.A1W(this.A02);
        IGRevShareProductType iGRevShareProductType = this.A00;
        int ordinal = iGRevShareProductType.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                c06090Tz = C06090Tz.A05;
                j = 36596587401906753L;
                obj = AbstractC166997dE.A0i(c06090Tz, userSession, j);
            }
            obj = -1;
        } else {
            if (!A1W) {
                c06090Tz = C06090Tz.A05;
                j = 36597283187133208L;
                obj = AbstractC166997dE.A0i(c06090Tz, userSession, j);
            }
            obj = -1;
        }
        return new C50975Mfi(iGRevShareProductType, userSession, c54437O3r, AbstractC166987dD.A0H(obj));
    }
}
