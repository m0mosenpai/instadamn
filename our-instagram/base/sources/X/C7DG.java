package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;

/* renamed from: X.7DG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7DG {
    public final boolean A01(UserSession userSession, C2EE c2ee) {
        Integer Bkb;
        if ((!c2ee.BSH().isEmpty()) && (Bkb = ((User) c2ee.BSH().get(0)).Bkb()) != null && Bkb.intValue() == 5) {
            if ((A02(userSession, c2ee) || A03(userSession, c2ee)) && !C18U.A06(C06090Tz.A05, userSession, 36316392324796776L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r0.A27() != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(com.instagram.common.session.UserSession r4, X.C2EE r5) {
        /*
            r3 = this;
            r0 = 1
            X.C14360o3.A0B(r4, r0)
            boolean r0 = r3.A00(r4, r5)
            if (r0 == 0) goto L44
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316392324731239(0x810591000a1167, double:3.029970968309784E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L3d
            X.3o9 r1 = r5.BKb()
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L3d
            com.instagram.model.direct.DirectThreadKey r1 = X.JRE.A02(r1)
            if (r1 == 0) goto L3d
            X.2DS r0 = X.C2JD.A00(r4)
            X.2DU r0 = (X.C2DU) r0
            X.3kb r0 = X.C2DU.A03(r0, r1)
            if (r0 == 0) goto L3d
            com.instagram.user.model.User r0 = r0.Ba5()
            if (r0 == 0) goto L3d
            boolean r0 = r0.A27()
            if (r0 != 0) goto L44
        L3d:
            boolean r1 = X.AbstractC1337462f.A00(r4)
            r0 = 1
            if (r1 != 0) goto L45
        L44:
            r0 = 0
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7DG.A02(com.instagram.common.session.UserSession, X.2EE):boolean");
    }

    public final boolean A03(UserSession userSession, C2EE c2ee) {
        C14360o3.A0B(c2ee, 0);
        C14360o3.A0B(userSession, 1);
        if (A00(userSession, c2ee) && C08730cb.A00(userSession).A00().A0I() != EnumC222416a.A05 && C18U.A06(C06090Tz.A06, userSession, 36329522039112064L)) {
            return true;
        }
        return false;
    }

    private final boolean A00(UserSession userSession, C2EE c2ee) {
        DirectThreadKey A02;
        C81663kb A03;
        if (!c2ee.CVQ() && !(c2ee.BKb() instanceof MsysThreadId) && !c2ee.CL1() && !c2ee.CKh() && !C4GR.A07(Integer.valueOf(c2ee.C7g())) && (!c2ee.BSH().isEmpty()) && ((User) c2ee.BSH().get(0)).A0I() != EnumC222416a.A05 && ((User) c2ee.BSH().get(0)).A2O() && c2ee.CCq() == null) {
            if (!C18U.A06(C06090Tz.A05, userSession, 36316392324665702L)) {
                return true;
            }
            C3o9 BKb = c2ee.BKb();
            if (!(BKb instanceof DirectThreadKey) || (A02 = JRE.A02(BKb)) == null || (A03 = C2DU.A03((C2DU) C2JD.A00(userSession), A02)) == null) {
                return true;
            }
            User Ba5 = A03.Ba5();
            C83403nh BLs = A03.BLs();
            if (BLs == null || Ba5 == null || !BLs.A1u.equals(Ba5.getId())) {
                return true;
            }
        }
        return false;
    }
}
