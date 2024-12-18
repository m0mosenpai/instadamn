package com.instagram.monetization.repository;

import X.AbstractC23021Ah;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C23031Ai;
import X.EnumC63312uC;
import X.InterfaceC13000lm;
import com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.userpay.api.UserPayApi;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class MonetizationRepository implements InterfaceC13000lm {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final UserSession A07;
    public final MonetizationApi A08;
    public final C23031Ai A09;
    public final UserPayApi A0A;
    public final C05A A0E;
    public final C0UO A0F;
    public final HashMap A0D = new HashMap();
    public final HashMap A0B = new HashMap();
    public final HashMap A0G = new HashMap();
    public final HashMap A0C = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r1 != true) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.C104384n4 r9) {
        /*
            r8 = this;
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            com.instagram.api.schemas.UserMonetizationProductType r4 = r9.A07
            java.lang.String r0 = r4.A00
            com.instagram.api.schemas.UserMonetizationProductType r7 = X.AbstractC104314mu.A00(r0)
            boolean r0 = r9.A09
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r8.A0D
            r0.put(r7, r1)
            boolean r1 = r9.A08
            r6 = 0
            r5 = 1
            r0 = 0
            if (r1 != r5) goto L1f
            r0 = 1
        L1f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r8.A0C
            r0.put(r7, r1)
            com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct r2 = r9.A04
            com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct r1 = com.instagram.api.schemas.HasOnboardedCreatorMonetizationProduct.A04
            r0 = 0
            if (r2 != r1) goto L30
            r0 = 1
        L30:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r0 = r8.A0B
            r0.put(r7, r1)
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r3 = r9.A02
            com.instagram.api.schemas.CanUseCreatorMonetizationProduct r2 = com.instagram.api.schemas.CanUseCreatorMonetizationProduct.A05
            r0 = 0
            if (r3 != r2) goto L41
            r0 = 1
        L41:
            r8.A02(r7, r0)
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0C
            if (r7 != r0) goto L56
            X.4u1 r0 = r9.A03
            if (r0 == 0) goto L53
            X.H3H r0 = (X.H3H) r0
            boolean r1 = r0.A00
            r0 = 1
            if (r1 == r5) goto L54
        L53:
            r0 = 0
        L54:
            r8.A06 = r0
        L56:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A08
            if (r7 != r0) goto L6c
            X.4n3 r0 = r9.A01
            if (r0 == 0) goto L6a
            X.4n2 r0 = (X.C104364n2) r0
            java.lang.Boolean r1 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r6 = X.C14360o3.A0K(r1, r0)
        L6a:
            r8.A05 = r6
        L6c:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0D
            if (r4 != r0) goto L9a
            if (r3 != r2) goto L97
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.A05
        L74:
            java.lang.String r0 = r0.A00
            r8.A03 = r0
            X.GzT r1 = r9.A00
            if (r1 == 0) goto L82
            java.lang.Object r0 = r1.A00
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto L84
        L82:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.A04
        L84:
            java.lang.String r0 = r0.A00
            r8.A02 = r0
            if (r1 == 0) goto L90
            java.lang.Object r0 = r1.A02
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto L92
        L90:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.A04
        L92:
            java.lang.String r0 = r0.A00
            r8.A01 = r0
        L96:
            return
        L97:
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.A07
            goto L74
        L9a:
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.A0G
            if (r4 != r0) goto L96
            if (r3 != r2) goto Lb7
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.A05
        La2:
            java.lang.String r0 = r0.A00
            r8.A04 = r0
            X.GzT r0 = r9.A00
            if (r0 == 0) goto Lb0
            java.lang.Object r0 = r0.A03
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = (com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting) r0
            if (r0 != 0) goto Lb2
        Lb0:
            com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting r0 = com.instagram.api.schemas.IGTVAccountLevelMonetizationToggleSetting.A04
        Lb2:
            java.lang.String r0 = r0.A00
            r8.A00 = r0
            return
        Lb7:
            com.instagram.api.schemas.MonetizationEligibilityDecision r0 = com.instagram.api.schemas.MonetizationEligibilityDecision.A07
            goto La2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.repository.MonetizationRepository.A01(X.4n4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.api.schemas.UserMonetizationProductType r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 39
            boolean r0 = X.C9CY.A00(r9, r3)
            if (r0 == 0) goto L61
            r6 = r9
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r2 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 == r3) goto L2a
            if (r0 != r4) goto L67
            X.AbstractC09560e7.A00(r2)
        L27:
            X.0eB r5 = X.C0eB.A00
            return r5
        L2a:
            java.lang.Object r3 = r6.A01
            com.instagram.monetization.repository.MonetizationRepository r3 = (com.instagram.monetization.repository.MonetizationRepository) r3
            X.AbstractC09560e7.A00(r2)
            goto L49
        L32:
            X.AbstractC09560e7.A00(r2)
            com.instagram.monetization.api.MonetizationApi r1 = r7.A08
            java.lang.String r0 = r8.A00
            r6.A01 = r7
            r6.A00 = r3
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r0)
            X.MWG r2 = r1.A01(r0)
            r3 = r7
        L49:
            X.0xP r2 = (X.InterfaceC19390xP) r2
            X.M9Y r1 = new X.M9Y
            r1.<init>(r3)
            r0 = 0
            r6.A01 = r0
            r6.A00 = r4
            com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2 r0 = new com.instagram.monetization.repository.MonetizationRepository$fetchProductEligibility$$inlined$map$1$2
            r0.<init>(r3, r1)
            java.lang.Object r0 = r2.collect(r0, r6)
            if (r0 != r5) goto L27
            return r5
        L61:
            X.9CY r6 = new X.9CY
            r6.<init>(r7, r9, r3)
            goto L16
        L67:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.repository.MonetizationRepository.A00(com.instagram.api.schemas.UserMonetizationProductType, X.1Ds):java.lang.Object");
    }

    public final boolean A03(UserMonetizationProductType userMonetizationProductType) {
        return C14360o3.A0K(this.A0G.get(userMonetizationProductType), true);
    }

    public final boolean A04(UserMonetizationProductType userMonetizationProductType) {
        return C14360o3.A0K(this.A0B.get(userMonetizationProductType), true);
    }

    public final boolean A05(UserMonetizationProductType userMonetizationProductType) {
        return C14360o3.A0K(this.A0C.get(userMonetizationProductType), true);
    }

    public final boolean A06(UserMonetizationProductType userMonetizationProductType) {
        return C14360o3.A0K(this.A0D.get(userMonetizationProductType), true);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A0D.clear();
    }

    public MonetizationRepository(UserSession userSession) {
        this.A07 = userSession;
        this.A09 = AbstractC23021Ah.A00(userSession);
        this.A08 = new MonetizationApi(userSession);
        this.A0A = new UserPayApi(userSession);
        C008002u c008002u = new C008002u(EnumC63312uC.A06);
        this.A0E = c008002u;
        this.A0F = c008002u;
        String str = IGTVAccountLevelMonetizationToggleSetting.A04.A00;
        this.A02 = str;
        this.A01 = str;
        this.A00 = str;
        this.A03 = "not_eligible";
        this.A04 = "not_eligible";
    }

    public final void A02(UserMonetizationProductType userMonetizationProductType, boolean z) {
        this.A0G.put(userMonetizationProductType, Boolean.valueOf(z));
    }
}
