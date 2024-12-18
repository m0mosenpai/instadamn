package com.instagram.brandedcontent.disclosure;

import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.C008002u;
import X.C05A;
import X.C14360o3;
import X.C2GT;
import X.C51675Ms6;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.brandedcontent.ads.repository.BrandedContentAdsApi;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class BrandedContentDisclosureMenuViewModel extends BrandedContentDisclosureBaseViewModel {
    public C51675Ms6 A00;
    public C51675Ms6 A01;
    public boolean A02;
    public boolean A03;
    public final C2GT A04;
    public final UserSession A05;
    public final C05A A06;
    public final BrandedContentAdsApi A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandedContentDisclosureMenuViewModel(BrandedContentAdsApi brandedContentAdsApi, UserSession userSession) {
        super(brandedContentAdsApi, userSession);
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A07 = brandedContentAdsApi;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A06 = A0o;
        this.A04 = AbstractC31172DnG.A0E(A0o);
    }

    public static final BrandedContentProjectMetadata A01(BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel) {
        C51675Ms6 c51675Ms6 = brandedContentDisclosureMenuViewModel.A01;
        if (c51675Ms6 != null) {
            BrandedContentProjectAction brandedContentProjectAction = BrandedContentProjectAction.A04;
            String str = c51675Ms6.A05;
            String str2 = c51675Ms6.A01;
            String str3 = c51675Ms6.A02;
            String str4 = c51675Ms6.A06;
            return new BrandedContentProjectMetadata(null, brandedContentProjectAction, null, str2, str3, c51675Ms6.A03, c51675Ms6.A04, str, str4);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A09(X.InterfaceC23621Ds r17) {
        /*
            r16 = this;
            r4 = 10
            r5 = r17
            boolean r0 = X.MAG.A01(r5, r4)
            r3 = r16
            if (r0 == 0) goto Lc3
            r14 = r5
            X.MAG r14 = (X.MAG) r14
            int r2 = r14.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc3
            int r2 = r2 - r1
            r14.A00 = r2
        L1a:
            java.lang.Object r4 = r14.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r14.A00
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L83
            if (r0 != r1) goto Lcf
            java.lang.Object r3 = r14.A01
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r3 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r3
            X.AbstractC09560e7.A00(r4)
        L2d:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L7a
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.N3N r0 = (X.N3N) r0
            com.instagram.common.session.UserSession r2 = r3.A05
            X.1DX r1 = X.C1DW.A00(r2)
            X.1qM r0 = r0.A00()
            r1.A03(r0)
            java.lang.String r0 = r3.A04
            if (r0 == 0) goto L53
            X.1qM r0 = X.AbstractC25229BEm.A0h(r2, r0)
            if (r0 == 0) goto L53
            r0.AEH(r2)
        L53:
            X.6aw r2 = X.AbstractC141776au.A00(r3)
            r1 = 19
            X.MC3 r0 = new X.MC3
            r0.<init>(r3, r5, r1)
            X.1Dx r0 = X.AbstractC25226BEj.A1L(r0, r2)
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L66:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L77
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto Lca
            X.6aw r1 = X.AbstractC141776au.A00(r3)
            r0 = 20
            X.MSY.A1M(r3, r1, r0)
        L77:
            X.0eB r2 = X.C0eB.A00
            return r2
        L7a:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L66
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L83:
            X.AbstractC09560e7.A00(r4)
            X.Ms6 r0 = r3.A01
            if (r0 == 0) goto Lad
            com.instagram.api.schemas.BrandedContentProjectMetadata r4 = A01(r3)
        L8e:
            com.instagram.common.session.UserSession r0 = r3.A05
            com.instagram.brandedcontent.repository.BrandedContentApi r8 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r8.<init>(r0)
            java.lang.String r11 = r3.A04
            if (r11 == 0) goto Ld4
            java.util.List r12 = r3.A07
            java.util.List r13 = r3.A06
            boolean r15 = r3.A0E
            com.instagram.api.schemas.BrandedContentGatingInfo r9 = r3.A01
            r14.A01 = r3
            r14.A00 = r1
            r10 = r4
            java.lang.Object r4 = r8.A01(r9, r10, r11, r12, r13, r14, r15)
            if (r4 != r2) goto L2d
            return r2
        Lad:
            X.Ms6 r0 = r3.A00
            if (r0 == 0) goto Lc1
            com.instagram.api.schemas.BrandedContentProjectAction r6 = com.instagram.api.schemas.BrandedContentProjectAction.A06
            java.lang.String r12 = r0.A05
            com.instagram.api.schemas.BrandedContentProjectMetadata r4 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            r13 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L8e
        Lc1:
            r4 = r5
            goto L8e
        Lc3:
            X.MAG r14 = new X.MAG
            r14.<init>(r3, r5, r4)
            goto L1a
        Lca:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lcf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Ld4:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel.A09(X.1Ds):java.lang.Object");
    }
}
