package com.instagram.brandedcontent.repository;

import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.AbstractC31173DnH;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C2DS;
import X.C40701ud;
import X.C41761wQ;
import X.C48253LXc;
import X.C50526MSf;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.monetization.api.MonetizationApi;

/* loaded from: classes8.dex */
public final class BrandedContentSettingsRepository {
    public final BrandedContentProjectRepository A00;
    public final C48253LXc A01;
    public final BrandedContentApi A02;
    public final C41761wQ A03 = AbstractC31173DnH.A0S();
    public final C2DS A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final C40701ud A0E;
    public final MonetizationApi A0F;
    public final C05A A0G;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r6, X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.MAS.A03(r7, r3)
            if (r0 == 0) goto L43
            r4 = r7
            X.MAS r4 = (X.MAS) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L48
            X.AbstractC09560e7.A00(r1)
        L24:
            boolean r0 = r1 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2b:
            X.AbstractC09560e7.A00(r1)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r1.<init>(r6)
            if (r8 == 0) goto L40
            java.lang.String r0 = "opted_in"
        L37:
            r4.A00 = r2
            java.lang.Object r1 = r1.A08(r0, r4)
            if (r1 != r3) goto L24
            return r3
        L40:
            java.lang.String r0 = "not_opted_in"
            goto L37
        L43:
            X.MAS r4 = X.MAS.A00(r5, r7, r3)
            goto L16
        L48:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A00(com.instagram.common.session.UserSession, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.util.List r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 14
            boolean r0 = X.MAG.A01(r10, r3)
            if (r0 == 0) goto L74
            r5 = r10
            X.MAG r5 = (X.MAG) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 == r7) goto L53
            if (r0 != r6) goto L7a
            X.AbstractC09560e7.A00(r1)
        L27:
            X.0eB r4 = X.C0eB.A00
            return r4
        L2a:
            X.AbstractC09560e7.A00(r1)
            com.instagram.monetization.api.MonetizationApi r3 = r8.A0F
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r9)
            java.util.Iterator r1 = r9.iterator()
        L37:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.UserMonetizationProductType r0 = (com.instagram.api.schemas.UserMonetizationProductType) r0
            java.lang.String r0 = r0.A00
            r2.add(r0)
            goto L37
        L49:
            r5.A01 = r8
            r5.A00 = r7
            X.MWG r1 = r3.A01(r2)
            r3 = r8
            goto L58
        L53:
            java.lang.Object r3 = r5.A01
            X.AbstractC09560e7.A00(r1)
        L58:
            X.MZP r0 = new X.MZP
            r0.<init>(r1, r7)
            X.0py r2 = new X.0py
            r2.<init>(r0)
            r0 = 4
            X.M9e r1 = new X.M9e
            r1.<init>(r3, r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L27
            return r4
        L74:
            X.MAG r5 = new X.MAG
            r5.<init>(r8, r10, r3)
            goto L16
        L7a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A01(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r2.getCoercedBooleanField(0, "eligible_to_onboard") != true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r2.getCoercedBooleanField(1, "onboarded_and_eligible") != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r3 = r6.A0G;
        r2 = new X.C50526MSf(r4, r1, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r18) {
        /*
            r17 = this;
            r5 = 13
            r6 = r18
            boolean r0 = X.MAG.A01(r6, r5)
            r4 = r17
            if (r0 == 0) goto Lb1
            r3 = r6
            X.MAG r3 = (X.MAG) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r7 = r3.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L78
            if (r0 != r1) goto Lbd
            java.lang.Object r6 = r3.A01
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r6 = (com.instagram.brandedcontent.repository.BrandedContentSettingsRepository) r6
            X.AbstractC09560e7.A00(r7)
        L2c:
            X.3NY r7 = (X.C3NY) r7
            boolean r0 = r7 instanceof X.C3NX
            r2 = 0
            r5 = 0
            if (r0 == 0) goto L6b
            X.2JS r4 = X.AbstractC25232BEp.A18(r7)
            if (r4 == 0) goto L50
            java.lang.Class<X.QYC> r3 = X.QYC.class
            java.lang.String r2 = "xfb_is_user_eligible_for_creator_dynamic_ads"
            r0 = -1918912611(0xffffffff8d9fb79d, float:-9.843335E-31)
            X.2JS r2 = r4.getOptionalTreeField(r5, r2, r3, r0)
            if (r2 == 0) goto L50
            java.lang.String r0 = "eligible_to_onboard"
            boolean r0 = r2.getCoercedBooleanField(r5, r0)
            r4 = 1
            if (r0 == r1) goto L53
        L50:
            r4 = 0
            if (r2 == 0) goto L69
        L53:
            java.lang.String r0 = "onboarded_and_eligible"
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            if (r0 != r1) goto L69
        L5b:
            X.05A r3 = r6.A0G
            r0 = 3
            X.MSf r2 = new X.MSf
            r2.<init>(r4, r1, r0)
        L63:
            r3.Egh(r2)
            X.0eB r2 = X.C0eB.A00
        L68:
            return r2
        L69:
            r1 = 0
            goto L5b
        L6b:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 == 0) goto Lb8
            X.05A r3 = r6.A0G
            r0 = 3
            X.MSf r2 = new X.MSf
            r2.<init>(r0, r0, r5)
            goto L63
        L78:
            X.AbstractC09560e7.A00(r7)
            r12 = 0
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r6 = X.AbstractC25225BEi.A0c()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.QYD> r10 = X.QYD.class
            java.util.ArrayList r16 = X.AbstractC166987dD.A1E()
            java.lang.String r7 = "IGCreatorDynamicAdsEligibility"
            r11 = 0
            java.lang.String r15 = "xfb_is_user_eligible_for_creator_dynamic_ads"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1ud r0 = r4.A0E
            r3.A01 = r4
            r3.A00 = r1
            java.lang.Object r7 = r0.A04(r5, r3)
            if (r7 == r2) goto L68
            r6 = r4
            goto L2c
        Lb1:
            X.MAG r3 = new X.MAG
            r3.<init>(r4, r6, r5)
            goto L1a
        Lb8:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbd:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r6 = this;
            r3 = 10
            boolean r0 = X.MAS.A03(r7, r3)
            if (r0 == 0) goto L57
            r5 = r7
            X.MAS r5 = (X.MAS) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r2 = r5.A00
            r1 = 1
            if (r2 == 0) goto L2b
            if (r2 != r1) goto L5c
            X.AbstractC09560e7.A00(r0)
        L24:
            boolean r0 = r0 instanceof X.C3NX
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2b:
            X.AbstractC09560e7.A00(r0)
            com.instagram.brandedcontent.repository.BrandedContentApi r0 = r6.A02
            r5.A00 = r1
            if (r8 == 0) goto L54
            java.lang.String r1 = "business/branded_content/onboard_creator_to_creator_marketplace/"
        L36:
            com.instagram.common.session.UserSession r0 = r0.A00
            r3 = 19346664(0x12734e8, float:3.0711014E-38)
            X.1Ms r2 = new X.1Ms
            r2.<init>(r0, r3)
            r2.A05()
            r2.A0E = r1
            java.lang.Class<X.1ul> r1 = X.C40781ul.class
            java.lang.Class<X.2hA> r0 = X.C55702hA.class
            X.1ON r0 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            java.lang.Object r0 = r0.A00(r3, r5)
            if (r0 != r4) goto L24
            return r4
        L54:
            java.lang.String r1 = "business/branded_content/offboard_creator_from_creator_marketplace/"
            goto L36
        L57:
            X.MAS r5 = X.MAS.A00(r6, r7, r3)
            goto L16
        L5c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.repository.BrandedContentSettingsRepository.A03(X.1Ds, boolean):java.lang.Object");
    }

    public BrandedContentSettingsRepository(BrandedContentProjectRepository brandedContentProjectRepository, C48253LXc c48253LXc, BrandedContentApi brandedContentApi, C2DS c2ds, C40701ud c40701ud, MonetizationApi monetizationApi) {
        this.A0F = monetizationApi;
        this.A02 = brandedContentApi;
        this.A04 = c2ds;
        this.A00 = brandedContentProjectRepository;
        this.A01 = c48253LXc;
        this.A0E = c40701ud;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A07 = A0o;
        this.A0D = A0o;
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A06 = A0z;
        this.A0C = A0z;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        this.A0B = A1A;
        C008002u A1H = AbstractC25225BEi.A1H(new C50526MSf(3, 3, false));
        this.A0G = A1H;
        this.A08 = A1H;
        this.A0A = brandedContentProjectRepository.A02;
        this.A09 = c48253LXc.A05;
    }
}
