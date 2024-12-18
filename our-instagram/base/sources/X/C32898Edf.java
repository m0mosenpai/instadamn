package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Edf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32898Edf extends EHS {
    public static final String __redex_internal_original_name = "RemoveUnsendInterstitialFragment";

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "remove_unsend_interstitial_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.wellbeing_interstitial_list);
        AbstractC13880nE.A0e(A0S, 0);
        AbstractC13880nE.A0V(A0S, 0);
        int A09 = AbstractC167017dG.A09(requireContext());
        AbstractC13880nE.A0i(A0S, A09, A09);
    }
}
