package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;

/* renamed from: X.3GE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GE implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public String A01;
    public final UserSession A02;

    public C3GE(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        C218914p.A04(EnumC220415e.A02, this, false, false);
    }

    public static final boolean A00(String str) {
        if (str.length() != 0) {
            int A00 = AbstractC15820qc.A00();
            C15790qZ A04 = AbstractC15820qc.A04();
            for (String str2 : (String[]) new C11L(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A03(str).toArray(new String[0])) {
                if (!C14360o3.A0K(str2, AbstractC15770qX.A00(A04.A00))) {
                    String A002 = AbstractC15780qY.A00(A04.A01);
                    if (!C14360o3.A0K(str2, A002) && !C14360o3.A0K(str2, AnonymousClass001.A0O(A002, A00))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0095, code lost:
    
        if (r7 > X.C18U.A01(r5, r6, 36599069891759523L)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long A01() {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r6 = r12.A02
            X.0Tz r5 = X.C06090Tz.A05
            r3 = 37162019848978650(0x8406a9003c00da, double:3.5647492197125765E-306)
            double r7 = X.C18U.A00(r5, r6, r3)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto Lde
            r1 = 0
            double r3 = X.C18U.A00(r5, r6, r3)
            float r0 = (float) r3
            float r7 = java.lang.Math.abs(r0)
            r3 = 37162019848913113(0x8406a9003b00d9, double:3.5647492196711306E-306)
            double r3 = X.C18U.A00(r5, r6, r3)
            float r0 = (float) r3
            float r0 = java.lang.Math.abs(r0)
            X.2Us r10 = X.AbstractC50712Us.A01
            float r9 = r10.A02()
            float r0 = r0 - r7
            float r9 = r9 * r0
            float r9 = r9 + r7
            r3 = 36599069895429557(0x8206a9003a0db5, double:3.208737402270615E-306)
            long r7 = X.C18U.A01(r5, r6, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            if (r0 == 0) goto L48
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L58
        L48:
            r0 = 100
            int r0 = r10.A05(r0)
            long r7 = (long) r0
            long r3 = X.C18U.A01(r5, r6, r3)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L58
            r9 = 0
        L58:
            X.0vz r3 = X.AbstractC12960li.A00
            X.18s r0 = X.C226218q.A01(r3)
            boolean r0 = r0.A0W()
            if (r0 == 0) goto Lb8
            X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
            X.0xq r3 = r0.A01
            java.lang.String r0 = "last_hot_start_feed_latency"
        L6c:
            long r3 = r3.getLong(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lde
            float r0 = (float) r3
            float r0 = r0 * r9
            long r7 = (long) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            if (r11 == 0) goto Lb7
            r3 = 36599069891693986(0x8206a900010da2, double:3.208737399908225E-306)
            long r9 = X.C18U.A01(r5, r6, r3)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L97
            r3 = 36599069891759523(0x8206a900020da3, double:3.208737399949671E-306)
            long r9 = X.C18U.A01(r5, r6, r3)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto La1
        L97:
            long r3 = X.C18U.A01(r5, r6, r3)
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            if (r11 == 0) goto Lb7
        La1:
            long r7 = r11.longValue()
            r3 = 36612461599791500(0x8212d70002198c, double:3.217206370033173E-306)
            long r3 = X.C18U.A01(r5, r6, r3)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb7
            long r7 = r7 + r3
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
        Lb7:
            return r11
        Lb8:
            X.18s r0 = X.C226218q.A01(r3)
            boolean r0 = r0.A0X()
            if (r0 == 0) goto Lcb
            X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
            X.0xq r3 = r0.A01
            java.lang.String r0 = "last_warm_start_feed_latency"
            goto L6c
        Lcb:
            X.18s r0 = X.C226218q.A01(r3)
            boolean r0 = r0.A0V()
            if (r0 == 0) goto Lde
            X.1Ai r0 = X.AbstractC23021Ah.A00(r6)
            X.0xq r3 = r0.A01
            java.lang.String r0 = "last_cold_start_feed_latency"
            goto L6c
        Lde:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GE.A01():java.lang.Long");
    }

    public final String A02() {
        UserSession userSession = this.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        String A04 = C18U.A04(c06090Tz, userSession, 36880544868860237L);
        if ((C18U.A01(c06090Tz, userSession, 36599069894184364L) > 0 && this.A00 < System.currentTimeMillis()) || A00(C18U.A04(c06090Tz, userSession, 36880544871219539L))) {
            return "rug_pull";
        }
        return A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (X.C18U.A06(r8, r9, 36317775303546422L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A03() {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r9 = r14.A02
            X.0Tz r8 = X.C06090Tz.A05
            r0 = 36317594915116404(0x8106a900031574, double:3.0307314913118053E-306)
            boolean r0 = X.C18U.A06(r8, r9, r0)
            r13 = 0
            r2 = 1
            if (r0 != 0) goto L1d
            r0 = 36317775303546422(0x8106d300001636, double:3.0308455696813146E-306)
            boolean r0 = X.C18U.A06(r8, r9, r0)
            r12 = 0
            if (r0 == 0) goto L1e
        L1d:
            r12 = 1
        L1e:
            r0 = 36880544871219539(0x8306a9002c0153, double:3.386743310368953E-306)
            java.lang.String r0 = X.C18U.A04(r8, r9, r0)
            boolean r0 = A00(r0)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r14.A01
            if (r0 == 0) goto L38
            int r0 = r0.length()
            if (r0 == 0) goto L38
            return r2
        L38:
            r4 = 36599069894184364(0x8206a900270dac, double:3.20873740148315E-306)
            long r6 = X.C18U.A01(r8, r9, r4)
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L8b
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r14.A00
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 >= 0) goto L70
            long r6 = X.C218914p.A00
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7a
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r6 = r0.now()
            long r0 = X.C218914p.A00
        L5f:
            long r6 = r6 - r0
            X.C218914p.A00 = r2
            long r1 = X.C18U.A01(r8, r9, r4)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L70
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r10 + r2
            r14.A00 = r0
        L70:
            if (r12 == 0) goto L8c
            long r1 = r14.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L8c
            r13 = 1
            return r13
        L7a:
            long r6 = java.lang.System.currentTimeMillis()
            X.1Ai r0 = X.AbstractC23021Ah.A00(r9)
            X.0xq r1 = r0.A01
            java.lang.String r0 = "last_feed_update_time"
            long r0 = r1.getLong(r0, r2)
            goto L5f
        L8b:
            return r12
        L8c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3GE.A03():boolean");
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-910630563);
        this.A00 = 0L;
        C0f9.A0A(554030236, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(2053927486, C0f9.A03(2020817101));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
        if (AbstractC201688vy.A01(this.A02, C05F.A0u)) {
            C218914p.A07(this);
        }
    }
}
