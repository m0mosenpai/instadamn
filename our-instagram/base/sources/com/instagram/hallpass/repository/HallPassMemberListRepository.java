package com.instagram.hallpass.repository;

import X.AbstractC208910l;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.EnumC33350Eoj;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class HallPassMemberListRepository extends C4A7 {
    public final C05A A00;
    public final C05A A01;
    public final C0UO A02;
    public final C0UO A03;
    public final C0UO A04;
    public final C0UO A05;
    public final UserSession A06;
    public final C05A A07;
    public final C05A A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HallPassMemberListRepository(UserSession userSession) {
        super("HallPass", C4A8.A00(214706031));
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A00 = A0o;
        C008002u A00 = C10E.A00(null);
        this.A08 = A00;
        C008002u A1H = AbstractC25225BEi.A1H(EnumC33350Eoj.A03);
        this.A07 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H("");
        this.A01 = A1H2;
        this.A04 = AbstractC208910l.A02(A0o);
        this.A03 = AbstractC208910l.A02(A00);
        this.A02 = AbstractC208910l.A02(A1H);
        this.A05 = AbstractC208910l.A02(A1H2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 36
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L84
            r4 = r7
            X.MAH r4 = (X.MAH) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L84
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L6a
            if (r0 != r2) goto L8f
            java.lang.Object r3 = r4.A01
            com.instagram.hallpass.repository.HallPassMemberListRepository r3 = (com.instagram.hallpass.repository.HallPassMemberListRepository) r3
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L61
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r2 = r1.A00
            X.PrY r2 = (X.InterfaceC58228PrY) r2
            X.05A r1 = r3.A00
            X.E7n r2 = (X.E7n) r2
            java.util.List r0 = r2.A01
            r1.Egh(r0)
            X.05A r1 = r3.A08
            com.instagram.user.model.User r0 = r2.A00
            r1.Egh(r0)
            X.05A r1 = r3.A07
            X.Eoj r0 = X.EnumC33350Eoj.A05
            r1.Egh(r0)
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L4f:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L5e
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L8a
            X.05A r1 = r3.A07
            X.Eoj r0 = X.EnumC33350Eoj.A02
            r1.Egh(r0)
        L5e:
            X.0eB r3 = X.C0eB.A00
        L60:
            return r3
        L61:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L4f
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6a:
            X.AbstractC09560e7.A00(r1)
            X.05A r1 = r5.A07
            X.Eoj r0 = X.EnumC33350Eoj.A04
            r1.Egh(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r0, r6, r4)
            if (r1 == r3) goto L60
            r3 = r5
            goto L28
        L84:
            X.MAH r4 = new X.MAH
            r4.<init>(r5, r7, r3)
            goto L16
        L8a:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassMemberListRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }
}
