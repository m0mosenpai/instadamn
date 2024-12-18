package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel;
import com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class N8B extends AbstractC52176N7l implements InterfaceC11380iw, InterfaceC60442pS, InterfaceC60072op, InterfaceC58184Pqp, InterfaceC37145GYg {
    public static final String __redex_internal_original_name = "BrandedContentDisclosureMenuFragment";
    public C64842wi A00;
    public final C64752wZ A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC41501vz A05;

    @Override // X.InterfaceC37145GYg
    public final /* synthetic */ void Cs2(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        F0C.A00(fragmentActivity, userSession, user, str);
    }

    @Override // X.InterfaceC58184Pqp
    public final void DQD(View view) {
    }

    @Override // X.InterfaceC58184Pqp
    public final void DTc(View view) {
    }

    @Override // X.InterfaceC37145GYg
    public final void DY5(User user) {
        C14360o3.A0B(user, 0);
        MSW.A0P(this.A04).A05(user);
        LL0.A01(this, AbstractC166987dD.A0r(super.A01), C05F.A0Q);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList A0U;
        InterfaceC43551JLl interfaceC43551JLl;
        List list;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            super.A00 = requireArguments().getString("ARGUMENT_MEDIA_ID");
            InterfaceC09390do interfaceC09390do = this.A04;
            BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel = (BrandedContentDisclosureMenuViewModel) interfaceC09390do.getValue();
            if (!brandedContentDisclosureMenuViewModel.A02) {
                brandedContentDisclosureMenuViewModel.A03 = AbstractC167007dF.A1Z(this.A03);
                boolean z = bundle2.getBoolean("includes_suspected_sponsor");
                brandedContentDisclosureMenuViewModel.A0A = z;
                if (z) {
                    brandedContentDisclosureMenuViewModel.A0E = true;
                    ArrayList parcelableArrayList = bundle2.getParcelableArrayList("brand_partners");
                    if (parcelableArrayList != null) {
                        list = AbstractC166987dD.A1F(parcelableArrayList);
                    } else {
                        list = C16930sl.A00;
                    }
                    brandedContentDisclosureMenuViewModel.A08 = list;
                    A0U = AbstractC166987dD.A1E();
                } else {
                    brandedContentDisclosureMenuViewModel.A0E = bundle2.getBoolean("disclosure_fragment_is_paid_partnership_on");
                    ArrayList A0Z = AbstractC50523MSb.A0Z(bundle2.getParcelableArrayList("brand_partners"));
                    ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A07 = A0Z;
                    ArrayList A0q = AbstractC167017dG.A0q(A0Z);
                    Iterator it = A0Z.iterator();
                    while (it.hasNext()) {
                        BrandedContentTag A0n = MSW.A0n(it);
                        C14360o3.A0A(A0n);
                        A0q.add(new BrandedContentTag(A0n));
                    }
                    A0U = AbstractC001800i.A0U(A0q);
                }
                ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A06 = A0U;
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) bundle2.getParcelable("BRANDED_CONTENT_GATING_INFO");
                if (brandedContentGatingInfo == null) {
                    interfaceC09390do.getValue();
                    brandedContentGatingInfo = new BrandedContentGatingInfo(null, null, null, null, null);
                }
                ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A01 = brandedContentGatingInfo;
                brandedContentDisclosureMenuViewModel.A0D = bundle2.getBoolean("disclosure_fragment_is_edit_flow");
                String string = bundle2.getString("ARGUMENT_MEDIA_TYPE");
                if (string == null) {
                    string = "feed";
                }
                ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A05 = string;
                ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A04 = super.A00;
                brandedContentDisclosureMenuViewModel.A09 = bundle2.getBoolean("has_interactive_elements_for_story");
                brandedContentDisclosureMenuViewModel.A02 = true;
                brandedContentDisclosureMenuViewModel.A0B = bundle2.getBoolean("argument_create_ad_code");
                String str = ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A04;
                if (str != null) {
                    C38321qM A0h = AbstractC25229BEm.A0h(AbstractC166987dD.A0r(super.A01), str);
                    if (A0h != null) {
                        interfaceC43551JLl = A0h.A1F();
                    } else {
                        interfaceC43551JLl = null;
                    }
                    ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A00 = interfaceC43551JLl;
                    if (interfaceC43551JLl != null) {
                        brandedContentDisclosureMenuViewModel.A0B = true;
                    }
                }
                BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = (BrandedContentProjectMetadataIntf) bundle2.getParcelable("project_metadata");
                if (MSW.A0P(interfaceC09390do).A0E && brandedContentProjectMetadataIntf != null && brandedContentProjectMetadataIntf.AYK() != BrandedContentProjectAction.A06) {
                    BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel2 = (BrandedContentDisclosureMenuViewModel) interfaceC09390do.getValue();
                    String BiT = brandedContentProjectMetadataIntf.BiT();
                    String BiU = brandedContentProjectMetadataIntf.BiU();
                    if (BiU == null) {
                        BiU = "";
                    }
                    String Ahu = brandedContentProjectMetadataIntf.Ahu();
                    if (Ahu == null) {
                        Ahu = "";
                    }
                    String Ai2 = brandedContentProjectMetadataIntf.Ai2();
                    if (Ai2 == null) {
                        Ai2 = "";
                    }
                    C51675Ms6 c51675Ms6 = new C51675Ms6(brandedContentProjectMetadataIntf.AaB(), AbstractC167007dF.A0d(), BiT, BiU, Ahu, Ai2, brandedContentProjectMetadataIntf.AkC(), brandedContentProjectMetadataIntf.AkB(), null);
                    brandedContentDisclosureMenuViewModel2.A00 = c51675Ms6;
                    brandedContentDisclosureMenuViewModel2.A01 = c51675Ms6;
                }
            }
        }
        C06C.A01(this, "request_key_audience_restrictions", new C30480DbP(this, 36));
        View inflate = AbstractC167007dF.A0M(view, R.id.action_bar).inflate();
        InterfaceC09390do interfaceC09390do2 = this.A03;
        if (AbstractC167007dF.A1Z(interfaceC09390do2)) {
            AbstractC166987dD.A1P(requireContext(), AbstractC167007dF.A0N(inflate, R.id.action_bar_title), 2131969368);
        }
        ViewOnClickListenerC55467OkM.A00(inflate.requireViewById(R.id.action_bar_button_back), 43, this);
        View A0S = AbstractC166997dE.A0S(inflate, R.id.done_button);
        if (AbstractC167007dF.A1Z(this.A02) || AbstractC167007dF.A1Z(interfaceC09390do2)) {
            A0S.setVisibility(0);
            ViewOnClickListenerC55464OkJ.A01(A0S, 13, this, inflate);
        }
        C27961Xa A00 = AbstractC54912fq.A00();
        InterfaceC09390do interfaceC09390do3 = super.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do3);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0C;
        C54922fr A0S2 = AbstractC31175DnJ.A0S();
        A0S2.A00 = new C56500P6y(this, 3);
        A0S2.A08 = P77.A00;
        C64842wi A0T = AbstractC31175DnJ.A0T(this, A0r, A0S2, A00, quickPromotionSlot);
        this.A00 = A0T;
        EnumSet of = EnumSet.of(Trigger.A0F);
        C14360o3.A07(of);
        A0T.AVr(of);
        BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel3 = (BrandedContentDisclosureMenuViewModel) this.A04.getValue();
        if (brandedContentDisclosureMenuViewModel3.A03) {
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do3);
            String str2 = ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel3).A04;
            String str3 = ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel3).A05;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31172DnG.A0Q(this, A0r2, 0), "instagram_partnership_and_ads_entry");
            AbstractC50523MSb.A10(A0f, str2, str3);
            A0f.Cht();
        }
        AbstractC31180DnO.A1F(getViewLifecycleOwner(), brandedContentDisclosureMenuViewModel3.A04, new C50259MHo(this, 21), 42);
        if (brandedContentDisclosureMenuViewModel3.A0A) {
            MSY.A1M(brandedContentDisclosureMenuViewModel3, AbstractC25235BEs.A0S(this), 18);
        }
        brandedContentDisclosureMenuViewModel3.A04();
        AbstractC166987dD.A1Z(new MC8(brandedContentDisclosureMenuViewModel3, this, view, null, 12), AbstractC25235BEs.A0S(this));
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do3), C05F.A0J);
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvB(boolean z) {
        BrandedContentTag brandedContentTag;
        BrandedContentDisclosureBaseViewModel A0P = MSW.A0P(this.A04);
        C14360o3.A0B(A0P, 1);
        if (!AbstractC55199Oe9.A06(requireContext(), this, AbstractC166987dD.A0r(super.A01))) {
            if (z) {
                boolean z2 = A0P.A0D;
                String str = super.A00;
                if (z2) {
                    if (str != null) {
                        if (A0P.A06.size() > 1) {
                            C193328hC A0O = AbstractC31175DnJ.A0O(this);
                            A0O.A0A(2131969355);
                            A0O.A09(2131969356);
                            AbstractC31176DnK.A17(null, A0O, 2131956237);
                        } else {
                            if (C14360o3.A0K(A0P.A05, "story") && A0P.A09) {
                                String str2 = null;
                                if (AbstractC166987dD.A1b(A0P.A06) && (brandedContentTag = (BrandedContentTag) AbstractC001800i.A0O(A0P.A06, 0)) != null) {
                                    str2 = brandedContentTag.A01;
                                }
                                String str3 = super.A00;
                                if (str3 != null) {
                                    AbstractC52176N7l.A00(new C55864OrE(this, A0P), this, A0P, str3, str2);
                                    return false;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            str = super.A00;
                            if (str == null) {
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                        }
                    }
                }
                return A0P.A07(this, str);
            }
            C193328hC A0O2 = AbstractC31175DnJ.A0O(this);
            A0O2.A0A(2131969363);
            A0O2.A09(2131969362);
            A0O2.A0L(DialogInterfaceOnClickListenerC55321Ogj.A00(this, A0P, 5), 2131954158);
            A0O2.A06();
            AbstractC166987dD.A1W(A0O2);
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CvW(boolean z) {
        BrandedContentDisclosureMenuViewModel brandedContentDisclosureMenuViewModel = (BrandedContentDisclosureMenuViewModel) this.A04.getValue();
        brandedContentDisclosureMenuViewModel.A0E = z;
        if (!z) {
            brandedContentDisclosureMenuViewModel.A01 = null;
            ((BrandedContentDisclosureBaseViewModel) brandedContentDisclosureMenuViewModel).A06.clear();
        }
        brandedContentDisclosureMenuViewModel.A04();
        return true;
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean CwP(boolean z) {
        LL0.A01(this, AbstractC166987dD.A0r(super.A01), C05F.A0R);
        return A0D(MSW.A0P(this.A04), super.A00, z);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.KHp, X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        NED ned = new NED(this);
        ?? obj = new Object();
        InterfaceC09390do interfaceC09390do = super.A01;
        NEO neo = new NEO(this, AbstractC166987dD.A0r(interfaceC09390do));
        NEE nee = new NEE(this);
        C32609EXj c32609EXj = new C32609EXj(AbstractC166987dD.A0r(interfaceC09390do));
        EXW exw = new EXW(this, this, this, AbstractC166987dD.A0r(interfaceC09390do));
        ?? obj2 = new Object();
        obj2.A00 = null;
        return AbstractC16960so.A1N(ned, obj, neo, nee, c32609EXj, exw, obj2, new C52352NEq(this, this, AbstractC166987dD.A0r(interfaceC09390do), this, MSW.A0P(this.A04).A05));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C57618PhU.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (X.AbstractC167007dF.A1Z(r18.A02) != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    @Override // X.InterfaceC60072op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPressed() {
        /*
            r18 = this;
            r3 = r18
            X.0do r5 = r3.A04
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r1 = X.MSW.A0P(r5)
            boolean r0 = r1.A0D
            r2 = 1
            if (r0 == 0) goto L3c
            X.JLl r0 = r1.A00
            if (r0 == 0) goto L3c
            java.util.List r0 = r1.A06
            int r0 = r0.size()
            if (r0 <= r2) goto L3c
            X.8hC r4 = X.AbstractC31175DnJ.A0O(r3)
            r0 = 2131969355(0x7f13454b, float:1.957563E38)
            r4.A0A(r0)
            r0 = 2131969356(0x7f13454c, float:1.9575633E38)
            r4.A09(r0)
            r1 = 2131956237(0x7f13120d, float:1.9549024E38)
            r0 = 0
            X.AbstractC31176DnK.A17(r0, r4, r1)
        L30:
            X.0do r0 = r3.A01
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r0)
            java.lang.Integer r0 = X.C05F.A0M
            X.LL0.A01(r3, r1, r0)
            return r2
        L3c:
            X.0do r0 = r3.A03
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L50
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.MSW.A0P(r5)
            boolean r0 = r0.A0D
            if (r0 == 0) goto L50
        L4c:
            X.AbstractC25226BEj.A1P(r3)
            goto L30
        L50:
            java.lang.Object r1 = r5.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r1 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r1
            X.Ms6 r0 = r1.A01
            if (r0 == 0) goto L80
            com.instagram.api.schemas.BrandedContentProjectMetadata r8 = com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel.A01(r1)
        L5e:
            com.instagram.common.session.UserSession r0 = r1.A05
            X.1My r7 = X.AbstractC25651Mw.A00(r0)
            java.util.List r6 = r1.A06
            com.instagram.api.schemas.BrandedContentGatingInfo r4 = r1.A01
            boolean r1 = r1.A0E
            X.Ots r0 = new X.Ots
            r0.<init>(r4, r8, r6, r1)
            r7.E4s(r0)
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.MSW.A0P(r5)
            java.lang.String r1 = r0.A05
            int r0 = r1.hashCode()
            switch(r0) {
                case 3138974: goto Lb4;
                case 3230752: goto La0;
                case 3322092: goto Lde;
                case 3496474: goto L9d;
                case 109770997: goto L9a;
                default: goto L7f;
            }
        L7f:
            goto L30
        L80:
            X.Ms6 r0 = r1.A00
            if (r0 == 0) goto L98
            com.instagram.api.schemas.BrandedContentProjectAction r10 = com.instagram.api.schemas.BrandedContentProjectAction.A06
            java.lang.String r0 = r0.A05
            r9 = 0
            com.instagram.api.schemas.BrandedContentProjectMetadata r8 = new com.instagram.api.schemas.BrandedContentProjectMetadata
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L5e
        L98:
            r8 = 0
            goto L5e
        L9a:
            java.lang.String r0 = "story"
            goto La2
        L9d:
            java.lang.String r0 = "reel"
            goto La2
        La0:
            java.lang.String r0 = "igtv"
        La2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L30
            X.AbstractC25226BEj.A1P(r3)
            X.0do r0 = r3.A02
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L30
            goto L4c
        Lb4:
            java.lang.String r0 = "feed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L30
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r0 = X.MSW.A0P(r5)
            boolean r0 = r0.A0D
            if (r0 != 0) goto L4c
            X.0do r1 = r3.A01
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            X.AbstractC43593JPy.A1P(r0)
            X.0do r0 = r3.A02
            boolean r0 = X.AbstractC167007dF.A1Z(r0)
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r1)
            X.AbstractC43593JPy.A1P(r0)
            goto L30
        Lde:
            java.lang.String r0 = "live"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L30
            X.AbstractC25227BEk.A1B(r3)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N8B.onBackPressed():boolean");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.2wZ, java.lang.Object] */
    public N8B() {
        C50150MDd c50150MDd = new C50150MDd(this, 49);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50150MDd(new C50150MDd(this, 46), 47));
        this.A04 = AbstractC25225BEi.A0a(new C50150MDd(A00, 48), c50150MDd, new C57253Pbb(0, null, A00), AbstractC25225BEi.A1D(BrandedContentDisclosureMenuViewModel.class));
        this.A02 = C1XM.A00(new C50150MDd(this, 44));
        this.A03 = C1XM.A00(new C50150MDd(this, 45));
        this.A05 = C56035Ou7.A00(this, 11);
        AbstractC54912fq.A00();
        this.A01 = new Object();
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvJ() {
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = super.A01;
        C140966Yy A00 = FT2.A00(requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        InterfaceC09390do interfaceC09390do2 = this.A04;
        A00.A0D(AbstractC55149OdC.A01(MSW.A0P(interfaceC09390do2).A01, MSW.A0P(interfaceC09390do2).A05, MSW.A0P(interfaceC09390do2).A0D, true));
        A00.A04();
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0P);
    }

    @Override // X.InterfaceC58184Pqp
    public final void CvK() {
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC09390do interfaceC09390do = this.A04;
        Iterator it = MSW.A0P(interfaceC09390do).A06.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0n = MSW.A0n(it);
            User user = A0n.A00;
            if (user != null || (user = AnonymousClass189.A00(AbstractC166987dD.A0r(super.A01)).A02(A0n.A01)) != null) {
                A1E.add(user);
            }
        }
        FT2.A01();
        String str = MSW.A0P(interfaceC09390do).A05;
        boolean z = MSW.A0P(interfaceC09390do).A0D;
        BrandedContentGatingInfo brandedContentGatingInfo = MSW.A0P(interfaceC09390do).A01;
        boolean z2 = MSW.A0P(interfaceC09390do).A09;
        N8G n8g = new N8G();
        n8g.A01 = null;
        n8g.A07 = false;
        MSZ.A1J(brandedContentGatingInfo, n8g, str, A1E, z);
        n8g.A08 = z2;
        C14360o3.A0C(n8g, "null cannot be cast to non-null type com.instagram.brandedcontent.disclosure.BrandedContentAddBrandPartnersFragment");
        n8g.A01 = new C55854Or4(this);
        n8g.A07 = true;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do2 = super.A01;
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, AbstractC166987dD.A0r(interfaceC09390do2));
        A0r.A0B(null, n8g);
        A0r.A0A = "javaClass";
        A0r.A04();
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do2), C05F.A0L);
    }

    @Override // X.InterfaceC58184Pqp
    public final boolean DkH() {
        String str;
        FragmentActivity requireActivity = requireActivity();
        InterfaceC09390do interfaceC09390do = super.A01;
        C140966Yy A00 = FT2.A00(requireActivity, AbstractC166987dD.A0r(interfaceC09390do));
        C51675Ms6 c51675Ms6 = ((BrandedContentDisclosureMenuViewModel) this.A04.getValue()).A01;
        if (c51675Ms6 != null) {
            str = c51675Ms6.A05;
        } else {
            str = null;
        }
        C45520KDl c45520KDl = new C45520KDl();
        AbstractC25233BEq.A15(c45520KDl, "prev_selected_project_id", str);
        A00.A0B(null, c45520KDl);
        A00.A04();
        LL0.A01(this, AbstractC166987dD.A0r(interfaceC09390do), C05F.A0K);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2126625973);
        super.onCreate(bundle);
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(super.A01)).A01(this.A05, C55980OtD.class);
        C0f9.A09(1317492593, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-460773689);
        super.onDestroy();
        AbstractC25651Mw.A00(AbstractC166987dD.A0r(super.A01)).A02(this.A05, C55980OtD.class);
        C0f9.A09(719368255, A02);
    }
}
