package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32751gz implements InterfaceC29421bJ {
    public static final C0KV A01 = new C0KV() { // from class: X.1h0
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(1175126429);
            int A032 = C0f9.A03(-263033193);
            C32751gz c32751gz = new C32751gz(new B2H(userSession, this));
            C0f9.A0A(-1874185918, A032);
            C0f9.A0A(-845683070, A03);
            return c32751gz;
        }
    };
    public final InterfaceC08830cm A00;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    @Override // X.InterfaceC29421bJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void DUn(X.MNP r7, X.C32711gv r8) {
        /*
            r6 = this;
            X.0cm r0 = r6.A00
            java.lang.Object r4 = r0.get()
            X.2DS r4 = (X.C2DS) r4
            X.JTV r7 = (X.JTV) r7
            java.lang.String r3 = r7.A02
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            r0 = 2
            X.C14360o3.A0B(r3, r0)
            com.instagram.model.direct.DirectThreadKey r2 = r8.A01
            X.C14360o3.A0A(r2)
            r1 = r4
            X.2DU r1 = (X.C2DU) r1
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.3kb r0 = X.C2DU.A03(r1, r2)
            if (r0 == 0) goto La3
            java.lang.String r0 = r8.A03
            X.3nh r0 = r4.BSh(r2, r0)
            r4 = 0
            if (r0 == 0) goto La3
            X.4hT r0 = r0.A0e
            if (r0 == 0) goto La3
            java.util.List r0 = r0.A0B
            if (r0 == 0) goto L92
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L3f:
            if (r0 == 0) goto La3
            java.util.Iterator r5 = r0.iterator()
        L45:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r2 = r5.next()
            r0 = r2
            X.3qW r0 = (X.C84823qW) r0
            X.3a5 r1 = r0.A12
            X.3a5 r0 = X.EnumC75383a5.A0x
            if (r1 != r0) goto L45
            r4 = r2
        L59:
            X.3qW r4 = (X.C84823qW) r4
            if (r4 == 0) goto La3
            int r0 = r3.hashCode()
            switch(r0) {
                case -1090974990: goto L70;
                case -948696717: goto L74;
                case 1501196714: goto L84;
                case 1563991648: goto L88;
                case 1885454214: goto L97;
                default: goto L64;
            }
        L64:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L70:
            java.lang.String r0 = "executing"
            goto L77
        L74:
            java.lang.String r0 = "queued"
        L77:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L64
            int r0 = r8.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto La1
        L84:
            java.lang.String r0 = "upload_failed_permanent"
            goto L9a
        L88:
            java.lang.String r0 = "uploaded"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L64
            return
        L92:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L3f
        L97:
            java.lang.String r0 = "upload_failed_transient"
        L9a:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L64
            r0 = 0
        La1:
            r4.A1M = r0
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32751gz.DUn(X.MNP, X.1gv):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
        throw new IllegalStateException("Cancellations are unsupported");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        DUn(mnp2, (C32711gv) c1ow);
    }

    public C32751gz(InterfaceC08830cm interfaceC08830cm) {
        this.A00 = interfaceC08830cm;
    }
}
