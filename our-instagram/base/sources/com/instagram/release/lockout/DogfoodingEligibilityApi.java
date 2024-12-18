package com.instagram.release.lockout;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C3EZ;
import X.C40701ud;
import X.C70423Eb;
import com.instagram.common.session.UserSession;

/* loaded from: classes2.dex */
public final class DogfoodingEligibilityApi {
    public final C40701ud A00;
    public final C70423Eb A01;
    public final C3EZ A02;

    public DogfoodingEligibilityApi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        C70423Eb c70423Eb = new C70423Eb();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C3EZ c3ez = new C3EZ(userSession);
        C14360o3.A0B(A01, 2);
        this.A01 = c70423Eb;
        this.A00 = A01;
        this.A02 = c3ez;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L67
            r5 = r7
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L50
            if (r0 != r2) goto L73
            java.lang.Object r1 = r5.A01
            com.instagram.release.lockout.DogfoodingEligibilityApi r1 = (com.instagram.release.lockout.DogfoodingEligibilityApi) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L44
            X.3EZ r1 = r1.A02
            X.C8m r0 = X.C8m.ELIGIBILITY_SERVICE_SUCCESS
            r1.A00(r0)
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L44:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L6d
            X.3EZ r1 = r1.A02
            X.C8m r0 = X.C8m.ELIGIBILITY_SERVICE_FAILURE
            r1.A00(r0)
            goto L3f
        L50:
            X.AbstractC09560e7.A00(r4)
            X.3EZ r1 = r6.A02
            X.C8m r0 = X.C8m.ELIGIBILITY_SERVICE_CHECK
            r1.A00(r0)
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r6.A01(r5)
            if (r4 != r3) goto L65
            return r3
        L65:
            r1 = r6
            goto L28
        L67:
            X.PWx r5 = new X.PWx
            r5.<init>(r6, r7, r3)
            goto L16
        L6d:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L73:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.lockout.DogfoodingEligibilityApi.A00(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 21
            boolean r0 = X.PXD.A03(r8, r3)
            if (r0 == 0) goto L9b
            r6 = r8
            X.PXD r6 = (X.PXD) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L75
            if (r0 != r4) goto Laa
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L6b
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r5 = r0.A01
            X.2JS r5 = (X.C2JS) r5
            if (r5 == 0) goto L69
            java.lang.Class<X.QjP> r3 = X.C59645QjP.class
            r2 = 0
            r0 = 1048(0x418, float:1.469E-42)
            java.lang.String r1 = X.AbstractC58317Pt9.A00(r0)
            r0 = 367519779(0x15e7e823, float:9.3666404E-26)
            X.2JS r1 = r5.getRequiredTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L69
            java.lang.String r0 = "status"
            boolean r0 = r1.getRequiredBooleanField(r2, r0)
        L4e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3NX r1 = new X.3NX
            r1.<init>(r0)
        L57:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L68
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.8jk r1 = new X.8jk
            r1.<init>(r0)
        L68:
            return r1
        L69:
            r0 = 1
            goto L4e
        L6b:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L57
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        L75:
            X.AbstractC09560e7.A00(r1)
            X.3Eb r3 = r7.A01
            r0 = 7
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            X.2JM r1 = r3.A00
            java.lang.String r0 = "lookback_days"
            r1.A03(r0, r2)
            r3.A02 = r4
            X.1Dk r1 = r3.A00()
            X.1ud r0 = r7.A00
            X.C14360o3.A0A(r1)
            r6.A00 = r4
            java.lang.Object r1 = r0.A04(r1, r6)
            if (r1 != r5) goto L24
            return r5
        L9b:
            r0 = 42
            X.PXD r6 = new X.PXD
            r6.<init>(r7, r8, r3, r0)
            goto L16
        La4:
            X.B4Z r0 = new X.B4Z
            r0.<init>()
            throw r0
        Laa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.lockout.DogfoodingEligibilityApi.A01(X.1Ds):java.lang.Object");
    }
}
