package com.instagram.wellbeing.upsells.fragment.dismissnudge;

import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C16440rp;
import X.C54990OTy;
import X.EnumC53124Nec;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC58094PpJ;
import X.OWU;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class DismissNudgeRepository implements InterfaceC58094PpJ {
    public final UserSession A00;
    public final OWU A01;
    public final C54990OTy A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.EnumC53124Nec r7, X.InterfaceC23621Ds r8, boolean r9) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.MUF.A00(r8, r3)
            if (r0 == 0) goto L99
            r5 = r8
            X.MUF r5 = (X.MUF) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L99
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L6a
            if (r0 != r3) goto La5
            boolean r9 = r5.A04
            java.lang.Object r2 = r5.A01
            com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository r2 = (com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository) r2
            X.AbstractC09560e7.A00(r1)
        L2a:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L61
            if (r9 == 0) goto L59
            X.OTy r1 = r2.A02
            java.lang.Integer r0 = X.C05F.A15
            X.C54990OTy.A00(r1, r0)
        L37:
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L3b:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L50
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La0
            if (r9 == 0) goto L51
            X.OTy r1 = r2.A02
            java.lang.Integer r0 = X.C05F.A1F
            X.C54990OTy.A00(r1, r0)
        L4c:
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L50:
            return r1
        L51:
            X.OWU r1 = r2.A01
            java.lang.Integer r0 = X.C05F.A0Y
            X.OWU.A00(r1, r0)
            goto L4c
        L59:
            X.OWU r1 = r2.A01
            java.lang.Integer r0 = X.C05F.A0N
            X.OWU.A00(r1, r0)
            goto L37
        L61:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L3b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L6a:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            r2 = 0
            X.1Ms r1 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "direct_v2/toggle_inbox_nudge/"
            r1.A0B(r0)
            X.Nec r0 = X.EnumC53124Nec.A02
            if (r7 != r0) goto L7e
            r2 = 1
        L7e:
            java.lang.String r0 = "disabled"
            r1.A0I(r0, r2)
            X.1ON r1 = X.AbstractC31177DnL.A0Q(r1)
            r5.A01 = r6
            r5.A04 = r9
            r5.A00 = r3
            r0 = 2710731(0x295ccb, float:3.798543E-39)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L97
            return r4
        L97:
            r2 = r6
            goto L2a
        L99:
            X.MUF r5 = new X.MUF
            r5.<init>(r6, r8, r3)
            goto L16
        La0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.dismissnudge.DismissNudgeRepository.A00(X.Nec, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC58094PpJ
    public final InterfaceC19390xP Btz() {
        return new C16440rp(AbstractC25225BEi.A0z(EnumC53124Nec.A03));
    }

    @Override // X.InterfaceC58094PpJ
    public final /* bridge */ /* synthetic */ Object ELp(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        return A00((EnumC53124Nec) obj2, interfaceC23621Ds, z);
    }

    public DismissNudgeRepository(UserSession userSession, OWU owu, C54990OTy c54990OTy) {
        AbstractC167027dH.A13(userSession, owu, c54990OTy);
        this.A00 = userSession;
        this.A01 = owu;
        this.A02 = c54990OTy;
    }
}
