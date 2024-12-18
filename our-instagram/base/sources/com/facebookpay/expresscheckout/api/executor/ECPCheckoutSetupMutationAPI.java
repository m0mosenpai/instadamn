package com.facebookpay.expresscheckout.api.executor;

import X.AbstractC09440dt;
import X.C64987TbC;
import X.InterfaceC09390do;

/* loaded from: classes10.dex */
public final class ECPCheckoutSetupMutationAPI {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C64987TbC.A00);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, X.InterfaceC23621Ds r17) {
        /*
            r10 = this;
            r3 = 28
            r4 = r17
            boolean r0 = X.MAQ.A02(r4, r3)
            if (r0 == 0) goto Lcc
            r5 = r4
            X.MAQ r5 = (X.MAQ) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcc
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto Ld5
            X.AbstractC09560e7.A00(r1)
        L26:
            X.SLr r1 = (X.C62678SLr) r1
            X.Sjd r0 = r1.A00()
            return r0
        L2d:
            X.AbstractC09560e7.A00(r1)
            X.Be9 r2 = new X.Be9
            r2.<init>()
            java.lang.String r0 = X.AbstractC63083Sc6.A00()
            r2.A07(r11, r0)
            java.lang.String r0 = "product_id"
            r2.A07(r12, r0)
            java.lang.String r0 = "receiver_id"
            r2.A07(r13, r0)
            java.lang.String r0 = "order_id"
            r2.A07(r14, r0)
            if (r16 == 0) goto L79
            java.util.ArrayList r9 = X.AbstractC167017dG.A0q(r16)
            java.util.Iterator r8 = r16.iterator()
        L55:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r7 = r8.next()
            com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue r7 = (com.facebookpay.expresscheckout.models.CheckoutSetupKeyValue) r7
            X.2JO r3 = new X.2JO
            r3.<init>()
            java.lang.String r1 = r7.A00
            java.lang.String r0 = "key"
            r3.A09(r1, r0)
            java.lang.String r1 = r7.A01
            java.lang.String r0 = "value"
            r3.A09(r1, r0)
            r9.add(r3)
            goto L55
        L79:
            r1 = 0
            goto L7f
        L7b:
            java.util.List r1 = X.AbstractC001800i.A0a(r9)
        L7f:
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            r2.A05(r0, r1)
            if (r15 == 0) goto L99
            X.2JO r1 = new X.2JO
            r1.<init>()
            java.lang.String r0 = "bloks_versioning_id"
            r1.A09(r15, r0)
            java.lang.String r0 = "bloks_input"
            r2.A06(r1, r0)
        L99:
            java.lang.Class<X.SR0> r1 = X.SR0.class
            java.lang.String r0 = "create"
            java.lang.Object r1 = X.AbstractC50523MSb.A0R(r0, r1)     // Catch: java.lang.Throwable -> Lda
            X.Sy6 r1 = (X.C64034Sy6) r1     // Catch: java.lang.Throwable -> Lda
            X.2JM r0 = r1.A00
            X.AbstractC58318PtA.A1K(r2, r0)
            r1.A01 = r4
            com.facebook.pando.PandoGraphQLRequest r3 = r1.A00()
            r1 = 0
            X.SLG r0 = new X.SLG
            r0.<init>(r1, r1)
            X.C14360o3.A0A(r3)
            r0.A00(r3)
            X.0do r0 = r10.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r0 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r0
            r5.A00 = r4
            java.lang.Object r1 = r0.A00(r3, r5)
            if (r1 != r6) goto L26
            return r6
        Lcc:
            r0 = 42
            X.MAQ r5 = new X.MAQ
            r5.<init>(r10, r4, r3, r0)
            goto L18
        Ld5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lda:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AbstractC58318PtA.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.api.executor.ECPCheckoutSetupMutationAPI.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }
}
