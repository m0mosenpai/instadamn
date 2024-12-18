package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1k5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1k5 implements InterfaceC29301b7 {
    public static final C0KV A01 = C1k6.A00;
    public final UserSession A00;

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r18, X.InterfaceC37261GbE r19, X.C1OW r20) {
        /*
            r17 = this;
            r13 = r20
            X.1k3 r13 = (X.C34651k3) r13
            r0 = 0
            X.C14360o3.A0B(r13, r0)
            r0 = 2
            r4 = r19
            X.C14360o3.A0B(r4, r0)
            r12 = r17
            com.instagram.common.session.UserSession r3 = r12.A00
            X.2DS r1 = X.C2JD.A00(r3)
            java.lang.String r0 = r13.A03()
            X.2DU r1 = (X.C2DU) r1
            r5 = 0
            X.3kb r2 = r1.A0N(r0)
            boolean r1 = r13.A07
            r6 = 0
            if (r1 == 0) goto Lb4
            java.lang.Integer r14 = r13.A04
        L28:
            if (r1 == 0) goto Lbd
            if (r2 == 0) goto Lb2
            X.7Hl r0 = X.AbstractC160497Hj.A03(r3, r2)
            boolean r0 = r0.CPg(r3, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L38:
            java.lang.Integer r1 = r13.A05
            if (r1 == 0) goto Lc6
            boolean r0 = X.A0W.A00(r0, r1)
            if (r0 == 0) goto Lc6
            long r1 = r1.longValue()
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L52
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r0.toMillis(r1)
        L52:
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
        L56:
            X.3kW r0 = r13.A01
            X.4Ds r0 = X.C6X6.A01(r3, r0)
            if (r0 == 0) goto L60
            java.lang.String r6 = r0.A00
        L60:
            X.ETN r11 = new X.ETN
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.String r10 = r13.A03()
            boolean r8 = r13.A07
            java.lang.Integer r7 = r13.A04
            java.lang.Integer r6 = r13.A05
            r1 = 1
            r9 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r3, r0)
            r2.A0R = r1
            java.lang.Integer r0 = X.C05F.A01
            r2.A09(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "direct_v2/threads/%s/set_disappearing_messages_settings/"
            r2.A0L(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            r2.A0P(r9, r1, r0, r5)
            java.lang.String r0 = "mode"
            r2.A0J(r0, r8)
            java.lang.String r0 = "ttl_sec"
            r2.A0A(r7, r0)
            java.lang.String r0 = "view_ttl_sec"
            r2.A0A(r6, r0)
            X.1ON r1 = r2.A0N()
            X.EDz r0 = new X.EDz
            r0.<init>(r11, r3, r4)
            r1.A00 = r0
            X.C1GJ.A03(r1)
            return
        Lb2:
            r0 = r6
            goto L38
        Lb4:
            X.52z r0 = r13.A03
            if (r0 == 0) goto Lbc
            java.lang.Integer r14 = r0.A02
            goto L28
        Lbc:
            r14 = r6
        Lbd:
            if (r2 == 0) goto Lc6
            X.7Iy r0 = X.C160907Iy.A00
            java.lang.Long r15 = r0.A01(r3, r2)
            goto L56
        Lc6:
            r15 = r6
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1k5.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C1k5(UserSession userSession) {
        this.A00 = userSession;
    }
}
