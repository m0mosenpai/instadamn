package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.DoI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31235DoI {
    public static final ArrayList A00(UserSession userSession, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C206419By c206419By = (C206419By) it.next();
                Object obj = c206419By.A01;
                if (((obj == C05F.A0Y || obj == C05F.A1F || obj == C05F.A0j || obj == C05F.A0u || obj == C05F.A15 || obj == C05F.A02 || obj == C05F.A06 || obj == C05F.A05) && A03(userSession)) || ((c206419By.A01 == C05F.A0N && C18U.A06(C06090Tz.A05, userSession, 36312913400628778L)) || ((c206419By.A01 == C05F.A1I && C18U.A06(C06090Tz.A05, userSession, 36320421003469297L)) || ((c206419By.A01 == C05F.A0C && C18U.A06(C06090Tz.A05, userSession, 36320421003534834L)) || ((c206419By.A01 == C05F.A03 && A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36316813231854251L)) || (c206419By.A01 == C05F.A04 && A03(userSession) && C18U.A06(C06090Tz.A05, userSession, 36316813231919788L))))))) {
                    arrayList.add(c206419By);
                }
            }
        }
        return arrayList;
    }

    public static final boolean A02(UserSession userSession) {
        if (C17060sy.A01.A01(userSession).A2I() && !C18U.A06(C06090Tz.A05, userSession, 36315318582250644L)) {
            return true;
        }
        return false;
    }

    public static final boolean A01(UserSession userSession) {
        boolean A03 = A03(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (A03) {
            return AbstractC31177DnL.A1U(c06090Tz, userSession, 2342159822445482666L);
        }
        return AbstractC167007dF.A1N(C18U.A06(c06090Tz, userSession, 36322362328688838L) ? 1 : 0);
    }

    public static final boolean A03(UserSession userSession) {
        if (!C4K3.A01(userSession)) {
            if (C2E7.A01(AbstractC166987dD.A10(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36316813231133345L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
