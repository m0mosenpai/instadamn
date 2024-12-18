package com.instagram.video.live.mvvm.model.repository;

import X.C14360o3;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi;

/* loaded from: classes9.dex */
public final class IgLiveBroadcastSettingsRepository {
    public final UserSession A00;
    public final IgLiveBroadcastSettingsApi A01;

    public /* synthetic */ IgLiveBroadcastSettingsRepository(UserSession userSession) {
        IgLiveBroadcastSettingsApi igLiveBroadcastSettingsApi = new IgLiveBroadcastSettingsApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = igLiveBroadcastSettingsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.IGLiveBadgeSettings r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 15
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L56
            r4 = r8
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 != r2) goto L66
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3f
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.N2q r0 = (X.C52090N2q) r0
            com.instagram.api.schemas.IGLiveBadgeSettings r0 = r0.A00
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L36:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            return r1
        L3f:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L36
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L48:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r3 = r0.A00(r6, r7, r4)
            if (r3 != r1) goto L24
            return r1
        L56:
            X.PX4 r4 = X.PX4.A00(r5, r8, r3)
            goto L16
        L5b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L61
            r1 = 0
            return r1
        L61:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository.A00(com.instagram.api.schemas.IGLiveBadgeSettings, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r7, X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r6 = this;
            r3 = 16
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L29
            r5 = r8
            X.PX4 r5 = (X.PX4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L45
            if (r0 == r2) goto L45
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L29:
            X.PX4 r5 = X.PX4.A00(r6, r8, r3)
            goto L16
        L2e:
            X.AbstractC09560e7.A00(r4)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi r0 = r6.A01
            if (r9 == 0) goto L3e
            r5.A00 = r1
            java.lang.Object r4 = r0.A04(r7, r5)
        L3b:
            if (r4 != r3) goto L48
            return r3
        L3e:
            r5.A00 = r2
            java.lang.Object r4 = r0.A03(r7, r5)
            goto L3b
        L45:
            X.AbstractC09560e7.A00(r4)
        L48:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r4 = X.AbstractC25235BEs.A0f(r1)
        L52:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L64
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            return r0
        L5b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L52
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L6d
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L6d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository.A01(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r7, X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L29
            r5 = r8
            X.PX4 r5 = (X.PX4) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L45
            if (r0 == r2) goto L45
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L29:
            X.PX4 r5 = X.PX4.A00(r6, r8, r3)
            goto L16
        L2e:
            X.AbstractC09560e7.A00(r4)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastSettingsApi r0 = r6.A01
            if (r9 == 0) goto L3e
            r5.A00 = r1
            java.lang.Object r4 = r0.A02(r7, r5)
        L3b:
            if (r4 != r3) goto L48
            return r3
        L3e:
            r5.A00 = r2
            java.lang.Object r4 = r0.A01(r7, r5)
            goto L3b
        L45:
            X.AbstractC09560e7.A00(r4)
        L48:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r4 = X.AbstractC25235BEs.A0f(r1)
        L52:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L64
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            return r0
        L5b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L52
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L64:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L6d
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L6d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository.A02(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }
}
