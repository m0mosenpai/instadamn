package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public final class EKT extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "UnderAgeRegBlockingFragment";
    public AbstractC18680vv A00;
    public RegFlowExtras A01;

    public static void A00(EKT ekt) {
        RegFlowExtras regFlowExtras;
        C1UC activity = ekt.getActivity();
        if ((activity instanceof InterfaceC37222GaX) && ekt.mFragmentManager != null) {
            if (!((InterfaceC37222GaX) activity).CJ5()) {
                ekt.mFragmentManager.A12();
                return;
            }
            return;
        }
        Bundle bundle = ekt.mArguments;
        if ((bundle != null && bundle.getBoolean("SHOULD_START_AT_SAC_REG_FLOW", false)) || ((regFlowExtras = ekt.A01) != null && regFlowExtras.A01() != null && regFlowExtras.A01() == EnumC33445EqI.A07)) {
            AbstractC25227BEk.A1B(ekt);
            return;
        }
        AbstractC10360h2 abstractC10360h2 = ekt.mFragmentManager;
        if (abstractC10360h2 == null) {
            return;
        }
        abstractC10360h2.A18("reg_gdpr_entrance", 1);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31173DnH.A0q(this);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        Bundle A0A = AbstractC31173DnH.A0A(requireActivity());
        if (A0A != null && A0A.containsKey("caa_registration_redirection_to_native")) {
            AbstractC25227BEk.A1B(this);
            return false;
        }
        A00(this);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(181637578);
        super.onCreate(bundle);
        C18C.A07(this.mArguments, "Arguments must contain MainSession token and Registration extras");
        this.A00 = AbstractC31176DnK.A0R(this);
        this.A01 = (RegFlowExtras) this.mArguments.getParcelable("RegFlowExtras.EXTRA_KEY");
        C0f9.A09(-671450039, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1089794762);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.under_age_reg_blocking_fragment);
        ViewOnClickListenerC31724DwT.A00(A0A.requireViewById(R.id.ok_button), 36, this);
        C0f9.A09(2054787410, A02);
        return A0A;
    }
}
