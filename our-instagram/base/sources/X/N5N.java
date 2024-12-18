package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.bugreporter.BugReportComposerFragment;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.model.BugReport;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class N5N extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GDPRPrivacyCheckFragment";
    public BugReportComposerViewModel A00;
    public C54748OGw A01;
    public InterfaceC58266PsA A02;
    public BugReport A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC60492pY.A01(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        UserSession userSession;
        C14360o3.A0B(interfaceC56362iU, 0);
        if (getSession() instanceof UserSession) {
            AbstractC18680vv session = getSession();
            AbstractC31171DnF.A1Q(session);
            userSession = (UserSession) session;
        } else {
            userSession = null;
        }
        interfaceC56362iU.ESp(userSession, R.layout.bugreporter_actionbar_header, 50, 0);
        interfaceC56362iU.ARb(0, true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_x_pano_outline_24;
        A0B.A05 = 2131953583;
        A0B.A0G = new ViewOnClickListenerC55467OkM(this, 60);
        interfaceC56362iU.A8u(new C3LY(A0B));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "gdpr_consent_for_rageshake";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        OJR ojr = new OJR(requireContext());
        BugReportComposerViewModel bugReportComposerViewModel = this.A00;
        if (bugReportComposerViewModel == null) {
            str = "composerViewModel";
        } else {
            ojr.A01 = bugReportComposerViewModel.A01;
            ojr.A02 = bugReportComposerViewModel.A02;
            ojr.A00 = bugReportComposerViewModel.A00;
            ojr.A04 = bugReportComposerViewModel.A04;
            ojr.A03 = bugReportComposerViewModel.A03;
            ojr.A05 = bugReportComposerViewModel.A05;
            InterfaceC58266PsA interfaceC58266PsA = this.A02;
            if (interfaceC58266PsA == null) {
                str = "userFlowLoggerV2";
            } else {
                interfaceC58266PsA.AW9("gdpr_privacy_check");
                C64P c64p = (C64P) AbstractC166997dE.A0R(view, R.id.rageshake_continue_button);
                c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC55464OkJ(17, this, ojr));
                c64p.setSecondaryActionOnClickListener(new ViewOnClickListenerC55464OkJ(18, this, ojr));
                TextView A0N = AbstractC167007dF.A0N(view, R.id.rageshake_span_with_link);
                String A0v = AbstractC25227BEk.A0v(this, 2131954370);
                String A0w = AbstractC31174DnI.A0w(this, A0v, 2131971472);
                C14360o3.A0A(A0w);
                AbstractC25227BEk.A11(A0N);
                Context A0L = AbstractC166997dE.A0L(A0N);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0w);
                AnonymousClass773.A05(A0H, new C52783NXr(this, AbstractC31174DnI.A02(A0L), 0), A0v);
                A0N.setText(A0H);
                AbstractC166997dE.A0S(view, R.id.learn_more_spam_view).setVisibility(0);
                TextView A0N2 = AbstractC167007dF.A0N(view, R.id.learn_more_spam_description);
                AbstractC25227BEk.A11(A0N2);
                String A0v2 = AbstractC25227BEk.A0v(this, 2131965063);
                SpannableStringBuilder A0H2 = AbstractC25225BEi.A0H(MSZ.A0q(this, A0v2, 2131965062));
                AnonymousClass773.A05(A0H2, new C52783NXr(this, AbstractC31174DnI.A02(A0N2.getContext()), 1), A0v2);
                A0N2.setText(A0H2);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public static final void A00(N5N n5n) {
        String str;
        String token = n5n.getSession().getToken();
        BugReport bugReport = n5n.A03;
        if (bugReport == null) {
            str = "bugReport";
        } else {
            BugReportComposerViewModel bugReportComposerViewModel = n5n.A00;
            if (bugReportComposerViewModel == null) {
                str = "composerViewModel";
            } else {
                InterfaceC58266PsA interfaceC58266PsA = n5n.A02;
                if (interfaceC58266PsA == null) {
                    str = "userFlowLoggerV2";
                } else {
                    BugReportComposerFragment A00 = AbstractC53851Nrf.A00(bugReport, bugReportComposerViewModel, interfaceC58266PsA, token);
                    n5n.A04 = true;
                    AbstractC31177DnL.A16(A00, n5n.requireActivity(), n5n.getSession());
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalArgumentException A12;
        int i;
        BugReportComposerViewModel bugReportComposerViewModel;
        BugReport bugReport;
        int A02 = C0f9.A02(1143056865);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (bugReportComposerViewModel = (BugReportComposerViewModel) bundle2.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_COMPOSER_VIEWMODEL")) != null) {
            this.A00 = bugReportComposerViewModel;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (bugReport = (BugReport) bundle3.getParcelable("GDPRPrivacyCheckFragment.ARGUMENT_BUGREPORT")) != null) {
                this.A03 = bugReport;
                this.A02 = OO8.A00(this.mArguments, getSession());
                this.A01 = new C54748OGw(getSession(), "gdpr_consent_for_rageshake");
                C0f9.A09(2023187409, A02);
                return;
            }
            A12 = AbstractC166987dD.A12("BugReport is required in order to launch this screen");
            i = -1710945694;
        } else {
            A12 = AbstractC166987dD.A12("BugReportComposerViewModel is required in order to launch this screen");
            i = 271352917;
        }
        C0f9.A09(i, A02);
        throw A12;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-736561626);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.feedback_privacy_consent_screen, viewGroup, false);
        C0f9.A09(-557830071, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-392497397);
        super.onDestroy();
        if (!this.A04) {
            InterfaceC58266PsA interfaceC58266PsA = this.A02;
            if (interfaceC58266PsA == null) {
                C14360o3.A0F("userFlowLoggerV2");
                throw C00O.createAndThrow();
            }
            interfaceC58266PsA.AW2(C05F.A01);
        }
        C0f9.A09(806269740, A02);
    }
}
