package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;

/* loaded from: classes6.dex */
public final class EL8 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LearnProfessionalToolsFragment";
    public FragmentActivity A00;
    public C56352iT A01;
    public AbstractC59962oe A02;
    public BusinessFlowAnalyticsLogger A03;
    public C31500Dsk A04;
    public UserSession A05;
    public String A06;
    public boolean A07;
    public InterfaceC37222GaX A09;
    public boolean A08 = true;
    public final InterfaceC41501vz A0A = C31650DvG.A00(this, 7);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "learn_professional_tools_fragment";
    }

    public static void A01(EL8 el8, String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = el8.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Cm3(new Y7A("learn_professional_tools", el8.A06, str, null, null, null, null, null));
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle("");
        interfaceC56362iU.Eha(ViewOnClickListenerC35690FpP.A00(this, 26), R.drawable.instagram_check_pano_outline_24);
        AbstractC31180DnO.A17(ViewOnClickListenerC35690FpP.A00(this, 27), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger;
        if (this.A08 && (businessFlowAnalyticsLogger = this.A03) != null) {
            businessFlowAnalyticsLogger.Cid(new Y7A("learn_professional_tools", this.A06, null, null, null, null, null, null));
            return false;
        }
        return false;
    }

    public static void A00(View.OnClickListener onClickListener, View view, int i, int i2, int i3, int i4) {
        AbstractC31173DnH.A0I(view, R.id.education_icon).setImageResource(i);
        AbstractC166997dE.A0T(view, R.id.education_title).setText(i2);
        AbstractC166997dE.A0T(view, R.id.education_body).setText(i3);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.education_cta);
        A0T.setText(i4);
        C0fQ.A00(onClickListener, A0T);
        view.setVisibility(0);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        InterfaceC37222GaX interfaceC37222GaX;
        super.onAttach(context);
        C1UC requireActivity = requireActivity();
        if (requireActivity instanceof InterfaceC37222GaX) {
            interfaceC37222GaX = (InterfaceC37222GaX) requireActivity;
        } else {
            interfaceC37222GaX = null;
        }
        this.A09 = interfaceC37222GaX;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1288471162);
        super.onCreate(bundle);
        this.A05 = AbstractC31176DnK.A0S(this);
        this.A02 = this;
        this.A00 = requireActivity();
        String A0b = AbstractC31180DnO.A0b(this);
        A0b.getClass();
        this.A06 = A0b;
        this.A03 = AbstractC35211Fg4.A00(this.A09, this, this.A05);
        C41451vu.A01.A02(this.A0A, C0KL.class);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clo(new Y7A("learn_professional_tools", this.A06, null, null, null, null, null, null));
        }
        this.A04 = new C31500Dsk(this.A05, this);
        this.A07 = AbstractC31172DnG.A1X(requireArguments(), "ARG_CHECKLIST_ITEM_COMPLETED");
        this.A01 = C56352iT.A0t.A03(requireActivity());
        C0f9.A09(693508883, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2067503940);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.learn_professional_tools_fragment);
        C0f9.A09(256592803, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-311879858);
        super.onDestroy();
        C0f9.A09(-1054788520, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1645962728);
        super.onDestroyView();
        C41451vu.A01.A03(this.A0A, C0KL.class);
        C0f9.A09(1915593613, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.onboarding_checklist_headline);
        A0Q.setHeadline(2131965067);
        A0Q.setBody(2131965066);
        A0Q.setVisibility(0);
        A00(ViewOnClickListenerC35690FpP.A00(this, 22), view.requireViewById(R.id.insights_education_unit), R.drawable.instagram_insights_pano_outline_24, 2131964521, 2131964519, 2131964520);
        A00(ViewOnClickListenerC35690FpP.A00(this, 23), view.requireViewById(R.id.promote_education_unit), R.drawable.instagram_promote_pano_outline_24, 2131970704, 2131970702, 2131970703);
        if (C4K3.A00(this.A05)) {
            A00(ViewOnClickListenerC35690FpP.A00(this, 24), view.requireViewById(R.id.activity_status_education_unit), R.drawable.instagram_activity_status_pano_outline_24, 2131963151, 2131952213, 2131952214);
        }
        if (C4K3.A00(this.A05)) {
            ((C36292Fzm) C31651DvH.A00(this.A05, C36292Fzm.class, 4)).A03();
            A00(ViewOnClickListenerC35690FpP.A00(this, 25), view.requireViewById(R.id.faq_education_unit), R.drawable.instagram_app_imessage_pano_outline_24, 2131962226, 2131962224, 2131962225);
        }
        super.onViewCreated(view, bundle);
    }
}
