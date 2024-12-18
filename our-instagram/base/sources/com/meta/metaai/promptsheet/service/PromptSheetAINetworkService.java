package com.meta.metaai.promptsheet.service;

import X.AbstractC28057CYl;
import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import X.InterfaceC40711ue;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class PromptSheetAINetworkService {
    public final Application A00;
    public final InterfaceC40711ue A01;
    public final FoaUserSession A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.CVS r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 20
            boolean r0 = X.C29631D3m.A03(r11, r3)
            if (r0 == 0) goto L67
            r7 = r11
            X.D3m r7 = (X.C29631D3m) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A01
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A00
            r6 = 1
            if (r0 == 0) goto L35
            if (r0 != r6) goto L81
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6c
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            if (r0 == 0) goto L75
            X.3NX r8 = X.AbstractC25225BEi.A0z(r0)
            return r8
        L35:
            X.AbstractC09560e7.A00(r1)
            X.1ue r5 = r9.A01
            java.lang.Class<X.CX5> r0 = X.CX5.class
            java.lang.Object r3 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> L86
            X.CpX r3 = (X.C28923CpX) r3     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "IGD"
            X.2JM r1 = r3.A00
            java.lang.String r0 = "app"
            r1.A04(r0, r2)
            r3.A02 = r6
            X.1Dk r4 = r3.A00()
            long r2 = r10.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            X.1Dk r0 = r4.setFreshCacheAgeMs(r2)
            X.1Dk r0 = r0.setMaxToleratedCacheAgeMs(r2)
            r7.A00 = r6
            java.lang.Object r1 = X.CL2.A00(r5, r0, r7)
            if (r1 != r8) goto L24
            return r8
        L67:
            X.D3m r7 = X.C29631D3m.A00(r9, r11, r3)
            goto L16
        L6c:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L7c
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
            goto L76
        L75:
            r0 = 0
        L76:
            X.8jk r8 = new X.8jk
            r8.<init>(r0)
            return r8
        L7c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L81:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L86:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.service.PromptSheetAINetworkService.A00(X.CVS, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ PromptSheetAINetworkService(Application application, FoaUserSession foaUserSession) {
        C40701ud A01 = AbstractC40691uc.A01(AbstractC28057CYl.A00(foaUserSession));
        C14360o3.A0B(A01, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A01;
    }
}
