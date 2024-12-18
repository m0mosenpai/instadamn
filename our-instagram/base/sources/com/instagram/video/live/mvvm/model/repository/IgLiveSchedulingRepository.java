package com.instagram.video.live.mvvm.model.repository;

import X.C14360o3;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi;

/* loaded from: classes9.dex */
public final class IgLiveSchedulingRepository {
    public final UserSession A00;
    public final IgLiveSchedulingApi A01;

    public /* synthetic */ IgLiveSchedulingRepository(UserSession userSession) {
        IgLiveSchedulingApi igLiveSchedulingApi = new IgLiveSchedulingApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = igLiveSchedulingApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C3PO r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r8 = this;
            r3 = 34
            boolean r0 = X.PX4.A02(r13, r3)
            if (r0 == 0) goto L56
            r7 = r13
            X.PX4 r7 = (X.PX4) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r3 = r7.A01
            X.1JX r0 = X.C1JX.A02
            int r2 = r7.A00
            r1 = 1
            if (r2 == 0) goto L44
            if (r2 != r1) goto L66
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L32:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L5b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L3b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r2 = r8.A01
            r7.A00 = r1
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            java.lang.Object r3 = r2.A00(r3, r4, r5, r6, r7)
            if (r3 != r0) goto L24
            return r0
        L56:
            X.PX4 r7 = X.PX4.A00(r8, r13, r3)
            goto L16
        L5b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L61
            r0 = 0
            return r0
        L61:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A00(X.3PO, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.C3PO r6, java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r5 = this;
            r3 = 32
            boolean r0 = X.PX4.A02(r9, r3)
            if (r0 == 0) goto L52
            r4 = r9
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L44
            if (r0 != r2) goto L62
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L32:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L57
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            return r1
        L3b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r3 = r0.A01(r6, r7, r8, r4)
            if (r3 != r1) goto L24
            return r1
        L52:
            X.PX4 r4 = X.PX4.A00(r5, r9, r3)
            goto L16
        L57:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L5d
            r1 = 0
            return r1
        L5d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L62:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A01(X.3PO, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 33
            boolean r0 = X.PX4.A02(r7, r3)
            if (r0 == 0) goto L4e
            r4 = r7
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L61
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L37
            X.3NX r3 = X.AbstractC25235BEs.A0f(r1)
        L2e:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L53
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L37:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L2e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L40:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L24
            return r2
        L4e:
            X.PX4 r4 = X.PX4.A00(r5, r7, r3)
            goto L16
        L53:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L5c
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L5c:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 35
            boolean r0 = X.PX4.A02(r6, r3)
            if (r0 == 0) goto L5e
            r4 = r6
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L50
            if (r0 != r2) goto L6e
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L47
            java.lang.Object r0 = X.AbstractC43594JPz.A0r(r3)
            X.4n5 r0 = (X.C104394n5) r0
            java.util.List r0 = r0.A00
            java.lang.Object r0 = X.AbstractC001800i.A0I(r0)
            X.4n4 r0 = (X.C104384n4) r0
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r0 = r0.A02
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L3e:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L63
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r1 = r3.A00
            return r1
        L47:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L3e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L50:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveSchedulingApi r0 = r5.A01
            r4.A00 = r2
            java.lang.Object r3 = r0.A03(r4)
            if (r3 != r1) goto L24
            return r1
        L5e:
            X.PX4 r4 = X.PX4.A00(r5, r6, r3)
            goto L16
        L63:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L69
            r1 = 0
            return r1
        L69:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository.A03(X.1Ds):java.lang.Object");
    }
}
