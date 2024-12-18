package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6tt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC152666tt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r5, 36329315880681738L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer A00(com.instagram.common.session.UserSession r5) {
        /*
            X.1Ai r4 = X.AbstractC23021Ah.A00(r5)
            X.0ry r1 = r4.A2Z
            X.0YR[] r3 = X.C23031Ai.A8c
            r0 = 224(0xe0, float:3.14E-43)
            r0 = r3[r0]
            java.lang.Object r0 = r1.CES(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2c
            boolean r0 = X.C5SJ.A00(r5)
            if (r0 == 0) goto L2c
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36329315880681738(0x8111520000410a, double:3.0381438771318626E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            r2 = 1
            if (r0 == 0) goto L2d
        L2c:
            r2 = 0
        L2d:
            X.0ry r1 = r4.A2a
            r0 = 225(0xe1, float:3.15E-43)
            r0 = r3[r0]
            r1.CES(r4, r0)
            if (r2 == 0) goto L40
            r0 = 2131958840(0x7f131c38, float:1.9554304E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L40:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC152666tt.A00(com.instagram.common.session.UserSession):java.lang.Integer");
    }

    public static final void A01(UserSession userSession) {
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        InterfaceC16530ry interfaceC16530ry = A00.A2Z;
        C0YR[] c0yrArr = C23031Ai.A8c;
        if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[224])).booleanValue() && C5SJ.A00(userSession)) {
            interfaceC16530ry.Egi(A00, true, c0yrArr[224]);
        } else {
            A00.A2a.CES(A00, c0yrArr[225]);
        }
        A00.A5c.Egi(A00, true, c0yrArr[223]);
    }
}
