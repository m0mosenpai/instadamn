package com.instagram.nux.ndx.util;

import X.C14360o3;
import com.instagram.common.session.UserSession;
import com.instagram.nux.ndx.api.NDXIGStepsAPI;

/* loaded from: classes6.dex */
public final class NdxStepsFetcher {
    public final UserSession A00;
    public final NDXIGStepsAPI A01;
    public final Integer A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.nux.ndx.api.NDXIGStepsAPI, java.lang.Object] */
    public /* synthetic */ NdxStepsFetcher(UserSession userSession, Integer num) {
        ?? obj = new Object();
        C14360o3.A0B(num, 2);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(int r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 25
            boolean r0 = X.PX5.A02(r8, r3)
            if (r0 == 0) goto L64
            r5 = r8
            X.PX5 r5 = (X.PX5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L4e
            if (r0 != r3) goto L71
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            java.util.ArrayList r2 = X.AbstractC166987dD.A1E()
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L3e
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r2 = r1.A00
            java.util.AbstractCollection r2 = (java.util.AbstractCollection) r2
            if (r2 == 0) goto L3c
        L36:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3d
        L3c:
            r2 = 0
        L3d:
            return r2
        L3e:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L6c
            X.0eB r0 = X.C0eB.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "NDX IG Server Step Fetch Error"
            X.C0w9.A03(r0, r1)
            goto L36
        L4e:
            X.AbstractC09560e7.A00(r1)
            com.instagram.nux.ndx.api.NDXIGStepsAPI r2 = r6.A01
            com.instagram.common.session.UserSession r1 = r6.A00
            java.lang.Integer r0 = r6.A02
            java.lang.String r0 = X.AbstractC34276F9w.A00(r0)
            r5.A00 = r3
            java.lang.Object r1 = r2.A00(r1, r0, r5, r7)
            if (r1 != r4) goto L24
            return r4
        L64:
            r0 = 42
            X.PX5 r5 = new X.PX5
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L6c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L71:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.ndx.util.NdxStepsFetcher.A00(int, X.1Ds):java.lang.Object");
    }
}
