package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AudienceValidationResponse;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.igds.components.stepperheader.IgdsStepperHeader;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class V11 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou, XDH, XA8, XAF {
    public static final String __redex_internal_original_name = "PromoteAudienceFragment";
    public View A00;
    public View A01;
    public View A02;
    public C70399WUb A03;
    public FRW A04;
    public C69655Vsw A05;
    public IgSimpleImageView A06;
    public C5SW A07;
    public SpinnerImageView A08;
    public boolean A09;
    public ViewStub A0A;
    public TextView A0B;
    public W65 A0C;
    public PromoteAudience A0D;
    public IgdsBanner A0E;
    public IgdsStepperHeader A0F;
    public SpinnerImageView A0G;
    public boolean A0H;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0I = AbstractC09440dt.A01(new X55(this, 2));
    public final InterfaceC09390do A0P = AbstractC09440dt.A01(new X55(this, 4));
    public final InterfaceC09390do A0L = AbstractC09440dt.A01(new X55(this, 5));
    public final InterfaceC09390do A0K = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0N = X55.A00(this, 7);
    public final InterfaceC09390do A0O = X55.A00(this, 1);
    public final InterfaceC09390do A0M = AbstractC09440dt.A01(new X55(this, 6));

    @Override // X.XAF
    public final void Dc7(PromoteState promoteState, Integer num) {
        C70399WUb c70399WUb;
        AbstractC167007dF.A1K(promoteState, num);
        boolean z = false;
        switch (num.intValue()) {
            case 0:
                promoteState.A0C(false);
                return;
            case 1:
                if (promoteState.A00) {
                    PromoteState promoteState2 = (PromoteState) this.A0L.getValue();
                    String str = A00(this).A1Z;
                    if (str != null) {
                        z = WGs.A0S(A00(this), str);
                    }
                    promoteState2.A0D(z);
                    A05();
                    A02();
                    C69655Vsw c69655Vsw = this.A05;
                    if (c69655Vsw != null) {
                        c69655Vsw.A00();
                        return;
                    } else {
                        A01();
                        return;
                    }
                }
                Avi().A04((AbstractC67958V3x) this.A0J.getValue());
                return;
            case 2:
                A05();
                return;
            case 3:
                String str2 = A00(this).A1Z;
                if (str2 != null) {
                    z = WGs.A0S(A00(this), str2);
                }
                if (A00(this).A0i == XIGIGBoostDestination.A07 && A00(this).A1Z != null && !z && (c70399WUb = this.A03) != null) {
                    c70399WUb.A0G(VG4.A0B, "lead_gen_invalid_custom_audience");
                }
                A05();
                A02();
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A04();
                ((PromoteState) this.A0L.getValue()).A0C(false);
                AbstractC167007dF.A0J().post(new RunnableC36824GKx(this));
                C69655Vsw c69655Vsw2 = this.A05;
                if (c69655Vsw2 != null) {
                    c69655Vsw2.A00();
                }
                A03();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A04();
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970383);
        interfaceC56362iU.EkS(true);
        FRW frw = new FRW(requireContext(), interfaceC56362iU);
        this.A04 = frw;
        WNT.A01(frw, C05F.A0Y, this, 21);
        FRW frw2 = this.A04;
        if (frw2 == null) {
            C14360o3.A0F("actionBarButtonController");
            throw C00O.createAndThrow();
        }
        frw2.A01(true);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_audience";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C70399WUb c70399WUb;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("should_open_special_category", false);
        } else {
            z = false;
        }
        this.A0H = z;
        A00(this).A2Q = true;
        C70813WhW c70813WhW = (C70813WhW) this.A0M.getValue();
        long j = c70813WhW.A00;
        if (j != 0) {
            c70813WhW.A01.flowEndCancel(j, CancelReason.USER_CANCELLED);
            c70813WhW.A00 = 0L;
        }
        C1QT c1qt = c70813WhW.A01;
        long flowStartForMarker = c1qt.flowStartForMarker(468328260, "boost_audience_rendered", true);
        c70813WhW.A00 = flowStartForMarker;
        c1qt.flowMarkPoint(flowStartForMarker, "navigation_start");
        InterfaceC09390do interfaceC09390do = this.A0L;
        ((PromoteState) interfaceC09390do.getValue()).A0A(this);
        PromoteData A00 = A00(this);
        if (WFR.A03(requireActivity(), A00)) {
            A00.A21.clear();
        } else {
            A00.A27.clear();
        }
        InterfaceC09390do interfaceC09390do2 = this.A0N;
        this.A03 = AbstractC43594JPz.A0N(interfaceC09390do2);
        boolean A03 = WG1.A03((UserSession) interfaceC09390do2.getValue());
        int i = R.id.main_container_stub;
        if (A03) {
            i = R.id.main_container_stub_v2;
        }
        this.A0A = (ViewStub) view.requireViewById(i);
        this.A0G = AbstractC31180DnO.A0V(view);
        if (!this.A0H && ((PromoteState) interfaceC09390do.getValue()).A00) {
            A01();
        } else {
            ((PromoteState) interfaceC09390do.getValue()).A0C(false);
            SpinnerImageView spinnerImageView = this.A0G;
            if (spinnerImageView == null) {
                C14360o3.A0F("loadingSpinner");
                throw C00O.createAndThrow();
            }
            spinnerImageView.setLoadingStatus(C3T1.LOADING);
            Avi().A04((AbstractC67958V3x) this.A0J.getValue());
        }
        String str = A00(this).A1V;
        if (str != null && (c70399WUb = this.A03) != null) {
            String obj = VG4.A0B.toString();
            Long A13 = AbstractC25228BEl.A13(str);
            InterfaceC02590Ai A0I = AbstractC65702TsY.A0I(c70399WUb, c70399WUb.A05, "promoted_posts_start_step");
            AbstractC65702TsY.A1E(A0I, c70399WUb, OptSvcAnalyticsStore.LOGGING_KEY_STEP, obj);
            C0Zx c0Zx = new C0Zx();
            c0Zx.A03("is_business_user_access_token_enabled", true);
            c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(c70399WUb.A04));
            c0Zx.A05("prefill_audience", A13);
            AbstractC65702TsY.A1A(A0I, c0Zx);
            return;
        }
        C70399WUb c70399WUb2 = this.A03;
        if (c70399WUb2 == null) {
            return;
        }
        AbstractC65702TsY.A1M(c70399WUb2, VG4.A0B);
    }

    public static final PromoteData A00(V11 v11) {
        return (PromoteData) AbstractC166987dD.A17(v11.A0P);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V11.A01():void");
    }

    private final void A03() {
        View view = this.A00;
        if (view != null) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.primary_text);
            A0N.setText(2131970535);
            A0N.setVisibility(0);
            View view2 = this.A00;
            if (view2 != null) {
                TextView A0N2 = AbstractC167007dF.A0N(view2, R.id.secondary_text);
                A0N2.setText(2131970534);
                A0N2.setVisibility(0);
                View view3 = this.A00;
                if (view3 != null) {
                    WNT.A00(view3, 22, this);
                    return;
                }
            }
        }
        C14360o3.A0F("createAudienceRow");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (A00(r5).A21.contains(com.instagram.business.promote.model.SpecialRequirementCategory.A08) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04() {
        /*
            r5 = this;
            android.view.View r4 = r5.A02
            if (r4 == 0) goto Lb1
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r0 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r2 = com.instagram.business.promote.model.SpecialRequirementCategory.A04
            boolean r0 = r0.contains(r2)
            r3 = 8
            if (r0 != 0) goto L40
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A05
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L40
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A06
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L40
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r1 = r1.contains(r0)
            r0 = 8
            if (r1 == 0) goto L41
        L40:
            r0 = 0
        L41:
            r4.setVisibility(r0)
            r0 = 2131438752(0x7f0b2ca0, float:1.849944E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L5e
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r0 = r0.A21
            boolean r0 = r0.contains(r2)
            int r0 = X.AbstractC167007dF.A05(r0)
            r1.setVisibility(r0)
        L5e:
            r0 = 2131438753(0x7f0b2ca1, float:1.8499442E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L7a
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A05
            boolean r0 = r1.contains(r0)
            int r0 = X.AbstractC167007dF.A05(r0)
            r2.setVisibility(r0)
        L7a:
            r0 = 2131438754(0x7f0b2ca2, float:1.8499444E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto L96
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A06
            boolean r0 = r1.contains(r0)
            int r0 = X.AbstractC167007dF.A05(r0)
            r2.setVisibility(r0)
        L96:
            r0 = 2131438755(0x7f0b2ca3, float:1.8499446E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 == 0) goto Lb1
            com.instagram.business.promote.model.PromoteData r0 = A00(r5)
            java.util.List r1 = r0.A21
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lae
            r3 = 0
        Lae:
            r2.setVisibility(r3)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V11.A04():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r3 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (A00(r6).A0C() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, (X.AbstractC12990ll) r6.A0N.getValue(), 36315816798457441L) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05() {
        /*
            r6 = this;
            X.W65 r5 = r6.A0C
            if (r5 == 0) goto L69
            com.instagram.business.promote.model.PromoteData r1 = A00(r6)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            com.instagram.business.promote.model.PromoteAudience r0 = r1.A08()
            com.instagram.api.schemas.AudienceValidationResponse r0 = X.WGs.A03(r0)
            boolean r0 = X.WGs.A0L(r0)
            r4 = 1
            if (r0 == 0) goto L31
            X.0do r0 = r6.A0N
            java.lang.Object r3 = r0.getValue()
            X.0ll r3 = (X.AbstractC12990ll) r3
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36315816798457441(0x81050b00000e61, double:3.029607003176776E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L32
        L31:
            r3 = 0
        L32:
            X.0do r1 = r6.A0L
            java.lang.Object r0 = r1.getValue()
            com.instagram.business.promote.model.PromoteState r0 = (com.instagram.business.promote.model.PromoteState) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.getValue()
            com.instagram.business.promote.model.PromoteState r0 = (com.instagram.business.promote.model.PromoteState) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L4b
            r2 = 1
            if (r3 == 0) goto L4c
        L4b:
            r2 = 0
        L4c:
            com.instagram.business.promote.model.PromoteData r0 = A00(r6)
            com.instagram.business.promote.model.PromoteLaunchOrigin r1 = r0.A0v
            com.instagram.business.promote.model.PromoteLaunchOrigin r0 = com.instagram.business.promote.model.PromoteLaunchOrigin.A07
            if (r1 != r0) goto L61
            com.instagram.business.promote.model.PromoteData r0 = A00(r6)
            boolean r1 = r0.A0C()
            r0 = 0
            if (r1 == 0) goto L62
        L61:
            r0 = 1
        L62:
            if (r2 == 0) goto L6a
            if (r0 == 0) goto L6a
        L66:
            r5.A04(r4)
        L69:
            return
        L6a:
            r4 = 0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V11.A05():void");
    }

    @Override // X.XDH
    public final W6E Avi() {
        return (W6E) this.A0O.getValue();
    }

    @Override // X.XDH
    public final VG4 BiZ() {
        return VG4.A0B;
    }

    @Override // X.XA8
    public final void CuW() {
        XDE xde;
        InterfaceC09390do interfaceC09390do = this.A0L;
        interfaceC09390do.getValue();
        if (PromoteState.A02(A00(this))) {
            if (!((C67968V4h) this.A0I.getValue()).A00()) {
                interfaceC09390do.getValue();
                PromoteState.A00(A00(this));
                C70399WUb c70399WUb = this.A03;
                if (c70399WUb != null) {
                    c70399WUb.A0C(VG4.A0B, A00(this));
                }
                AbstractC25226BEj.A1Q(this);
                return;
            }
            return;
        }
        if (A00(this).A0v == PromoteLaunchOrigin.A07) {
            C70399WUb c70399WUb2 = this.A03;
            if (c70399WUb2 != null) {
                c70399WUb2.A0G(VG4.A0B, "done_button");
            }
            if (!A00(this).A0C()) {
                return;
            }
            W6E Avi = Avi();
            C66081TzI c66081TzI = new C66081TzI(this, 13);
            PromoteData promoteData = Avi.A03;
            PromoteAudience A06 = promoteData.A06();
            if (A06 == null) {
                return;
            }
            UserSession userSession = Avi.A08;
            String str = promoteData.A1A;
            String str2 = promoteData.A1S;
            ImmutableList A03 = promoteData.A03();
            String str3 = A06.A06;
            C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
            AbstractC37301Gc2.A1M(A0M, "ads/promote/create_appeal/", str2);
            A0M.A9s("fb_auth_token", str);
            A0M.A9s("regulated_category", null);
            A0M.A0H("regulated_target_spec_string", str3);
            A0M.A0S(C67807Uyg.class, C69902VxT.class);
            if (A03 != null) {
                A0M.A9s("regulated_categories", AbstractC31175DnJ.A0b(A03));
            }
            C1ON A0N = A0M.A0N();
            A0N.A00 = c66081TzI;
            Avi.A07.schedule(A0N);
            return;
        }
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnA(VG4.A0B.toString());
        }
        C70399WUb c70399WUb3 = this.A03;
        if (c70399WUb3 != null) {
            c70399WUb3.A0C(VG4.A0B, A00(this));
        }
        this.A09 = true;
        AbstractC65702TsY.A0q();
        AbstractC31179DnN.A0y(new V12(), requireActivity(), this.A0N);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0N.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        XDE xde;
        InterfaceC09390do interfaceC09390do = this.A0L;
        interfaceC09390do.getValue();
        if (PromoteState.A02(A00(this))) {
            ((PromoteState) interfaceC09390do.getValue()).A06(A00(this));
        }
        C70399WUb c70399WUb = this.A03;
        if (c70399WUb != null) {
            c70399WUb.A0G(VG4.A0B, "back_button");
        }
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnA(VG4.A0B.toString());
        }
        return false;
    }

    public V11() {
        Bundle bundle = this.mArguments;
        this.A0H = bundle != null ? bundle.getBoolean("should_open_special_category", false) : false;
        this.A0J = AbstractC09440dt.A01(new X55(this, 3));
    }

    private final void A02() {
        PromoteData A00 = A00(this);
        C14360o3.A0B(A00, 0);
        AudienceValidationResponse A03 = WGs.A03(A00.A08());
        this.A0D = A00(this).A08();
        IgdsBanner igdsBanner = this.A0E;
        if (igdsBanner != null) {
            if (A03 != null && WGs.A0L(A03)) {
                PromoteAudience promoteAudience = this.A0D;
                C14360o3.A0A(promoteAudience);
                if (!WGs.A0O(promoteAudience) && !AbstractC69923Vxo.A01(this.A0D)) {
                    if (C18U.A06(C06090Tz.A05, (AbstractC12990ll) this.A0N.getValue(), 36315816798457441L)) {
                        C70399WUb c70399WUb = this.A03;
                        if (c70399WUb != null) {
                            c70399WUb.A0I(VG4.A0B, "audience_validation_banner");
                        }
                        igdsBanner.setVisibility(0);
                        igdsBanner.setBody(A03.A02, false);
                        String A0H = WGs.A0H(A03);
                        igdsBanner.setAction(WGs.A0G(A03));
                        igdsBanner.A00 = new C70934Wkd(A0H, this, 0);
                        return;
                    }
                    return;
                }
            }
            igdsBanner.setVisibility(8);
        }
    }

    public static final void A06(V11 v11) {
        A00(v11).A2r = false;
        A00(v11).A1m = new ArrayList();
        A00(v11).A1m.add(PromoteAudience.A0E);
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A05();
        c146106i8.A0H = "promote_fetch_available_audience_error_alert";
        c146106i8.A0D = v11.getString(2131970736);
        AbstractC25233BEq.A1F(c146106i8);
        C69655Vsw c69655Vsw = v11.A05;
        if (c69655Vsw != null) {
            c69655Vsw.A00();
        } else {
            v11.A01();
        }
        ((PromoteState) v11.A0L.getValue()).A09(A00(v11), BoostedPostAudienceOption.A0K.toString());
    }

    public static final void A07(V11 v11) {
        FragmentActivity activity = v11.getActivity();
        if (activity != null) {
            AbstractC65702TsY.A0q();
            boolean z = v11.A0H;
            Bundle bundle = new Bundle();
            bundle.putBoolean("should_show_boost_package_text", z);
            V1L v1l = new V1L();
            v1l.setArguments(bundle);
            C189448aO A0g = AbstractC25231BEo.A0g(v11.A0N);
            C14360o3.A0C(v1l, MSV.A00(3));
            A0g.A0T = v1l;
            A0g.A0U = v1l;
            A0g.A00().A02(activity, v1l);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        XDE xde;
        int A02 = C0f9.A02(-273394222);
        C14360o3.A0B(layoutInflater, 0);
        C1UC activity = getActivity();
        if ((activity instanceof XDE) && (xde = (XDE) activity) != null) {
            xde.CnB(VG4.A0B.toString());
        }
        View inflate = layoutInflater.inflate(R.layout.promote_audience_view, viewGroup, false);
        C0f9.A09(-1356755969, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1659107221);
        this.A08 = null;
        this.A05 = null;
        this.A02 = null;
        this.A0E = null;
        ((PromoteState) this.A0L.getValue()).A0B(this);
        this.A03 = null;
        super.onDestroyView();
        C0f9.A09(1970606577, A02);
    }
}
