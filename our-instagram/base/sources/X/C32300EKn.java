package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.Locale;

/* renamed from: X.EKn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32300EKn extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenFlaggedFormErrorFragment";
    public P4X A00;
    public Long A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "lead_gen_flagged_form_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) AbstractC166997dE.A0R(view, R.id.warning_headline);
        Context requireContext = requireContext();
        UserSession A0r = AbstractC166987dD.A0r(this.A02);
        FragmentActivity activity = getActivity();
        C14360o3.A0B(A0r, 1);
        String A0p = AbstractC166997dE.A0p(requireContext, 2131964988);
        String A0b = AbstractC31177DnL.A0b(requireContext, A0p, 2131964991);
        String A0p2 = AbstractC166997dE.A0p(requireContext, 2131964989);
        SpannableStringBuilder A01 = C55218Oeh.A01(requireContext, A0b);
        AnonymousClass773.A05(A01, new C52788NXx(activity, requireContext, A0r, "https://transparency.fb.com/policies/community-standards/", requireContext.getColor(AbstractC53242c7.A06(requireContext))), A0p);
        String A00 = AbstractC111324zv.A00(230);
        A01.append((CharSequence) System.getProperty(A00));
        A01.append((CharSequence) System.getProperty(A00));
        A01.append((CharSequence) A0p2);
        igdsHeadline.setBody(A01);
        ((C64P) AbstractC166997dE.A0R(view, R.id.action_bottom_button)).setPrimaryAction(getString(2131964990), new ViewOnClickListenerC35677FpC(this, 13));
        ViewOnClickListenerC35677FpC.A00(AbstractC166997dE.A0S(view, R.id.learn_more_button), 14, this);
        P4X p4x = this.A00;
        if (p4x == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        P4X.A00(p4x, this.A01, "lead_gen_flagged_form", "flagged_form_warning_screen_impression", "impression", AbstractC31172DnG.A16(Locale.ROOT, "FLAGGED_FORM")).Cht();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        P4X p4x = this.A00;
        if (p4x == null) {
            AbstractC31171DnF.A0s();
            throw C00O.createAndThrow();
        }
        P4X.A00(p4x, this.A01, "lead_gen_flagged_form", "cancel", "click", AbstractC31172DnG.A16(Locale.ROOT, "FLAGGED_FORM")).Cht();
        AbstractC25231BEo.A0c(requireActivity(), this.A02).A06();
        return true;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        interfaceC56362iU.Ehd(new C3LY(AbstractC31174DnI.A0K()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1431128638);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A02;
        this.A01 = AbstractC25233BEq.A0n(AbstractC31178DnM.A0U(interfaceC09390do).A03.getFbidV2());
        this.A00 = new P4X(this, AbstractC166987dD.A0r(interfaceC09390do));
        C0f9.A09(-96315852, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-873153192);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.lead_gen_flagged_form_view, viewGroup, false);
        C0f9.A09(-1207172609, A02);
        return inflate;
    }
}
