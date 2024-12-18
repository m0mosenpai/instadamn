package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fd3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35092Fd3 {
    public static final GZY A01(Activity activity, UserSession userSession, GZY gzy) {
        if (!C18U.A06(AbstractC25225BEi.A0j(userSession, 2), userSession, 36318398073804930L)) {
            return gzy;
        }
        return new C36786GJj(0, activity, userSession.A01(C70806WhM.class, new C43205J8c(userSession, 18)), gzy);
    }

    public static final GYL A00(Activity activity, UserSession userSession, GYL gyl) {
        AbstractC167017dG.A1O(gyl, userSession);
        if (!C18U.A06(C06090Tz.A05, userSession, 36318398073804930L)) {
            return gyl;
        }
        return new C36708GGd(activity, gyl, (C70806WhM) userSession.A01(C70806WhM.class, new C43205J8c(userSession, 18)));
    }

    public static final void A02(Activity activity) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131963713);
        A0H.A09(2131963712);
        A0H.A0H(null, 2131968948);
        A0H.A04();
        AbstractC166987dD.A1W(A0H);
    }
}
