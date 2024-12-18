package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EJI extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentNuxFragment";
    public boolean A00;
    public final InterfaceC09390do A02 = C37050GUg.A00(this, 46);
    public final InterfaceC09390do A03 = C37050GUg.A00(this, 47);
    public final InterfaceC09390do A01 = C37050GUg.A00(this, 45);
    public final InterfaceC09390do A04 = C37050GUg.A00(this, 49);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Ect(getString(2131954754), ViewOnClickListenerC35681FpG.A00(this, 12));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "AiAgentUpsellInterstitialFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C35228FgL c35228FgL;
        String string;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.interstitial_headline);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A05;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C14360o3.A0B(A0o, 1);
        Resources resources = requireContext.getResources();
        boolean z = true;
        int i2 = 4;
        if (C18U.A06(C06090Tz.A05, A0o, 36319368739691771L)) {
            c35228FgL = new C35228FgL(requireContext, (Boolean) z, i2);
            c35228FgL.A04(resources.getString(2131952596), resources.getString(2131952593), R.drawable.instagram_gen_ai_pano_outline_24);
            c35228FgL.A04(resources.getString(2131952594), resources.getString(2131952592), R.drawable.instagram_user_circle_pano_outline_24);
            string = resources.getString(2131952599);
            i = 2131952598;
        } else {
            c35228FgL = new C35228FgL(requireContext, (Boolean) z, i2);
            c35228FgL.A04(resources.getString(2131952594), resources.getString(2131952592), R.drawable.instagram_user_circle_pano_outline_24);
            c35228FgL.A04(resources.getString(2131952596), resources.getString(2131952595), R.drawable.instagram_gen_ai_pano_outline_24);
            string = resources.getString(2131952599);
            i = 2131952597;
        }
        C35228FgL.A02(c35228FgL, igdsHeadline, string, resources.getString(i), R.drawable.instagram_channels_pano_outline_24);
        igdsHeadline.A0D();
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.interstitial_bottom_button_layout);
        Resources A0N = AbstractC166997dE.A0N(this);
        igdsBottomButtonLayout.setPrimaryAction(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131952574), ViewOnClickListenerC35681FpG.A00(this, 13));
        igdsBottomButtonLayout.setSecondaryAction(A0N.getString(2131952575), ViewOnClickListenerC35681FpG.A00(this, 14));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        igdsBottomButtonLayout.setFooterAboveActionText(F1Z.A00(requireContext(), requireActivity(), A0r, C2Fb.A49));
        C7F3 A0c = AbstractC31172DnG.A0c(this.A02);
        EnumC33519Ers enumC33519Ers = (EnumC33519Ers) this.A03.getValue();
        C25531Mh A0H = AbstractC31172DnG.A0H(A0c);
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(11);
            A0H.A0X(1);
            A0H.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0H.Cht();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1807576037);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_ai_agent_upsell_interstitial, false);
        C0f9.A09(-355416030, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1272043933);
        super.onDestroy();
        if (!this.A00) {
            C7F3 A0c = AbstractC31172DnG.A0c(this.A02);
            EnumC33519Ers enumC33519Ers = (EnumC33519Ers) this.A03.getValue();
            C25531Mh A0H = AbstractC31172DnG.A0H(A0c);
            if (AbstractC25226BEj.A1Z(A0H)) {
                A0H.A0Z(11);
                A0H.A0X(0);
                A0H.A0M(enumC33519Ers, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0H.A0R("selected_item", "cancel");
                A0H.Cht();
            }
        }
        C0f9.A09(5205132, A02);
    }
}
