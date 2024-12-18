package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.3K4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K4 {
    public int A00 = -1;
    public long A01;
    public boolean A02;
    public final InterfaceC26681Qx A03;
    public final C60802q4 A04;
    public final ViewOnTouchListenerC60632pm A05;
    public final UserSession A06;
    public final C3K0 A07;
    public final C1EN A08;
    public final C69453Af A09;
    public final C61602rN A0A;
    public final C61442r7 A0B;
    public final C71723Jv A0C;
    public final C61572rK A0D;
    public final C3FY A0E;
    public final C71743Jx A0F;
    public final C61842rl A0G;
    public final C60862qA A0H;
    public final C60662pp A0I;
    public final C69703Be A0J;
    public final C3BV A0K;
    public final C61382r1 A0L;
    public final C61832rk A0M;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (X.C23061Al.A00(r4).A00(X.EnumC23071Am.A0Q) == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C3FZ A00(X.C3K4 r10) {
        /*
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r8 = r0.now()
            long r0 = r10.A01
            long r8 = r8 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r0
            com.instagram.common.session.UserSession r4 = r10.A06
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36598966816017751(0x82069100370d57, double:3.2086722144355215E-306)
            long r6 = X.C18U.A01(r3, r4, r0)
            r0 = 36317594919441813(0x8106a900451595, double:3.0307314940472114E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L5b
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r4)
            X.1Am r0 = X.EnumC23071Am.A0Q
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L5b
            r0 = 36599069896084921(0x8206a900440db9, double:3.20873740268507E-306)
        L37:
            long r0 = X.C18U.A01(r3, r4, r0)
        L3b:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C14360o3.A0A(r0)
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lab
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lab
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto La8
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto La8
            X.3FZ r0 = X.C3FZ.A04
            return r0
        L5b:
            r0 = 36328602916634278(0x8110ac00083ea6, double:3.037692995797373E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto La2
            X.AC6 r5 = X.I21.A00(r4)
            r0 = 36328602916699815(0x8110ac00093ea7, double:3.037692995838819E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto L84
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r4)
            X.1Am r0 = X.EnumC23071Am.A0Q
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L85
        L84:
            r0 = 0
        L85:
            java.lang.String r2 = "in_session_refresh_timer_in_s"
            java.util.concurrent.ConcurrentHashMap r1 = r5.A01
            if (r0 == 0) goto L9f
            java.lang.String r0 = "on_peak_"
        L8d:
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto La2
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L3b
        L9f:
            java.lang.String r0 = ""
            goto L8d
        La2:
            r0 = 36599069893922219(0x8206a900230dab, double:3.2087374013173684E-306)
            goto L37
        La8:
            X.3FZ r0 = X.C3FZ.A05
            return r0
        Lab:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto Lb6
            X.3FZ r0 = X.C3FZ.A06
            return r0
        Lb6:
            X.3FZ r0 = X.C3FZ.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3K4.A00(X.3K4):X.3FZ");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean A01(X.C1EN r14, X.C69453Af r15, X.C3FZ r16, X.C3K4 r17) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3K4.A01(X.1EN, X.3Af, X.3FZ, X.3K4):java.lang.Boolean");
    }

    public static final Boolean A02(C1EN c1en, C3FZ c3fz, C3K4 c3k4, boolean z) {
        boolean z2;
        C61842rl c61842rl = c3k4.A0G;
        boolean z3 = false;
        if (c61842rl.A08 != null) {
            z3 = true;
        }
        if (!z3) {
            if (!C18U.A06(C06090Tz.A05, c3k4.A06, 36329285816303858L)) {
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        UserSession userSession = c3k4.A06;
        z2 = true;
        if (C3GD.A00(userSession).A03()) {
            if (C18U.A06(C06090Tz.A05, C3GD.A00(userSession).A02, 36317594915247477L)) {
                A03(c3k4);
                if (Systrace.A0E(1L)) {
                    C0fO.A01("MainFeedDeliveryController.restart", -1272963170);
                }
                try {
                    C61922rt c61922rt = c61842rl.A0e;
                    synchronized (c61922rt.A0Z) {
                        c61922rt.A07 = null;
                    }
                    c61922rt.A0I.removeCallbacksAndMessages(null);
                    c61922rt.A09(c61842rl, true);
                    C18150uz.A0B.A03(C61842rl.A00(c61842rl));
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(-240681582);
                    }
                    return Boolean.valueOf(z2);
                } catch (Throwable th) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A00(1728612820);
                    }
                    throw th;
                }
            }
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36326339468670795L)) {
            c61842rl.A08(new C42720IvF(c1en, c3fz, c3k4, z), true);
            return null;
        }
        z2 = A04(c1en, c3fz, c3k4);
        return Boolean.valueOf(z2);
    }

    public static final void A03(C3K4 c3k4) {
        c3k4.A0L.A01 = C1EP.A00();
        C61842rl c61842rl = c3k4.A0G;
        C65192xH c65192xH = c61842rl.A06;
        if (c65192xH != null) {
            C3ZD.A00 = null;
            ((AbstractC65332xV) ((AbstractC65202xI) c65192xH).A00).A04();
            c65192xH.A04 = null;
            c65192xH.A0A(-1);
        }
        c61842rl.A08 = null;
        c61842rl.A01 = 0L;
        c61842rl.A0m.A0T("");
        C61832rk c61832rk = c3k4.A0M;
        c61832rk.A00.A0A().A0O().A07();
        c61832rk.A00();
        c61842rl.A0e.A02 = System.currentTimeMillis();
    }

    public static final boolean A04(C1EN c1en, C3FZ c3fz, C3K4 c3k4) {
        C11T.A03(new GNL(c3k4));
        HashMap hashMap = new HashMap();
        hashMap.put("new_posts_pill_type", c3fz.toString());
        return c3k4.A0G.A0A(c1en, null, hashMap);
    }

    public C3K4(InterfaceC26681Qx interfaceC26681Qx, C60802q4 c60802q4, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, C3K0 c3k0, C3BV c3bv, C1EN c1en, C69453Af c69453Af, C61602rN c61602rN, C61442r7 c61442r7, C71723Jv c71723Jv, C61572rK c61572rK, C3FY c3fy, C61382r1 c61382r1, C71743Jx c71743Jx, C61842rl c61842rl, C60862qA c60862qA, C60662pp c60662pp, C69703Be c69703Be, C61832rk c61832rk) {
        this.A06 = userSession;
        this.A0H = c60862qA;
        this.A0C = c71723Jv;
        this.A0E = c3fy;
        this.A0L = c61382r1;
        this.A09 = c69453Af;
        this.A0I = c60662pp;
        this.A0G = c61842rl;
        this.A0B = c61442r7;
        this.A04 = c60802q4;
        this.A0F = c71743Jx;
        this.A07 = c3k0;
        this.A0K = c3bv;
        this.A03 = interfaceC26681Qx;
        this.A08 = c1en;
        this.A0J = c69703Be;
        this.A0D = c61572rK;
        this.A05 = viewOnTouchListenerC60632pm;
        this.A0A = c61602rN;
        this.A0M = c61832rk;
    }
}
