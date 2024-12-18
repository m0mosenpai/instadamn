package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V08 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteSpecialRequirementsPolicyFragment";
    public View A00;
    public UserSession A01;
    public PromoteData A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_special_requirements_policy";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.special_requirement_policy_layout);
        this.A00 = requireViewById;
        if (requireViewById != null) {
            AbstractC167007dF.A0N(requireViewById, R.id.special_requirement_header_text).setText(2131970969);
            View view2 = this.A00;
            if (view2 != null) {
                C0fQ.A00(new ViewOnClickListenerC35690FpP(this, 54), AbstractC166997dE.A0S(view2, R.id.special_requirement_back_button));
                View view3 = this.A00;
                if (view3 != null) {
                    View A0S = AbstractC166997dE.A0S(view3, R.id.advertising_policy_row);
                    A00(A0S, 2131970961, 2131970962);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(2131970962));
                    AnonymousClass773.A05(spannableStringBuilder, new C33252Elm(this, AbstractC25233BEq.A04(this)), AbstractC25227BEk.A0v(this, 2131970961));
                    AbstractC31176DnK.A1G(AbstractC167007dF.A0N(A0S, R.id.secondary_text), spannableStringBuilder);
                    View view4 = this.A00;
                    if (view4 != null) {
                        A00(AbstractC166997dE.A0S(view4, R.id.audience_row), 2131970963, 2131970964);
                        View view5 = this.A00;
                        if (view5 != null) {
                            A00(AbstractC166997dE.A0S(view5, R.id.creative_consideration_row), 2131970965, 2131970966);
                            View view6 = this.A00;
                            if (view6 != null) {
                                A00(AbstractC166997dE.A0S(view6, R.id.additional_resource_row), 2131970959, 2131970960);
                                View view7 = this.A00;
                                if (view7 != null) {
                                    View A0S2 = AbstractC166997dE.A0S(view7, R.id.credit_row);
                                    A00(A0S2, 2131970946, 2131970967);
                                    A01(AbstractC167007dF.A0N(A0S2, R.id.secondary_text), "https://www.consumerfinance.gov/", 2131970967, 2131970967);
                                    View view8 = this.A00;
                                    if (view8 != null) {
                                        View A0S3 = AbstractC166997dE.A0S(view8, R.id.employment_row);
                                        A00(A0S3, 2131970949, 2131970968);
                                        A01(AbstractC167007dF.A0N(A0S3, R.id.secondary_text), "https://www.eeoc.gov/", 2131970968, 2131970968);
                                        View view9 = this.A00;
                                        str = "mainContainer";
                                        if (view9 != null) {
                                            View A0R = AbstractC166997dE.A0R(view9, R.id.housing_row);
                                            View view10 = this.A00;
                                            if (view10 != null) {
                                                TextView A0N = AbstractC167007dF.A0N(view10, R.id.housing_nfha_link_text);
                                                A00(A0R, 2131970952, 2131970970);
                                                A0N.setText(2131970971);
                                                A01(AbstractC167007dF.A0N(A0R, R.id.secondary_text), "https://www.hud.gov/", 2131970970, 2131970970);
                                                A01(A0N, "https://nationalfairhousing.org/", 2131970971, 2131970971);
                                                return;
                                            }
                                        }
                                        C14360o3.A0F(str);
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        str = "mainContainer";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A01;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    public static final void A00(View view, int i, int i2) {
        AbstractC167007dF.A0N(view, R.id.primary_text).setText(i);
        AbstractC167007dF.A0N(view, R.id.secondary_text).setText(i2);
    }

    private final void A01(TextView textView, String str, int i, int i2) {
        AnonymousClass773.A07(new VB5(this, str, AbstractC25233BEq.A04(this)), textView, AbstractC25227BEk.A0v(this, i), getString(i2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1000974158);
        super.onCreate(bundle);
        PromoteData A00 = InterfaceC72021XFj.A00(this);
        this.A02 = A00;
        this.A01 = A00.A0y;
        C0f9.A09(-1777617273, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1660159014);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_special_requirements_policy_view, viewGroup, false);
        C0f9.A09(294547183, A02);
        return inflate;
    }
}
