package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ENl extends C53Z implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "InsightsWelcomeFragment";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131964517);
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        boolean z = false;
        if (abstractC10360h2 != null && abstractC10360h2.A0L() > 0) {
            z = true;
        }
        interfaceC56362iU.EkS(z);
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A06 = AbstractC31174DnI.A09(requireContext(), R.color.igds_secondary_text);
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "get_insights_welcome";
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1998957105);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.get_insights_welcome_fragment, viewGroup, false);
        ImageView A0D = AbstractC31176DnK.A0D(inflate, R.id.image);
        A0D.setVisibility(0);
        A0D.setImageResource(R.drawable.insights);
        AbstractC31177DnL.A0p(requireContext(), A0D, AbstractC53242c7.A08(requireContext()));
        AbstractC31180DnO.A06(inflate).setText(2131963208);
        AbstractC31176DnK.A0E(inflate).setText(2131956618);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.login_button);
        TextView A0N2 = AbstractC167007dF.A0N(inflate, R.id.explanation_message);
        String A0v = AbstractC25227BEk.A0v(this, 2131962235);
        String A0w = AbstractC31174DnI.A0w(this, A0v, 2131956617);
        C14360o3.A07(A0w);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0w);
        AnonymousClass773.A05(A0H, new C33246Elg(requireContext(), getSession(), "https://www.facebook.com/policies/ads/#data_use_restrictions", requireContext().getColor(R.color.igds_link)), A0v);
        AbstractC31176DnK.A1G(A0N2, A0H);
        A0N.setText(2131956791);
        ViewOnClickListenerC35690FpP.A01(A0N, 50, this);
        C0f9.A09(-1787103082, A02);
        return inflate;
    }
}
