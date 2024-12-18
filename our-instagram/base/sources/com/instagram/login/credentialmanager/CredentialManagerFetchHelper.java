package com.instagram.login.credentialmanager;

import X.AbstractC43594JPz;
import X.C12L;
import X.C19L;
import X.OC2;
import android.content.Context;

/* loaded from: classes9.dex */
public final class CredentialManagerFetchHelper {
    public OC2 A00;
    public final C19L A01 = AbstractC43594JPz.A13(C12L.A00, 1348461140);
    public final Context A02;

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|14|15|(1:17)|19|20))|31|6|7|(0)(0)|12|14|15|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        r8.A01(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r4 = r0.A01();
        r5 = r0.getMessage();
        X.C14360o3.A0B(r4, 0);
        X.AbstractC166987dD.A1Z(new X.C50109MAf(r9.A02, r4, r5, null, 1), X.MSY.A0v());
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[Catch: NullPointerException -> 0x0088, TRY_LEAVE, TryCatch #1 {NullPointerException -> 0x0088, blocks: (B:15:0x0073, B:17:0x0079), top: B:14:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.login.credentialmanager.CredentialManagerFetchHelper r8, X.OC2 r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 49
            boolean r0 = X.MAK.A01(r10, r3)
            if (r0 == 0) goto L2a
            r5 = r10
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L35
            if (r0 != r7) goto L30
            java.lang.Object r9 = r5.A02
            X.OC2 r9 = (X.OC2) r9
            java.lang.Object r8 = r5.A01
            com.instagram.login.credentialmanager.CredentialManagerFetchHelper r8 = (com.instagram.login.credentialmanager.CredentialManagerFetchHelper) r8
            goto L6e
        L2a:
            X.MAK r5 = new X.MAK
            r5.<init>(r8, r10, r3)
            goto L16
        L30:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L35:
            X.AbstractC09560e7.A00(r1)
            r0 = 4136(0x1028, float:5.796E-42)
            java.lang.String r2 = X.AbstractC111324zv.A00(r0)
            java.lang.String r1 = "com.google.android.gms.auth.api.credentials.credman.service.PasswordAndPasskeyService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r2, r1)
            java.util.Set r2 = X.AbstractC43592JPx.A16(r0)
            X.0sj r1 = X.C16910sj.A00
            r4 = 0
            X.Q6P r0 = new X.Q6P
            r0.<init>(r1, r2)
            android.content.Context r3 = r8.A02     // Catch: X.AbstractC53410Njz -> L8d
            X.Ole r2 = new X.Ole     // Catch: X.AbstractC53410Njz -> L8d
            r2.<init>(r3)     // Catch: X.AbstractC53410Njz -> L8d
            java.util.List r1 = X.AbstractC166987dD.A1J(r0)     // Catch: X.AbstractC53410Njz -> L8d
            X.SCy r0 = new X.SCy     // Catch: X.AbstractC53410Njz -> L8d
            r0.<init>(r1, r4)     // Catch: X.AbstractC53410Njz -> L8d
            r5.A01 = r8     // Catch: X.AbstractC53410Njz -> L8d
            r5.A02 = r9     // Catch: X.AbstractC53410Njz -> L8d
            r5.A00 = r7     // Catch: X.AbstractC53410Njz -> L8d
            java.lang.Object r1 = r2.At9(r3, r0, r5)     // Catch: X.AbstractC53410Njz -> L8d
            if (r1 != r6) goto L71
            return r6
        L6e:
            X.AbstractC09560e7.A00(r1)     // Catch: X.AbstractC53410Njz -> L8d
        L71:
            X.SAA r1 = (X.SAA) r1     // Catch: X.AbstractC53410Njz -> L8d
            X.SA9 r2 = r1.A00     // Catch: java.lang.NullPointerException -> L88
            boolean r0 = r2 instanceof X.Q6M     // Catch: java.lang.NullPointerException -> L88
            if (r0 == 0) goto La9
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.PasswordCredential"
            X.C14360o3.A0C(r2, r0)     // Catch: java.lang.NullPointerException -> L88
            X.Q6M r2 = (X.Q6M) r2     // Catch: java.lang.NullPointerException -> L88
            java.lang.String r1 = r2.A00     // Catch: java.lang.NullPointerException -> L88
            java.lang.String r0 = r2.A01     // Catch: java.lang.NullPointerException -> L88
            r8.A01(r1, r0)     // Catch: java.lang.NullPointerException -> L88
            goto La9
        L88:
            r0 = 0
            r8.A01(r0, r0)
            goto La9
        L8d:
            r0 = move-exception
            java.lang.String r4 = r0.A01()
            java.lang.String r5 = r0.getMessage()
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            X.19K r0 = X.MSY.A0v()
            X.TnA r3 = r9.A02
            r6 = 0
            X.MAf r2 = new X.MAf
            r2.<init>(r3, r4, r5, r6, r7)
            X.AbstractC166987dD.A1Z(r2, r0)
        La9:
            X.0eB r6 = X.C0eB.A00
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerFetchHelper.A00(com.instagram.login.credentialmanager.CredentialManagerFetchHelper, X.OC2, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        if (r13.length() == 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L9
            int r1 = r13.length()
            r0 = 0
            if (r1 != 0) goto La
        L9:
            r0 = 1
        La:
            java.lang.String r2 = "retrieveCredentialResultListener"
            if (r0 != 0) goto L3b
            if (r14 == 0) goto L3b
            int r0 = r14.length()
            if (r0 == 0) goto L3b
            X.OC2 r1 = r12.A00
            if (r1 == 0) goto L4e
            X.P4o r0 = new X.P4o
            r0.<init>(r13, r14)
            X.P4p r7 = new X.P4p
            r7.<init>(r0)
            X.19K r3 = X.MSY.A0v()
            X.TnA r8 = r1.A02
            androidx.fragment.app.Fragment r6 = r1.A00
            X.DwI r5 = r1.A03
            X.0a1 r9 = r1.A01
            r10 = 0
            r11 = 6
            X.MBy r4 = new X.MBy
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
        L37:
            X.AbstractC166987dD.A1Z(r4, r3)
            return
        L3b:
            X.OC2 r0 = r12.A00
            if (r0 == 0) goto L4e
            X.19K r3 = X.MSY.A0v()
            X.TnA r2 = r0.A02
            r1 = 0
            r0 = 43
            X.GSQ r4 = new X.GSQ
            r4.<init>(r2, r1, r0)
            goto L37
        L4e:
            X.C14360o3.A0F(r2)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.credentialmanager.CredentialManagerFetchHelper.A01(java.lang.String, java.lang.String):void");
    }

    public CredentialManagerFetchHelper(Context context) {
        this.A02 = context;
    }
}
