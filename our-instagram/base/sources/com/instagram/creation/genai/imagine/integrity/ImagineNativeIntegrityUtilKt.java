package com.instagram.creation.genai.imagine.integrity;

/* loaded from: classes5.dex */
public abstract class ImagineNativeIntegrityUtilKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.app.Application r13, com.instagram.common.session.UserSession r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC23621Ds r19) {
        /*
            r3 = 15
            r4 = r19
            boolean r0 = X.D3k.A02(r4, r3)
            if (r0 == 0) goto L82
            r12 = r4
            X.D3k r12 = (X.D3k) r12
            int r2 = r12.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r12.A00 = r2
        L18:
            java.lang.Object r2 = r12.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r12.A00
            r5 = 1
            if (r0 == 0) goto L64
            if (r0 != r5) goto L96
            X.AbstractC09560e7.A00(r2)
        L26:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r4 = r2.A00
            X.2JS r4 = (X.C2JS) r4
            java.lang.Class<X.QUw> r3 = X.C59038QUw.class
            r2 = 0
            r0 = 147(0x93, float:2.06E-43)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 1882557464(0x70358c18, float:2.247446E29)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L59
            java.lang.String r0 = "submitted"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r5) goto L59
        L4c:
            X.3NX r2 = X.AbstractC25235BEs.A0f(r5)
        L50:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L88
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            return r0
        L59:
            r5 = 0
            goto L4c
        L5b:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L50
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            X.AbstractC09560e7.A00(r2)
            com.instagram.foa.session.IgMetaSessionImpl r0 = X.AbstractC28057CYl.A01(r14)
            com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService r6 = new com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService
            r6.<init>(r13, r0)
            r12.A00 = r5
            java.lang.String r11 = "IG_STORIES_IMAGINE"
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            java.lang.Object r2 = r6.A00(r7, r8, r9, r10, r11, r12)
            if (r2 != r1) goto L26
            return r1
        L82:
            X.D3k r12 = new X.D3k
            r12.<init>(r3, r4)
            goto L18
        L88:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L91
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L91:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L96:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.imagine.integrity.ImagineNativeIntegrityUtilKt.A00(android.app.Application, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }
}
