package X;

import android.os.Build;
import com.instagram.common.session.UserSession;

/* renamed from: X.2J9, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2J9 {
    public static boolean A00;

    public static final boolean A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A00 && !A03(userSession)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (!A00 && C18U.A06(C06090Tz.A05, userSession, 36315451727547634L)) {
            return true;
        }
        return false;
    }

    public static final boolean A04(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A00 && C18U.A06(C06090Tz.A05, userSession, 36315451728006393L)) {
            return true;
        }
        return false;
    }

    public static final boolean A05(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (A06(userSession) && A06(userSession)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36321623594509966L) && C18U.A06(c06090Tz, userSession, 36321623594444429L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A06(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (Build.VERSION.SDK_INT >= 34) {
            if (A00 || C18U.A06(C06090Tz.A05, userSession, 36315451727613171L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final float A00(UserSession userSession) {
        if (Build.VERSION.SDK_INT >= 34) {
            float A002 = (float) C18U.A00(C06090Tz.A05, userSession, 37166048524763555L);
            if (A002 > 0.0f) {
                return A002;
            }
            return 0.5f;
        }
        return 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r1 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (X.C18U.A06(r4, r5, 36323023753784173L) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (X.C18U.A06(r3, r5, 36321623594706575L) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005b, code lost:
    
        if (X.C18U.A06(r3, r5, 36315451727613171L) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(com.instagram.common.session.UserSession r5) {
        /*
            X.0Tz r4 = X.C06090Tz.A06
            r0 = 36323049524112268(0x810b9f000b2b8c, double:3.034181008004737E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 != 0) goto L5d
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L20
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36321623594706575(0x810a530007268f, double:3.03327924450682E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L51
        L20:
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36315451726236912(0x8104b600000cf0, double:3.0293761300344857E-306)
            boolean r0 = X.C18U.A06(r3, r5, r0)
            if (r0 != 0) goto L51
            X.09Y r1 = X.C023409i.A0A     // Catch: java.lang.RuntimeException -> L46
            X.4eP r0 = X.C100024eP.A00     // Catch: java.lang.RuntimeException -> L46
            com.instagram.common.session.UserSession r2 = r1.A08(r0)     // Catch: java.lang.RuntimeException -> L46
            r0 = 36317985757927166(0x810704000f16fe, double:3.030978661879129E-306)
            boolean r1 = X.C18U.A06(r3, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 == 0) goto L46
            if (r1 != 0) goto L51
        L46:
            r0 = 36323023753784173(0x810b9900032b6d, double:3.034164710745481E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L5d
        L51:
            r0 = 36315451727613171(0x8104b600150cf3, double:3.0293761309048374E-306)
            boolean r1 = X.C18U.A06(r3, r5, r0)
            r0 = 1
            if (r1 == 0) goto L5e
        L5d:
            r0 = 0
        L5e:
            X.C2J9.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2J9.A01(com.instagram.common.session.UserSession):void");
    }
}
