package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7C5, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7C5 {
    public static final boolean A00(UserSession userSession, C2EE c2ee) {
        int C7g = c2ee.C7g();
        if ((C7g == 0 || C7g == 1003 || C7g == 47) && !c2ee.CWk(userSession) && !c2ee.Ay8() && !c2ee.CWO()) {
            C7DG c7dg = C7DF.A00;
            if (!c7dg.A02(userSession, c2ee) && !c7dg.A03(userSession, c2ee) && !c2ee.isPending() && !c2ee.Cc2() && !c2ee.CgC() && C18U.A06(C06090Tz.A05, userSession, 36329723902575106L)) {
                return true;
            }
        }
        return false;
    }
}
