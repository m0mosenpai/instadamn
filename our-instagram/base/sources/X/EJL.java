package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.actionbar.ActionButton;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes6.dex */
public final class EJL extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BusinessEnableNativeCallingFragment";
    public BusinessFlowAnalyticsLogger A00;
    public IgdsSwitch A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public ActionButton A05;
    public final Handler A06 = AbstractC167007dF.A0J();
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "Business enable native calling";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        TextView A0N = AbstractC167007dF.A0N(view, R.id.enable_calling_text);
        View A0S = AbstractC166997dE.A0S(view, R.id.enable_calling_toggle);
        String A0p = AbstractC166997dE.A0p(requireContext, 2131965052);
        SpannableStringBuilder A05 = AbstractC31175DnJ.A05(requireContext, 2131954414);
        AnonymousClass773.A04(A05, new Em0(requireContext, this, AbstractC31173DnH.A01(requireContext)), A0p);
        AbstractC31176DnK.A1G(A0N, A05);
        AbstractC31180DnO.A06(A0S).setText(2131954427);
        IgdsSwitch igdsSwitch = (IgdsSwitch) A0S.requireViewById(R.id.toggle);
        igdsSwitch.setChecked(this.A03);
        igdsSwitch.A07 = new G9H(this, 0);
        this.A01 = igdsSwitch;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = "Instagram Calling";
        A00.A00 = R.drawable.instagram_arrow_back_24;
        ActionButton A002 = C31722DwR.A00(new Fp1(this, 65), interfaceC56362iU, A00);
        A002.setEnabled(true);
        this.A05 = A002;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(2144852060);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_profile_audio_call_enabled", false);
        this.A04 = requireArguments.getBoolean("maybe_show_confirmation_dialog", false);
        this.A02 = AbstractC31171DnF.A0Z(requireArguments);
        C0f9.A09(-686228201, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-524724417);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.business_enable_native_calling_layout, viewGroup, false);
        C0f9.A09(1488042307, A02);
        return inflate;
    }
}
