package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;

/* renamed from: X.1EV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1EV {
    public static final boolean A01(UserSession userSession, C1EN c1en) {
        C14360o3.A0B(c1en, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36893644518589411L);
        if (A04.length() == 0) {
            A04 = C18U.A04(c06090Tz, userSession, 36878805406580946L);
        }
        if (A04.length() != 0) {
            String[] strArr = (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(A04).toArray(new String[0]);
            for (String str : strArr) {
                if (C14360o3.A0K(str, c1en.toString()) || C14360o3.A0K(str, "all")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (X.C23061Al.A00(r8).A00(X.EnumC23071Am.A0U) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(com.instagram.common.session.UserSession r8) {
        /*
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36329393190682943(0x8111640009413f, double:3.038192768287927E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            r6 = 0
            if (r0 == 0) goto L1d
            r0 = 36610868167317730(0x821164000818e2, double:3.216198676920523E-306)
            long r1 = X.C18U.A01(r3, r8, r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L1d
            return r1
        L1d:
            r0 = 36328602916765352(0x8110ac000a3ea8, double:3.037692995880265E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            if (r0 == 0) goto L73
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            X.AC6 r5 = X.I21.A00(r8)
            r0 = 36328602916830889(0x8110ac000b3ea9, double:3.037692995921711E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            if (r0 == 0) goto L48
            boolean r0 = X.C23051Ak.A05
            X.1Ak r1 = X.C23061Al.A00(r8)
            X.1Am r0 = X.EnumC23071Am.A0U
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L49
        L48:
            r0 = 0
        L49:
            java.lang.String r2 = "feed_away_timer_in_s"
            java.util.concurrent.ConcurrentHashMap r1 = r5.A01
            if (r0 == 0) goto L70
            java.lang.String r0 = "on_peak_"
        L53:
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L6d
            int r0 = r0.intValue()
            long r0 = (long) r0
        L64:
            long r1 = r4.toMillis(r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L73
            return r1
        L6d:
            r0 = 0
            goto L64
        L70:
            java.lang.String r0 = ""
            goto L53
        L73:
            r0 = 36599069896215994(0x8206a900460dba, double:3.208737402767961E-306)
            long r0 = X.C18U.A01(r3, r8, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1EV.A00(com.instagram.common.session.UserSession):long");
    }
}
