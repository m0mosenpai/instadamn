package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LCt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47873LCt {
    public static final void A00(UserSession userSession) {
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        long A06 = AbstractC31177DnL.A06();
        A00.A0R.Egi(A00, Long.valueOf(A06), C2056398n.A0d[14]);
    }

    public static final boolean A01(UserSession userSession) {
        long A06 = AbstractC31177DnL.A06();
        C2056398n A00 = AbstractC2056298m.A00(userSession);
        return AbstractC167007dF.A1O(((A06 - AbstractC166987dD.A0N(AbstractC31171DnF.A0Y(A00, A00.A0R, C2056398n.A0d, 14))) > (C18U.A01(C06090Tz.A06, userSession, 36596316818901385L) * 3600) ? 1 : ((A06 - AbstractC166987dD.A0N(AbstractC31171DnF.A0Y(A00, A00.A0R, C2056398n.A0d, 14))) == (C18U.A01(C06090Tz.A06, userSession, 36596316818901385L) * 3600) ? 0 : -1)));
    }
}
