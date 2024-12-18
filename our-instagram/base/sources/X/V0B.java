package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: classes11.dex */
public final class V0B extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteAdsManagerErrorFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970877);
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            interfaceC56362iU.EkS(AbstractC167007dF.A1O(abstractC10360h2.A0L()));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(450);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String A0p;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (A0p = bundle2.getString(TraceFieldType.Error)) == null) {
            A0p = AbstractC166997dE.A0p(requireContext(), 2131970315);
        }
        View A0U = AbstractC167017dG.A0U(view, R.id.promote_empty_view_stub);
        if (A0U != null) {
            TextView A0N = AbstractC167007dF.A0N(A0U, R.id.promote_empty_view_title);
            TextView A0N2 = AbstractC167007dF.A0N(A0U, R.id.promote_empty_view_description);
            A0N.setText(2131970316);
            A0N2.setText(A0p);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A00.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1188904828);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.promote_ads_manager_error_view, false);
        C0f9.A09(103002230, A02);
        return A0R;
    }
}
