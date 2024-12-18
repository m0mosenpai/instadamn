package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G5Y implements InterfaceC29421bJ {
    public final UserSession A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C29887DGb(this, 32));

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r1.equals("queued") == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        ((X.C2DS) r5.getValue()).Asr(r4).A05(r8.A05, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r1.equals("executing") != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(X.C37271oQ r8) {
        /*
            r7 = this;
            X.0do r5 = r7.A01
            java.lang.Object r1 = r5.getValue()
            X.2DS r1 = (X.C2DS) r1
            java.lang.String r0 = r8.A00
            if (r0 == 0) goto L72
            X.3kb r4 = r1.C76(r0)
            if (r4 == 0) goto L2a
            java.util.Map r3 = r8.A01
            if (r3 == 0) goto L2a
            java.lang.String r1 = r8.A06
            int r0 = r1.hashCode()
            java.lang.String r6 = "uploaded"
            switch(r0) {
                case -1090974990: goto L5a;
                case -948696717: goto L51;
                case 1501196714: goto L33;
                case 1563991648: goto L2e;
                case 1885454214: goto L2b;
                default: goto L21;
            }
        L21:
            java.lang.Object r0 = r5.getValue()
            X.2DS r0 = (X.C2DS) r0
            X.AbstractC31173DnH.A1V(r4, r0)
        L2a:
            return
        L2b:
            java.lang.String r0 = "upload_failed_transient"
            goto L35
        L2e:
            boolean r0 = r1.equals(r6)
            goto L39
        L33:
            java.lang.String r0 = "upload_failed_permanent"
        L35:
            boolean r0 = r1.equals(r0)
        L39:
            if (r0 == 0) goto L21
            java.lang.Object r0 = r5.getValue()
            X.2DS r0 = (X.C2DS) r0
            X.3j1 r2 = r0.Asr(r4)
            java.lang.String r1 = r8.A05
            java.lang.String r0 = r8.A06
            boolean r0 = X.AbstractC167007dF.A1X(r0, r6)
            r2.A04(r3, r1, r0)
            goto L21
        L51:
            java.lang.String r0 = "queued"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L62
            goto L21
        L5a:
            java.lang.String r0 = "executing"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L21
        L62:
            java.lang.Object r0 = r5.getValue()
            X.2DS r0 = (X.C2DS) r0
            X.3j1 r1 = r0.Asr(r4)
            java.lang.String r0 = r8.A05
            r1.A05(r0, r3)
            goto L21
        L72:
            java.lang.String r0 = "threadId"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G5Y.A00(X.1oQ):void");
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUn(C1OW c1ow, MNP mnp) {
        C37271oQ c37271oQ = (C37271oQ) c1ow;
        AbstractC167017dG.A1N(c37271oQ, mnp);
        A00(c37271oQ);
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUs(C1OW c1ow, MNP mnp, MNP mnp2) {
        C37271oQ c37271oQ = (C37271oQ) c1ow;
        AbstractC167017dG.A1O(c37271oQ, mnp2);
        A00(c37271oQ);
    }

    public G5Y(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.InterfaceC29421bJ
    public final /* bridge */ /* synthetic */ void DUr(C1OW c1ow, MNP mnp) {
    }
}
