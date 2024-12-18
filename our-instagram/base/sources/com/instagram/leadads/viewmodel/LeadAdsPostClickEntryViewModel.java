package com.instagram.leadads.viewmodel;

import X.AbstractC07080Za;
import X.AbstractC141776au;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31177DnL;
import X.AbstractC50522MSa;
import X.AbstractC50523MSb;
import X.AbstractC52922bZ;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C152406tQ;
import X.C24721Ip;
import X.C51689MsK;
import X.C55226Oet;
import X.C57183PaJ;
import X.C69475Vny;
import X.EnumC53270Nh8;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.MSX;
import X.MSZ;
import X.OAR;
import X.OLJ;
import X.OPM;
import X.P4T;
import com.instagram.common.session.UserSession;
import com.instagram.leadads.repository.LeadFormRepository;

/* loaded from: classes9.dex */
public final class LeadAdsPostClickEntryViewModel extends AbstractC52922bZ {
    public boolean A00;
    public final C152406tQ A01;
    public final UserSession A02;
    public final OAR A03;
    public final LeadFormRepository A04;
    public final InterfaceC24731Iq A05;
    public final InterfaceC19390xP A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C05A A0A;
    public final C0UO A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public /* synthetic */ LeadAdsPostClickEntryViewModel(C152406tQ c152406tQ, UserSession userSession) {
        LeadFormRepository leadFormRepository = new LeadFormRepository(userSession);
        OAR oar = new OAR(userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = c152406tQ;
        this.A04 = leadFormRepository;
        this.A03 = oar;
        C008002u A00 = C10E.A00(P4T.A00);
        this.A07 = A00;
        this.A0B = A00;
        C24721Ip A0q = MSX.A0q();
        this.A05 = A0q;
        this.A06 = AbstractC07080Za.A03(A0q);
        this.A0C = AbstractC167007dF.A1T(AbstractC50522MSa.A0e(c152406tQ, "is_bottom_sheet_flow"));
        C008002u A1H = AbstractC25225BEi.A1H("");
        this.A0A = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(EnumC53270Nh8.A08);
        this.A08 = A1H2;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A09 = A1A;
        this.A0E = AbstractC50523MSb.A1Z(c152406tQ, "is_sensitive_vertical_ad");
        this.A0F = AbstractC50523MSb.A1Z(c152406tQ, "should_force_full_page_context_card");
        Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "is_first_question_sticker");
        this.A0D = A0e != null ? A0e.booleanValue() : false;
        AbstractC31177DnL.A1Q(this, AbstractC141776au.A00(this), 33);
        MSZ.A19(this, new C57183PaJ(this, null, 2), A1H, A1H2, A1A);
    }

    private final Object A00(OLJ olj, InterfaceC23621Ds interfaceC23621Ds) {
        Integer num;
        C55226Oet c55226Oet = C55226Oet.A00;
        UserSession userSession = this.A02;
        boolean z = this.A0E;
        boolean z2 = this.A0F;
        boolean z3 = this.A0D;
        this.A00 = c55226Oet.A0C(userSession, olj, z, z2, z3, this.A0C);
        AbstractC166997dE.A1Y(this.A09, true);
        InterfaceC24731Iq interfaceC24731Iq = this.A05;
        C152406tQ c152406tQ = this.A01;
        Boolean A0e = AbstractC50522MSa.A0e(c152406tQ, "submitted");
        if (A0e != null && A0e.booleanValue()) {
            if (OPM.A00(userSession, z)) {
                num = C05F.A0Y;
            } else {
                num = C05F.A0N;
            }
        } else {
            C69475Vny c69475Vny = olj.A00;
            if (c69475Vny.A00 != null) {
                num = C05F.A01;
            } else {
                boolean A1Z = AbstractC50523MSb.A1Z(c152406tQ, "is_pharma_vertical_ad");
                boolean A1Z2 = AbstractC50523MSb.A1Z(c152406tQ, "is_partnership_ad");
                if ((!C55226Oet.A09(olj, A1Z) && !c69475Vny.A0E && !z && !A1Z2 && !z2) || z3 || c69475Vny.A03 == null || this.A00) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0C;
                }
            }
        }
        return MSX.A0b(interfaceC24731Iq.EMz(new C51689MsK(num), interfaceC23621Ds));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r10, X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r3 = 48
            boolean r0 = X.MAH.A01(r11, r3)
            if (r0 == 0) goto L2c
            r5 = r11
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r2 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 3
            r9 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L32
            if (r0 == r9) goto L6c
            if (r0 == r6) goto L32
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2c:
            X.MAH r5 = new X.MAH
            r5.<init>(r10, r11, r3)
            goto L16
        L32:
            X.AbstractC09560e7.A00(r2)
            goto La1
        L36:
            X.AbstractC09560e7.A00(r2)
            X.6tQ r2 = r10.A01
            java.lang.String r0 = "formID"
            java.lang.String r8 = X.AbstractC50522MSa.A0h(r2, r0)
            java.lang.String r0 = "trackingToken"
            java.lang.String r7 = X.AbstractC50522MSa.A0h(r2, r0)
            java.lang.String r0 = "adID"
            java.lang.String r3 = X.AbstractC50522MSa.A0h(r2, r0)
            if (r8 == 0) goto La1
            com.instagram.leadads.repository.LeadFormRepository r2 = r10.A04
            X.OVX r0 = X.OVX.A01
            if (r12 == 0) goto L87
            java.util.concurrent.ConcurrentMap r0 = r0.A00
            r0.remove(r8)
        L5a:
            X.05A r1 = r10.A07
            X.P4T r0 = X.P4T.A00
            r1.Egh(r0)
            r5.A01 = r10
            r5.A00 = r9
            java.lang.Object r2 = r2.A01(r8, r7, r3, r5)
            if (r2 != r4) goto L73
            return r4
        L6c:
            java.lang.Object r10 = r5.A01
            com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel r10 = (com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel) r10
            X.AbstractC09560e7.A00(r2)
        L73:
            X.Pky r2 = (X.InterfaceC57832Pky) r2
            boolean r0 = r2 instanceof X.C51837Mvf
            if (r0 == 0) goto L96
            X.Mvf r2 = (X.C51837Mvf) r2
            X.OLJ r1 = r2.A00
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            java.lang.Object r0 = r10.A00(r1, r5)
            goto L93
        L87:
            X.OLJ r0 = r0.A00(r8)
            if (r0 == 0) goto L5a
            r5.A00 = r1
            java.lang.Object r0 = r10.A00(r0, r5)
        L93:
            if (r0 != r4) goto La1
            return r4
        L96:
            boolean r0 = r2 instanceof X.C51836Mve
            if (r0 == 0) goto La4
            X.05A r1 = r10.A07
            X.P4S r0 = X.P4S.A00
            r1.Egh(r0)
        La1:
            X.0eB r4 = X.C0eB.A00
            return r4
        La4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel.A01(com.instagram.leadads.viewmodel.LeadAdsPostClickEntryViewModel, X.1Ds, boolean):java.lang.Object");
    }
}
