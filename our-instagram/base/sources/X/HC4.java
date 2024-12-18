package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsFeedbackBottomSheetFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.RecommendationsInfoBottomSheetFragment;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HC4 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorInspirationSignalsPlaygroundRecommendationsFragment";
    public int A00;
    public IgdsButton A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public InterfaceC678133v A04;
    public C41161IKa A05;
    public User A06;
    public final String A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        InterfaceC09390do interfaceC09390do = this.A0E;
        User A02 = AnonymousClass189.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02(AbstractC25225BEi.A15(this.A0I));
        if (A02 != null) {
            this.A06 = A02;
            interfaceC56362iU.EkS(true);
            View ESp = interfaceC56362iU.ESp(AbstractC166987dD.A0r(interfaceC09390do), R.layout.creator_inspiration_signals_playground_recommendations_action_bar, 0, 0);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) AbstractC166997dE.A0R(ESp, R.id.profile_image);
            User user = this.A06;
            if (user != null) {
                gradientSpinnerAvatarView.A0F(null, this, user.Bhu());
                gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
                ViewOnClickListenerC42035Ik4.A01(gradientSpinnerAvatarView, 66, this);
                TextView A0N = AbstractC167007dF.A0N(ESp, R.id.primary_name);
                User user2 = this.A06;
                if (user2 != null) {
                    AbstractC31173DnH.A1F(A0N, user2);
                    ViewOnClickListenerC42035Ik4.A01(A0N, 67, this);
                    TextView A0N2 = AbstractC167007dF.A0N(ESp, R.id.secondary_name);
                    User user3 = this.A06;
                    if (user3 != null) {
                        A0N2.setText(user3.A0Q());
                        ViewOnClickListenerC42035Ik4.A01(A0N2, 68, this);
                        View A0S = AbstractC166997dE.A0S(ESp, R.id.action_bar_buttons_container);
                        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36328499836960329L)) {
                            A0S.setVisibility(8);
                            ViewGroup.LayoutParams layoutParams = A0N.getLayoutParams();
                            String A00 = AbstractC111324zv.A00(0);
                            C14360o3.A0C(layoutParams, A00);
                            ((C56302iJ) layoutParams).A0M = 0;
                            ViewGroup.LayoutParams layoutParams2 = A0N2.getLayoutParams();
                            C14360o3.A0C(layoutParams2, A00);
                            ((C56302iJ) layoutParams2).A0M = 0;
                            return;
                        }
                        ViewOnClickListenerC42035Ik4.A01(AbstractC166997dE.A0S(ESp, R.id.comment_icon_button), 69, this);
                        ViewOnClickListenerC42035Ik4.A01(AbstractC166997dE.A0S(ESp, R.id.info_icon_button), 70, this);
                        return;
                    }
                }
            }
            C14360o3.A0F("testUser");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C2UU c2uu;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.error_message);
        View A0R = AbstractC166997dE.A0R(view, R.id.loading_spinner);
        View A0R2 = AbstractC166997dE.A0R(view, R.id.recommendations_container);
        AbstractC167007dF.A0N(view, R.id.signal_title_line).setText(AbstractC25225BEi.A15(this.A0H));
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0S(view, R.id.recommendations_hscroll_recycler_view);
        C41161IKa c41161IKa = this.A05;
        if (c41161IKa == null) {
            C14360o3.A0F("recommendationsRecyclerViewHelper");
            throw C00O.createAndThrow();
        }
        C14360o3.A0B(recyclerView, 0);
        AbstractC31174DnI.A17(c41161IKa.A00, recyclerView, false);
        String str = c41161IKa.A08;
        if (C14360o3.A0K(str, "CLIPS")) {
            c2uu = c41161IKa.A06;
        } else if (C14360o3.A0K(str, "AUDIO")) {
            c2uu = c41161IKa.A05;
        } else {
            c2uu = null;
        }
        recyclerView.setAdapter(c2uu);
        recyclerView.A14(c41161IKa.A03);
        recyclerView.A10(c41161IKa.A02);
        new C61792rg().A07(recyclerView);
        View A0S2 = AbstractC166997dE.A0S(view, R.id.feedback_buttons_container);
        IgdsButton igdsButton = (IgdsButton) view.requireViewById(R.id.relevant_button);
        this.A03 = igdsButton;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.RELEVANT;
        if (igdsButton != null) {
            ViewOnClickListenerC38053Gog.A03(igdsButton, 64, feedbackType, this);
        }
        IgdsButton igdsButton2 = (IgdsButton) view.requireViewById(R.id.partially_relevant_button);
        this.A02 = igdsButton2;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType2 = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.PARTIALLY_RELEVANT;
        if (igdsButton2 != null) {
            ViewOnClickListenerC38053Gog.A03(igdsButton2, 64, feedbackType2, this);
        }
        IgdsButton igdsButton3 = (IgdsButton) view.requireViewById(R.id.not_relevant_button);
        this.A01 = igdsButton3;
        CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType feedbackType3 = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.FeedbackType.NOT_RELEVANT;
        if (igdsButton3 != null) {
            ViewOnClickListenerC38053Gog.A03(igdsButton3, 64, feedbackType3, this);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57170PZo(viewLifecycleOwner, A0R, this, A0S, A0S2, c07s, A0R2, null, 18), C07Y.A00(viewLifecycleOwner));
        AbstractC18560vj.A03(AbstractC25235BEs.A0S(this), new C15340po(new PZ3(view, recyclerView, this, null, 41), ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) this.A0D.getValue()).viewEffect));
    }

    public static final void A00(HC4 hc4) {
        InterfaceC09390do interfaceC09390do = hc4.A0E;
        C31368DqX A01 = AbstractC31402Dr6.A01(AbstractC166987dD.A0r(interfaceC09390do), AbstractC25225BEi.A15(hc4.A0I), "creator_inspiration_signals_playground_action_bar", hc4.A07);
        C140966Yy A0j = AbstractC25233BEq.A0j(hc4, interfaceC09390do);
        A0j.A08();
        C31368DqX.A02(A0j, AbstractC166987dD.A0r(interfaceC09390do), AbstractC31364DqT.A02(), A01);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A07;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0E);
    }

    public HC4() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0G = DH5.A01(this, AbstractC111324zv.A00(5374), enumC09460dv, 43);
        this.A0H = DH5.A01(this, AbstractC111324zv.A00(5372), enumC09460dv, 44);
        this.A0F = DH5.A01(this, AbstractC111324zv.A00(5373), enumC09460dv, 45);
        this.A0I = DH5.A01(this, AbstractC111324zv.A00(3223), enumC09460dv, 46);
        D88 d88 = new D88(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new D88(new D88(this, 47), 48));
        this.A0D = AbstractC25225BEi.A0a(new D88(A00, 49), d88, new D8K(41, null, A00), AbstractC25225BEi.A1D(CreatorInspirationSignalsPlaygroundRecommendationsViewModel.class));
        D88 d882 = new D88(this, 41);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new C57537PgB(new C57537PgB(this, 0), 1));
        this.A08 = AbstractC25225BEi.A0a(new C57537PgB(A002, 2), d882, new D8K(42, null, A002), AbstractC25225BEi.A1D(Gt6.class));
        this.A0A = C1XM.A00(new D88(this, 43));
        this.A09 = C1XM.A00(new D88(this, 42));
        this.A0C = C1XM.A00(new D88(this, 45));
        this.A0B = C1XM.A00(new D88(this, 44));
        this.A0E = AbstractC60492pY.A02(this);
        this.A07 = MSV.A00(1093);
    }

    public static final void A01(HC4 hc4, Integer num) {
        int i;
        Fragment recommendationsFeedbackBottomSheetFragment;
        if (num.intValue() != 0) {
            i = 2131957195;
            recommendationsFeedbackBottomSheetFragment = new RecommendationsInfoBottomSheetFragment();
        } else {
            i = 2131957192;
            recommendationsFeedbackBottomSheetFragment = new RecommendationsFeedbackBottomSheetFragment();
        }
        C189448aO A0y = AbstractC25225BEi.A0y(AbstractC166987dD.A0o(hc4.A0E));
        AbstractC25226BEj.A1M(hc4.requireContext(), A0y, i);
        A0y.A00().A02(hc4.requireActivity(), recommendationsFeedbackBottomSheetFragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-28599201);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A0E;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        this.A04 = AbstractC677833s.A00(requireContext, A0r, null, new C677733r(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)), "CreatorInspirationSignalsPlayground", AbstractC677833s.A02(A0r));
        String A15 = AbstractC25225BEi.A15(this.A0F);
        Context requireContext2 = requireContext();
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        Gt6 gt6 = (Gt6) this.A08.getValue();
        int A01 = AbstractC167027dH.A01(this.A0A);
        int A012 = AbstractC167027dH.A01(this.A09);
        String A152 = AbstractC25225BEi.A15(this.A0H);
        C1I4 c1i4 = (C1I4) this.A0C.getValue();
        AbstractC70653Fc abstractC70653Fc = (AbstractC70653Fc) this.A0B.getValue();
        InterfaceC678133v interfaceC678133v = this.A04;
        if (interfaceC678133v != null) {
            this.A05 = new C41161IKa(requireContext2, requireActivity, abstractC70653Fc, c1i4, this, A0r2, interfaceC678133v, gt6, A15, A152, A01, A012);
            ((CreatorInspirationSignalsPlaygroundRecommendationsViewModel) this.A0D.getValue()).fetchSignalRecommendations(AbstractC25225BEi.A15(this.A0G), AbstractC25225BEi.A15(this.A0I));
            C0f9.A09(-583112239, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-937607294, A02);
            throw A0g;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1688478414);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.creator_inspiration_signals_playground_recommendations_fragment, false);
        C0f9.A09(-1549677399, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1399742367);
        super.onDestroy();
        InterfaceC678133v interfaceC678133v = this.A04;
        if (interfaceC678133v != null) {
            interfaceC678133v.release();
        }
        this.A04 = null;
        C0f9.A09(638184299, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1414048960);
        super.onDestroyView();
        ((Gt6) this.A08.getValue()).A0E();
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        C0f9.A09(-794079824, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(713128524);
        super.onPause();
        ((Gt6) this.A08.getValue()).A0F();
        InterfaceC678133v interfaceC678133v = this.A04;
        if (interfaceC678133v != null) {
            interfaceC678133v.EJa(false);
        }
        C0f9.A09(-1922980172, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1584449727);
        super.onResume();
        Gt6 gt6 = (Gt6) this.A08.getValue();
        gt6.A00 = false;
        Gt6.A01(gt6);
        C0f9.A09(-2027532333, A02);
    }
}
