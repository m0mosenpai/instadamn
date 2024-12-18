package com.instagram.genai.imageservice.service;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class GenAIImagineService {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.AbstractC47451Kxg r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r6 = 1
            boolean r0 = X.PX9.A03(r10, r6)
            if (r0 == 0) goto L20
            r5 = r10
            X.PX9 r5 = (X.PX9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A01
            X.1JX r7 = X.C1JX.A02
            int r1 = r5.A00
            if (r1 == 0) goto L31
            if (r1 != r6) goto L2c
            goto L28
        L20:
            r0 = 42
            X.PX9 r5 = new X.PX9
            r5.<init>(r8, r10, r6, r0)
            goto L15
        L28:
            X.AbstractC09560e7.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            return r0
        L2c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L31:
            X.AbstractC09560e7.A00(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            r0 = 60
            long r2 = r2.toMillis(r0)     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            r4 = 0
            r1 = 38
            X.MCG r0 = new X.MCG     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            r0.<init>(r9, r8, r4, r1)     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            r5.A00 = r6     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            java.lang.Object r0 = X.LHL.A00(r5, r0, r2)     // Catch: java.util.concurrent.CancellationException -> L4d X.C902540k -> L4f
            if (r0 != r7) goto L55
            return r7
        L4d:
            r0 = move-exception
            throw r0
        L4f:
            X.KXy r0 = X.C46010KXy.A00
            X.8jk r0 = X.AbstractC43592JPx.A0p(r0)
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImagineService.A02(X.Kxg, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.genai.imageservice.service.GenAIImagineService r7, X.AbstractC47451Kxg r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 33
            boolean r0 = X.MAH.A01(r9, r3)
            if (r0 == 0) goto L81
            r4 = r9
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r6 = r4.A02
            X.1JX r5 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L43
            if (r1 == r0) goto L51
            if (r1 != r2) goto L87
            X.AbstractC09560e7.A00(r6)
        L27:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r6.iterator()
        L31:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L31
            r3.add(r1)
            goto L31
        L43:
            X.AbstractC09560e7.A00(r6)
            r4.A01 = r7
            r4.A00 = r0
            java.lang.Object r6 = A01(r7, r8, r4)
            if (r6 != r5) goto L56
            return r5
        L51:
            java.lang.Object r7 = r4.A01
            X.AbstractC09560e7.A00(r6)
        L56:
            X.3NY r6 = (X.C3NY) r6
            boolean r0 = r6 instanceof X.C3NX
            if (r0 == 0) goto L8c
            X.3NX r6 = (X.C3NX) r6
            java.lang.Object r0 = r6.A00
            X.Mte r0 = (X.C51755Mte) r0
            java.lang.Object r3 = r0.A00
            r1 = 0
            r4.A01 = r1
            r4.A00 = r2
            r0 = 5
            X.PZP r2 = new X.PZP
            r2.<init>(r7, r3, r1, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass198.A00
            X.12W r1 = r4.getContext()
            X.MMf r0 = new X.MMf
            r0.<init>(r4, r1)
            java.lang.Object r6 = X.C1UZ.A00(r0, r2, r0)
            if (r6 != r5) goto L27
            return r5
        L81:
            X.MAH r4 = new X.MAH
            r4.<init>(r7, r9, r3)
            goto L16
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L8c:
            boolean r0 = r6 instanceof X.C194848jk
            if (r0 != 0) goto La1
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L95:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto La2
            X.KXu r0 = X.C46006KXu.A00
            X.8jk r6 = X.AbstractC43592JPx.A0p(r0)
        La1:
            return r6
        La2:
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r3)
            java.util.Iterator r1 = r3.iterator()
        Laa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r1.next()
            X.3NX r0 = (X.C3NX) r0
            java.lang.Object r0 = r0.A00
            r2.add(r0)
            goto Laa
        Lbc:
            X.5Hb r2 = X.AbstractC133095zb.A03(r2)
            r1 = 30
            X.Mte r0 = new X.Mte
            r0.<init>(r2, r1)
            X.3NX r6 = X.AbstractC25225BEi.A0z(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImagineService.A00(com.instagram.genai.imageservice.service.GenAIImagineService, X.Kxg, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0068, code lost:
    
        if (r4 == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.genai.imageservice.service.GenAIImagineService r17, X.AbstractC47451Kxg r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.GenAIImagineService.A01(com.instagram.genai.imageservice.service.GenAIImagineService, X.Kxg, X.1Ds):java.lang.Object");
    }

    public GenAIImagineService(UserSession userSession) {
        this.A00 = userSession;
    }
}
