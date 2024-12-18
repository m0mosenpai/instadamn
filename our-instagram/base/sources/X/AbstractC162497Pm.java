package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162497Pm {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (((java.lang.Number) r3.A05.CES(r3, X.C2056398n.A0d[21])).intValue() < 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r4, X.C7TT r5) {
        /*
            int r1 = r5.A08
            r0 = 29
            if (r1 != r0) goto L33
            boolean r0 = r5.A0n
            if (r0 == 0) goto L23
            X.98n r3 = X.AbstractC2056298m.A00(r4)
            X.0ry r2 = r3.A05
            X.0YR[] r1 = X.C2056398n.A0d
            r0 = 21
            r0 = r1[r0]
            java.lang.Object r0 = r2.CES(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 3
            if (r1 >= r0) goto L31
        L23:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319377327463729(0x81084800111d31, double:3.031858696057452E-306)
            boolean r1 = X.C18U.A06(r2, r4, r0)
        L2e:
            r0 = 1
            if (r1 != 0) goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            java.lang.Boolean r0 = X.AbstractC159077Bt.A00(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
            r0 = 1
            return r0
        L3f:
            boolean r0 = r5.A1C
            if (r0 == 0) goto L31
            boolean r1 = X.F3B.A00(r4, r5)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC162497Pm.A00(com.instagram.common.session.UserSession, X.7TT):boolean");
    }

    public static final boolean A01(UserSession userSession, C83403nh c83403nh, int i) {
        if (i == 29) {
            return AbstractC31323Dpl.A00(userSession, c83403nh);
        }
        if (AbstractC159077Bt.A00(userSession).booleanValue()) {
            return F3A.A00(c83403nh);
        }
        if (c83403nh.A10 != C2EY.A1i) {
            return false;
        }
        return true;
    }
}
