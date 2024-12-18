package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EJ2 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PrivacyBundleNuxFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "privacy_bundle_nux_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((C64P) AbstractC166987dD.A0c(view, R.id.continue_button)).setPrimaryActionOnClickListener(new ViewOnClickListenerC35666Fp0(this, 35));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        C3LO A0I = AbstractC31176DnK.A0I();
        A0I.A05 = 2131954754;
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35666Fp0(this, 34), A0I, interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-925501931);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.privacy_bundle_education_fragment, viewGroup, false);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166987dD.A0c(inflate, R.id.privacy_bundle_nux_title_textview);
        igdsHeadline.requestFocus();
        C35228FgL A01 = C35228FgL.A01(requireContext(), true);
        A01.A04(AbstractC166997dE.A0N(this).getString(2131969926), AbstractC166997dE.A0N(this).getString(2131969923), R.drawable.instagram_lock_pano_outline_24);
        A01.A04(AbstractC166997dE.A0N(this).getString(2131969927), AbstractC166997dE.A0N(this).getString(2131969924), R.drawable.instagram_undo_pano_outline_24);
        C35228FgL.A02(A01, igdsHeadline, AbstractC166997dE.A0N(this).getString(2131969928), AbstractC166997dE.A0N(this).getString(2131969925), R.drawable.instagram_delete_pano_outline_24);
        C0f9.A09(-427511778, A02);
        return inflate;
    }
}
