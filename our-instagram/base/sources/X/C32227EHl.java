package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.EHl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32227EHl extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "ClipsBrandSurveyLearnMoreFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_brand_survey_learn_more";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC35678FpD.A00(view.findViewById(R.id.got_it_button), 16, this);
        ViewOnClickListenerC35678FpD.A00(view.findViewById(R.id.read_our_data_policy_link), 17, this);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(800325658);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.brand_survey_learn_more, viewGroup, false);
        C0f9.A09(1822122906, A02);
        return inflate;
    }
}
