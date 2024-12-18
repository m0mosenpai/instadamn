package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ef8 extends AbstractC32317ELg {
    public static final String __redex_internal_original_name = "StepperPolicyReviewFragment";
    public FRA A00;
    public EVF A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    @Override // X.AbstractC32317ELg, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(434443901);
        super.onCreate(bundle);
        this.A00 = C35154Few.A00().A00.A05;
        C0f9.A09(2025206310, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-737885762);
        View inflate = layoutInflater.inflate(R.layout.gdpr_stepper_policy_review_layout, viewGroup, false);
        getContext();
        View requireViewById = inflate.requireViewById(R.id.policy_review);
        C14360o3.A0B(requireViewById, 1);
        requireViewById.setTag(new C34555FKp(AbstractC31176DnK.A0C(requireViewById, R.id.paragraphs_container), AbstractC167007dF.A0N(requireViewById, R.id.content_title), AbstractC167007dF.A0N(requireViewById, R.id.terms_of_use_link)));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.agree_button);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.see_other_options_text);
        FRA fra = this.A00;
        if (fra != null) {
            Context requireContext = requireContext();
            AbstractC18680vv abstractC18680vv = super.A00;
            C34555FKp c34555FKp = (C34555FKp) AbstractC31172DnG.A0x(requireViewById);
            C14360o3.A0B(c34555FKp, 2);
            TextView textView = c34555FKp.A01;
            AbstractC35175FfS.A03(textView, requireContext);
            textView.setText(fra.A01);
            ViewGroup viewGroup2 = c34555FKp.A00;
            List list = fra.A03;
            C14360o3.A07(list);
            F80.A00(requireContext, viewGroup2, list);
            C0fQ.A00(new ViewOnClickListenerC35610Fo1(11, requireContext, this, abstractC18680vv, this), c34555FKp.A02);
            if (C35154Few.A00().A03 == C05F.A01) {
                View requireViewById2 = requireViewById.requireViewById(R.id.terms_of_use_link);
                TextView A0T2 = AbstractC166997dE.A0T(requireViewById, R.id.terms_of_use_link_row);
                requireViewById2.setVisibility(8);
                A0T2.setVisibility(0);
                Context requireContext2 = requireContext();
                Em0 em0 = new Em0(AbstractC31174DnI.A0q(requireContext2, R.color.badge_color), requireContext2, this, 10);
                Em0 em02 = new Em0(AbstractC31174DnI.A0q(requireContext2, R.color.badge_color), requireContext2, this, 11);
                String string = getString(2131962966);
                String string2 = getString(2131957507);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(getString(2131975275, string, string2));
                AnonymousClass773.A05(A0H, em0, string);
                AnonymousClass773.A05(A0H, em02, string2);
                AbstractC31176DnK.A1G(A0T2, A0H);
            }
            EVF evf = new EVF(this, progressButton, C35154Few.A00().A08);
            this.A01 = evf;
            registerLifecycleListener(evf);
            AbstractC25227BEk.A11(A0T);
            Context requireContext3 = requireContext();
            C33264Ely c33264Ely = new C33264Ely(requireContext3, A0T, this, AbstractC31174DnI.A0q(requireContext3, R.color.blue_8));
            String A0p = AbstractC166997dE.A0p(requireContext3, 2131969280);
            SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(AbstractC31177DnL.A0b(requireContext3, A0p, 2131973206));
            AnonymousClass773.A05(A0H2, c33264Ely, A0p);
            A0T.setText(A0H2);
        }
        C35208Fg0 A00 = C35208Fg0.A00();
        AbstractC18680vv abstractC18680vv2 = super.A00;
        Integer num = C05F.A01;
        C14360o3.A0B(abstractC18680vv2, 0);
        C14360o3.A0B(num, 1);
        C35208Fg0.A01(this, abstractC18680vv2, A00, num, null);
        C0f9.A09(277949432, A02);
        return inflate;
    }

    @Override // X.AbstractC32317ELg, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-330656224);
        super.onDestroy();
        unregisterLifecycleListener(this.A01);
        C0f9.A09(1448240605, A02);
    }
}
