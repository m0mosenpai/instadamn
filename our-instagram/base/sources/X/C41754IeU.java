package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.IeU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41754IeU {
    public static final C41754IeU A00 = new Object();

    public static final boolean A01(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36320244909809826L) && !C18U.A06(c06090Tz, userSession, 36320244912234688L) && !C18U.A06(c06090Tz, userSession, 36320244912758982L)) {
            return false;
        }
        return true;
    }

    public static final boolean A02(UserSession userSession) {
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342163254126518471L)) {
            return false;
        }
        return C18U.A06(c06090Tz, userSession, 36320244911513785L);
    }

    public static final int A00(UserSession userSession) {
        return AbstractC25225BEi.A07(AbstractC166997dE.A0U(userSession), userSession, 36601719888875856L);
    }

    public static final boolean A03(UserSession userSession) {
        return C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36320244913610960L);
    }

    public final boolean A04(UserSession userSession, Integer num, List list) {
        int A002 = A00(userSession);
        if ((num != null && num.intValue() == A002 && C18U.A06(C06090Tz.A05, userSession, 2342163254126911690L)) || (list != null && AbstractC001800i.A0u(list, AnonymousClass189.A00(userSession).A02(userSession.userId)) && C18U.A06(C06090Tz.A05, userSession, 36320244913283275L))) {
            return true;
        }
        return false;
    }
}
