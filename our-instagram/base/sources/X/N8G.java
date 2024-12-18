package X;

import android.os.Bundle;
import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes9.dex */
public final class N8G extends AbstractC52114N4m {
    public static final String __redex_internal_original_name = "BrandedContentAddBrandPartnersFragment";
    public BrandedContentGatingInfoIntf A00;
    public InterfaceC58026PoC A01;
    public C64842wi A02;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C64752wZ A0B;
    public List A06 = AbstractC166987dD.A1E();
    public List A05 = AbstractC166987dD.A1E();
    public List A04 = AbstractC166987dD.A1E();
    public String A03 = "feed";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00eb, code lost:
    
        if (r0 != false) goto L10;
     */
    @Override // X.AbstractC52114N4m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            r8 = this;
            r2 = 0
            X.C14360o3.A0B(r9, r2)
            super.onViewCreated(r9, r10)
            java.lang.String r0 = r8.A03
            java.lang.String r7 = "live"
            boolean r0 = X.C14360o3.A0K(r0, r7)
            if (r0 == 0) goto L1a
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r8.A02
            if (r1 == 0) goto Lee
            r0 = 8
            r1.setVisibility(r0)
        L1a:
            r0 = 2131427510(0x7f0b00b6, float:1.8476638E38)
            android.view.ViewStub r0 = X.AbstractC167007dF.A0M(r9, r0)
            android.view.View r4 = r0.inflate()
            r0 = 2131427564(0x7f0b00ec, float:1.8476748E38)
            android.widget.TextView r3 = X.AbstractC167007dF.A0N(r4, r0)
            android.content.Context r1 = r4.getContext()
            r0 = 2131952336(0x7f1302d0, float:1.9541112E38)
            X.AbstractC31173DnH.A12(r1, r3, r0)
            r0 = 2131427517(0x7f0b00bd, float:1.8476652E38)
            android.view.View r1 = r4.requireViewById(r0)
            r0 = 37
            X.ViewOnClickListenerC55467OkM.A00(r1, r0, r8)
            r0 = 38
            X.OkM r1 = new X.OkM
            r1.<init>(r8, r0)
            r0 = 2131427520(0x7f0b00c0, float:1.8476659E38)
            android.view.View r0 = X.AbstractC166997dE.A0S(r4, r0)
            X.C0fQ.A00(r1, r0)
            X.1Xa r6 = X.AbstractC54912fq.A00()
            X.0do r5 = r8.A09
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r5)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r3 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0C
            X.2fr r1 = X.AbstractC31175DnJ.A0S()
            X.P6y r0 = new X.P6y
            r0.<init>(r8, r2)
            r1.A00 = r0
            X.P74 r0 = X.P74.A00
            r1.A08 = r0
            X.2wi r1 = X.AbstractC31175DnJ.A0T(r8, r4, r1, r6, r3)
            r8.A02 = r1
            com.instagram.quickpromotion.intf.Trigger r0 = com.instagram.quickpromotion.intf.Trigger.A0F
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            X.C14360o3.A07(r0)
            r1.AVr(r0)
            java.lang.String r1 = r8.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3230752: goto Lc6;
                case 3322092: goto Ld0;
                case 3496474: goto Ld8;
                case 109770997: goto Le2;
                default: goto L89;
            }
        L89:
            r4 = 2131954162(0x7f1309f2, float:1.9544815E38)
        L8c:
            android.widget.TextView r0 = r8.A04()
            r0.setVisibility(r2)
            android.widget.TextView r3 = r8.A04()
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r5)
            java.lang.String r0 = "BrandedContentAddBrandPartnersFragment"
            android.text.SpannableStringBuilder r0 = X.AbstractC55199Oe9.A02(r2, r1, r0, r4)
            r3.setText(r0)
            android.widget.TextView r0 = r8.A04()
            X.AbstractC25227BEk.A11(r0)
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r8.A08()
            X.AbstractC31171DnF.A1M(r0)
            X.2k6 r3 = X.AbstractC25235BEs.A0S(r8)
            r2 = 0
            r1 = 36
            X.MCJ r0 = new X.MCJ
            r0.<init>(r8, r2, r1)
            X.AbstractC166987dD.A1Z(r0, r3)
            return
        Lc6:
            java.lang.String r0 = "igtv"
            boolean r0 = r1.equals(r0)
            r4 = 2131954163(0x7f1309f3, float:1.9544817E38)
            goto Leb
        Ld0:
            boolean r0 = r1.equals(r7)
            r4 = 2131954164(0x7f1309f4, float:1.954482E38)
            goto Leb
        Ld8:
            java.lang.String r0 = "reel"
            boolean r0 = r1.equals(r0)
            r4 = 2131954165(0x7f1309f5, float:1.9544822E38)
            goto Leb
        Le2:
            java.lang.String r0 = "story"
            boolean r0 = r1.equals(r0)
            r4 = 2131954166(0x7f1309f6, float:1.9544824E38)
        Leb:
            if (r0 != 0) goto L8c
            goto L89
        Lee:
            java.lang.String r0 = "inlineSearchBox"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8G.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C65954Twz A00(N8G n8g, User user) {
        C65954Twz c65954Twz;
        EnumC99704do enumC99704do;
        int i;
        if (C4A4.A02(AbstractC166987dD.A0r(((AbstractC52114N4m) n8g).A09))) {
            return new C65954Twz();
        }
        if (n8g.A04.contains(user)) {
            if (user.A03.AcS() != BrandedContentBrandTaggingRequestApprovalStatus.A07 && !user.A1s()) {
                c65954Twz = new C65954Twz();
                i = 2131969455;
            } else {
                c65954Twz = new C65954Twz();
                i = 2131952460;
            }
            AbstractC50523MSb.A1J(c65954Twz, i);
            enumC99704do = EnumC99704do.A06;
        } else {
            c65954Twz = new C65954Twz();
            AbstractC50523MSb.A1J(c65954Twz, 2131952265);
            enumC99704do = EnumC99704do.A03;
        }
        c65954Twz.A03 = enumC99704do;
        return c65954Twz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019f, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0079, code lost:
    
        if (r0 != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.N8G r6, com.instagram.user.model.User r7) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8G.A02(X.N8G, com.instagram.user.model.User):void");
    }

    private final void A03(User user, boolean z) {
        String str;
        if (z) {
            str = "added";
        } else {
            str = "removed";
        }
        InterfaceC09390do interfaceC09390do = super.A09;
        LL0.A04(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0D, AbstractC166987dD.A0r(interfaceC09390do).userId, AbstractC25232BEp.A1F("has_brand_approval", String.valueOf(user.A1s()), AbstractC166987dD.A1L("brand_id", user.getId()), AbstractC166987dD.A1L("action_type", str)));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2wZ, java.lang.Object] */
    public N8G() {
        AbstractC54912fq.A00();
        this.A0B = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r6.A03.AcS() == com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.A07) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.NKm, X.MZs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.N8G r18) {
        /*
            java.util.ArrayList r8 = X.AbstractC166987dD.A1E()
            r3 = r18
            java.util.List r0 = r3.A04
            java.util.Iterator r7 = r0.iterator()
        Lc:
            boolean r0 = r7.hasNext()
            r12 = 0
            if (r0 == 0) goto L4d
            com.instagram.user.model.User r6 = X.AbstractC25226BEj.A15(r7)
            boolean r0 = r6.A1s()
            if (r0 != 0) goto L28
            X.17P r0 = r6.A03
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.AcS()
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.A07
            r5 = 1
            if (r1 != r0) goto L29
        L28:
            r5 = 0
        L29:
            java.util.List r0 = r3.A04
            int r1 = r0.size()
            if (r1 <= 0) goto L44
            r0 = 2
            if (r1 > r0) goto L44
            X.0do r0 = r3.A09
            com.instagram.common.session.UserSession r4 = X.AbstractC166987dD.A0r(r0)
            java.lang.String r2 = r3.A03
            boolean r1 = r3.A09
            boolean r0 = r3.A08
            boolean r12 = X.AbstractC172137li.A06(r4, r2, r1, r0)
        L44:
            com.instagram.pendingmedia.model.BrandedContentTag r0 = new com.instagram.pendingmedia.model.BrandedContentTag
            r0.<init>(r6, r12, r5)
            r8.add(r0)
            goto Lc
        L4d:
            boolean r0 = r3.A07
            if (r0 != 0) goto Lc3
            boolean r0 = r3.A09
            if (r0 != 0) goto Lc3
            java.lang.String r1 = r3.A03
            int r0 = r1.hashCode()
            switch(r0) {
                case 3138974: goto L5f;
                case 3230752: goto L8f;
                case 3322092: goto L92;
                case 3496474: goto L95;
                case 109770997: goto L98;
                default: goto L5e;
            }
        L5e:
            return
        L5f:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
            X.0do r0 = r3.A09
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r0)
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r13 = r3.A00
            if (r13 != 0) goto L7e
            r14 = 0
            com.instagram.api.schemas.BrandedContentGatingInfo r13 = new com.instagram.api.schemas.BrandedContentGatingInfo
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            r13.<init>(r14, r15, r16, r17, r18)
        L7e:
            java.lang.String r1 = "branded_content_tagged_business_partner"
            X.NKm r0 = new X.NKm
            r0.<init>(r1)
            r0.A01 = r8
            r0.A00 = r13
            r0.A02 = r12
            X.C50695MZq.A00(r2, r0)
            return
        L8f:
            java.lang.String r0 = "igtv"
            goto L9a
        L92:
            java.lang.String r0 = "live"
            goto L9a
        L95:
            java.lang.String r0 = "reel"
            goto L9a
        L98:
            java.lang.String r0 = "story"
        L9a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5e
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0do r0 = r3.A09
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.6Yy r1 = X.FT2.A00(r1, r0)
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r5 = r3.A00
            boolean r10 = r3.A09
            java.lang.String r6 = r3.A03
            r7 = 0
            r9 = 1
            r11 = r9
            r13 = r12
            X.N8C r0 = X.AbstractC55149OdC.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A0B(r7, r0)
            r1.A04()
            return
        Lc3:
            X.AbstractC25226BEj.A1P(r3)
            X.PoC r0 = r3.A01
            if (r0 == 0) goto L5e
            r0.A7y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8G.A01(X.N8G):void");
    }

    @Override // X.AbstractC52114N4m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1661305808);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = super.A09;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, AbstractC166987dD.A0r(interfaceC09390do), 0), "instagram_bc_add_partner_entry");
        A0f.A7v("is_editing", false);
        AbstractC50523MSb.A10(A0f, null, "feed");
        AbstractC37300Gc1.A0n(A0f, __redex_internal_original_name);
        A0f.Cht();
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A0A = C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36316104562315250L);
        C0f9.A09(2133081499, A02);
    }
}
