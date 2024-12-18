package com.instagram.share.facebook.cxpnotice.noticestate.internal;

import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.C1AV;
import X.C2BI;
import X.C9B9;
import X.EnumC46582Bw;
import X.InterfaceC19630xq;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* loaded from: classes.dex */
public final class CXPNoticeStateRepository {
    public final UserSession A00;
    public final CXPNoticeStateApi A01;
    public final C2BI A02;

    public CXPNoticeStateRepository(UserSession userSession, Integer num) {
        C1AV c1av;
        C14360o3.A0B(userSession, 1);
        if (num.intValue() != 0) {
            c1av = C1AV.A12;
        } else {
            c1av = C1AV.A13;
        }
        C2BI c2bi = new C2BI(userSession, c1av);
        CXPNoticeStateApi cXPNoticeStateApi = new CXPNoticeStateApi(userSession);
        this.A00 = userSession;
        this.A02 = c2bi;
        this.A01 = cXPNoticeStateApi;
    }

    public final C9B9 A00(EnumC46582Bw enumC46582Bw) {
        C9B9 A00 = this.A02.A00(enumC46582Bw);
        if (A00 == null) {
            return new C9B9(0, 0, 8);
        }
        return A00;
    }

    public final void A03(C9B9 c9b9, EnumC46582Bw enumC46582Bw) {
        C14360o3.A0B(c9b9, 1);
        this.A02.A01(new C9B9(false, c9b9.A00, c9b9.A01, c9b9.A03, 0), enumC46582Bw);
    }

    public final boolean A04(Map map) {
        C14360o3.A0B(map, 0);
        if (map.isEmpty()) {
            return false;
        }
        InterfaceC19630xq interfaceC19630xq = this.A02.A01;
        if (interfaceC19630xq.getBoolean("has_synced_notice_states", false)) {
            if (interfaceC19630xq.getLong("upsell_states_sync_sequence_number", 0L) >= C18U.A01(C06090Tz.A05, this.A00, 36599916002872995L)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r10 < (r9.getLong("disclosure_states_last_synced_ms", 0) + X.C18U.A01(X.C06090Tz.A05, r12.A00, 36600173698289406L))) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.util.Map r13, X.InterfaceC23621Ds r14) {
        /*
            r12 = this;
            r3 = 48
            boolean r0 = X.C9CY.A00(r14, r3)
            if (r0 == 0) goto L91
            r6 = r14
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L4e
            if (r0 != r4) goto L97
            java.lang.Object r1 = r6.A01
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r1 = (com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository) r1
            X.AbstractC09560e7.A00(r2)
        L28:
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4b
            X.2BI r1 = r1.A02
            r0 = 0
            r1.A02(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            X.0xq r0 = r1.A01
            X.0xo r1 = r0.ARD()
            java.lang.String r0 = "disclosure_states_last_synced_ms"
            r1.E7G(r0, r2)
            r1.apply()
        L4b:
            X.0eB r5 = X.C0eB.A00
        L4d:
            return r5
        L4e:
            X.AbstractC09560e7.A00(r2)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L4b
            long r10 = java.lang.System.currentTimeMillis()
            X.2BI r0 = r12.A02
            X.0xq r9 = r0.A01
            java.lang.String r3 = "disclosure_states_last_synced_ms"
            r0 = 0
            long r7 = r9.getLong(r3, r0)
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r2 <= 0) goto L83
            long r7 = r9.getLong(r3, r0)
            com.instagram.common.session.UserSession r3 = r12.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36600173698289406(0x8207aa00010efe, double:3.209435451643841E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            long r7 = r7 + r0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 >= 0) goto L83
            goto L4b
        L83:
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi r0 = r12.A01
            r6.A01 = r12
            r6.A00 = r4
            java.lang.Object r2 = r0.A03(r13, r6)
            if (r2 == r5) goto L4d
            r1 = r12
            goto L28
        L91:
            X.9CY r6 = new X.9CY
            r6.<init>(r12, r14, r3)
            goto L16
        L97:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository.A01(java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.Map r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r4 = 49
            boolean r0 = X.C9CY.A00(r9, r4)
            if (r0 == 0) goto L5e
            r3 = r9
            X.9CY r3 = (X.C9CY) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r6 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L45
            if (r0 != r5) goto L64
            java.lang.Object r0 = r3.A01
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r0 = (com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository) r0
            X.AbstractC09560e7.A00(r6)
        L28:
            java.util.Map r6 = (java.util.Map) r6
            X.2BI r4 = r0.A02
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36599916002872995(0x82076e00290ea3, double:3.2092724840248465E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A02(r0, r6)
        L40:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
        L44:
            return r1
        L45:
            X.AbstractC09560e7.A00(r6)
            boolean r0 = r7.A04(r8)
            if (r0 != 0) goto L50
            r5 = 0
            goto L40
        L50:
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateApi r0 = r7.A01
            r3.A01 = r7
            r3.A00 = r5
            java.lang.Object r6 = r0.A03(r8, r3)
            if (r6 == r1) goto L44
            r0 = r7
            goto L28
        L5e:
            X.9CY r3 = new X.9CY
            r3.<init>(r7, r9, r4)
            goto L16
        L64:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository.A02(java.util.Map, X.1Ds):java.lang.Object");
    }
}
