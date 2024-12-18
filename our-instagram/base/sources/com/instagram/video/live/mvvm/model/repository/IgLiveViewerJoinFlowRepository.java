package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC208910l;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.MSZ;
import X.NYC;
import X.NYM;
import X.Ou1;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;

/* loaded from: classes9.dex */
public final class IgLiveViewerJoinFlowRepository {
    public Ou1 A00;
    public NYC A01;
    public final UserSession A02;
    public final IgLiveJoinRequestsApi A03;
    public final C05A A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;

    public final void A04() {
        Ou1 ou1 = this.A00;
        if (ou1 != null) {
            AbstractC25651Mw.A00(this.A02).A02(ou1, NYM.class);
            this.A00 = null;
        }
    }

    public /* synthetic */ IgLiveViewerJoinFlowRepository(UserSession userSession) {
        IgLiveJoinRequestsApi igLiveJoinRequestsApi = new IgLiveJoinRequestsApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = igLiveJoinRequestsApi;
        C008002u A0y = MSZ.A0y();
        this.A04 = A0y;
        this.A06 = AbstractC208910l.A02(A0y);
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A05 = A0z;
        this.A07 = AbstractC208910l.A02(A0z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r5, java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 26
            boolean r0 = X.C57146PWy.A01(r7, r3)
            if (r0 == 0) goto L4a
            r4 = r7
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 != r1) goto L50
            java.lang.Object r5 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r5
            X.AbstractC09560e7.A00(r3)
        L28:
            X.05A r0 = r5.A04
            X.AbstractC43594JPz.A1T(r0)
            X.0eB r2 = X.C0eB.A00
            return r2
        L30:
            X.AbstractC09560e7.A00(r3)
            X.05A r0 = r5.A04
            boolean r0 = X.AbstractC31176DnK.A1b(r0)
            if (r0 == 0) goto L28
            if (r6 == 0) goto L28
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r0 = r5.A03
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = r0.A00(r6, r4)
            if (r0 != r2) goto L28
            return r2
        L4a:
            X.PWy r4 = new X.PWy
            r4.<init>(r5, r7, r3)
            goto L16
        L50:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A00(com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r6, java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r5 = this;
            r3 = 32
            boolean r0 = X.MAP.A02(r9, r3)
            if (r0 == 0) goto L7c
            r4 = r9
            X.MAP r4 = (X.MAP) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A05
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L57
            if (r0 != r2) goto L82
            java.lang.Object r8 = r4.A04
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r4.A03
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r4.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r3
            X.AbstractC09560e7.A00(r1)
        L34:
            if (r7 == 0) goto L42
            X.05A r2 = r3.A05
            java.lang.Integer r1 = X.C05F.A01
            X.NYX r0 = new X.NYX
            r0.<init>(r1, r6, r7, r8)
            r2.Egh(r0)
        L42:
            X.NYS r2 = new X.NYS
            r2.<init>(r3, r6)
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1My r1 = X.AbstractC25651Mw.A00(r0)
            java.lang.Class<X.NYJ> r0 = X.NYJ.class
            r1.A01(r2, r0)
            r3.A01 = r2
        L54:
            X.0eB r3 = X.C0eB.A00
        L56:
            return r3
        L57:
            X.AbstractC09560e7.A00(r1)
            X.NYC r1 = r5.A01
            r0 = 0
            if (r1 == 0) goto L7a
            java.lang.String r1 = r1.A00
        L61:
            boolean r1 = X.C14360o3.A0K(r1, r6)
            if (r1 != 0) goto L54
            X.NYC r1 = r5.A01
            if (r1 == 0) goto L6d
            java.lang.String r0 = r1.A00
        L6d:
            r4.A01 = r5
            X.MAP.A00(r6, r7, r8, r4, r2)
            java.lang.Object r0 = r5.A02(r0, r4)
            if (r0 == r3) goto L56
            r3 = r5
            goto L34
        L7a:
            r1 = r0
            goto L61
        L7c:
            X.MAP r4 = new X.MAP
            r4.<init>(r5, r9, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A01(java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 27
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L55
            r5 = r8
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L5b
            java.lang.Object r0 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r0 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r0
            X.AbstractC09560e7.A00(r1)
        L28:
            X.05A r1 = r0.A05
            r0 = 0
            r1.Egh(r0)
            X.0eB r4 = X.C0eB.A00
        L30:
            return r4
        L31:
            X.AbstractC09560e7.A00(r1)
            X.NYC r2 = r6.A01
            if (r2 == 0) goto L46
            com.instagram.common.session.UserSession r0 = r6.A02
            X.1My r1 = X.AbstractC25651Mw.A00(r0)
            java.lang.Class<X.NYJ> r0 = X.NYJ.class
            r1.A02(r2, r0)
            r0 = 0
            r6.A01 = r0
        L46:
            r6.A04()
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = A00(r6, r7, r5)
            if (r0 == r4) goto L30
            r0 = r6
            goto L28
        L55:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r8, r3)
            goto L16
        L5b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A02(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 28
            boolean r0 = X.C57146PWy.A01(r9, r3)
            if (r0 == 0) goto Lb5
            r5 = r9
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb5
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r3 = r5.A02
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L80
            if (r0 != r4) goto Ld3
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository) r1
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            r2 = 0
            if (r0 == 0) goto L77
            X.05A r1 = r1.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r1.Egh(r0)
            X.0e4 r0 = X.AbstractC166987dD.A1L(r0, r2)
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L40:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L6a
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lce
            X.5If r1 = X.MSX.A0E(r3)
            boolean r0 = r1 instanceof X.C115115Ig
            if (r0 == 0) goto L75
            X.5Ig r1 = (X.C115115Ig) r1
            if (r1 == 0) goto L75
            java.lang.Object r0 = r1.A00
            X.1up r0 = (X.InterfaceC40821up) r0
        L58:
            java.lang.Boolean r1 = X.AbstractC166997dE.A0a()
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.getErrorMessage()
        L62:
            X.0e4 r0 = X.AbstractC166987dD.A1L(r1, r0)
            X.8jk r3 = X.AbstractC43592JPx.A0p(r0)
        L6a:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto Lbc
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            return r0
        L73:
            r0 = r2
            goto L62
        L75:
            r0 = r2
            goto L58
        L77:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L80:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r0 = r7.A03
            r5.A01 = r7
            r5.A00 = r4
            com.instagram.common.session.UserSession r1 = r0.A00
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            r3 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r8}
            java.lang.String r0 = "live/%s/request_to_join/"
            r2.A0L(r0, r1)
            java.lang.Class<X.N2e> r1 = X.C52078N2e.class
            java.lang.Class<X.OQN> r0 = X.OQN.class
            r2.A0P(r3, r1, r0, r4)
            X.1ON r1 = X.AbstractC31172DnG.A0U(r2, r4)
            r0 = 1424430875(0x54e7171b, float:7.9402007E12)
            java.lang.Object r3 = r1.A00(r0, r5)
            if (r3 != r6) goto Lb2
            return r6
        Lb2:
            r1 = r7
            goto L28
        Lb5:
            X.PWy r5 = new X.PWy
            r5.<init>(r7, r9, r3)
            goto L16
        Lbc:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lc9
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            X.0e4 r0 = X.AbstractC166987dD.A1L(r0, r2)
            return r0
        Lc9:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lce:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Ld3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository.A03(java.lang.String, X.1Ds):java.lang.Object");
    }
}
