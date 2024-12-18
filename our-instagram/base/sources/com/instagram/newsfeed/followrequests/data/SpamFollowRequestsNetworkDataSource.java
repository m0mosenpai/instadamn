package com.instagram.newsfeed.followrequests.data;

import X.InterfaceC58264Ps8;
import X.N2B;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class SpamFollowRequestsNetworkDataSource implements InterfaceC58264Ps8 {
    public final UserSession A00;
    public final N2B A01;

    @Override // X.InterfaceC58264Ps8
    public final void Chh() {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC58264Ps8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AOb(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 11
            boolean r0 = X.PX5.A02(r7, r3)
            if (r0 == 0) goto L47
            r5 = r7
            X.PX5 r5 = (X.PX5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 != r3) goto L4f
            X.AbstractC09560e7.A00(r0)
        L24:
            return r0
        L25:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "friendships/remove_all_spam_requests/"
            r2.A0B(r0)
            java.lang.Class<X.EAY> r1 = X.EAY.class
            java.lang.Class<X.FSK> r0 = X.FSK.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 28653216(0x1b536a0, float:6.656728E-38)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L47:
            r0 = 42
            X.PX5 r5 = new X.PX5
            r5.<init>(r6, r7, r3, r0)
            goto L16
        L4f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource.AOb(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // X.InterfaceC58264Ps8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AV6(X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r10 = this;
            r3 = 13
            r4 = r11
            boolean r0 = X.C57145PWx.A02(r11, r3)
            if (r0 == 0) goto L74
            r6 = r4
            X.PWx r6 = (X.C57145PWx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r2 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r9 = 0
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 != r3) goto L98
            java.lang.Object r0 = r6.A01
            com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource r0 = (com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource) r0
            X.AbstractC09560e7.A00(r2)
        L2b:
            X.3NY r2 = (X.C3NY) r2
            X.N2B r0 = r0.A01
            X.3Av r1 = r0.A00
            r1.A08(r4)
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L9d
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.7fM r0 = (X.C168277fM) r0
            X.7fN r0 = r0.A03
            if (r0 != 0) goto L79
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L4a:
            X.AbstractC09560e7.A00(r2)
            com.instagram.common.session.UserSession r0 = r10.A00
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.String r0 = "friendships/pending_spam/"
            r2.A0B(r0)
            java.lang.String r0 = "response_without_su"
            r2.A0I(r0, r12)
            java.lang.Class<X.7fM> r1 = X.C168277fM.class
            java.lang.Class<X.7fL> r0 = X.C168267fL.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r4, r2, r1, r0, r9)
            r6.A01 = r10
            r6.A00 = r3
            r0 = 28653216(0x1b536a0, float:6.656728E-38)
            java.lang.Object r2 = r1.A00(r0, r6)
            if (r2 == r5) goto Lbe
            r0 = r10
            goto L2b
        L74:
            X.PWx r6 = X.C57145PWx.A00(r10, r11, r3)
            goto L17
        L79:
            X.0sl r5 = X.C16930sl.A00
            java.util.List r4 = r0.A03
            if (r4 != 0) goto L80
            r4 = r5
        L80:
            java.lang.Integer r0 = r0.A02
            int r8 = X.AbstractC25227BEk.A06(r0, r9)
            java.lang.Integer r0 = X.C05F.A00
            X.NQY r3 = new X.NQY
            r3.<init>(r0)
            int r6 = r4.size()
            r7 = -1
            X.MsF r2 = new X.MsF
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto Lb6
        L98:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L9d:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lbf
            X.MsF r2 = new X.MsF
            java.lang.Integer r0 = X.C05F.A00
            X.NQX r3 = new X.NQX
            r3.<init>(r0)
            X.0sl r4 = X.C16930sl.A00
            int r6 = r4.size()
            r7 = -1
            r5 = r4
            r8 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        Lb6:
            r1.A05()
            X.0rp r5 = new X.0rp
            r5.<init>(r2)
        Lbe:
            return r5
        Lbf:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.SpamFollowRequestsNetworkDataSource.AV6(X.1Ds, boolean):java.lang.Object");
    }

    public SpamFollowRequestsNetworkDataSource(UserSession userSession, N2B n2b) {
        this.A00 = userSession;
        this.A01 = n2b;
    }
}
