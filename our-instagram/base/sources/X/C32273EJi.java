package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EJi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32273EJi extends AbstractC59962oe implements InterfaceC60122ou {
    public static final FTT A01 = new Object();
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationFullPolicyFragment";
    public UserSession A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131970821);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_non_discrimination_full_policy";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.full_policy_body_1_row);
        FTT.A00(requireViewById, AbstractC31180DnO.A02(this, requireViewById).getString(2131970788));
        View requireViewById2 = view.requireViewById(R.id.full_policy_body_2_row);
        FTT.A00(requireViewById2, AbstractC31180DnO.A02(this, requireViewById2).getString(2131970789));
        View requireViewById3 = view.requireViewById(R.id.discrimination_guides_title_row);
        String string = AbstractC31180DnO.A02(this, requireViewById3).getString(2131970795);
        TextView A0N = AbstractC167007dF.A0N(requireViewById3, R.id.primary_text);
        View A0S = AbstractC166997dE.A0S(requireViewById3, R.id.secondary_text);
        if (string != null) {
            A0N.setText(string);
            A0N.setVisibility(0);
            A0N.setTypeface(Typeface.defaultFromStyle(1));
        } else {
            A0N.setVisibility(8);
        }
        A0S.setVisibility(8);
        View requireViewById4 = view.requireViewById(R.id.department_of_housing_and_urban_link_row);
        A00(requireViewById4, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById4), 2131970793), "https://www.hud.gov/?fbclid=IwAR1BCtVQIYzgEV-AHKFQ7vnY4BiJoVZP1dPzbEQqpDMj01L7Jc8W39jVabU");
        View requireViewById5 = view.requireViewById(R.id.equal_employment_link_row);
        A00(requireViewById5, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById5), 2131970796), "https://www.eeoc.gov");
        View requireViewById6 = view.requireViewById(R.id.consumer_financial_protect_link_row);
        A00(requireViewById6, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById6), 2131970792), "https://www.consumerfinance.gov/?fbclid=IwAR3Zq8i7BOJ14yCUZWYSjN7OHEB3L0aLeG4gzOOMQML0Z6brPvZ8q7k2eH4");
        View requireViewById7 = view.requireViewById(R.id.civil_liberties_union_link_row);
        A00(requireViewById7, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById7), 2131970791), "https://www.aclu.org/?fbclid=IwAR2DU6KQXc-zOSrjZ4m_0OHP-BTTKG7EEint9fmolzXVRKdzcd9pfiVYIxY");
        View requireViewById8 = view.requireViewById(R.id.civil_and_human_rights_link_row);
        A00(requireViewById8, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById8), 2131970790), "https://civilrights.org/?fbclid=IwAR3Ejp_5nLJ2Ghi9aHVekHPj2j_V44uct_fy29kq1Lu9OZily5UiqWCYeJ8");
        View requireViewById9 = view.requireViewById(R.id.department_of_justice_link_row);
        A00(requireViewById9, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById9), 2131970794), "https://www.justice.gov/crt?fbclid=IwAR1FW0uYkUB885SbGjwDs_Rtyv_8KiUFy2M-OUdE95YmYtXmy89Rq_JlDdQ");
        View requireViewById10 = view.requireViewById(R.id.fair_housing_link_row);
        A00(requireViewById10, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById10), 2131970798), "https://fairhousingresourcecenter.wordpress.com/?fbclid=IwAR036hQB0CW7b-jPAQfoGB8B5kKc0Zt1bN39QBOtY2BDig-JYG-JcdL7zOU");
        View requireViewById11 = view.requireViewById(R.id.facebook_advertising_policies_link_row);
        A00(requireViewById11, AbstractC166997dE.A0q(AbstractC31180DnO.A02(this, requireViewById11), 2131970797), "https://www.facebook.com/policies/ads/prohibited_content/discriminatory_practices");
        View requireViewById12 = view.requireViewById(R.id.footer_row);
        FTT.A00(requireViewById12, AbstractC31180DnO.A02(this, requireViewById12).getString(2131970799));
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    private final void A00(View view, String str, String str2) {
        AnonymousClass773.A07(new C33265Elz(this, str2, AbstractC31179DnN.A01(this)), AbstractC167007dF.A0N(view, R.id.primary_text), str, str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(878677658);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(13));
        this.A00 = ((InterfaceC72021XFj) requireActivity).BiY().A0y;
        super.onCreate(bundle);
        C0f9.A09(-876528999, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1035917289);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_non_discrimination_full_policy_view, false);
        C0f9.A09(1222304849, A02);
        return A0R;
    }
}
