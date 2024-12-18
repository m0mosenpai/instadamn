package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gk5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37790Gk5 implements InterfaceC128405r9 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    public C37790Gk5(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (X.AbstractC37587Ggi.A00(r13.A00) != false) goto L5;
     */
    @Override // X.InterfaceC128405r9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C221269pq AUh(java.lang.Object r14, java.lang.Object r15, java.lang.String r16) {
        /*
            r13 = this;
            X.5dq r14 = (X.C120985dq) r14
            r9 = r16
            X.AbstractC167017dG.A1O(r14, r9)
            boolean r0 = r14.CdW()
            if (r0 == 0) goto L3f
            X.1v4 r1 = r14.A06()
        L11:
            if (r1 == 0) goto L4e
            java.lang.String r4 = r13.A01
            X.1qM r2 = r1.A0K
            java.lang.String r5 = X.AbstractC37302Gc3.A0c(r2)
            com.instagram.common.session.UserSession r1 = r13.A00
            java.lang.String r6 = X.AbstractC37303Gc4.A0S(r14, r1)
            X.1qM r0 = r14.A02
            java.lang.String r7 = X.AbstractC82563mK.A04(r1, r0)
            X.2vl r3 = X.AbstractC37302Gc3.A0O(r2)
            X.0sl r10 = X.C16930sl.A00
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = r2.getId()
            if (r8 != 0) goto L39
            java.lang.String r8 = "n/a"
        L39:
            X.9pq r2 = new X.9pq
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r2
        L3f:
            X.1v4 r1 = r14.A07()
            if (r1 == 0) goto L4e
            com.instagram.common.session.UserSession r0 = r13.A00
            boolean r0 = X.AbstractC37587Ggi.A00(r0)
            if (r0 == 0) goto L4e
            goto L11
        L4e:
            java.lang.String r0 = "No valid ad found in the item model"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37790Gk5.AUh(java.lang.Object, java.lang.Object, java.lang.String):X.9pq");
    }

    @Override // X.InterfaceC128405r9
    public final /* bridge */ /* synthetic */ C9CQ AUg(Object obj) {
        return AbstractC37303Gc4.A05(obj);
    }
}
