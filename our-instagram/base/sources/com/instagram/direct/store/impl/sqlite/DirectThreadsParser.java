package com.instagram.direct.store.impl.sqlite;

import X.C2DX;
import X.C46862Da;
import com.instagram.common.session.UserSession;

/* loaded from: classes.dex */
public final class DirectThreadsParser {
    public final UserSession A00;
    public final C2DX A01;
    public final C46862Da A02;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.util.List r13, java.util.List r14, X.InterfaceC23621Ds r15) {
        /*
            r12 = this;
            r3 = 23
            boolean r0 = X.MAK.A01(r15, r3)
            r6 = r12
            if (r0 == 0) goto L59
            r4 = r15
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L37
            if (r1 != r0) goto L5f
            java.lang.Object r11 = r4.A02
            X.0ps r11 = (X.C15370ps) r11
            java.lang.Object r10 = r4.A01
            X.0ps r10 = (X.C15370ps) r10
            X.AbstractC09560e7.A00(r3)
        L2d:
            java.lang.Object r1 = r10.A00
            java.lang.Object r0 = r11.A00
            X.0e4 r2 = new X.0e4
            r2.<init>(r1, r0)
            return r2
        L37:
            X.AbstractC09560e7.A00(r3)
            X.0ps r10 = new X.0ps
            r10.<init>()
            X.0ps r11 = new X.0ps
            r11.<init>()
            r9 = 0
            X.PZo r5 = new X.PZo
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.A01 = r10
            r4.A02 = r11
            r4.A00 = r0
            java.lang.Object r0 = X.AnonymousClass194.A00(r4, r5)
            if (r0 != r2) goto L2d
            return r2
        L59:
            X.MAK r4 = new X.MAK
            r4.<init>(r12, r15, r3)
            goto L17
        L5f:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.store.impl.sqlite.DirectThreadsParser.A00(java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    public DirectThreadsParser(UserSession userSession, C2DX c2dx) {
        this.A00 = userSession;
        this.A01 = c2dx;
        this.A02 = new C46862Da(userSession);
    }
}
