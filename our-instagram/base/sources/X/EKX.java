package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EKX extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AvatarCoinFlipExpandedViewFragment";
    public ViewGroup A00;
    public ViewGroup A01;
    public AvatarCoinFlipConfig A02;
    public AvatarCoinFlipConfig A03;
    public EnumC152426tV A04;
    public ProfileCoinFlipView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public ExtendedImageUrl A09;
    public C70L A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Intent A0H;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0J = AbstractC25225BEi.A0a(C37048GUe.A00(this, 30), C37048GUe.A00(this, 26), new MHV(24, (Object) null, this), AbstractC25225BEi.A1D(C31370Dqa.class));
    public final InterfaceC09390do A0I = AbstractC25225BEi.A0a(C37048GUe.A00(this, 31), C37048GUe.A00(this, 25), new MHV(25, (Object) null, this), AbstractC25225BEi.A1D(C31843DzA.class));

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "avatar_coin_flip_mimicry";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        String str;
        ViewGroup viewGroup2;
        ProfileCoinFlipView profileCoinFlipView;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.postponeEnterTransition();
        }
        this.A00 = AbstractC31173DnH.A0F(view, R.id.expanded_coin_flip_container);
        this.A01 = AbstractC31173DnH.A0F(view, R.id.expanded_coin_flip_gesture_detector);
        this.A05 = (ProfileCoinFlipView) view.requireViewById(R.id.expanded_coin_flip_view);
        this.A08 = AbstractC31172DnG.A0Z(view, R.id.close_button);
        this.A07 = AbstractC31172DnG.A0X(view, R.id.enable_coin_flip_button);
        this.A06 = AbstractC31172DnG.A0X(view, R.id.create_avatar_button);
        InterfaceC09390do interfaceC09390do = this.A0L;
        if (!AbstractC31248DoW.A00(AbstractC166987dD.A0r(interfaceC09390do)) && (viewGroup2 = this.A00) != null && (profileCoinFlipView = this.A05) != null) {
            C55942hf c55942hf = AbstractC669130i.A00;
            C14360o3.A08(c55942hf);
            this.A0A = new C70L(viewGroup2, profileCoinFlipView, c55942hf);
        }
        ProfileCoinFlipView profileCoinFlipView2 = this.A05;
        if (profileCoinFlipView2 != null) {
            C74K.A03(AbstractC166997dE.A0L(profileCoinFlipView2), profileCoinFlipView2, AbstractC166987dD.A0r(interfaceC09390do), null, R.dimen.avatar_size_coin_flip_expanded_view);
            AbstractC56952jT.A01(profileCoinFlipView2);
            ExtendedImageUrl extendedImageUrl = this.A09;
            if (extendedImageUrl == null) {
                str = "externalUserProfilePicUrl";
            } else {
                profileCoinFlipView2.setProfilePicUrl(extendedImageUrl, this);
                profileCoinFlipView2.setCameraDistance(AbstractC166997dE.A0N(this).getDisplayMetrics().heightPixels * AbstractC166997dE.A0N(this).getDisplayMetrics().density);
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                Context requireContext = requireContext();
                AvatarCoinFlipConfig avatarCoinFlipConfig = this.A02;
                if (avatarCoinFlipConfig != null) {
                    C74O A00 = C74K.A00(requireContext, A0r, avatarCoinFlipConfig.A06.A03, r6.A02 / r6.A01, R.dimen.avatar_size_coin_flip_expanded_view);
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    Context requireContext2 = requireContext();
                    AvatarCoinFlipConfig avatarCoinFlipConfig2 = this.A02;
                    if (avatarCoinFlipConfig2 != null) {
                        profileCoinFlipView2.setAvatarDrawables(AbstractC16960so.A1Q(A00, C74K.A00(requireContext2, A0r2, avatarCoinFlipConfig2.A05.A03, r6.A02 / r6.A01, R.dimen.avatar_size_coin_flip_expanded_view)));
                        EnumC152426tV enumC152426tV = this.A04;
                        str = "initialCoinSide";
                        if (enumC152426tV != null) {
                            profileCoinFlipView2.A0F(enumC152426tV);
                            EnumC152426tV enumC152426tV2 = this.A04;
                            if (enumC152426tV2 != null) {
                                if (enumC152426tV2 == EnumC152426tV.A02) {
                                    ((AbstractC1569172v) profileCoinFlipView2).A01.setAvatarScale(1.0f);
                                }
                                Context requireContext3 = requireContext();
                                AvatarCoinFlipConfig avatarCoinFlipConfig3 = this.A02;
                                if (avatarCoinFlipConfig3 != null) {
                                    C74K.A01(requireContext3, avatarCoinFlipConfig3, profileCoinFlipView2, this, AbstractC166987dD.A0r(interfaceC09390do));
                                    ViewGroup viewGroup3 = this.A01;
                                    if (viewGroup3 != null) {
                                        boolean A01 = AbstractC31248DoW.A01(AbstractC166987dD.A0r(interfaceC09390do));
                                        EnumC152426tV enumC152426tV3 = this.A04;
                                        if (enumC152426tV3 != null) {
                                            new C74H(viewGroup3, enumC152426tV3, profileCoinFlipView2, null, C37048GUe.A00(this, 28), C37048GUe.A00(this, 29), GTL.A00, GTM.A00, A01, true, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F("externalCoinFlipConfig");
                throw C00O.createAndThrow();
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IgImageView igImageView = this.A08;
        if (igImageView != null) {
            AbstractC31177DnL.A0p(requireContext(), igImageView, AbstractC31174DnI.A05(this));
        }
        C70L c70l = this.A0A;
        if (c70l != null) {
            C55982hj c55982hj = c70l.A00;
            c55982hj.A05(0.0d);
            c55982hj.A03();
        }
        A00(this);
        if (!this.A0D && (viewGroup = this.A00) != null) {
            AbstractC31172DnG.A1B(requireContext(), viewGroup, AbstractC53242c7.A0H(getContext(), R.attr.igds_color_secondary_background));
        }
        ViewGroup viewGroup4 = this.A00;
        if (viewGroup4 != null) {
            Fp1.A00(viewGroup4, 16, this);
        }
        IgImageView igImageView2 = this.A08;
        if (igImageView2 != null) {
            Fp1.A00(igImageView2, 17, this);
        }
        IgTextView igTextView = this.A07;
        if (igTextView != null) {
            Fp1.A00(igTextView, 18, this);
        }
        IgTextView igTextView2 = this.A06;
        if (igTextView2 != null) {
            Fp1.A00(igTextView2, 19, this);
        }
        ProfileCoinFlipView profileCoinFlipView3 = this.A05;
        if (profileCoinFlipView3 != null) {
            ((AbstractC1569172v) profileCoinFlipView3).A01.setTransitionName(AbstractC111324zv.A00(744));
            ((AbstractC1569172v) profileCoinFlipView3).A02.setTransitionName(AbstractC111324zv.A00(1966));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.startPostponedEnterTransition();
        }
        AbstractC31180DnO.A1F(this, ((C31370Dqa) this.A0J.getValue()).A02, new C50262MHr(this, 18), 39);
    }

    public static final void A00(EKX ekx) {
        EnumC152426tV enumC152426tV;
        ViewGroup viewGroup = ekx.A00;
        if (viewGroup != null) {
            UK9 uk9 = new UK9();
            uk9.A0d(200L);
            AbstractC66022TyK.A02(viewGroup, uk9);
        }
        AvatarCoinFlipConfig avatarCoinFlipConfig = ekx.A03;
        int i = 0;
        if (avatarCoinFlipConfig == null || !avatarCoinFlipConfig.A08) {
            ProfileCoinFlipView profileCoinFlipView = ekx.A05;
            if (profileCoinFlipView != null) {
                enumC152426tV = profileCoinFlipView.A01;
            } else {
                enumC152426tV = null;
            }
            if (enumC152426tV != EnumC152426tV.A03) {
                IgTextView igTextView = ekx.A07;
                if (igTextView != null) {
                    igTextView.setVisibility(AbstractC167007dF.A05(ekx.A0C ? 1 : 0));
                }
                IgTextView igTextView2 = ekx.A06;
                if (igTextView2 == null) {
                    return;
                }
                if (ekx.A0C) {
                    i = 8;
                }
                igTextView2.setVisibility(i);
                return;
            }
        }
        IgTextView igTextView3 = ekx.A07;
        if (igTextView3 != null) {
            igTextView3.setVisibility(8);
        }
        IgTextView igTextView4 = ekx.A06;
        if (igTextView4 != null) {
            igTextView4.setVisibility(8);
        }
    }

    public static final void A01(EKX ekx) {
        Intent intent = ekx.A0H;
        intent.putExtra(AbstractC111324zv.A00(5586), ekx.A0G);
        ProfileCoinFlipView profileCoinFlipView = ekx.A05;
        EnumC152426tV enumC152426tV = null;
        if (profileCoinFlipView != null) {
            enumC152426tV = profileCoinFlipView.A01;
        }
        intent.putExtra(AbstractC111324zv.A00(5360), AbstractC167007dF.A1X(enumC152426tV, EnumC152426tV.A03));
        AbstractC31176DnK.A18(intent, ekx);
        if (AbstractC31248DoW.A00(AbstractC166987dD.A0r(ekx.A0L))) {
            EnumC152426tV enumC152426tV2 = ekx.A04;
            if (enumC152426tV2 == null) {
                C14360o3.A0F("initialCoinSide");
                throw C00O.createAndThrow();
            }
            ProfileCoinFlipView profileCoinFlipView2 = ekx.A05;
            if (profileCoinFlipView2 != null && enumC152426tV2 == profileCoinFlipView2.A01) {
                ekx.requireActivity().finishAfterTransition();
                return;
            }
        }
        AbstractC25227BEk.A1B(ekx);
    }

    public static final void A02(EKX ekx, boolean z) {
        if (z) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(AbstractC166987dD.A0o(ekx.A0L)), "expandable_profile_picture_action");
            if (A0f.isSampled()) {
                AbstractC31174DnI.A1G(A0f, AbstractC167007dF.A0n("action", "Add your avatar to profile"));
            }
        }
        FragmentActivity requireActivity = ekx.requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(ekx.A0L);
        AvatarCoinFlipConfig avatarCoinFlipConfig = ekx.A03;
        DialogInterfaceOnClickListenerC35452Fk9 A00 = DialogInterfaceOnClickListenerC35452Fk9.A00(ekx, 10);
        DialogInterfaceOnClickListenerC35452Fk9 A002 = DialogInterfaceOnClickListenerC35452Fk9.A00(ekx, 11);
        Boolean A0a = AbstractC166997dE.A0a();
        C14360o3.A0B(A0r, 1);
        View inflate = LayoutInflater.from(requireActivity).inflate(R.layout.avatar_coin_flip_nux_dialogue_fragment, (ViewGroup) null);
        C14360o3.A07(inflate);
        if (A0a.equals(true)) {
            TextView A0Q = AbstractC25230BEn.A0Q(inflate, R.id.avatar_coin_flip_dialog_nux_title);
            TextView A0Q2 = AbstractC25230BEn.A0Q(inflate, R.id.avatar_coin_flip_dialog_nux_subtitle);
            A0Q.setText(2131953448);
            A0Q2.setText(2131953447);
        }
        AbstractC34758FSx.A01(inflate, avatarCoinFlipConfig, ekx, A0r);
        C193328hC A0H = AbstractC31171DnF.A0H(requireActivity);
        A0H.A0l(inflate);
        A0H.A0J(A00, 2131952271);
        A0H.A0I(A002, 2131953458);
        A0H.A0t(true);
        A0H.A0s(true);
        A0H.A09 = true;
        AbstractC166987dD.A1W(A0H);
        C31843DzA c31843DzA = (C31843DzA) ekx.A0I.getValue();
        if (c31843DzA != null) {
            c31843DzA.A00("ig_external_profile", C05F.A00, null);
        }
    }

    public static final void A03(EKX ekx, boolean z) {
        ekx.A0E = z;
        ((C31370Dqa) ekx.A0J.getValue()).A02(null, AbstractC166997dE.A0a());
        IgTextView igTextView = ekx.A07;
        if (igTextView != null) {
            igTextView.setVisibility(8);
        }
        IgTextView igTextView2 = ekx.A06;
        if (igTextView2 != null) {
            igTextView2.setVisibility(8);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0L);
    }

    public EKX() {
        C37048GUe A00 = C37048GUe.A00(this, 27);
        InterfaceC09390do A002 = AbstractC09440dt.A00(EnumC09460dv.A02, C37048GUe.A00(C37048GUe.A00(this, 32), 33));
        this.A0K = AbstractC25225BEi.A0a(C37048GUe.A00(A002, 34), A00, new MHV(26, (Object) null, A002), AbstractC25225BEi.A1D(C143266dR.class));
        this.A0H = AbstractC31171DnF.A04();
        this.A0L = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A01(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        EnumC152426tV enumC152426tV;
        int A02 = C0f9.A02(1126517521);
        super.onCreate(bundle);
        this.A03 = (AvatarCoinFlipConfig) requireArguments().getParcelable(AbstractC111324zv.A00(3951));
        AvatarCoinFlipConfig avatarCoinFlipConfig = (AvatarCoinFlipConfig) requireArguments().getParcelable(AbstractC111324zv.A00(3943));
        if (avatarCoinFlipConfig != null) {
            this.A02 = avatarCoinFlipConfig;
            String string = requireArguments().getString(AbstractC111324zv.A00(3944));
            if (string != null) {
                this.A0B = string;
                ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) requireArguments().getParcelable(AbstractC111324zv.A00(3945));
                if (extendedImageUrl != null) {
                    this.A09 = extendedImageUrl;
                    Serializable serializable = requireArguments().getSerializable(AbstractC111324zv.A00(3947));
                    if ((serializable instanceof EnumC152426tV) && (enumC152426tV = (EnumC152426tV) serializable) != null) {
                        this.A04 = enumC152426tV;
                        this.A0F = requireArguments().getBoolean(AbstractC111324zv.A00(3955));
                        this.A0D = requireArguments().getBoolean(AbstractC111324zv.A00(3940));
                        AbstractC166987dD.A1Z(new MCJ(this, null, 4), C07Y.A00(this));
                        if (this.A03 == null) {
                            ((C31370Dqa) this.A0J.getValue()).A02(null, AbstractC166997dE.A0a());
                        }
                        C0f9.A09(-1615825055, A02);
                        return;
                    }
                    A14 = AbstractC166987dD.A14("initial coin side is required");
                    i = 281618707;
                } else {
                    A14 = AbstractC166987dD.A14("external user profile pic url required");
                    i = 2143287770;
                }
            } else {
                A14 = AbstractC166987dD.A14("external user id required");
                i = -62862862;
            }
        } else {
            A14 = AbstractC166987dD.A14("external coin flip config required");
            i = -1992200890;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(313554354);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.avatar_coin_flip_expanded_view_fragment, viewGroup, false);
        C0f9.A09(-170374961, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-937705889);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        this.A08 = null;
        this.A07 = null;
        this.A06 = null;
        C0f9.A09(791779237, A02);
    }
}
