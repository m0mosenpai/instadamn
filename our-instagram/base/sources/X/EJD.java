package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EJD extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationHECFragment";
    public UserSession A00;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131970821);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_non_discrimination_hec";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.special_considerations_title_row);
        F0X.A00(requireViewById, AbstractC31180DnO.A02(this, requireViewById).getString(2131970819), null, true);
        View requireViewById2 = view.requireViewById(R.id.special_considerations_content_1_row);
        F0X.A00(requireViewById2, null, AbstractC31180DnO.A02(this, requireViewById2).getString(2131970817), false);
        View requireViewById3 = view.requireViewById(R.id.special_considerations_content_2_row);
        F0X.A00(requireViewById3, null, AbstractC31180DnO.A02(this, requireViewById3).getString(2131970818), false);
        View requireViewById4 = view.requireViewById(R.id.acceptable_ad_targeting_row);
        F0X.A00(requireViewById4, AbstractC31180DnO.A02(this, requireViewById4).getString(2131970802), null, true);
        View requireViewById5 = view.requireViewById(R.id.housing_targeting_row);
        F0X.A00(requireViewById5, AbstractC31180DnO.A02(this, requireViewById5).getString(2131970816), AbstractC166997dE.A0N(this).getString(2131970815), false);
        View requireViewById6 = view.requireViewById(R.id.employment_targeting_row);
        F0X.A00(requireViewById6, AbstractC31180DnO.A02(this, requireViewById6).getString(2131970811), AbstractC166997dE.A0N(this).getString(2131970810), false);
        View requireViewById7 = view.requireViewById(R.id.credit_targeting_row);
        F0X.A00(requireViewById7, AbstractC31180DnO.A02(this, requireViewById7).getString(2131970807), AbstractC166997dE.A0N(this).getString(2131970806), false);
        View requireViewById8 = view.requireViewById(R.id.ad_discrimination_row);
        F0X.A00(requireViewById8, AbstractC31180DnO.A02(this, requireViewById8).getString(2131970803), null, true);
        View requireViewById9 = view.requireViewById(R.id.housing_discrimination_row);
        F0X.A00(requireViewById9, AbstractC31180DnO.A02(this, requireViewById9).getString(2131970814), AbstractC166997dE.A0N(this).getString(2131970813), false);
        View requireViewById10 = view.requireViewById(R.id.employment_discrimination_row);
        F0X.A00(requireViewById10, AbstractC31180DnO.A02(this, requireViewById10).getString(2131970809), AbstractC166997dE.A0N(this).getString(2131970808), false);
        View requireViewById11 = view.requireViewById(R.id.credit_discrimination_row);
        F0X.A00(requireViewById11, AbstractC31180DnO.A02(this, requireViewById11).getString(2131970805), AbstractC166997dE.A0N(this).getString(2131970804), false);
        super.onViewCreated(view, bundle);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1016938055);
        C1UC requireActivity = requireActivity();
        C14360o3.A0C(requireActivity, AbstractC43591JPw.A00(13));
        this.A00 = ((InterfaceC72021XFj) requireActivity).BiY().A0y;
        super.onCreate(bundle);
        C0f9.A09(-724826683, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(817279390);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_non_discrimination_hec_view, viewGroup, false);
        C0f9.A09(-1129691391, A02);
        return inflate;
    }
}
