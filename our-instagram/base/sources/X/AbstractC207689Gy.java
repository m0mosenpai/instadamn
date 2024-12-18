package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Gy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC207689Gy {
    public static final boolean A05(UserSession userSession, List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer Bkb = ((AnonymousClass175) it.next()).Bkb();
            if (Bkb != null && Bkb.intValue() == 1) {
                return C18U.A06(C06090Tz.A05, userSession, 36311994277561189L);
            }
        }
        return false;
    }

    public static final boolean A00(UserSession userSession, C2EE c2ee) {
        if (!c2ee.CVQ()) {
            Iterator it = c2ee.BSH().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer Bkb = ((AnonymousClass175) it.next()).Bkb();
                if (Bkb != null && Bkb.intValue() == 3) {
                    if (!C18U.A06(C06090Tz.A05, userSession, 36311994277626726L)) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A01(UserSession userSession, C2EE c2ee) {
        if (!c2ee.CVQ()) {
            Iterator it = c2ee.BSH().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer Bkb = ((AnonymousClass175) it.next()).Bkb();
                if (Bkb != null && Bkb.intValue() == 4) {
                    if (!C18U.A06(C06090Tz.A05, userSession, 36311994277626726L)) {
                        break;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean A02(UserSession userSession, C2EE c2ee) {
        if (!c2ee.CVQ() && !c2ee.CX1() && A05(userSession, c2ee.BSH())) {
            return true;
        }
        return false;
    }

    public static final boolean A03(UserSession userSession, C2EE c2ee) {
        if (!c2ee.CVQ() && c2ee.CX1() && A05(userSession, c2ee.BSH())) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession, C2EE c2ee) {
        if (!A02(userSession, c2ee) && !A03(userSession, c2ee) && !A01(userSession, c2ee) && !A00(userSession, c2ee)) {
            return false;
        }
        return true;
    }
}
