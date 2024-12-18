package com.instagram.wellbeing.upsells.fragment.remixsettings;

import X.AbstractC167017dG;
import X.AbstractC1807880g;
import X.AbstractC25227BEk;
import X.AbstractC31177DnL;
import X.C172887n0;
import X.C25621Ms;
import X.C52093N2t;
import X.C54990OTy;
import X.C57154PYy;
import X.D4r;
import X.EnumC39589Hdz;
import X.InterfaceC11380iw;
import X.InterfaceC19390xP;
import X.InterfaceC58094PpJ;
import X.MSZ;
import X.OLM;
import X.OOE;
import X.OWU;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class RemixSettingsRepository implements InterfaceC58094PpJ {
    public final EnumC39589Hdz A00;
    public final OLM A01;
    public final String A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final OWU A05;
    public final C54990OTy A06;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // X.InterfaceC58094PpJ
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ELp(X.EnumC53222NgK r8, X.EnumC53222NgK r9, X.InterfaceC23621Ds r10, boolean r11) {
        /*
            r7 = this;
            r4 = 10
            boolean r0 = X.MUF.A00(r10, r4)
            if (r0 == 0) goto Lb8
            r3 = r10
            X.MUF r3 = (X.MUF) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb8
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L6a
            if (r0 != r5) goto Lc4
            boolean r11 = r3.A04
            java.lang.Object r2 = r3.A01
            com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository r2 = (com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository) r2
            X.AbstractC09560e7.A00(r1)
        L2a:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L61
            if (r11 == 0) goto L59
            X.OTy r1 = r2.A06
            java.lang.Integer r0 = X.C05F.A15
            X.C54990OTy.A00(r1, r0)
        L37:
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L3b:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L50
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lbf
            if (r11 == 0) goto L51
            X.OTy r1 = r2.A06
            java.lang.Integer r0 = X.C05F.A1F
            X.C54990OTy.A00(r1, r0)
        L4c:
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L50:
            return r1
        L51:
            X.OWU r1 = r2.A05
            java.lang.Integer r0 = X.C05F.A0Y
            X.OWU.A00(r1, r0)
            goto L4c
        L59:
            X.OWU r1 = r2.A05
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
            if (r11 != 0) goto L7c
            X.OWU r2 = r7.A05
            java.lang.String r1 = r8.name()
            java.lang.String r0 = r9.name()
            r2.A02(r1, r0)
        L7c:
            int r6 = r9.A00
            com.instagram.common.session.UserSession r2 = r7.A04
            X.0iw r0 = r7.A03
            java.lang.String r1 = r0.getModuleName()
            r0 = 2
            X.C14360o3.A0B(r1, r0)
            X.1Ms r2 = X.AbstractC167017dG.A0c(r2)
            java.lang.String r0 = "clips/user/set_mashups_allowed_type/"
            r2.A0B(r0)
            java.lang.String r0 = "mashups_allowed_type"
            r2.A0D(r0, r6)
            java.lang.String r0 = "container_module"
            r2.A9s(r0, r1)
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            X.1ON r1 = X.AbstractC31175DnJ.A0D(r2, r1, r0, r5)
            r3.A01 = r7
            r3.A04 = r11
            r3.A00 = r5
            r0 = 1588772734(0x5eb2bf7e, float:6.440076E18)
            java.lang.Object r1 = r1.A00(r0, r3)
            if (r1 != r4) goto Lb5
            return r4
        Lb5:
            r2 = r7
            goto L2a
        Lb8:
            X.MUF r3 = new X.MUF
            r3.<init>(r7, r10, r4)
            goto L16
        Lbf:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lc4:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.upsells.fragment.remixsettings.RemixSettingsRepository.ELp(X.NgK, X.NgK, X.1Ds, boolean):java.lang.Object");
    }

    @Override // X.InterfaceC58094PpJ
    public final InterfaceC19390xP Btz() {
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A04);
        A0M.A0B("clips/user/privacy_setting_type/");
        return new C172887n0(new D4r(this, null, 3), AbstractC1807880g.A00(new C57154PYy(this, null, 9), AbstractC25227BEk.A0e(A0M, C52093N2t.class, OOE.class).A04(1213026850, 3)));
    }

    public RemixSettingsRepository(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC39589Hdz enumC39589Hdz, OWU owu, OLM olm, C54990OTy c54990OTy, String str) {
        MSZ.A1O(userSession, olm);
        AbstractC167017dG.A1U(c54990OTy, interfaceC11380iw);
        this.A04 = userSession;
        this.A02 = str;
        this.A00 = enumC39589Hdz;
        this.A01 = olm;
        this.A05 = owu;
        this.A06 = c54990OTy;
        this.A03 = interfaceC11380iw;
    }
}
