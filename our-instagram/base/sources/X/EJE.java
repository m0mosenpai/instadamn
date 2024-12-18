package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EJE extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiAgentAssistantDisclaimerInterstitialFragment";
    public boolean A00;
    public final InterfaceC09390do A01 = C37050GUg.A00(this, 41);
    public final InterfaceC09390do A02 = C37050GUg.A00(this, 42);
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        if (!AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(this.A03), 36329272931139816L).booleanValue()) {
            interfaceC56362iU.Ect(getString(2131954754), ViewOnClickListenerC35681FpG.A00(this, 9));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Resources A0N;
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC13880nE.A0O(view);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.interstitial_headline);
        InterfaceC09390do interfaceC09390do = this.A03;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!AbstractC166997dE.A0c(c06090Tz, A0o, 36329272931139816L).booleanValue()) {
            boolean A06 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36329985895973485L);
            int i2 = R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_100;
            if (A06) {
                i2 = R.drawable.instagram_icons_exceptions_genai_agent_new_profile_filled_100;
            }
            igdsHeadline.setImageResource(i2);
        }
        Context requireContext = requireContext();
        requireContext.getResources();
        boolean A062 = C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36319368739691771L);
        C35228FgL A00 = C35228FgL.A00(requireContext, AbstractC166997dE.A0b());
        if (A062) {
            A00.A04(AbstractC166997dE.A0N(this).getString(2131952556), AbstractC166997dE.A0N(this).getString(2131952555), R.drawable.instagram_group_pano_outline_24);
            A00.A04(AbstractC166997dE.A0N(this).getString(2131952558), AbstractC166997dE.A0N(this).getString(2131952557), R.drawable.instagram_gen_ai_pano_outline_24);
            string = AbstractC166997dE.A0N(this).getString(2131952561);
            A0N = AbstractC166997dE.A0N(this);
            i = 2131952560;
        } else {
            A00.A04(AbstractC166997dE.A0N(this).getString(2131952556), AbstractC166997dE.A0N(this).getString(2131952554), R.drawable.instagram_group_pano_outline_24);
            A00.A04(AbstractC166997dE.A0N(this).getString(2131952558), AbstractC166997dE.A0N(this).getString(2131952557), R.drawable.instagram_gen_ai_pano_outline_24);
            string = AbstractC166997dE.A0N(this).getString(2131952561);
            A0N = AbstractC166997dE.A0N(this);
            i = 2131952559;
        }
        C35228FgL.A02(A00, igdsHeadline, string, A0N.getString(i), R.drawable.instagram_channels_pano_outline_24);
        igdsHeadline.A0D();
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) view.findViewById(R.id.interstitial_bottom_button_layout);
        Resources A0N2 = AbstractC166997dE.A0N(this);
        int i3 = 2131952576;
        if (!AbstractC166997dE.A0c(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36329272931139816L).booleanValue()) {
            i3 = 2131952574;
        }
        igdsBottomButtonLayout.setPrimaryAction(A0N2.getString(i3), ViewOnClickListenerC35681FpG.A00(this, 10));
        igdsBottomButtonLayout.setSecondaryAction(A0N2.getString(2131952575), ViewOnClickListenerC35681FpG.A00(this, 11));
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        igdsBottomButtonLayout.setFooterAboveActionText(F1Z.A00(requireContext(), requireActivity(), A0r, C2Fb.A0L));
        AbstractC31172DnG.A0c(this.A01).A07((EnumC33519Ers) this.A02.getValue());
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2003358801);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_ai_agent_assistant_disclaimer_interstitial, false);
        C0f9.A09(1796079822, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1294277758);
        super.onDestroy();
        if (!this.A00) {
            AbstractC31172DnG.A0c(this.A01).A06((EnumC33519Ers) this.A02.getValue());
        }
        C0f9.A09(-1468242148, A02);
    }
}
