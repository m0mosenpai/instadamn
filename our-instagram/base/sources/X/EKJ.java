package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EKJ extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "AgreeToTermsOfUseFragment";
    public C07270a1 A00;
    public C32401EPc A01;
    public RegFlowExtras A02;
    public ProgressButton A03;

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A01(this.A00, this.A02.A01(), "agree_to_terms");
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "agree_to_terms";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1998780351);
        super.onCreate(bundle);
        this.A00 = AbstractC31180DnO.A0L(this);
        this.A02 = (RegFlowExtras) AbstractC31180DnO.A04(this);
        C0f9.A09(-1847442678, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(795546946);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.agree_to_terms_of_use_fragment, AbstractC31180DnO.A05(A0A), true);
        this.A03 = AbstractC31180DnO.A0U(A0A);
        this.A01 = new C32401EPc(requireContext(), this, this);
        ((AbsListView) A0A.requireViewById(android.R.id.list)).setAdapter((ListAdapter) this.A01);
        this.A01.A0C();
        this.A03.setEnabled(false);
        ViewOnClickListenerC35667Fp2.A00(this.A03, 43, this);
        C0f9.A09(1181816833, A02);
        return A0A;
    }
}
