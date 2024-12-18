package com.instagram.settings2.extension.common.derivedvalues;

/* loaded from: classes6.dex */
public abstract class DerivedValueProviderKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 26
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L76
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L56
            if (r1 != r3) goto L7c
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L4d
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r1 = r4.A00
            X.ECw r1 = (X.C32201ECw) r1
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L42
            int r0 = r0.intValue()
        L39:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L41:
            return r4
        L42:
            java.util.List r0 = r1.A02
            java.util.List r0 = X.AbstractC31172DnG.A19(r0)
            int r0 = r0.size()
            goto L39
        L4d:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L41
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L56:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31179DnN.A0D(r6)
            java.lang.String r0 = "users/blocked_list/"
            r2.A0B(r0)
            java.lang.Class<X.ECw> r1 = X.C32201ECw.class
            java.lang.Class<X.FYA> r0 = X.FYA.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 664905613(0x27a1a78d, float:4.4868136E-15)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
            return r4
        L76:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L16
        L7c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A00(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 27
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L71
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 != r3) goto L77
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L41
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.7ex r0 = (X.C168027ex) r0
            java.util.List r0 = r0.getItems()
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L40:
            return r1
        L41:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            X.AbstractC09560e7.A00(r1)
            X.1Ms r2 = X.AbstractC31179DnN.A0D(r6)
            java.lang.String r0 = "friendships/feed_favorites/"
            r2.A0B(r0)
            java.lang.String r0 = "feed_favorites"
            r2.A0A = r0
            r2.A04()
            java.lang.Class<X.7ex> r1 = X.C168027ex.class
            java.lang.Class<X.7ey> r0 = X.C168037ey.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1910055487(0x71d9223f, float:2.1503887E30)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L24
            return r4
        L71:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L16
        L77:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A01(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (r0 == r4) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A02(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 28
            boolean r0 = X.D3k.A02(r7, r3)
            if (r0 == 0) goto L82
            r5 = r7
            X.D3k r5 = (X.D3k) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L62
            if (r1 != r3) goto Lc7
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L59
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r4 = r4.A00
            X.EAn r4 = (X.C32140EAn) r4
            java.util.LinkedHashSet r3 = X.AbstractC31171DnF.A0l()
            X.Gay r0 = r4.A00
            if (r0 == 0) goto Lbf
            X.E7x r0 = (X.E7x) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L45:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r0 = r1.next()
            X.Gax r0 = (X.InterfaceC37248Gax) r0
            X.E7w r0 = (X.E7w) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L45
        L59:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L81
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r6)
            java.lang.String r0 = "users/muted_user_list/"
            r2.A0B(r0)
            java.lang.Class<X.EAn> r1 = X.C32140EAn.class
            java.lang.Class<X.FSb> r0 = X.C34736FSb.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 1538196257(0x5baf0321, float:9.852312E16)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
        L81:
            return r4
        L82:
            X.D3k r5 = new X.D3k
            r5.<init>(r3, r7)
            goto L16
        L88:
            r3.addAll(r2)
            X.Gay r0 = r4.A00
            if (r0 == 0) goto Lbf
            X.E7x r0 = (X.E7x) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L9b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r1.next()
            X.Gax r0 = (X.InterfaceC37248Gax) r0
            X.E7w r0 = (X.E7w) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L9b
        Laf:
            r3.addAll(r2)
            int r0 = r3.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
            return r4
        Lbf:
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lc7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A02(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(com.instagram.common.session.UserSession r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 29
            boolean r0 = X.D3k.A02(r6, r3)
            if (r0 == 0) goto L5d
            r4 = r6
            X.D3k r4 = (X.D3k) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L4a
            if (r1 != r0) goto L63
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L41
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.7ex r0 = (X.C168027ex) r0
            java.util.List r0 = r0.getItems()
            int r0 = r0.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L40:
            return r3
        L41:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            X.AbstractC09560e7.A00(r3)
            X.1ON r1 = X.AbstractC166547cQ.A00(r5)
            r4.A00 = r0
            r0 = 1145595412(0x44486614, float:801.595)
            java.lang.Object r3 = r1.A00(r0, r4)
            if (r3 != r2) goto L24
            return r2
        L5d:
            X.D3k r4 = new X.D3k
            r4.<init>(r3, r6)
            goto L16
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.extension.common.derivedvalues.DerivedValueProviderKt.A03(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
