package com.instagram.screentime;

import X.AbstractC23641Du;
import X.AbstractC24771Iv;
import X.AnonymousClass191;
import X.C14360o3;
import X.C19K;
import X.C99004cK;
import X.C99014cL;
import X.InterfaceC23621Ds;
import X.PZW;
import com.instagram.common.session.UserSession;
import com.instagram.screentime.storage.ScreenTimeDatabase;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class IGScreenTimeApi {
    public final C99014cL A00;
    public final C99014cL A01;
    public final UserSession A02;
    public final AtomicLong A03;
    public final AtomicLong A04;
    public final AtomicReference A05;
    public final long A06;
    public final C99004cK A07;
    public final ScreenTimeDatabase A08;
    public final String A09;
    public final AtomicBoolean A0A;

    public IGScreenTimeApi(C99014cL c99014cL, C99014cL c99014cL2, UserSession userSession, C99004cK c99004cK, ScreenTimeDatabase screenTimeDatabase) {
        C14360o3.A0B(c99004cK, 1);
        C14360o3.A0B(screenTimeDatabase, 3);
        C14360o3.A0B(c99014cL, 4);
        C14360o3.A0B(c99014cL2, 5);
        this.A07 = c99004cK;
        this.A02 = userSession;
        this.A08 = screenTimeDatabase;
        this.A00 = c99014cL;
        this.A01 = c99014cL2;
        this.A06 = System.currentTimeMillis() / 1000;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A09 = obj;
        this.A03 = new AtomicLong(0L);
        this.A04 = new AtomicLong(0L);
        this.A0A = new AtomicBoolean(false);
        this.A05 = new AtomicReference(null);
    }

    public final void A02(boolean z) {
        C19K A02 = AbstractC24771Iv.A02(487035921, 3);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZW(this, (InterfaceC23621Ds) null, 44, z), A02);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[PHI: r0
      0x00ad: PHI (r0v17 java.lang.Object) = (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:21:0x0086, B:14:0x00aa] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r11 = this;
            r3 = 33
            boolean r0 = X.C206459Cc.A00(r13, r3)
            if (r0 == 0) goto L2f
            r8 = r13
            X.9Cc r8 = (X.C206459Cc) r8
            int r2 = r8.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r8.A00 = r2
        L16:
            java.lang.Object r0 = r8.A03
            X.1JX r9 = X.C1JX.A02
            int r2 = r8.A00
            r10 = 3
            r5 = 2
            r1 = 1
            if (r2 == 0) goto L35
            if (r2 == r1) goto L61
            if (r2 == r5) goto Laa
            if (r2 == r10) goto Laa
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L2f:
            X.9Cc r8 = new X.9Cc
            r8.<init>(r11, r13, r3)
            goto L16
        L35:
            X.AbstractC09560e7.A00(r0)
            com.instagram.screentime.storage.ScreenTimeDatabase r0 = r11.A08
            X.4cR r6 = r0.A00()
            r8.A01 = r11
            r8.A02 = r12
            r8.A00 = r1
            java.lang.String r1 = "SELECT * FROM screentime_sync limit 1"
            r4 = 0
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r3 = X.AbstractC37591ow.A00(r1, r4)
            android.os.CancellationSignal r2 = new android.os.CancellationSignal
            r2.<init>()
            X.1YP r1 = r6.A01
            X.4lo r0 = new X.4lo
            r0.<init>()
            java.lang.Object r0 = X.C2Q9.A00(r2, r1, r0, r8, r4)
            if (r0 == r9) goto L88
            r7 = r11
            goto L6c
        L61:
            java.lang.Object r12 = r8.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r7 = r8.A01
            com.instagram.screentime.IGScreenTimeApi r7 = (com.instagram.screentime.IGScreenTimeApi) r7
            X.AbstractC09560e7.A00(r0)
        L6c:
            X.5Nh r0 = (X.C116035Nh) r0
            r6 = 0
            if (r0 != 0) goto L89
            r8.A01 = r6
            r8.A02 = r6
            r8.A00 = r5
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 - r2
        L82:
            java.lang.Object r0 = r7.A01(r12, r8, r0)
            if (r0 != r9) goto Lad
        L88:
            return r9
        L89:
            java.lang.Long r0 = r0.A02
            if (r0 == 0) goto La7
            long r4 = r0.longValue()
        L91:
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            r0 = 86400(0x15180, double:4.26873E-319)
            long r2 = r2 - r0
            long r0 = java.lang.Math.max(r4, r2)
            r8.A01 = r6
            r8.A02 = r6
            r8.A00 = r10
            goto L82
        La7:
            r4 = 0
            goto L91
        Laa:
            X.AbstractC09560e7.A00(r0)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.screentime.IGScreenTimeApi.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (((X.C206499Cg) r46).A06 != 1) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x033c A[LOOP:3: B:105:0x0336->B:107:0x033c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0375 A[LOOP:4: B:110:0x036f->B:112:0x0375, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x065e A[Catch: Exception -> 0x06ed, TRY_ENTER, TryCatch #0 {Exception -> 0x06ed, blocks: (B:18:0x06b3, B:19:0x06b6, B:21:0x06c1, B:23:0x06d1, B:25:0x06e0, B:26:0x06e5, B:41:0x065e, B:43:0x0673, B:44:0x067a, B:45:0x0682, B:49:0x068b, B:50:0x068c, B:51:0x068e, B:53:0x0694, B:54:0x0695, B:59:0x06eb, B:60:0x06ec, B:48:0x0686, B:52:0x068f), top: B:11:0x002d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0074  */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r45, X.InterfaceC23621Ds r46, long r47) {
        /*
            Method dump skipped, instructions count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.screentime.IGScreenTimeApi.A01(java.lang.String, X.1Ds, long):java.lang.Object");
    }
}
