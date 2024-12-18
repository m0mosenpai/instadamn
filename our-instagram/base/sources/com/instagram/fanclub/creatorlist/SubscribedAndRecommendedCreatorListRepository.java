package com.instagram.fanclub.creatorlist;

import X.AbstractC208910l;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C10M;
import X.C14360o3;
import X.EnumC33349Eoi;
import X.InterfaceC06180Ui;
import X.InterfaceC15070pN;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes6.dex */
public final class SubscribedAndRecommendedCreatorListRepository {
    public EnumC33349Eoi A00;
    public EnumC33349Eoi A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final UserSession A06;
    public final FanClubApi A07;
    public final InterfaceC06180Ui A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final InterfaceC15070pN A0D;
    public final C0UO A0E;
    public final C0UO A0F;
    public final C0UO A0G;
    public final C0UO A0H;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r3 = 0
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto La8
            r4 = r7
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L94
            if (r0 != r2) goto Lb4
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.AbstractC09560e7.A00(r3)
        L27:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L8b
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r4 = r3.A00
            X.3DC r4 = (X.C3DC) r4
            X.05A r3 = r5.A09
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L3f
            X.0sl r1 = X.C16930sl.A00
        L3f:
            java.lang.Object r0 = r4.F7f()
            X.E6D r0 = (X.E6D) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r0, r1)
            r3.Egh(r0)
            java.lang.Object r0 = r4.F7f()
            X.E6D r0 = (X.E6D) r0
            java.lang.String r0 = r0.A00
            r5.A02 = r0
            java.lang.Object r0 = r4.F7f()
            X.E6D r0 = (X.E6D) r0
            boolean r0 = r0.A02
            r5.A04 = r0
            X.Eoi r0 = X.EnumC33349Eoi.A03
            r5.A00 = r0
            X.3NX r3 = X.AbstractC25227BEk.A0i()
        L6a:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L88
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Laf
            X.05A r1 = r5.A09
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L7c
            X.0sl r0 = X.C16930sl.A00
        L7c:
            r1.Egh(r0)
            X.Eoi r0 = X.EnumC33349Eoi.A02
            r5.A00 = r0
            X.05A r0 = r5.A0C
            X.AbstractC166997dE.A1Y(r0, r2)
        L88:
            X.0eB r1 = X.C0eB.A00
            return r1
        L8b:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L6a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L94:
            X.AbstractC09560e7.A00(r3)
            X.Eoi r0 = X.EnumC33349Eoi.A05
            r5.A00 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A0C(r6, r4)
            if (r3 != r1) goto L27
            return r1
        La8:
            X.MAH r4 = new X.MAH
            r4.<init>(r5, r7, r3)
            goto L15
        Laf:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r2 = 1
            boolean r0 = X.MAH.A01(r7, r2)
            if (r0 == 0) goto La7
            r4 = r7
            X.MAH r4 = (X.MAH) r4
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La7
            int r3 = r3 - r1
            r4.A00 = r3
        L15:
            java.lang.Object r3 = r4.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            if (r0 == 0) goto L93
            if (r0 != r2) goto Lb3
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.AbstractC09560e7.A00(r3)
        L26:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L8a
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r4 = r3.A00
            X.3DC r4 = (X.C3DC) r4
            X.05A r3 = r5.A0A
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L3e
            X.0sl r1 = X.C16930sl.A00
        L3e:
            java.lang.Object r0 = r4.F7f()
            X.E6C r0 = (X.E6C) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r0, r1)
            r3.Egh(r0)
            java.lang.Object r0 = r4.F7f()
            X.E6C r0 = (X.E6C) r0
            java.lang.String r0 = r0.A00
            r5.A03 = r0
            java.lang.Object r0 = r4.F7f()
            X.E6C r0 = (X.E6C) r0
            boolean r0 = r0.A02
            r5.A05 = r0
            X.Eoi r0 = X.EnumC33349Eoi.A03
            r5.A01 = r0
            X.3NX r3 = X.AbstractC25227BEk.A0i()
        L69:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L87
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto Lae
            X.05A r1 = r5.A0A
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L7b
            X.0sl r0 = X.C16930sl.A00
        L7b:
            r1.Egh(r0)
            X.Eoi r0 = X.EnumC33349Eoi.A02
            r5.A01 = r0
            X.05A r0 = r5.A0C
            X.AbstractC166997dE.A1Y(r0, r2)
        L87:
            X.0eB r1 = X.C0eB.A00
            return r1
        L8a:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L69
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L93:
            X.AbstractC09560e7.A00(r3)
            X.Eoi r0 = X.EnumC33349Eoi.A05
            r5.A01 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A0B(r6, r4)
            if (r3 != r1) goto L26
            return r1
        La7:
            X.MAH r4 = new X.MAH
            r4.<init>(r5, r7, r2)
            goto L15
        Lae:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb3:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r6) {
        /*
            r5 = this;
            r3 = 2
            boolean r0 = X.MAH.A01(r6, r3)
            if (r0 == 0) goto L5d
            r4 = r6
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto L63
            java.lang.Object r1 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r1 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r1
            X.AbstractC09560e7.A00(r3)
        L27:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L43
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.3DC r0 = (X.C3DC) r0
            X.05A r1 = r1.A0B
            java.lang.Object r0 = r0.F7f()
            X.E5n r0 = (X.C32035E5n) r0
            java.util.List r0 = r0.A00
            r1.Egh(r0)
        L40:
            X.0eB r2 = X.C0eB.A00
        L42:
            return r2
        L43:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4c:
            X.AbstractC09560e7.A00(r3)
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A0Q(r4)
            if (r3 == r2) goto L42
            r1 = r5
            goto L27
        L5d:
            X.MAH r4 = new X.MAH
            r4.<init>(r5, r6, r3)
            goto L15
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r3.A00 != X.EnumC33349Eoi.A05) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        if (r7.A01 == X.EnumC33349Eoi.A05) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 3
            boolean r0 = X.MAH.A01(r8, r3)
            if (r0 == 0) goto L85
            r5 = r8
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r6 = 2
            r0 = 1
            if (r1 == 0) goto L33
            if (r1 == r0) goto L59
            if (r1 != r6) goto L8b
            java.lang.Object r3 = r5.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.AbstractC09560e7.A00(r2)
        L2a:
            X.05A r1 = r3.A0C
            r0 = 0
            X.AbstractC166997dE.A1Y(r1, r0)
            X.0eB r4 = X.C0eB.A00
            return r4
        L33:
            X.AbstractC09560e7.A00(r2)
            r5.A01 = r7
            r5.A00 = r0
            boolean r0 = r7.A05
            if (r0 == 0) goto L45
            X.Eoi r1 = r7.A01
            X.Eoi r0 = X.EnumC33349Eoi.A05
            r2 = 1
            if (r1 != r0) goto L46
        L45:
            r2 = 0
        L46:
            X.Eoi r1 = r7.A01
            X.Eoi r0 = X.EnumC33349Eoi.A04
            if (r1 == r0) goto L4e
            if (r2 == 0) goto L57
        L4e:
            java.lang.String r0 = r7.A03
            java.lang.Object r0 = A01(r7, r0, r5)
            if (r0 != r4) goto L57
            return r4
        L57:
            r3 = r7
            goto L60
        L59:
            java.lang.Object r3 = r5.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.AbstractC09560e7.A00(r2)
        L60:
            r5.A01 = r3
            r5.A00 = r6
            boolean r0 = r3.A05
            if (r0 != 0) goto L73
            boolean r0 = r3.A04
            if (r0 == 0) goto L73
            X.Eoi r1 = r3.A00
            X.Eoi r0 = X.EnumC33349Eoi.A05
            r2 = 1
            if (r1 != r0) goto L74
        L73:
            r2 = 0
        L74:
            X.Eoi r1 = r3.A00
            X.Eoi r0 = X.EnumC33349Eoi.A04
            if (r1 == r0) goto L7c
            if (r2 == 0) goto L2a
        L7c:
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = A00(r3, r0, r5)
            if (r0 != r4) goto L2a
            return r4
        L85:
            X.MAH r5 = new X.MAH
            r5.<init>(r7, r8, r3)
            goto L15
        L8b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A03(X.1Ds):java.lang.Object");
    }

    public /* synthetic */ SubscribedAndRecommendedCreatorListRepository(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A07 = fanClubApi;
        C008002u A00 = C10E.A00(null);
        this.A0A = A00;
        this.A05 = true;
        EnumC33349Eoi enumC33349Eoi = EnumC33349Eoi.A04;
        this.A01 = enumC33349Eoi;
        C008002u A002 = C10E.A00(null);
        this.A09 = A002;
        this.A04 = true;
        this.A00 = enumC33349Eoi;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0B = A0o;
        this.A0F = AbstractC208910l.A02(A00);
        this.A0E = AbstractC208910l.A02(A002);
        this.A0G = AbstractC208910l.A02(A0o);
        AnonymousClass057 A003 = C10M.A00(C05F.A00, 1, 0);
        this.A08 = A003;
        this.A0D = new C06160Ug(null, A003);
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0C = A1A;
        this.A0H = AbstractC208910l.A02(A1A);
        A003.F8m(C0eB.A00);
    }
}
