package com.instagram.wellbeing.upsells.fragment.tagsettings;

import X.AbstractC166997dE;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC54114NwC;
import X.C16440rp;
import X.C54990OTy;
import X.InterfaceC19390xP;
import X.InterfaceC58094PpJ;
import X.OWU;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class TagSettingsRepository implements InterfaceC58094PpJ {
    public final UserSession A00;
    public final OWU A01;
    public final C54990OTy A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC58094PpJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ELp(X.EnumC53253Ngr r8, X.EnumC53253Ngr r9, X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r7 = this;
            r3 = 12
            boolean r0 = X.PX0.A01(r10, r3)
            if (r0 == 0) goto Lc0
            r4 = r10
            X.PX0 r4 = (X.PX0) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc0
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L82
            if (r0 != r6) goto Lcc
            boolean r11 = r4.A05
            java.lang.Object r9 = r4.A02
            X.Ngr r9 = (X.EnumC53253Ngr) r9
            java.lang.Object r4 = r4.A01
            com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository r4 = (com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository) r4
            X.AbstractC09560e7.A00(r1)
        L2e:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L79
            com.instagram.common.session.UserSession r3 = r4.A00
            com.instagram.user.model.User r2 = X.AbstractC166997dE.A0Y(r3)
            java.lang.String r1 = r9.A00
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.17P r0 = r2.A03
            r0.EPX(r1)
            r2.A0c(r3)
            if (r11 == 0) goto L71
            X.OTy r1 = r4.A02
            java.lang.Integer r0 = X.C05F.A15
            X.C54990OTy.A00(r1, r0)
        L4f:
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L53:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L68
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lc7
            if (r11 == 0) goto L69
            X.OTy r1 = r4.A02
            java.lang.Integer r0 = X.C05F.A1F
            X.C54990OTy.A00(r1, r0)
        L64:
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L68:
            return r1
        L69:
            X.OWU r1 = r4.A01
            java.lang.Integer r0 = X.C05F.A0Y
            X.OWU.A00(r1, r0)
            goto L64
        L71:
            X.OWU r1 = r4.A01
            java.lang.Integer r0 = X.C05F.A0N
            X.OWU.A00(r1, r0)
            goto L4f
        L79:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L53
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L82:
            X.AbstractC09560e7.A00(r1)
            if (r11 != 0) goto L90
            X.OWU r2 = r7.A01
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r9.A01
            r2.A02(r1, r0)
        L90:
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 0
            X.1Ms r2 = X.AbstractC167017dG.A0c(r0)
            java.lang.String r0 = "usertags/user_tagee_setting/"
            r2.A0B(r0)
            java.lang.String r1 = r9.A00
            java.lang.String r0 = "user_tagee_setting"
            r2.A9s(r0, r1)
            java.lang.Class<X.N2c> r1 = X.C52076N2c.class
            java.lang.Class<X.OPi> r0 = X.C54887OPi.class
            X.1ON r1 = X.AbstractC31172DnG.A0R(r3, r2, r1, r0, r6)
            r4.A01 = r7
            r4.A02 = r9
            r4.A05 = r11
            r4.A00 = r6
            r0 = 2008996894(0x77bedc1e, float:7.7421946E33)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto Lbd
            return r5
        Lbd:
            r4 = r7
            goto L2e
        Lc0:
            X.PX0 r4 = new X.PX0
            r4.<init>(r7, r10, r3)
            goto L16
        Lc7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lcc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.tagsettings.TagSettingsRepository.ELp(X.Ngr, X.Ngr, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC58094PpJ
    public final InterfaceC19390xP Btz() {
        Object A0h;
        String AbK = AbstractC166997dE.A0Y(this.A00).A03.AbK();
        if (AbK != null) {
            A0h = AbstractC25225BEi.A0z(AbstractC54114NwC.A00(AbK));
        } else {
            A0h = AbstractC25227BEk.A0h();
        }
        return new C16440rp(A0h);
    }

    public TagSettingsRepository(UserSession userSession, OWU owu, C54990OTy c54990OTy) {
        AbstractC167027dH.A13(userSession, owu, c54990OTy);
        this.A00 = userSession;
        this.A01 = owu;
        this.A02 = c54990OTy;
    }
}
