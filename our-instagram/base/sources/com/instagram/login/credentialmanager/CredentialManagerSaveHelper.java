package com.instagram.login.credentialmanager;

import X.AbstractC43594JPz;
import X.C12L;
import X.C19L;
import android.content.Context;

/* loaded from: classes9.dex */
public final class CredentialManagerSaveHelper {
    public final C19L A00 = AbstractC43594JPz.A13(C12L.A00, 759212040);
    public final Context A01;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|16|17))|28|6|7|(0)(0)|12|(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r4 = r0.A00();
        r3 = r0.getMessage();
        X.C14360o3.A0B(r4, 0);
        r8.A00.D6d(false, X.AnonymousClass001.A0u("Credential manager save failed: errorType:", r4, X.AbstractC43591JPw.A00(508), r3));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: Njy -> 0x0059, TRY_LEAVE, TryCatch #0 {Njy -> 0x0059, blocks: (B:11:0x0048, B:12:0x004b, B:14:0x0052, B:22:0x0039), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.login.credentialmanager.CredentialManagerSaveHelper r7, X.FH5 r8, java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r5 = 0
            boolean r0 = X.PXA.A03(r11, r5)
            if (r0 == 0) goto L25
            r6 = r11
            X.PXA r6 = (X.PXA) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L2a
            java.lang.Object r8 = r6.A02
            X.FH5 r8 = (X.FH5) r8
            goto L48
        L25:
            X.PXA r6 = X.PXA.A00(r7, r11, r5)
            goto L15
        L2a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2f:
            X.AbstractC09560e7.A00(r1)
            android.content.Context r2 = r7.A01
            X.Ole r1 = new X.Ole
            r1.<init>(r2)
            X.Q6H r0 = new X.Q6H     // Catch: X.AbstractC53409Njy -> L59
            r0.<init>(r9, r10)     // Catch: X.AbstractC53409Njy -> L59
            X.PXA.A01(r7, r8, r6, r3)     // Catch: X.AbstractC53409Njy -> L59
            java.lang.Object r1 = r1.ALu(r2, r0, r6)     // Catch: X.AbstractC53409Njy -> L59
            if (r1 != r4) goto L4b
            return r4
        L48:
            X.AbstractC09560e7.A00(r1)     // Catch: X.AbstractC53409Njy -> L59
        L4b:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePasswordResponse"
            X.C14360o3.A0C(r1, r0)     // Catch: X.AbstractC53409Njy -> L59
            if (r8 == 0) goto L78
            X.Tm1 r1 = r8.A00     // Catch: X.AbstractC53409Njy -> L59
            r0 = 0
            r1.D6d(r3, r0)     // Catch: X.AbstractC53409Njy -> L59
            goto L78
        L59:
            r0 = move-exception
            if (r8 == 0) goto L78
            java.lang.String r4 = r0.A00()
            java.lang.String r3 = r0.getMessage()
            X.C14360o3.A0B(r4, r5)
            X.Tm1 r2 = r8.A00
            java.lang.String r1 = "Credential manager save failed: errorType:"
            r0 = 508(0x1fc, float:7.12E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            java.lang.String r0 = X.AnonymousClass001.A0u(r1, r4, r0, r3)
            r2.D6d(r5, r0)
        L78:
            X.0eB r4 = X.C0eB.A00
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerSaveHelper.A00(com.instagram.login.credentialmanager.CredentialManagerSaveHelper, X.FH5, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public CredentialManagerSaveHelper(Context context) {
        this.A01 = context;
    }
}
