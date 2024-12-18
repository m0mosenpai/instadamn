package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3BK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BK {
    public final AbstractC59962oe A00;
    public final UserSession A01;
    public final C3BL A02;

    public C3BK(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = abstractC59962oe;
        this.A02 = new C3BL(userSession);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Integer r10) {
        /*
            r9 = this;
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r0 = 33
            r1 = 0
            if (r2 < r0) goto L9
            r1 = 1
        L9:
            r6 = 0
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == 0) goto L21
            if (r10 != r0) goto L18
            X.3BL r1 = r9.A02
            java.lang.Integer r0 = X.C05F.A09
            r1.A00(r0, r6)
            return
        L18:
            java.lang.Integer r0 = X.C05F.A0C
            if (r10 != r0) goto L2a
            X.3BL r1 = r9.A02
            java.lang.Integer r0 = X.C05F.A0A
            goto L27
        L21:
            if (r10 != r0) goto L2a
            X.3BL r1 = r9.A02
            java.lang.Integer r0 = X.C05F.A0B
        L27:
            r1.A00(r0, r6)
        L2a:
            com.instagram.common.session.UserSession r7 = r9.A01
            X.1AU r2 = X.C1AT.A01(r7)
            X.1AV r1 = X.C1AV.A2J
            java.lang.Class<X.3yS> r0 = X.C89263yS.class
            X.0xq r8 = r2.A04(r1, r0)
            java.lang.String r2 = "ndx_impression_timestamp"
            r0 = 0
            long r3 = r8.getLong(r2, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L4c
            X.3BL r1 = r9.A02
            java.lang.Integer r0 = X.C05F.A02
            r1.A00(r0, r6)
            return
        L4c:
            java.lang.String r2 = "ndx_immersive_written_timestamp"
            long r3 = r8.getLong(r2, r0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L5e
            X.3BL r1 = r9.A02
            java.lang.Integer r0 = X.C05F.A1F
            r1.A00(r0, r6)
            return
        L5e:
            long r0 = java.lang.System.currentTimeMillis()
            X.EUl r4 = new X.EUl
            r4.<init>(r9, r10, r0)
            java.lang.String r1 = X.AbstractC34276F9w.A00(r10)
            r3 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r7, r0)
            java.lang.Integer r0 = X.C05F.A0N
            r2.A09(r0)
            java.lang.String r0 = "devices/ndx/api/async_get_ndx_ig_steps/"
            r2.A0B(r0)
            X.Ft2 r0 = new X.Ft2
            r0.<init>(r1)
            r2.A04 = r0
            java.lang.Class<X.EBm> r1 = X.C32165EBm.class
            java.lang.Class<X.FWR> r0 = X.FWR.class
            r2.A0P(r6, r1, r0, r3)
            X.1ON r1 = r2.A0N()
            r1.A00 = r4
            r0 = 1260133026(0x4b1c1aa2, float:1.0230434E7)
            X.C1GJ.A06(r1, r0, r5, r5, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3BK.A00(java.lang.Integer):void");
    }
}
