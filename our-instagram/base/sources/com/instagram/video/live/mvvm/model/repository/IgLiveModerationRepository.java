package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC07080Za;
import X.AbstractC166987dD;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C1Df;
import X.C24721Ip;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import X.MSY;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi;

/* loaded from: classes9.dex */
public final class IgLiveModerationRepository {
    public C1Df A00;
    public final UserSession A01;
    public final IgLiveModerationApi A02;
    public final InterfaceC24731Iq A03;
    public final InterfaceC19390xP A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;

    public /* synthetic */ IgLiveModerationRepository(UserSession userSession) {
        IgLiveModerationApi igLiveModerationApi = new IgLiveModerationApi(userSession);
        this.A01 = userSession;
        this.A02 = igLiveModerationApi;
        C008002u A1H = AbstractC25225BEi.A1H(AbstractC166987dD.A1E());
        this.A07 = A1H;
        this.A0A = AbstractC208910l.A02(A1H);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        this.A08 = AbstractC208910l.A02(A1A);
        C008002u A0u = MSY.A0u(0);
        this.A06 = A0u;
        this.A09 = AbstractC208910l.A02(A0u);
        C24721Ip A12 = AbstractC25229BEm.A12();
        this.A03 = A12;
        this.A04 = AbstractC07080Za.A03(A12);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 23
            boolean r0 = X.C57146PWy.A01(r9, r3)
            if (r0 == 0) goto L65
            r5 = r9
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L44
            if (r0 != r2) goto L87
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r1
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L3b
            X.3NX r4 = X.AbstractC25235BEs.A0f(r2)
        L32:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L6b
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            return r0
        L3b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L32
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L44:
            X.AbstractC09560e7.A00(r4)
            X.05A r1 = r6.A06
            int r0 = X.MSZ.A0A(r1)
            int r0 = r0 + 1
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r1.Egh(r0)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r6.A02
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r0.A00(r7, r8, r5)
            if (r4 != r3) goto L63
            return r3
        L63:
            r1 = r6
            goto L28
        L65:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r9, r3)
            goto L16
        L6b:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L82
            X.05A r1 = r1.A06
            int r0 = X.MSZ.A0A(r1)
            int r0 = r0 - r2
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r1.Egh(r0)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0a()
            return r0
        L82:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L87:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 8
            boolean r0 = X.C57147PWz.A02(r9, r3)
            if (r0 == 0) goto L67
            r5 = r9
            X.PWz r5 = (X.C57147PWz) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 == r1) goto L2a
            if (r0 != r3) goto L6d
            X.AbstractC09560e7.A00(r2)
        L27:
            X.0eB r4 = X.C0eB.A00
        L29:
            return r4
        L2a:
            java.lang.Object r8 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r1 = (com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository) r1
            X.AbstractC09560e7.A00(r2)
            goto L43
        L34:
            X.AbstractC09560e7.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r6.A02
            X.C57147PWz.A00(r6, r8, r5, r1)
            java.lang.Object r2 = r0.A01(r7, r8, r5)
            if (r2 == r4) goto L29
            r1 = r6
        L43:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L5e
            X.05A r2 = r1.A07
            java.util.List r1 = X.MSW.A1A(r2)
            r1.add(r8)
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L27
            return r4
        L5e:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L27
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L67:
            X.PWz r5 = new X.PWz
            r5.<init>(r6, r9, r3)
            goto L16
        L6d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A01(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
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
    public final java.lang.Object A02(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 26
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L4e
            r4 = r8
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
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A03(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L4e:
            X.PX4 r4 = X.PX4.A00(r5, r8, r3)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A02(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
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
    public final java.lang.Object A03(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 27
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
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveModerationApi r0 = r5.A02
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository.A03(java.lang.String, X.1Ds):java.lang.Object");
    }
}
