package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1hK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32961hK implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1hL
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(135013867);
            int A032 = C0f9.A03(-1562482635);
            C32961hK c32961hK = new C32961hK(new B2J(userSession, this));
            C0f9.A0A(1967707771, A032);
            C0f9.A0A(631161487, A03);
            return c32961hK;
        }
    };
    public final InterfaceC08830cm A00;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // X.InterfaceC29421bJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DUn(X.MNP r8, X.C32931hH r9) {
        /*
            r7 = this;
            X.0cm r0 = r7.A00
            java.lang.Object r5 = r0.get()
            X.2DS r5 = (X.C2DS) r5
            X.JTV r8 = (X.JTV) r8
            java.lang.String r6 = r8.A02
            com.instagram.model.direct.DirectThreadKey r0 = r9.C7Q()
            java.lang.String r0 = r0.A00
            X.3kb r4 = r5.C76(r0)
            if (r4 == 0) goto L26
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L27;
                case -948696717: goto L2b;
                case 1501196714: goto L44;
                case 1563991648: goto L48;
                case 1885454214: goto L4c;
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
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r9.A00
            if (r0 == 0) goto L1f
            X.3j1 r2 = r5.C7k(r4)
            java.lang.String r1 = r9.A05
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r9.A00
            r2.A05(r1, r0)
            goto L1f
        L44:
            java.lang.String r0 = "upload_failed_permanent"
            goto L4f
        L48:
            java.lang.String r0 = "uploaded"
            goto L4f
        L4c:
            java.lang.String r0 = "upload_failed_transient"
        L4f:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1f
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r9.A00
            if (r0 == 0) goto L1f
            X.3j1 r3 = r5.C7k(r4)
            java.lang.String r2 = r9.A05
            com.instagram.direct.model.DirectThreadThemeInfo r1 = r9.A00
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32961hK.DUn(X.MNP, X.1hH):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        DUn(mnp2, (C32931hH) c1ow);
    }

    public C32961hK(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
