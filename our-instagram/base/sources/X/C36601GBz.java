package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GBz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36601GBz implements C5OV {
    public final UserSession A00;
    public final C55732hE A01;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r1 != false) goto L24;
     */
    @Override // X.C5OV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E3b(X.C5OW r12) {
        /*
            r11 = this;
            X.0cb r0 = X.C17060sy.A01
            com.instagram.common.session.UserSession r3 = r11.A00
            com.instagram.user.model.User r4 = r0.A01(r3)
            boolean r0 = X.C2E7.A02(r4)
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L1d
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322933559274238(0x810b8400002afe, double:3.034107671374214E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L30
        L1d:
            boolean r0 = X.C2E7.A03(r4)
            if (r0 == 0) goto L87
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322933559405311(0x810b8400022aff, double:3.034107671457105E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L87
        L30:
            X.2hE r1 = r11.A01
            if (r1 == 0) goto L87
            java.lang.String r0 = "target_thread_id"
            java.lang.String r4 = r1.A00(r0)
            if (r4 == 0) goto L87
            X.2DS r7 = X.C2JD.A00(r3)
            X.3kb r6 = X.AbstractC31172DnG.A0h(r7, r4)
            if (r6 == 0) goto L87
            boolean r0 = r6.CVQ()
            if (r0 == 0) goto L87
            boolean r0 = r6.CaK()
            if (r0 != 0) goto L87
            r8 = 3
            int r2 = r6.B7A()
            X.3iy r0 = r6.A01
            X.3kP r0 = r0.A0t
            if (r0 == 0) goto L63
            boolean r1 = r0.A0L
            r0 = 1
            if (r1 == 0) goto L64
        L63:
            r0 = 0
        L64:
            int r0 = r7.BdL(r2, r0)
            long r1 = (long) r0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L87
            com.instagram.model.direct.DirectThreadKey r0 = r6.BKb()
            java.util.ArrayList r2 = r7.Ab7(r0, r5)
            int r1 = r2.size()
            r0 = 20
            if (r1 < r0) goto L87
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L88
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L88
        L87:
            return r5
        L88:
            java.util.Iterator r1 = r2.iterator()
        L8c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r1.next()
            X.3nh r0 = (X.C83403nh) r0
            boolean r0 = r0.A2N
            if (r0 == 0) goto L8c
            X.0xq r3 = X.AbstractC166987dD.A0x(r3)
            java.lang.String r2 = "direct_pin_upsell_thread_ids"
            java.util.Set r0 = r3.C2v(r2)
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L87
            java.util.Set r0 = r3.C2v(r2)
            java.util.Set r1 = X.AbstractC001800i.A0j(r0)
            r1.add(r4)
            X.0xo r0 = r3.ARD()
            r0.E7L(r2, r1)
            r0.apply()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36601GBz.E3b(X.5OW):boolean");
    }

    public C36601GBz(UserSession userSession, C55732hE c55732hE) {
        this.A00 = userSession;
        this.A01 = c55732hE;
    }
}
