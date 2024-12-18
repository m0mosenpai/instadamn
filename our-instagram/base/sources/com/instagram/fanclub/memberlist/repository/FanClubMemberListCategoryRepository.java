package com.instagram.fanclub.memberlist.repository;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C14360o3;
import X.C16930sl;
import X.InterfaceC06180Ui;
import X.InterfaceC13000lm;
import X.InterfaceC15070pN;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes6.dex */
public final class FanClubMemberListCategoryRepository implements InterfaceC13000lm {
    public final C05A A00;
    public final C05A A01;
    public final InterfaceC15070pN A02;
    public final C0UO A03;
    public final C0UO A04;
    public final C0UO A05;
    public final UserSession A06;
    public final FanClubApi A07;
    public final InterfaceC06180Ui A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;

    public FanClubMemberListCategoryRepository(UserSession userSession, FanClubApi fanClubApi) {
        C14360o3.A0B(userSession, 2);
        this.A07 = fanClubApi;
        this.A06 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A09 = A1H;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A00 = A0o;
        C008002u A00 = C10E.A00(null);
        this.A01 = A00;
        C008002u A1H2 = AbstractC25225BEi.A1H(0);
        this.A0A = A1H2;
        AnonymousClass057 A002 = C10M.A00(C05F.A00, 0, 0);
        this.A08 = A002;
        this.A03 = AbstractC208910l.A02(A1H);
        this.A04 = AbstractC208910l.A02(A0o);
        this.A05 = AbstractC208910l.A02(A00);
        this.A0B = AbstractC208910l.A02(A1H2);
        this.A02 = new C06160Ug(null, A002);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.FanClubCategoryType r9, X.InterfaceC23621Ds r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r3 = 8
            boolean r0 = X.MAH.A01(r10, r3)
            if (r0 == 0) goto Lb5
            r4 = r10
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb5
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L2a
            if (r0 != r5) goto Lbc
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r3 = X.C0eB.A00
        L29:
            return r3
        L2a:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r6 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r6
            X.AbstractC09560e7.A00(r1)
            goto L56
        L32:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r8.A01
            r0 = 0
            r1.Egh(r0)
            X.05A r1 = r8.A09
            java.lang.String r0 = ""
            r1.Egh(r0)
            X.05A r1 = r8.A00
            X.0sl r0 = X.C16930sl.A00
            r1.Egh(r0)
            com.instagram.fanclub.api.FanClubApi r0 = r8.A07
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r1 = r0.A01(r9, r4, r11, r12)
            if (r1 == r3) goto L29
            r6 = r8
        L56:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lac
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r7 = r1.A00
            X.3DC r7 = (X.C3DC) r7
            X.05A r1 = r6.A09
            java.lang.Object r0 = r7.F7f()
            X.E6J r0 = (X.E6J) r0
            java.lang.String r0 = r0.A01
            r1.Egh(r0)
            X.05A r1 = r6.A00
            java.lang.Object r0 = r7.F7f()
            X.E6J r0 = (X.E6J) r0
            java.util.List r0 = r0.A02
            r1.Egh(r0)
            X.05A r2 = r6.A0A
            java.lang.Object r0 = r7.F7f()
            X.E6J r0 = (X.E6J) r0
            int r1 = r0.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r2.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L92:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L27
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lc1
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r2 = r1.A00
            X.0Ui r1 = r6.A08
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L27
            return r3
        Lac:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L92
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb5:
            X.MAH r4 = new X.MAH
            r4.<init>(r8, r10, r3)
            goto L16
        Lbc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lc1:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A00(com.instagram.api.schemas.FanClubCategoryType, X.1Ds, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.user.model.User r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 28
            boolean r0 = X.MAK.A01(r8, r3)
            if (r0 == 0) goto L80
            r5 = r8
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L80
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L58
            if (r0 != r3) goto L8f
            java.lang.Object r7 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r1 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r1
            X.AbstractC09560e7.A00(r2)
        L2a:
            r4 = r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L86
            X.05A r4 = r1.A00
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r4)
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L3d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.PrT r0 = (X.InterfaceC58223PrT) r0
            X.E7i r0 = (X.E7i) r0
            com.instagram.user.model.User r0 = r0.A00
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 != 0) goto L3d
            r3.add(r1)
            goto L3d
        L58:
            X.AbstractC09560e7.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r6.A07
            X.0cb r1 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r6.A06
            com.instagram.user.model.User r0 = r1.A01(r0)
            com.instagram.api.schemas.FanClubInfoDict r0 = X.AbstractC31172DnG.A0M(r0)
            if (r0 == 0) goto L9c
            java.lang.String r1 = r0.getFanClubId()
            if (r1 == 0) goto L9c
            java.lang.String r0 = r7.getId()
            X.AbstractC31172DnG.A1V(r6, r7, r5, r3)
            java.lang.Object r2 = r2.A03(r1, r0, r5)
            if (r2 == r4) goto L9b
            r1 = r6
            goto L2a
        L80:
            X.MAK r5 = new X.MAK
            r5.<init>(r6, r8, r3)
            goto L16
        L86:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L9b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L94:
            r4.Egh(r3)
            X.3NX r4 = X.AbstractC25227BEk.A0i()
        L9b:
            return r4
        L9c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A01(com.instagram.user.model.User, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A09.Egh("");
        this.A00.Egh(C16930sl.A00);
    }
}
