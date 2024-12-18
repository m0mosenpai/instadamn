package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32511gb implements InterfaceC29421bJ {
    public static final C0KV A02 = new C0KV() { // from class: X.1gc
        @Override // X.C0KV
        public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
            int A03 = C0f9.A03(-572145749);
            int A032 = C0f9.A03(-346528339);
            C32511gb c32511gb = new C32511gb(new GRO(userSession, this), new GRP(userSession, this));
            C0f9.A0A(-1987510910, A032);
            C0f9.A0A(-1070403147, A03);
            return c32511gb;
        }
    };
    public final InterfaceC08830cm A00;
    public final InterfaceC08830cm A01;

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    @Override // X.InterfaceC29421bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DUs(X.C1OW r9, X.MNP r10, X.MNP r11) {
        /*
            r8 = this;
            X.1gX r9 = (X.C32471gX) r9
            X.0cm r0 = r8.A00
            java.lang.Object r3 = r0.get()
            X.1My r3 = (X.C25671My) r3
            X.0cm r0 = r8.A01
            java.lang.Object r4 = r0.get()
            X.2DS r4 = (X.C2DS) r4
            X.JTV r11 = (X.JTV) r11
            java.lang.String r6 = r11.A02
            com.instagram.model.direct.DirectThreadKey r2 = r9.A00
            r1 = r4
            X.2DU r1 = (X.C2DU) r1
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            X.3kb r5 = X.C2DU.A03(r1, r2)
            if (r5 == 0) goto L92
            boolean r7 = r9.A01
            int r0 = r6.hashCode()
            switch(r0) {
                case -1090974990: goto L73;
                case -948696717: goto L6f;
                case 1501196714: goto L5b;
                case 1563991648: goto L3e;
                case 1885454214: goto L3a;
                default: goto L2e;
            }
        L2e:
            java.lang.String r0 = "Invalid lifecycleState: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L3a:
            java.lang.String r0 = "upload_failed_transient"
            goto L5e
        L3e:
            java.lang.String r0 = "uploaded"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L2e
            X.3j1 r3 = r4.C7T(r5)
            com.instagram.model.direct.DirectThreadKey r0 = r9.A00
            java.lang.String r2 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = X.AbstractC31275Dox.A0I(r6)
            r3.A04(r1, r2, r0)
            goto L8b
        L5b:
            java.lang.String r0 = "upload_failed_permanent"
        L5e:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L2e
            com.instagram.model.direct.DirectThreadKey r1 = r9.A00
            X.7OG r0 = new X.7OG
            r0.<init>(r1)
            r3.E4s(r0)
            goto L8b
        L6f:
            java.lang.String r0 = "queued"
            goto L76
        L73:
            java.lang.String r0 = "executing"
        L76:
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L2e
            X.3j1 r2 = r4.C7T(r5)
            com.instagram.model.direct.DirectThreadKey r0 = r9.A00
            java.lang.String r1 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r2.A05(r1, r0)
        L8b:
            com.instagram.model.direct.DirectThreadKey r0 = r5.BKb()
            r4.FCS(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32511gb.DUs(X.1OW, X.MNP, X.MNP):void");
    }

    public C32511gb(InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2) {
        this.A00 = interfaceC08830cm;
        this.A01 = interfaceC08830cm2;
    }
}
