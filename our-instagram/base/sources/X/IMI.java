package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IMI {
    public final C38532Gwt A00;
    public final C18920wW A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final UserSession A05;
    public final InterfaceC60442pS A06;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(java.lang.Long r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r6 = this;
            X.0wW r1 = r6.A01
            java.lang.String r0 = "instagram_shopping_checker_tile_tap"
            X.0Ai r5 = X.AbstractC166987dD.A0f(r1, r0)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L47
            java.lang.String r0 = r6.A02
            X.AbstractC37300Gc1.A0n(r5, r0)
            java.lang.String r0 = r6.A03
            X.AbstractC37300Gc1.A0q(r5, r0)
            X.AbstractC37300Gc1.A0m(r5, r8)
            java.lang.String r1 = r6.A04
            java.lang.String r0 = "shopping_session_id"
            X.AbstractC25233BEq.A17(r5, r0, r1)
            X.AbstractC37301Gc2.A0x(r5, r11, r12)
            X.Gwt r1 = r6.A00
            java.lang.String r0 = "feed_item_info"
            r5.AAQ(r1, r0)
            if (r10 == 0) goto L48
            X.4SX r1 = X.C4SX.A00(r10)
            java.lang.String r0 = "marketer_id"
        L34:
            r5.AAK(r1, r0)
        L37:
            if (r7 == 0) goto L44
            r3 = 0
            long r1 = r7.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            X.AbstractC37304Gc5.A15(r5, r7, r0)
        L44:
            r5.Cht()
        L47:
            return
        L48:
            if (r9 == 0) goto L37
            X.4SX r1 = X.C4SX.A00(r9)
            java.lang.String r0 = "merchant_id"
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IMI.A00(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IMI(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4) {
        C38532Gwt c38532Gwt;
        this.A06 = interfaceC60442pS;
        this.A05 = userSession;
        this.A04 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        if (str4 != null) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A06("m_pk", str4);
            c0Zx.A06("tracking_token", AbstractC41071vF.A0I(userSession, str4));
            c38532Gwt = c0Zx;
        } else {
            c38532Gwt = null;
        }
        this.A00 = c38532Gwt;
    }
}
