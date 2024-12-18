package com.instagram.igtv.repository.user;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class UserRepository {
    public final UserSession A00;
    public final UserNetworkDataSource A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13, boolean r14) {
        /*
            r10 = this;
            r3 = 39
            boolean r0 = X.MAH.A01(r13, r3)
            if (r0 == 0) goto L70
            r9 = r13
            X.MAH r9 = (X.MAH) r9
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r9.A00 = r2
        L16:
            java.lang.Object r4 = r9.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r9.A00
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto L87
            java.lang.Object r1 = r9.A01
            com.instagram.igtv.repository.user.UserRepository r1 = (com.instagram.igtv.repository.user.UserRepository) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L76
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r3 = r4.A00
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            com.instagram.common.session.UserSession r0 = r1.A00
            X.18A r1 = X.AnonymousClass189.A00(r0)
            r0 = 0
            com.instagram.user.model.User r1 = r1.A01(r3, r2, r0)
        L3f:
            return r1
        L40:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r10.A00
            r8 = r11
            com.instagram.user.model.User r1 = X.AbstractC31174DnI.A0k(r0, r11)
            if (r1 == 0) goto L5c
            if (r14 == 0) goto L3f
            X.17P r0 = r1.A03
            java.lang.Boolean r0 = r0.BBu()
            if (r0 == 0) goto L5c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3f
        L5c:
            com.instagram.igtv.repository.user.UserNetworkDataSource r4 = r10.A01
            r9.A01 = r10
            r9.A00 = r2
            java.lang.String r6 = "users/{user_id}/info/"
            java.lang.String r7 = "user_id"
            r5 = r12
            java.lang.Object r4 = com.instagram.igtv.repository.user.UserNetworkDataSource.A00(r4, r5, r6, r7, r8, r9)
            if (r4 != r3) goto L6e
            return r3
        L6e:
            r1 = r10
            goto L28
        L70:
            X.MAH r9 = new X.MAH
            r9.<init>(r10, r13, r3)
            goto L16
        L76:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L82
            java.lang.String r0 = "UserRepository network request failed"
            X.470 r1 = new X.470
            r1.<init>(r0)
            throw r1
        L82:
            X.B4Z r1 = X.B4Z.A00()
            throw r1
        L87:
            java.lang.IllegalStateException r1 = X.AbstractC166987dD.A13()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.repository.user.UserRepository.A00(java.lang.String, java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public UserRepository(UserSession userSession, UserNetworkDataSource userNetworkDataSource) {
        this.A00 = userSession;
        this.A01 = userNetworkDataSource;
    }
}
