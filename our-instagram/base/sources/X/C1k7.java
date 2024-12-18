package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1k7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1k7 implements InterfaceC29421bJ {
    public static final C0KV A02 = C34671k8.A00;
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C9E1(this, 22));

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.MNP r9, X.C34651k3 r10) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r7 = r8.A00
            X.0do r0 = r8.A01
            java.lang.Object r5 = r0.getValue()
            X.2DS r5 = (X.C2DS) r5
            X.JTV r9 = (X.JTV) r9
            java.lang.String r6 = r9.A02
            java.lang.String r0 = r10.A03()
            X.3kb r4 = r5.C76(r0)
            if (r4 == 0) goto L26
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L27;
                case -948696717: goto L2b;
                case 1501196714: goto L48;
                case 1563991648: goto L4c;
                case 1885454214: goto L6f;
                default: goto L1f;
            }
        L1f:
            com.instagram.model.direct.DirectThreadKey r0 = r4.BKb()
            r5.FCS(r0)
        L26:
            return
        L27:
            java.lang.String r0 = "executing"
            goto L2e
        L2b:
            java.lang.String r0 = "queued"
        L2e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            X.3j1 r1 = r5.AyA(r4)
            X.52z r0 = r10.A02
            if (r0 != 0) goto L44
            X.2DS r0 = X.AbstractC28761aE.A00(r7)
            X.52z r0 = X.C34651k3.A00(r7, r10, r0)
        L44:
            r1.A03(r0)
            goto L1f
        L48:
            java.lang.String r0 = "upload_failed_permanent"
            goto L72
        L4c:
            java.lang.String r0 = "uploaded"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            X.3j1 r3 = r5.AyA(r4)
            java.lang.String r2 = r10.A05
            X.52z r1 = r10.A02
            if (r1 != 0) goto L67
            X.2DS r0 = X.AbstractC28761aE.A00(r7)
            X.52z r1 = X.C34651k3.A00(r7, r10, r0)
        L67:
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            goto L1f
        L6f:
            java.lang.String r0 = "upload_failed_transient"
        L72:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            X.3j1 r3 = r5.AyA(r4)
            java.lang.String r2 = r10.A05
            X.52z r1 = r10.A02
            if (r1 != 0) goto L8a
            X.2DS r0 = X.AbstractC28761aE.A00(r7)
            X.52z r1 = X.C34651k3.A00(r7, r10, r0)
        L8a:
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            X.52z r1 = r10.A03
            if (r1 == 0) goto L1f
            X.3j1 r0 = r5.AyA(r4)
            r0.A03(r1)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1k7.A00(X.MNP, X.1k3):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C34651k3 c34651k3 = (C34651k3) c1ow;
        C14360o3.A0B(c34651k3, 0);
        C14360o3.A0B(mnp, 1);
        A00(mnp, c34651k3);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C34651k3 c34651k3 = (C34651k3) c1ow;
        C14360o3.A0B(c34651k3, 0);
        C14360o3.A0B(mnp2, 2);
        A00(mnp2, c34651k3);
    }

    public C1k7(UserSession userSession) {
        this.A00 = userSession;
    }
}
