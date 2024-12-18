package com.instagram.video.live.mvvm.model.repository;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C16930sl;
import X.MSY;
import X.OBD;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class IgLiveJoinRequestsRepository {
    public static final long A0D = TimeUnit.SECONDS.toMillis(3);
    public int A00;
    public long A01;
    public final IgLiveJoinRequestsApi A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX A01(java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 4
            boolean r0 = X.C57147PWz.A02(r9, r3)
            if (r0 == 0) goto L54
            r6 = r9
            X.PWz r6 = (X.C57147PWz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4f
            if (r0 == r3) goto L38
            if (r0 != r4) goto L5a
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r2
            X.AbstractC09560e7.A00(r1)
        L2e:
            X.C57147PWz.A00(r2, r8, r6, r3)
            java.lang.Object r0 = A00(r2, r8, r6)
            if (r0 != r5) goto L43
            return r5
        L38:
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r2 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r2
            X.AbstractC09560e7.A00(r1)
        L43:
            long r0 = com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository.A0D
            X.C57147PWz.A00(r2, r8, r6, r4)
            java.lang.Object r0 = X.AbstractC89993zf.A01(r6, r0)
            if (r0 != r5) goto L2e
            return r5
        L4f:
            X.AbstractC09560e7.A00(r1)
            r2 = r7
            goto L2e
        L54:
            X.PWz r6 = new X.PWz
            r6.<init>(r7, r9, r3)
            goto L15
        L5a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository.A01(java.lang.String, X.1Ds):X.1JX");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0084 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1JX A02(java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r3 = 5
            boolean r0 = X.C57147PWz.A02(r11, r3)
            if (r0 == 0) goto L8c
            r6 = r11
            X.PWz r6 = (X.C57147PWz) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r1 = r6.A03
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L87
            if (r0 == r4) goto L70
            if (r0 != r5) goto L92
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r3
            X.AbstractC09560e7.A00(r1)
        L2e:
            X.C57147PWz.A00(r3, r10, r6, r4)
            if (r10 == 0) goto L7b
            java.lang.String r0 = "0"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L7b
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r0 = r3.A02
            com.instagram.common.session.UserSession r0 = r0.A00
            r8 = 0
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r10}
            java.lang.String r0 = "live/%s/get_join_requests/"
            r2.A0L(r0, r1)
            java.lang.Class<X.7ex> r1 = X.C168027ex.class
            java.lang.Class<X.7ey> r0 = X.C168037ey.class
            X.1ON r2 = X.AbstractC31172DnG.A0R(r8, r2, r1, r0, r4)
            r1 = 225191002(0xd6c245a, float:7.276687E-31)
            r0 = 3
            X.02x r2 = r2.A04(r1, r0)
            r0 = 59
            X.MWC r1 = X.MWC.A00(r3, r0)
            r0 = 58
            X.MWC r0 = X.MWC.A00(r1, r0)
            java.lang.Object r0 = r2.collect(r0, r6)
            if (r0 != r7) goto L7b
            return r7
        L70:
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r3 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r3
            X.AbstractC09560e7.A00(r1)
        L7b:
            long r0 = com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository.A0D
            X.C57147PWz.A00(r3, r10, r6, r5)
            java.lang.Object r0 = X.AbstractC89993zf.A01(r6, r0)
            if (r0 != r7) goto L2e
            return r7
        L87:
            X.AbstractC09560e7.A00(r1)
            r3 = r9
            goto L2e
        L8c:
            X.PWz r6 = new X.PWz
            r6.<init>(r9, r11, r3)
            goto L15
        L92:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository.A02(java.lang.String, X.1Ds):X.1JX");
    }

    public /* synthetic */ IgLiveJoinRequestsRepository(UserSession userSession) {
        this.A02 = new IgLiveJoinRequestsApi(userSession);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A03 = A00;
        this.A08 = AbstractC208910l.A02(A00);
        C008002u A1A = AbstractC25235BEs.A1A(true);
        this.A04 = A1A;
        this.A09 = AbstractC208910l.A02(A1A);
        C008002u A0u = MSY.A0u(0);
        this.A07 = A0u;
        this.A0C = AbstractC208910l.A02(A0u);
        C008002u A1H = AbstractC25225BEi.A1H(new OBD(0, false, c16930sl));
        this.A06 = A1H;
        this.A0B = AbstractC208910l.A02(A1H);
        C008002u A002 = C10E.A00(c16930sl);
        this.A05 = A002;
        this.A0A = AbstractC208910l.A02(A002);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 22
            boolean r0 = X.C57146PWy.A01(r11, r3)
            if (r0 == 0) goto Lcc
            r5 = r11
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcc
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r3 = r5.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r5.A00
            r1 = 1
            if (r0 == 0) goto Laf
            if (r0 != r1) goto Ld3
            java.lang.Object r9 = r5.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository r9 = (com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository) r9
            X.AbstractC09560e7.A00(r3)
        L28:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto La6
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r5 = r3.A00
            X.N3B r5 = (X.N3B) r5
            long r2 = r5.A02
            r9.A01 = r2
            int r0 = r5.A00
            r9.A00 = r0
            X.05A r2 = r9.A07
            int r0 = r5.A01
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r2.Egh(r0)
            int r7 = r5.A00
            java.util.ArrayList r0 = r5.A03
            java.util.List r6 = X.MSY.A0l(r0)
            r4 = 1
            r3 = 0
            X.05A r2 = r9.A06
            if (r7 >= r1) goto L78
            X.0sl r1 = X.C16930sl.A00
            X.OBD r0 = new X.OBD
            r0.<init>(r3, r3, r1)
        L5c:
            r2.Egh(r0)
            X.05A r1 = r9.A03
            java.util.ArrayList r0 = r5.A03
            java.util.List r0 = X.MSY.A0l(r0)
            X.3NX r3 = X.AbstractC43593JPy.A0m(r0, r1)
        L6b:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto Ld8
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto Ld8
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L78:
            java.lang.Object r0 = r2.getValue()
            X.OBD r0 = (X.OBD) r0
            int r0 = r0.A00
            if (r7 > r0) goto L9e
            java.lang.Object r0 = r2.getValue()
            X.OBD r0 = (X.OBD) r0
            int r0 = r0.A00
            if (r7 != r0) goto La4
            java.lang.Object r1 = r6.get(r3)
            java.lang.Object r0 = r2.getValue()
            X.OBD r0 = (X.OBD) r0
            java.util.List r0 = r0.A01
            java.lang.Object r0 = r0.get(r3)
            if (r1 == r0) goto La4
        L9e:
            X.OBD r0 = new X.OBD
            r0.<init>(r7, r4, r6)
            goto L5c
        La4:
            r4 = 0
            goto L9e
        La6:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L6b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Laf:
            X.AbstractC09560e7.A00(r3)
            java.lang.String r0 = "0"
            r4 = r10
            boolean r0 = X.C14360o3.A0K(r10, r0)
            if (r0 != 0) goto Ld8
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveJoinRequestsApi r3 = r9.A02
            long r7 = r9.A01
            int r6 = r9.A00
            r5.A01 = r9
            r5.A00 = r1
            java.lang.Object r3 = r3.A01(r4, r5, r6, r7)
            if (r3 != r2) goto L28
            return r2
        Lcc:
            X.PWy r5 = new X.PWy
            r5.<init>(r9, r11, r3)
            goto L16
        Ld3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Ld8:
            X.0eB r2 = X.C0eB.A00
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository.A00(com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository, java.lang.String, X.1Ds):java.lang.Object");
    }
}
