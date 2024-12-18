package com.instagram.bugreporter;

/* loaded from: classes8.dex */
public final class BugReportComposerFragment$onClickScreenshotThumbnail$1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BugReportComposerFragment A01;

    public BugReportComposerFragment$onClickScreenshotThumbnail$1(BugReportComposerFragment bugReportComposerFragment, int i) {
        this.A01 = bugReportComposerFragment;
        this.A00 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(android.net.Uri r12, X.InterfaceC23621Ds r13) {
        /*
            r11 = this;
            r3 = 32
            boolean r0 = X.MAO.A02(r13, r3)
            if (r0 == 0) goto Lc0
            r8 = r13
            X.MAO r8 = (X.MAO) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc0
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r4 = r8.A03
            X.1JX r7 = X.C1JX.A02
            int r0 = r8.A00
            r9 = 3
            r2 = 1
            r10 = 2
            r6 = 0
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L71
            if (r0 == r10) goto L98
            if (r0 != r9) goto Lcf
            java.lang.Object r6 = r8.A02
            com.meta.flytrap.attachment.model.BugReportAttachment r6 = (com.meta.flytrap.attachment.model.BugReportAttachment) r6
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.AbstractC09560e7.A00(r4)
        L33:
            com.instagram.bugreporter.BugReportComposerFragment r3 = r5.A01
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            java.lang.String r2 = "bugReport"
            if (r0 == 0) goto Lc7
            java.util.List r0 = r0.A0K
            int r1 = r5.A00
            r0.add(r1, r6)
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            if (r0 == 0) goto Lc7
            java.util.List r0 = r0.A0L
            r0.add(r1, r4)
            com.instagram.bugreporter.model.BugReport r0 = r3.A08
            if (r0 == 0) goto Lc7
            com.meta.flytrap.attachment.model.AttachmentCounter r2 = r0.A01
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r1 = r6.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            java.util.ArrayList r0 = r2.A00
            r0.add(r1)
            X.0eB r7 = X.C0eB.A00
        L5e:
            return r7
        L5f:
            X.AbstractC09560e7.A00(r4)
            com.instagram.bugreporter.BugReportComposerFragment r1 = r11.A01
            int r0 = r11.A00
            X.MAO.A00(r11, r12, r8, r2)
            java.lang.Object r0 = com.instagram.bugreporter.BugReportComposerFragment.A03(r1, r8, r0)
            if (r0 == r7) goto L5e
            r5 = r11
            goto L7c
        L71:
            java.lang.Object r12 = r8.A02
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.AbstractC09560e7.A00(r4)
        L7c:
            X.12L r1 = X.C12L.A00
            r0 = 480314591(0x1ca104df, float:1.0655345E-21)
            X.0nZ r3 = r1.CPG(r0, r9)
            com.instagram.bugreporter.BugReportComposerFragment r2 = r5.A01
            int r1 = r5.A00
            X.MCK r0 = new X.MCK
            r0.<init>(r12, r2, r6, r1)
            X.MAO.A00(r5, r6, r8, r10)
            java.lang.Object r4 = X.AbstractC23641Du.A00(r8, r3, r0)
            if (r4 != r7) goto L9f
            return r7
        L98:
            java.lang.Object r5 = r8.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r5 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r5
            X.AbstractC09560e7.A00(r4)
        L9f:
            com.meta.flytrap.attachment.model.BugReportAttachment r4 = (com.meta.flytrap.attachment.model.BugReportAttachment) r4
            X.12L r1 = X.C12L.A00
            r0 = 480314591(0x1ca104df, float:1.0655345E-21)
            X.0nZ r3 = r1.CPG(r0, r9)
            com.instagram.bugreporter.BugReportComposerFragment r2 = r5.A01
            r1 = 31
            X.MC5 r0 = new X.MC5
            r0.<init>(r4, r2, r6, r1)
            X.MAO.A00(r5, r4, r8, r9)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r8, r3, r0)
            if (r0 == r7) goto L5e
            r6 = r4
            r4 = r0
            goto L33
        Lc0:
            X.MAO r8 = new X.MAO
            r8.<init>(r11, r13, r3)
            goto L16
        Lc7:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lcf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1.A00(android.net.Uri, X.1Ds):java.lang.Object");
    }
}
