package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Edg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32899Edg extends EHS {
    public static final String __redex_internal_original_name = "UnsendWarningInterstitialFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31173DnH.A0j(requireArguments(), "analytics_module_name");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.wellbeing_interstitial_list);
        AbstractC13880nE.A0e(requireViewById, 0);
        AbstractC13880nE.A0V(requireViewById, 0);
        int A09 = AbstractC167017dG.A09(requireContext());
        AbstractC13880nE.A0i(requireViewById, A09, A09);
    }
}
