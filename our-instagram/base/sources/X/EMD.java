package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EMD extends AbstractC59962oe implements InterfaceC60442pS, JPX {
    public static final String __redex_internal_original_name = "SuperlativeNonNullStateBottomSheet";
    public View.OnClickListener A00 = ViewOnClickListenerC35662Fow.A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return MSV.A00(35);
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return true;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.JPX
    public final Integer BlT() {
        return C05F.A0I;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(950164640);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_superlative_non_null_state_bottomsheet, viewGroup, false);
        ViewOnClickListenerC35686FpL.A00(AbstractC166997dE.A0S(inflate, R.id.superlative_non_null_state_bottom_sheet_cta_button), 2, this);
        C0f9.A09(-913581895, A02);
        return inflate;
    }
}
