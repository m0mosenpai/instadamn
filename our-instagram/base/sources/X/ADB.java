package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public abstract class ADB {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (X.C18U.A06(r2, r8, 36319557715107347L) != false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.9wz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C23518AbY A00(android.content.Context r6, X.InterfaceC25204BDc r7, com.instagram.common.session.UserSession r8) {
        /*
            X.9wz r4 = new X.9wz
            r4.<init>()
            java.util.HashMap r5 = X.AbstractC166987dD.A1G()
            X.9x1 r2 = X.AK4.A06
            X.TyA r1 = X.VYI.A00
            X.Opg r0 = new X.Opg
            r0.<init>(r6, r1)
            r5.put(r2, r0)
            X.9x1 r0 = X.AK4.A07
            r5.put(r0, r7)
            X.9x1 r3 = X.AK4.A0B
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319557715041810(0x81087200011e12, double:3.031972773888193E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            if (r0 == 0) goto L35
            r0 = 36319557715107347(0x81087200021e13, double:3.031972773929639E-306)
            boolean r1 = X.C18U.A06(r2, r8, r0)
            r0 = 1
            if (r1 == 0) goto L36
        L35:
            r0 = 0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.put(r3, r0)
            X.AK4 r1 = new X.AK4
            r1.<init>(r5)
            X.AbY r0 = new X.AbY
            r0.<init>(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ADB.A00(android.content.Context, X.BDc, com.instagram.common.session.UserSession):X.AbY");
    }

    public static final C23518AbY A01(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        InterfaceC25204BDc c23509AbP;
        if ((z || !C18U.A06(C06090Tz.A05, userSession, 36330887838909508L)) && !C18U.A06(C06090Tz.A05, userSession, 36330887838843971L)) {
            c23509AbP = new C23509AbP(context, userSession, z2, z3);
        } else {
            c23509AbP = new C23510AbQ(userSession, context, z2);
        }
        return A00(context, c23509AbP, userSession);
    }
}
