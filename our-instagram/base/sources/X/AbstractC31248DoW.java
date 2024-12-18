package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.DoW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31248DoW {
    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC166997dE.A0c(c06090Tz, userSession, 36319828297981636L).booleanValue() && !C18U.A06(c06090Tz, userSession, 36325270021485513L) && !C18U.A06(c06090Tz, userSession, 36325270021551050L) && !C18U.A06(c06090Tz, userSession, 36325270021616587L) && C18U.A06(c06090Tz, userSession, 36315915583491790L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return AbstractC166997dE.A0c(C06090Tz.A05, userSession, 36319828297981636L).booleanValue();
    }

    public static final boolean A06(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (z) {
            if (AbstractC166997dE.A0c(c06090Tz, userSession, 36319828297981636L).booleanValue() || !C18U.A06(c06090Tz, userSession, 36315915582901960L)) {
                return false;
            }
            return true;
        }
        if (C18U.A06(c06090Tz, userSession, 36325270021485513L) || !C18U.A06(c06090Tz, userSession, 36315915582901960L)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(UserSession userSession) {
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (C18U.A06(A0U, userSession, 36315915582901960L) && C18U.A06(A0U, userSession, 36315915583426253L) && C18U.A06(A0U, userSession, 36315915583753937L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36315915583426253L);
    }

    public static final boolean A03(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36325720993051958L);
    }

    public static final boolean A04(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36315915583622864L);
    }
}
