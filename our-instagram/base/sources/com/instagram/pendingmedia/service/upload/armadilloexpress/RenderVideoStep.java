package com.instagram.pendingmedia.service.upload.armadilloexpress;

import X.C70343Ds;
import X.InterfaceC70363Du;
import X.MQE;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class RenderVideoStep implements MQE {
    public final UserSession A00;
    public final InterfaceC70363Du A01;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.MQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F8t(X.OXD r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 16
            boolean r0 = X.PX6.A02(r11, r3)
            if (r0 == 0) goto L2a
            r7 = r11
            X.PX6 r7 = (X.PX6) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r0 = r7.A04
            X.1JX r8 = X.C1JX.A02
            int r3 = r7.A00
            r2 = 2
            r1 = 1
            r6 = 0
            if (r3 == 0) goto L41
            if (r3 == r1) goto L35
            if (r3 != r2) goto L30
            java.lang.Object r5 = r7.A01
            X.139 r5 = (X.AnonymousClass139) r5
            goto L71
        L2a:
            X.PX6 r7 = new X.PX6
            r7.<init>(r9, r11, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            java.lang.Object r5 = r7.A03
            X.139 r5 = (X.AnonymousClass139) r5
            java.lang.Object r10 = r7.A02
            java.lang.Object r1 = r7.A01
            X.AbstractC09560e7.A00(r0)
            goto L50
        L41:
            X.AbstractC09560e7.A00(r0)
            X.139 r5 = X.O0J.A00
            X.PX6.A00(r9, r10, r5, r7, r1)
            java.lang.Object r0 = X.AnonymousClass139.A00(r7, r5)
            if (r0 == r8) goto L81
            r1 = r9
        L50:
            r0 = 33
            X.Pbd r4 = new X.Pbd     // Catch: java.lang.Throwable -> L7a
            r4.<init>(r0, r10, r1)     // Catch: java.lang.Throwable -> L7a
            r7.A01 = r5     // Catch: java.lang.Throwable -> L7a
            r7.A02 = r6     // Catch: java.lang.Throwable -> L7a
            r7.A03 = r6     // Catch: java.lang.Throwable -> L7a
            r7.A00 = r2     // Catch: java.lang.Throwable -> L7a
            X.191 r3 = X.AnonymousClass191.A00     // Catch: java.lang.Throwable -> L7a
            r2 = 30
            r1 = 42
            X.PYx r0 = new X.PYx     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r4, r6, r2, r1)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = X.AbstractC23641Du.A00(r7, r3, r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != r8) goto L74
            return r8
        L71:
            X.AbstractC09560e7.A00(r0)     // Catch: java.lang.Throwable -> L7c
        L74:
            X.O3s r0 = (X.AbstractC54438O3s) r0     // Catch: java.lang.Throwable -> L7c
            r5.A04(r6)
            return r0
        L7a:
            r0 = move-exception
            goto L7d
        L7c:
            r0 = move-exception
        L7d:
            r5.A04(r6)
            throw r0
        L81:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep.F8t(X.OXD, X.1Ds):java.lang.Object");
    }

    @Override // X.MQE
    public final String getName() {
        return "RenderVideoStep";
    }

    public RenderVideoStep(UserSession userSession, Context context) {
        this.A00 = userSession;
        this.A01 = C70343Ds.A00(context, userSession);
    }
}
