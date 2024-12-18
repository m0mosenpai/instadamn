package com.instagram.direct.fragment.thread.threadmedia.data;

import X.AbstractC167017dG;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class SharedLinksDataSource {
    public final UserSession A00;
    public final C40701ud A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r21, X.InterfaceC23621Ds r22) {
        /*
            r20 = this;
            r3 = 13
            r5 = r22
            boolean r0 = X.MAT.A03(r5, r3)
            r7 = r20
            if (r0 == 0) goto Lb8
            r4 = r5
            X.MAT r4 = (X.MAT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L5c
            if (r0 != r2) goto Lc8
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L4d
            java.lang.Object r0 = X.AbstractC43593JPy.A0v(r1)
            if (r0 == 0) goto L56
            X.3NX r1 = X.AbstractC25225BEi.A0z(r0)
        L38:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L4c
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lbe
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
        L4c:
            return r1
        L4d:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lc3
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
            goto L57
        L56:
            r0 = 0
        L57:
            X.8jk r1 = X.AbstractC43592JPx.A0p(r0)
            goto L38
        L5c:
            X.AbstractC09560e7.A00(r1)
            r15 = 0
            X.2JM r8 = X.AbstractC25225BEi.A0b()
            X.2JM r10 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "thread_igid"
            r1 = r21
            boolean r9 = X.AbstractC43594JPz.A1X(r8, r0, r1)
            long r0 = X.AbstractC43593JPy.A06()
            int r5 = (int) r0
            java.lang.Integer r1 = X.AbstractC43592JPx.A0r(r5)
            java.lang.String r0 = "max_timestamp"
            r8.A03(r0, r1)
            long r5 = X.AbstractC43593JPy.A06()
            double r0 = (double) r5
            java.lang.Double r5 = new java.lang.Double
            r5.<init>(r0)
            java.lang.String r0 = "max_timestamp_float"
            r8.A03(r0, r5)
            X.1uJ r9 = X.AbstractC25227BEk.A0U(r9)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r10.getParamsCopy()
            java.lang.Class<X.Qkj> r13 = X.C59717Qkj.class
            java.util.ArrayList r19 = X.AbstractC166987dD.A1E()
            java.lang.String r10 = "IGDGetThreadsSharedLinksQuery"
            r14 = 0
            java.lang.String r18 = "igd_shared_links_in_thread_details"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1ud r0 = r7.A01
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r8, r4)
            if (r1 != r3) goto L28
            return r3
        Lb8:
            X.MAT r4 = X.MAT.A00(r7, r5, r3)
            goto L1a
        Lbe:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.thread.threadmedia.data.SharedLinksDataSource.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public SharedLinksDataSource(UserSession userSession, C40701ud c40701ud) {
        AbstractC167017dG.A1P(userSession, c40701ud);
        this.A00 = userSession;
        this.A01 = c40701ud;
    }
}
