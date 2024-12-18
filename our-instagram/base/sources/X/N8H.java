package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* loaded from: classes9.dex */
public final class N8H extends AbstractC52114N4m implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BrandedContentRequestApprovalFragment";
    public List A01 = AbstractC166987dD.A1E();
    public List A00 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131954198);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC52114N4m, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String A0v = AbstractC25227BEk.A0v(this, 2131954194);
        A04().setVisibility(0);
        TextView A04 = A04();
        SpannableStringBuilder A08 = AbstractC31178DnM.A08(this, A0v, 2131954195);
        FragmentActivity activity = getActivity();
        AbstractC31171DnF.A1O(activity);
        AnonymousClass773.A05(A08, new NY0(this, MSZ.A04(activity, this)), A0v);
        A04.setText(A08);
        AbstractC25227BEk.A11(A04());
        AbstractC31171DnF.A1M(A08());
        AbstractC166987dD.A1Z(new MCJ(this, null, 44), AbstractC25235BEs.A0S(this));
        LL0.A01(this, AbstractC166987dD.A0r(this.A09), C05F.A1I);
    }
}
