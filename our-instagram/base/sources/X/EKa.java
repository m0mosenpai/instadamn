package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.RefreshSpinner;

/* loaded from: classes6.dex */
public final class EKa extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AvatarCoinFlipCustomizationFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public ProfileCoinFlipView A02;
    public C66362zD A03;
    public C66362zD A04;
    public IgdsBottomButtonLayout A05;
    public RefreshSpinner A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C56352iT A0B;
    public IgView A0C;
    public IgView A0D;
    public final Intent A0E;
    public final G85 A0F;
    public final G85 A0G;
    public final G85 A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final C35909FtT A0M;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "avatar_coin_flip_customization";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.postponeEnterTransition();
        }
        this.A00 = AbstractC31172DnG.A0G(view, R.id.avatar_background_grid);
        this.A01 = AbstractC31172DnG.A0G(view, R.id.avatar_pose_grid);
        this.A05 = AbstractC31172DnG.A0j(view, R.id.update_coin_flip_button);
        this.A02 = (ProfileCoinFlipView) view.requireViewById(R.id.avatar_preview);
        this.A06 = (RefreshSpinner) view.requireViewById(R.id.loading_spinner);
        this.A0C = (IgView) view.requireViewById(R.id.grid_separator);
        this.A0D = (IgView) view.requireViewById(R.id.preview_separator);
        C66392zG A0R = AbstractC31174DnI.A0R(this);
        InterfaceC09390do interfaceC09390do = this.A0L;
        C66362zD A0R2 = AbstractC31173DnH.A0R(A0R, new C32649EYx(this, AbstractC166987dD.A0r(interfaceC09390do)));
        this.A03 = A0R2;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter(A0R2);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 1, 0, false);
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.A10(new C195638l4(false, AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.accent_edge_thickness), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap), 0));
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(gridLayoutManager);
        }
        C66362zD A0R3 = AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new C32650EYy(AbstractC166987dD.A0r(interfaceC09390do), requireContext()));
        this.A04 = A0R3;
        RecyclerView recyclerView4 = this.A01;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(A0R3);
        }
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(requireContext(), 3, 1, false);
        RecyclerView recyclerView5 = this.A01;
        if (recyclerView5 != null) {
            recyclerView5.A10(new C195638l4(true, AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AbstractC166997dE.A0N(this).getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), 0));
        }
        RecyclerView recyclerView6 = this.A01;
        if (recyclerView6 != null) {
            recyclerView6.setLayoutManager(gridLayoutManager2);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 28);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcq, A00);
        AbstractC167007dF.A0x(this.A05);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A05;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionOnClickListener(new Fp1(this, 15));
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A05;
        if (igdsBottomButtonLayout2 != null) {
            igdsBottomButtonLayout2.setDividerVisible(true);
        }
        C07X viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC23641Du.A05(anonymousClass191, new MCQ(viewLifecycleOwner2, c07s, this, null, 29), C07Y.A00(viewLifecycleOwner2));
        if (this.A0A) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.setEnterSharedElementCallback(new SharedElementCallbackC31732Dwd(this));
            }
        } else {
            A03(this);
        }
        InterfaceC09390do interfaceC09390do2 = this.A0K;
        if (!((C31370Dqa) interfaceC09390do2.getValue()).A0A.A00.A00.getBoolean("KEY_HAS_SEEN_CUSTOMIZATION_LAUNCH_ON_EDIT_PROFILE", false)) {
            String str2 = this.A07;
            str = "previousEditorSurface";
            if (str2 != null) {
                if (str2.equals("ig_edit_profile")) {
                    AbstractC31177DnL.A1N(((C31370Dqa) interfaceC09390do2.getValue()).A0A.A00.A00, "KEY_HAS_SEEN_CUSTOMIZATION_LAUNCH_ON_EDIT_PROFILE", true);
                    C31475DsJ c31475DsJ = (C31475DsJ) this.A0I.getValue();
                    String str3 = this.A07;
                    if (str3 != null) {
                        AbstractC33784EwA.A00(c31475DsJ.A01, str3);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        InterfaceC09390do interfaceC09390do3 = this.A0I;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do3);
        AbstractC23641Du.A05(anonymousClass191, new MBq(A0Z, null, 15), AbstractC141776au.A00(A0Z));
        ((C31475DsJ) interfaceC09390do3.getValue()).A05(AbstractC31248DoW.A03(AbstractC166987dD.A0r(interfaceC09390do)), AbstractC31248DoW.A03(AbstractC166987dD.A0r(interfaceC09390do)));
        InterfaceC09390do interfaceC09390do4 = this.A0J;
        if (AbstractC167007dF.A1Z(((C148236lt) interfaceC09390do4.getValue()).A08)) {
            C07X viewLifecycleOwner3 = getViewLifecycleOwner();
            AbstractC23641Du.A05(anonymousClass191, new MCP(view, viewLifecycleOwner3, this, c07s, null, 17), C07Y.A00(viewLifecycleOwner3));
            ((C148236lt) interfaceC09390do4.getValue()).A02(EnumC143276dS.A0J);
        }
        C31475DsJ c31475DsJ2 = (C31475DsJ) interfaceC09390do3.getValue();
        if (this.A08 && !c31475DsJ2.A03.A00.getBoolean("key_has_seen_coin_flip_pose_deprecated_message", false)) {
            if (C18U.A06(C06090Tz.A05, c31475DsJ2.A02, 36325278611616726L)) {
                c31475DsJ2.A05.F8m(EEM.A00);
            }
        }
        C31475DsJ c31475DsJ3 = (C31475DsJ) interfaceC09390do3.getValue();
        String str4 = this.A07;
        if (str4 == null) {
            str = "previousEditorSurface";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC33784EwA.A00(c31475DsJ3.A01, str4);
    }

    private final AnimatorSet A00(float f, float f2, float f3, float f4) {
        View view;
        Animator[] animatorArr;
        AnimatorSet animatorSet = new AnimatorSet();
        ProfileCoinFlipView profileCoinFlipView = this.A02;
        if (profileCoinFlipView != null) {
            view = profileCoinFlipView.getRootView();
        } else {
            view = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        RecyclerView recyclerView = this.A00;
        Property property = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(recyclerView, (Property<RecyclerView, Float>) property, f3, f4);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.A01, (Property<RecyclerView, Float>) property, f3, f4);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.A0C, (Property<IgView, Float>) property, f3, f4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.A0D, (Property<IgView, Float>) property, f3, f4);
        if (this.A0A) {
            animatorArr = new Animator[]{ofFloat2, ofFloat3, ofFloat4, ofFloat5};
        } else {
            animatorArr = new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5};
        }
        animatorSet.playTogether(animatorArr);
        return animatorSet;
    }

    public static final void A01(AvatarCoinFlipSticker avatarCoinFlipSticker, AvatarCoinFlipSticker avatarCoinFlipSticker2, EKa eKa) {
        ProfileCoinFlipView profileCoinFlipView = eKa.A02;
        if (profileCoinFlipView != null) {
            InterfaceC09390do interfaceC09390do = eKa.A0L;
            C74K.A03(AbstractC166997dE.A0L(profileCoinFlipView), profileCoinFlipView, AbstractC166987dD.A0r(interfaceC09390do), null, R.dimen.avatar_size_coin_flip_expanded_view);
            profileCoinFlipView.setAvatarDrawables(AbstractC16960so.A1Q(C74K.A00(eKa.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), avatarCoinFlipSticker2.A03, avatarCoinFlipSticker2.A00, R.dimen.avatar_size_coin_flip_expanded_view), C74K.A00(eKa.requireContext(), AbstractC166987dD.A0r(interfaceC09390do), avatarCoinFlipSticker.A03, avatarCoinFlipSticker.A00, R.dimen.avatar_size_coin_flip_expanded_view)));
            EnumC152426tV enumC152426tV = EnumC152426tV.A02;
            profileCoinFlipView.A0F(enumC152426tV);
            ((AbstractC1569172v) profileCoinFlipView).A01.setAvatarScale(1.0f);
            C74H c74h = new C74H(profileCoinFlipView, enumC152426tV, profileCoinFlipView, null, GTH.A00, GTI.A00, GTJ.A00, GTK.A00, AbstractC31248DoW.A01(AbstractC166987dD.A0r(interfaceC09390do)), false, false);
            c74h.A08.A05(0.0d);
            c74h.A04(enumC152426tV);
            c74h.A0C.A0D();
        }
        ProfileCoinFlipView profileCoinFlipView2 = eKa.A02;
        if (profileCoinFlipView2 != null) {
            ((AbstractC1569172v) profileCoinFlipView2).A01.setTransitionName(AbstractC111324zv.A00(744));
            ((AbstractC1569172v) profileCoinFlipView2).A02.setTransitionName(AbstractC111324zv.A00(1966));
        }
        FragmentActivity activity = eKa.getActivity();
        if (activity != null) {
            activity.startPostponedEnterTransition();
        }
    }

    public static final void A02(EKa eKa) {
        View view = eKa.mView;
        if (view != null) {
            C56352iT A01 = C56342iS.A01(ViewOnClickListenerC35650Fok.A00, AbstractC31176DnK.A0C(view, R.id.action_bar_container));
            eKa.A0B = A01;
            A01.A0X(new Ft8(eKa, 0));
        }
    }

    public static final void A03(EKa eKa) {
        ProfileCoinFlipView profileCoinFlipView;
        View rootView;
        String str = eKa.A07;
        if (str == null) {
            C14360o3.A0F("previousEditorSurface");
            throw C00O.createAndThrow();
        }
        if (str.equals("ig_self_profile")) {
            RecyclerView recyclerView = eKa.A00;
            if (recyclerView != null) {
                recyclerView.setTranslationY(1500.0f);
            }
            RecyclerView recyclerView2 = eKa.A01;
            if (recyclerView2 != null) {
                recyclerView2.setTranslationY(1500.0f);
            }
            IgView igView = eKa.A0C;
            if (igView != null) {
                igView.setTranslationY(1500.0f);
            }
            IgView igView2 = eKa.A0D;
            if (igView2 != null) {
                igView2.setTranslationY(1500.0f);
            }
            if (!eKa.A0A && (profileCoinFlipView = eKa.A02) != null && (rootView = profileCoinFlipView.getRootView()) != null) {
                rootView.setAlpha(0.0f);
            }
            AnimatorSet A00 = eKa.A00(0.0f, 1.0f, 1500.0f, 0.0f);
            A00.setStartDelay(250L);
            A00.setDuration(250L);
            A00.addListener(new C35280FhF(eKa, 1));
            A00.start();
            return;
        }
        A02(eKa);
    }

    public static final void A04(EKa eKa) {
        ViewGroup viewGroup;
        String str = eKa.A07;
        if (str == null) {
            C14360o3.A0F("previousEditorSurface");
            throw C00O.createAndThrow();
        }
        if (str.equals("ig_self_profile")) {
            AnimatorSet A00 = eKa.A00(1.0f, 0.0f, 0.0f, 1500.0f);
            A00.setInterpolator(new DecelerateInterpolator());
            A00.setDuration(250L);
            int i = 3;
            if (eKa.A0A) {
                i = 2;
            }
            A00.addListener(new C35280FhF(eKa, i));
            A00.start();
            C56352iT c56352iT = eKa.A0B;
            if (c56352iT != null && (viewGroup = c56352iT.A0O) != null) {
                viewGroup.setAlpha(0.0f);
                return;
            }
            return;
        }
        AbstractC31181DnP.A0q(eKa);
    }

    public static final void A05(EKa eKa, String str) {
        String str2;
        EnumC143276dS enumC143276dS;
        JZ8 jz8 = AbstractC47193KtS.A01;
        InterfaceC09390do interfaceC09390do = eKa.A0L;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        FragmentActivity requireActivity = eKa.requireActivity();
        if (str == null) {
            str2 = "ig_avatar_coin_flip_customization_menu_item";
        } else {
            str2 = "mux_banner";
        }
        C35909FtT c35909FtT = eKa.A0M;
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        C149736oQ c149736oQ = EnumC143276dS.A01;
        EnumC143286dT enumC143286dT = EnumC143286dT.A0E;
        if (AbstractC31248DoW.A00(A0r2)) {
            enumC143276dS = EnumC143276dS.A0C;
        } else {
            enumC143276dS = EnumC143276dS.A0B;
        }
        jz8.A04(requireActivity, c35909FtT, A0r, AbstractC43591JPw.A00(386), str2, str, AbstractC16960so.A1O(c149736oQ.A00(enumC143276dS, enumC143286dT, A0r2, false)));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    public EKa() {
        C37048GUe A00 = C37048GUe.A00(this, 14);
        C37048GUe A002 = C37048GUe.A00(this, 19);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, C37048GUe.A00(A002, 20));
        this.A0I = AbstractC25225BEi.A0a(C37048GUe.A00(A003, 21), A00, new MHV(22, (Object) null, A003), AbstractC25225BEi.A1D(C31475DsJ.class));
        this.A0K = AbstractC25225BEi.A0a(C37048GUe.A00(this, 18), C37048GUe.A00(this, 16), new MHV(21, (Object) null, this), AbstractC25225BEi.A1D(C31370Dqa.class));
        C37048GUe A004 = C37048GUe.A00(this, 15);
        InterfaceC09390do A005 = AbstractC09440dt.A00(enumC09460dv, C37048GUe.A00(C37048GUe.A00(this, 22), 23));
        this.A0J = AbstractC25225BEi.A0a(C37048GUe.A00(A005, 24), A004, new MHV(23, (Object) null, A005), AbstractC25225BEi.A1D(C148236lt.class));
        this.A0E = AbstractC31171DnF.A04();
        this.A0M = new C35909FtT(this, 1);
        this.A0H = new G85(this, 2);
        this.A0G = new G85(this, 1);
        this.A0F = new G85(this, 0);
        this.A0L = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A04(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-39625063);
        super.onCreate(bundle);
        if (requireArguments().getString("args_avatar_idle_sticker_url") != null) {
            if (requireArguments().getString("args_avatar_pose_sticker_url") != null) {
                requireArguments().getFloat("args_top_margin_ratio");
                String string = requireArguments().getString("args_editor_surface");
                if (string != null) {
                    this.A07 = string;
                    this.A0A = requireArguments().getBoolean("args_shared_element_transition_enabled");
                    this.A09 = requireArguments().getBoolean("args_is_coin_flip_tied_to_avatar");
                    this.A08 = requireArguments().getBoolean("args_has_deprecated_pose");
                    C0f9.A09(-1203244502, A02);
                    return;
                }
                A14 = AbstractC166987dD.A14("editor surface required");
                i = -198640492;
            } else {
                A14 = AbstractC166987dD.A14("avatar sticker required");
                i = -1591589384;
            }
        } else {
            A14 = AbstractC166987dD.A14("avatar sticker required");
            i = 20960056;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        MWT mwt;
        int A02 = C0f9.A02(9133499);
        C14360o3.A0B(layoutInflater, 0);
        AvatarCoinFlipBackgroundOptionResponse avatarCoinFlipBackgroundOptionResponse = (AvatarCoinFlipBackgroundOptionResponse) requireArguments().getParcelable("args_avatar_background");
        if (avatarCoinFlipBackgroundOptionResponse != null) {
            ((C31475DsJ) this.A0I.getValue()).A03(avatarCoinFlipBackgroundOptionResponse);
        }
        String string = requireArguments().getString("args_avatar_pose_id");
        if (string != null) {
            C05A c05a = ((C31475DsJ) this.A0I.getValue()).A06;
            do {
                value = c05a.getValue();
                mwt = (MWT) value;
            } while (!c05a.AIi(value, new MWT(mwt.A00, mwt.A01, mwt.A05, mwt.A02, string, 0)));
        }
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_customization_v2_sheet, viewGroup, false);
        C0f9.A09(1535145735, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(279909912);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
        this.A06 = null;
        C0f9.A09(1197697291, A02);
    }
}
