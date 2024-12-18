package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EJS extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AiCharacterQuickCaptureBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            interfaceC56362iU.Ect("Cancel", onClickListener);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.ai_character_disclaimer_headline);
        Context requireContext = requireContext();
        requireContext.getResources();
        C35228FgL A01 = C35228FgL.A01(requireContext, true);
        A01.A04(AbstractC166997dE.A0N(this).getString(2131952607), AbstractC166997dE.A0N(this).getString(2131952605), R.drawable.instagram_app_imessage_pano_outline_24);
        C35228FgL.A02(A01, igdsHeadline, AbstractC166997dE.A0N(this).getString(2131952608), AbstractC166997dE.A0N(this).getString(2131952606), R.drawable.instagram_gen_ai_pano_outline_24);
        igdsHeadline.A0D();
        C64P c64p = (C64P) view.findViewById(R.id.ai_character_disclaimer_bottom_button_layout);
        Context requireContext2 = requireContext();
        Resources resources = requireContext2.getResources();
        c64p.setDividerVisible(false);
        c64p.setPrimaryAction(resources.getString(2131952611), this.A01);
        c64p.setSecondaryAction(resources.getString(2131952610), new ViewOnClickListenerC35684FpJ(10, requireContext2, this, resources));
        TextView A0e = AbstractC166987dD.A0e(view, R.id.ai_character_disclaimer_bottom_button_footer_text);
        Context requireContext3 = requireContext();
        Resources resources2 = requireContext3.getResources();
        String A0q = AbstractC166997dE.A0q(resources2, 2131952604);
        C52790NXz c52790NXz = new C52790NXz(requireContext3, this, A0q, requireContext3.getColor(AbstractC53242c7.A06(getActivity())));
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC166997dE.A0r(resources2, A0q, 2131952609));
        AnonymousClass773.A05(A0H, c52790NXz, A0q);
        A0e.setText(A0H);
        A0e.setMovementMethod(C6R6.A00);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("moduleName");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1033765028);
        super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            C0f9.A09(1841011209, A02);
        } else {
            IllegalStateException A14 = AbstractC166987dD.A14("module name required");
            C0f9.A09(849643742, A02);
            throw A14;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-990592128);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_character_disclaimer_sheet_fragment, viewGroup, false);
        C0f9.A09(-108991310, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1096141369);
        super.onDestroyView();
        C0f9.A09(-989147747, A02);
    }
}
