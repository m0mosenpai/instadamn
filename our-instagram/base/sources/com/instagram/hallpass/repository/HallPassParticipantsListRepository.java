package com.instagram.hallpass.repository;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.EnumC33351Eok;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class HallPassParticipantsListRepository extends C4A7 {
    public final UserSession A00;
    public final C0UO A01;
    public final C0UO A02;
    public final C05A A03;
    public final C05A A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallPassParticipantsListRepository(UserSession userSession) {
        super("HallPass", C4A8.A00(2133572359));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A04 = A0o;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33351Eok.A03);
        this.A03 = A1H;
        this.A02 = AbstractC208910l.A02(A0o);
        this.A01 = AbstractC208910l.A02(A1H);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r10 = this;
            r3 = 37
            boolean r0 = X.MAH.A01(r12, r3)
            if (r0 == 0) goto L90
            r4 = r12
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L76
            if (r0 != r2) goto L9f
            java.lang.Object r6 = r4.A01
            com.instagram.hallpass.repository.HallPassParticipantsListRepository r6 = (com.instagram.hallpass.repository.HallPassParticipantsListRepository) r6
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L96
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.Gat r0 = (X.InterfaceC37244Gat) r0
            X.05A r9 = r6.A04
            X.E7p r0 = (X.E7p) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r8 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r7 = r0.iterator()
        L42:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r7.next()
            X.Gas r0 = (X.InterfaceC37243Gas) r0
            X.E7o r0 = (X.E7o) r0
            java.lang.String r5 = r0.A01
            com.instagram.user.model.User r4 = r0.A00
            X.1N9 r3 = new X.1N9
            r3.<init>(r4)
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r0 = r2.userId
            boolean r0 = X.AbstractC31174DnI.A1Y(r4, r0)
            com.instagram.model.reels.Reel r1 = new com.instagram.model.reels.Reel
            r1.<init>(r3, r5, r0)
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r2)
            r0.A0X(r1)
            X.E8a r0 = new X.E8a
            r0.<init>(r1, r4)
            r8.add(r0)
            goto L42
        L76:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r10.A03
            X.Eok r0 = X.EnumC33351Eok.A04
            r1.Egh(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r10.A00
            r4.A01 = r10
            r4.A00 = r2
            java.lang.Object r1 = r1.A03(r0, r11, r4)
            if (r1 == r3) goto Lc3
            r6 = r10
            goto L28
        L90:
            X.MAH r4 = new X.MAH
            r4.<init>(r10, r12, r3)
            goto L16
        L96:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lb2
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La4:
            r9.Egh(r8)
            X.05A r1 = r6.A03
            X.Eok r0 = X.EnumC33351Eok.A05
            r1.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        Lb2:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto Lc1
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lc4
            X.05A r1 = r6.A03
            X.Eok r0 = X.EnumC33351Eok.A02
            r1.Egh(r0)
        Lc1:
            X.0eB r3 = X.C0eB.A00
        Lc3:
            return r3
        Lc4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassParticipantsListRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }
}
