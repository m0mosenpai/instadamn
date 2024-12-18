package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.FrU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35792FrU implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C35792FrU.class);
    public static final String __redex_internal_original_name = "BusinessConversionGatingUtil";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.booleanValue() != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0.booleanValue() != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(com.instagram.common.session.UserSession r5) {
        /*
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            r4 = 0
            boolean r1 = A01(r5, r0)
            r0 = 1
            if (r1 == 0) goto Ld
            return r0
        Ld:
            com.instagram.user.model.User r1 = X.AbstractC166997dE.A0Y(r5)
            X.17P r0 = r1.A03
            java.lang.Boolean r0 = r0.CVn()
            if (r0 == 0) goto L20
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 == 0) goto L21
        L20:
            r3 = 0
        L21:
            X.17P r0 = r1.A03
            java.lang.Boolean r0 = r0.CZ8()
            if (r0 == 0) goto L30
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L31
        L30:
            r2 = 0
        L31:
            X.17P r0 = r1.A03
            java.lang.Integer r0 = r0.B7S()
            if (r0 == 0) goto L60
            int r1 = r0.intValue()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 <= r0) goto L60
            if (r3 != 0) goto L45
            if (r2 == 0) goto L60
        L45:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314000027289971(0x81036400000973, double:3.028458069774918E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L60
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36316259180089544(0x810572000010c8, double:3.029886767102246E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 != 0) goto L60
            r4 = 1
        L60:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35792FrU.A00(com.instagram.common.session.UserSession):boolean");
    }

    public static final boolean A01(UserSession userSession, boolean z) {
        C06090Tz c06090Tz;
        InterfaceC37263GbG Btt = AbstractC31178DnM.A0T(userSession).A03.Btt();
        if (Btt != null && Btt.CT6()) {
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            if (AbstractC31177DnL.A1U(c06090Tz, userSession, 36316259180220618L)) {
                return true;
            }
        }
        return false;
    }
}
