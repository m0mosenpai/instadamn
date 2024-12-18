package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EL5 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubConsiderationFragment";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public InterfaceC56392iX A0C;
    public InterfaceC56392iX A0D;
    public InterfaceC56392iX A0E;
    public IgdsButton A0F;
    public IgdsButton A0G;
    public SpinnerImageView A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        BHS bhs;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (AbstractC167007dF.A1Z(this.A0P)) {
            interfaceC56362iU.EkF(false);
            return;
        }
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle("");
        FanClubConsiderationViewModel A00 = A00(this);
        C01L A1I = C0eM.A1I();
        if (A00.A00 == C05F.A0C && !A00.A0M) {
            A1I.add(new JV1(C05F.A00));
            UserSession userSession = A00.A03;
            MonetizationRepository monetizationRepository = A00.A08;
            if (C18U.A06(C06090Tz.A05, userSession, 36314708696894230L) && monetizationRepository.A06) {
                InterfaceC19630xq interfaceC19630xq = A00.A09.A01;
                if (!interfaceC19630xq.getBoolean("has_seen_consideration_share_screen_promo_sticker_tooltip", false)) {
                    AbstractC31177DnL.A1N(interfaceC19630xq, "has_seen_consideration_share_screen_promo_sticker_tooltip", true);
                    bhs = BHS.A00(new Object[0], 2131957204);
                } else {
                    bhs = null;
                }
                A1I.add(new JV1(bhs, C05F.A01, R.drawable.instagram_share_pano_outline_24, 2131962138));
            }
        }
        Iterator<E> it = C0eM.A1J(A1I).iterator();
        while (it.hasNext()) {
            JV1 jv1 = (JV1) it.next();
            C3LO A0B = AbstractC31171DnF.A0B();
            A0B.A06 = jv1.A02;
            A0B.A05 = jv1.A01;
            View A0F = AbstractC31177DnL.A0F(new FpQ(63, this, jv1), A0B, interfaceC56362iU);
            C5QE c5qe = (C5QE) jv1.A03;
            if (c5qe != null) {
                A0F.postDelayed(new GQJ(A0F, c5qe, this, A0F.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding)), 1000L);
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "FanClubFanOnboardingConsiderationFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            SpinnerImageView A0V = AbstractC31180DnO.A0V(view2);
            AbstractC31171DnF.A1M(A0V);
            this.A0H = A0V;
            this.A01 = (IgLinearLayout) view2.requireViewById(R.id.subscription_info);
            this.A02 = (IgSimpleImageView) view2.requireViewById(R.id.facepile_icon);
            this.A03 = (IgSimpleImageView) view2.requireViewById(R.id.icon_badge);
            this.A0B = AbstractC31172DnG.A0X(view2, R.id.fan_club_name_title);
            this.A09 = AbstractC31172DnG.A0X(view2, R.id.fan_club_description);
            this.A0A = AbstractC31172DnG.A0X(view2, R.id.support_value_prop_description);
            this.A0F = AbstractC31173DnH.A0W(view2, R.id.cta_button);
            IgTextView A0X = AbstractC31172DnG.A0X(view2, R.id.learn_more_footer);
            this.A07 = A0X;
            if (A0X == null) {
                C14360o3.A0F("footer");
                throw C00O.createAndThrow();
            }
            AbstractC25227BEk.A11(A0X);
            this.A0G = AbstractC31173DnH.A0W(view2, R.id.secondary_cta_button);
            this.A04 = AbstractC31172DnG.A0X(view2, R.id.benefit_header);
            this.A05 = AbstractC31172DnG.A0X(view2, R.id.customized_benefits_edit_cta);
            this.A00 = (IgLinearLayout) view2.requireViewById(R.id.bullet_cell_group_container);
            this.A06 = AbstractC31172DnG.A0X(view2, R.id.customized_benefits_span);
            this.A0C = AbstractC31173DnH.A0U(view2, R.id.fan_club_consideration_content_preview_section_stub);
            this.A0D = AbstractC31173DnH.A0U(view2, R.id.fan_club_consideration_exclusive_content_view_stub);
            this.A0E = AbstractC31173DnH.A0U(view2, R.id.fan_club_consideration_social_context_section_stub);
            this.A08 = AbstractC31172DnG.A0X(view2, R.id.recent_content_text);
            FanClubConsiderationViewModel A00 = A00(this);
            Context requireContext = requireContext();
            Object value = this.A0Q.getValue();
            Object value2 = this.A0L.getValue();
            AbstractC23641Du.A05(((C12M) A00.A02).A04, new MCM(value, value2, requireContext, A00, null, 37), AbstractC141776au.A00(A00));
            A00(this);
            String A0e = AbstractC31175DnJ.A0e(this.A0M);
            if (!FE3.A00.contains(A0e)) {
                AbstractC166987dD.A1T(C18950wb.A01, AnonymousClass001.A0R("Unexpected origin: ", A0e), 1062876315);
            }
            C07S c07s = C07S.STARTED;
            C07X viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC166987dD.A1Z(new MCL(viewLifecycleOwner, c07s, this, null, 16), C07Y.A00(viewLifecycleOwner));
            return;
        }
        throw AbstractC25227BEk.A0n();
    }

    public static final FanClubConsiderationViewModel A00(EL5 el5) {
        return (FanClubConsiderationViewModel) el5.A0R.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0O);
    }

    public EL5() {
        C37053GUj c37053GUj = new C37053GUj(this, 38);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37053GUj(new C37053GUj(this, 34), 35));
        this.A0R = AbstractC25225BEi.A0a(new C37053GUj(A00, 36), c37053GUj, new C50171MDy(23, null, A00), AbstractC25225BEi.A1D(FanClubConsiderationViewModel.class));
        this.A0K = C37053GUj.A00(this, 29);
        this.A0M = C37053GUj.A00(this, 31);
        this.A0P = C37053GUj.A00(this, 33);
        this.A0Q = C37053GUj.A00(this, 37);
        this.A0L = C37053GUj.A00(this, 30);
        this.A0N = C37053GUj.A00(this, 32);
        this.A0J = C37053GUj.A00(this, 28);
        this.A0I = C37053GUj.A00(this, 27);
        this.A0O = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            AbstractC25231BEo.A16(this);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (isResumed() && A00(this).A0L.getValue() != EnumC33336EoV.A04) {
            C193328hC A0P = AbstractC31180DnO.A0P(this);
            A0P.A0A(2131962217);
            A0P.A09(2131962216);
            A0P.A0J(null, 2131962215);
            A0P.A0P(DialogInterfaceOnClickListenerC35453FkA.A00(this, 19), EnumC193348hE.A05, 2131962214);
            AbstractC166987dD.A1W(A0P);
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1068123879);
        C14360o3.A0B(layoutInflater, 0);
        boolean A1Z = AbstractC167007dF.A1Z(this.A0P);
        int i = R.layout.fan_club_consideration;
        if (A1Z) {
            i = R.layout.fan_club_consideration_bottom_sheet;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(717157249, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1123910848);
        FanClubConsiderationViewModel A00 = A00(this);
        if (AbstractC31176DnK.A1b(A00.A0I)) {
            FJ8 fj8 = A00.A05;
            fj8.A00.markerEndAtPoint(1062864564, fj8.A01.hashCode(), (short) 4, F7M.A00(C05F.A00));
        }
        if (A00.A0L.getValue() != EnumC33336EoV.A04) {
            FJ8 fj82 = A00.A05;
            fj82.A00.markerEndAtPoint(1062866800, fj82.A01.hashCode(), (short) 4, "cancel_during_purchase_flow");
        }
        super.onDestroy();
        C0f9.A09(-546749194, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1824012224);
        SpinnerImageView spinnerImageView = this.A0H;
        if (spinnerImageView == null) {
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C3T1.LOADED);
        super.onPause();
        C0f9.A09(-1439880434, A02);
    }
}
