package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1mV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36111mV implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1mW
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(232316093);
            int A032 = C0f9.A03(-27750418);
            C36111mV c36111mV = new C36111mV(userSession);
            C0f9.A0A(471724576, A032);
            C0f9.A0A(-1989816382, A03);
            return c36111mV;
        }
    };
    public final UserSession A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2 == 2) goto L6;
     */
    @Override // X.InterfaceC29421bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DUn(X.C1OW r7, X.MNP r8) {
        /*
            r6 = this;
            X.1mR r7 = (X.C36071mR) r7
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1My r5 = X.AbstractC25651Mw.A00(r0)
            X.JTV r8 = (X.JTV) r8
            java.lang.String r0 = r8.A02
            java.lang.String r4 = X.AbstractC34335FCd.A00(r0)
            java.lang.String r3 = r7.A03
            int r2 = r7.A00
            if (r2 == 0) goto L1a
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L1b
        L1a:
            r1 = 1
        L1b:
            X.Fwm r0 = new X.Fwm
            r0.<init>(r4, r3, r1)
            r5.E4s(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36111mV.DUn(X.1OW, X.MNP):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r2 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r1 == 2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r2 == 2) goto L6;
     */
    @Override // X.InterfaceC29421bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DUs(X.C1OW r9, X.MNP r10, X.MNP r11) {
        /*
            r8 = this;
            X.1mR r9 = (X.C36071mR) r9
            X.JTV r11 = (X.JTV) r11
            java.lang.String r7 = r11.A02
            com.instagram.common.session.UserSession r5 = r8.A00
            X.1My r6 = X.AbstractC25651Mw.A00(r5)
            java.lang.String r4 = X.AbstractC34335FCd.A00(r7)
            java.lang.String r3 = r9.A03
            int r2 = r9.A00
            if (r2 == 0) goto L1a
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L1b
        L1a:
            r1 = 1
        L1b:
            X.Fwm r0 = new X.Fwm
            r0.<init>(r4, r3, r1)
            r6.E4s(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 1501196714: goto L5b;
                case 1563991648: goto L2f;
                case 1885454214: goto L2b;
                default: goto L2a;
            }
        L2a:
            return
        L2b:
            java.lang.String r0 = "upload_failed_transient"
            goto L5e
        L2f:
            java.lang.String r0 = "uploaded"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
            java.lang.String r6 = r9.A03
            int r1 = r9.A00
            if (r1 == 0) goto L42
            r0 = 2
            r4 = 0
            if (r1 != r0) goto L43
        L42:
            r4 = 1
        L43:
            X.18A r0 = X.AnonymousClass189.A00(r5)
            com.instagram.user.model.User r3 = r0.A02(r6)
            r2 = 1
            if (r3 != 0) goto L77
            java.lang.Object[] r2 = new java.lang.Object[]{r6}
            java.lang.String r1 = "BlockIgUserMutationStateObserver"
            java.lang.String r0 = "user with id: %s does not exist in cache."
            X.C0K8.A0O(r1, r0, r2)
            return
        L5b:
            java.lang.String r0 = "upload_failed_permanent"
        L5e:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2a
            android.content.Context r5 = X.AbstractC12290kX.A00
            java.lang.String r4 = r9.A02
            java.lang.String r3 = r9.A04
            int r2 = r9.A00
            if (r2 == 0) goto L72
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L73
        L72:
            r0 = 1
        L73:
            X.AbstractC35116FeI.A00(r5, r4, r3, r0)
            return
        L77:
            r3.A0v(r4)
            X.1My r1 = X.AbstractC25651Mw.A00(r5)
            X.1xI r0 = new X.1xI
            r0.<init>(r3)
            r1.E4s(r0)
            X.5ts r1 = X.AbstractC129875tr.A00(r5)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A06
            r1.A0D(r0, r3, r2)
            r3.A0c(r5)
            if (r4 == 0) goto La2
            X.TtF r0 = X.AbstractC65792TuA.A00(r5)
            r0.A00(r3)
            X.2kX r0 = X.C57582kX.A00(r5)
            r0.A0P(r3)
        La2:
            X.8kN r0 = X.C195218kN.A00(r5)
            r0.A06()
            X.FzP r0 = X.MUK.A02(r5)
            r0.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36111mV.DUs(X.1OW, X.MNP, X.MNP):void");
    }

    public C36111mV(UserSession userSession) {
        this.A00 = userSession;
    }
}
