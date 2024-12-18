package com.instagram.fanclub.memberlist.repository;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AnonymousClass057;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06160Ug;
import X.C0UO;
import X.C10E;
import X.C10M;
import X.C16930sl;
import X.InterfaceC06180Ui;
import X.InterfaceC13000lm;
import X.InterfaceC15070pN;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes6.dex */
public final class CreatorMessagingSelectionScreenRepository implements InterfaceC13000lm {
    public final C0UO A00;
    public final C0UO A01;
    public final C0UO A02;
    public final C0UO A03;
    public final C0UO A04;
    public final FanClubApi A05;
    public final String A06;
    public final InterfaceC06180Ui A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final InterfaceC15070pN A0E;
    public final C0UO A0F;
    public final boolean A0G;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r9, java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r8 = this;
            r3 = 7
            boolean r0 = X.MAH.A01(r11, r3)
            if (r0 == 0) goto Lb0
            r4 = r11
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L45
            if (r0 != r5) goto Lb7
            X.AbstractC09560e7.A00(r1)
        L26:
            X.0eB r3 = X.C0eB.A00
        L28:
            return r3
        L29:
            X.AbstractC09560e7.A00(r1)
            if (r9 != 0) goto L35
            X.05A r1 = r8.A0D
            X.0sl r0 = X.C16930sl.A00
            r1.Egh(r0)
        L35:
            com.instagram.fanclub.api.FanClubApi r1 = r8.A05
            boolean r0 = r8.A0G
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r1 = r1.A07(r9, r10, r4, r0)
            if (r1 == r3) goto L28
            r6 = r8
            goto L4c
        L45:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r6 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r6
            X.AbstractC09560e7.A00(r1)
        L4c:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La7
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r7 = r1.A00
            X.3DC r7 = (X.C3DC) r7
            X.05A r2 = r6.A0D
            java.lang.Object r1 = r2.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r7.F7f()
            X.E6K r0 = (X.E6K) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r0, r1)
            r2.Egh(r0)
            X.05A r1 = r6.A0B
            java.lang.Object r0 = r7.F7f()
            X.E6K r0 = (X.E6K) r0
            java.lang.String r0 = r0.A00
            r1.Egh(r0)
            X.05A r1 = r6.A0A
            java.lang.Object r0 = r7.F7f()
            X.E6K r0 = (X.E6K) r0
            boolean r0 = r0.A02
            X.AbstractC166997dE.A1Y(r1, r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L8d:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L26
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lbc
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r2 = r1.A00
            X.0Ui r1 = r6.A07
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L26
            return r3
        La7:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L8d
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb0:
            X.MAH r4 = new X.MAH
            r4.<init>(r8, r11, r3)
            goto L15
        Lb7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lbc:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 5
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L60
            r5 = r7
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L4c
            if (r0 != r3) goto L66
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r1 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r1
            X.AbstractC09560e7.A00(r2)
        L27:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L43
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.3DC r0 = (X.C3DC) r0
            X.05A r1 = r1.A08
            java.lang.Object r0 = r0.F7f()
            X.E5m r0 = (X.C32034E5m) r0
            java.util.List r0 = r0.A00
            r1.Egh(r0)
        L40:
            X.0eB r4 = X.C0eB.A00
        L42:
            return r4
        L43:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L40
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4c:
            X.AbstractC09560e7.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r6.A05
            r1 = 0
            boolean r0 = r6.A0G
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r2 = r2.A0T(r5, r1, r0)
            if (r2 == r4) goto L42
            r1 = r6
            goto L27
        L60:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r7, r3)
            goto L15
        L66:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r13) {
        /*
            r12 = this;
            r3 = 6
            boolean r0 = X.MAH.A01(r13, r3)
            if (r0 == 0) goto L99
            r4 = r13
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r2 = r4.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L80
            if (r0 != r6) goto La0
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r5 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r5
            X.AbstractC09560e7.A00(r2)
        L27:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L77
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.R0o r0 = (X.C60488R0o) r0
            if (r0 == 0) goto L75
            X.R0n r0 = r0.A0E()
            if (r0 == 0) goto L75
            X.R0m r0 = r0.A0E()
            if (r0 == 0) goto L75
            X.R0l r4 = r0.A0E()
        L45:
            X.05A r3 = r5.A0C
            r1 = 0
            if (r4 == 0) goto L73
            X.QgL r2 = r4.A0E()
            if (r2 == 0) goto L73
            java.lang.String r0 = "count"
            int r2 = r2.getCoercedIntField(r1, r0)
        L56:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r3.Egh(r0)
            X.05A r2 = r5.A09
            if (r4 == 0) goto L68
            java.lang.String r0 = "connected_member_count"
            int r1 = r4.A00(r0)
        L68:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r2.Egh(r0)
        L70:
            X.0eB r1 = X.C0eB.A00
        L72:
            return r1
        L73:
            r2 = 0
            goto L56
        L75:
            r4 = 0
            goto L45
        L77:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L70
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L80:
            X.AbstractC09560e7.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r12.A05
            java.lang.String r3 = r12.A06
            r4.A01 = r12
            r4.A00 = r6
            r5 = 0
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            java.lang.Object r2 = r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == r1) goto L72
            r5 = r12
            goto L27
        L99:
            X.MAH r4 = new X.MAH
            r4.<init>(r12, r13, r3)
            goto L15
        La0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A02(X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C05A c05a = this.A08;
        C16930sl c16930sl = C16930sl.A00;
        c05a.Egh(c16930sl);
        this.A0D.Egh(c16930sl);
        this.A0B.Egh(null);
        AbstractC166997dE.A1Y(this.A0A, true);
    }

    public CreatorMessagingSelectionScreenRepository(FanClubApi fanClubApi, String str, boolean z) {
        boolean A1V = AbstractC167007dF.A1V(str);
        this.A05 = fanClubApi;
        this.A06 = str;
        this.A0G = z;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A08 = A00;
        C008002u A1H = AbstractC25225BEi.A1H(0);
        this.A0C = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(0);
        this.A09 = A1H2;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0D = A002;
        C008002u A003 = C10E.A00(null);
        this.A0B = A003;
        C008002u A1A = AbstractC25235BEs.A1A(A1V);
        this.A0A = A1A;
        AnonymousClass057 A004 = C10M.A00(C05F.A00, 0, 0);
        this.A07 = A004;
        this.A00 = AbstractC208910l.A02(A00);
        this.A0F = AbstractC208910l.A02(A1H);
        this.A01 = AbstractC208910l.A02(A1H2);
        this.A04 = AbstractC208910l.A02(A002);
        this.A03 = AbstractC208910l.A02(A003);
        this.A02 = AbstractC208910l.A02(A1A);
        this.A0E = new C06160Ug(null, A004);
    }
}
