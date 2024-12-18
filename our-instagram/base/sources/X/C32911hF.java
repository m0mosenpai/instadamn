package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32911hF implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1hG
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1845383044);
            int A032 = C0f9.A03(1038377040);
            C32911hF c32911hF = new C32911hF(new B2K(userSession, this));
            C0f9.A0A(1707044254, A032);
            C0f9.A0A(1966329591, A03);
            return c32911hF;
        }
    };
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0018. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // X.InterfaceC29421bJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DUn(X.MNP r8, X.C32851h9 r9) {
        /*
            r7 = this;
            X.0cm r0 = r7.A00
            java.lang.Object r5 = r0.get()
            X.2DS r5 = (X.C2DS) r5
            X.JTV r8 = (X.JTV) r8
            java.lang.String r6 = r8.A02
            java.lang.String r0 = r9.A00
            X.3kb r4 = r5.C76(r0)
            if (r4 == 0) goto L22
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L23;
                case -948696717: goto L27;
                case 1501196714: goto L4b;
                case 1563991648: goto L4f;
                case 1885454214: goto L53;
                default: goto L1b;
            }
        L1b:
            com.instagram.model.direct.DirectThreadKey r0 = r4.BKb()
            r5.FCS(r0)
        L22:
            return
        L23:
            java.lang.String r0 = "executing"
            goto L2a
        L27:
            java.lang.String r0 = "queued"
        L2a:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1b
            X.3j1 r2 = r5.BuV(r4)
            java.lang.String r1 = r9.A05
            boolean r0 = r9.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A05(r1, r0)
            X.3j1 r2 = r5.BuW(r4)
            java.lang.String r1 = r9.A05
            java.lang.String r0 = r9.A02
            r2.A05(r1, r0)
            goto L1b
        L4b:
            java.lang.String r0 = "upload_failed_permanent"
            goto L56
        L4f:
            java.lang.String r0 = "uploaded"
            goto L56
        L53:
            java.lang.String r0 = "upload_failed_transient"
        L56:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1b
            X.3j1 r3 = r5.BuV(r4)
            java.lang.String r2 = r9.A05
            boolean r0 = r9.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            X.3j1 r3 = r5.BuW(r4)
            java.lang.String r2 = r9.A05
            java.lang.String r1 = r9.A02
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32911hF.DUn(X.MNP, X.1h9):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        DUn(mnp2, (C32851h9) c1ow);
    }

    public C32911hF(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
