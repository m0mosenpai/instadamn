package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DpO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31302DpO {
    public static final boolean A00(UserSession userSession, C2EC c2ec, C2056398n c2056398n) {
        AbstractC167007dF.A1K(userSession, c2056398n);
        String C7I = c2ec.C7I();
        if (C7I == null) {
            return false;
        }
        if ((c2ec.BKb().A00 != null && (!AbstractC31174DnI.A1X(C1AT.A01(userSession).A03(C1AV.A0a), "BROADCAST_CHAT_CREATION_KEY", r2))) || AbstractC31174DnI.A1X(c2056398n.A00, AbstractC111324zv.A00(2006), C7I) || AbstractC167017dG.A1b(c2056398n, c2056398n.A04, C2056398n.A0d, 19) || !C98Q.A00(userSession).A00(AbstractC31171DnF.A0N(C7I), 49) || C18U.A06(C06090Tz.A05, userSession, 36319377334541712L)) {
            return false;
        }
        return true;
    }
}
