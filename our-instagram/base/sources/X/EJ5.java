package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EJ5 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BirthdayAdditionalInfoFragment";
    public C07270a1 A00;
    public EnumC33445EqI A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131953822);
        AbstractC31180DnO.A17(new ViewOnClickListenerC35667Fp2(this, 50), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31173DnH.A0q(this);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1805053814);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C023409i.A0A.A02(requireArguments);
        this.A01 = EnumC33445EqI.valueOf(requireArguments.getString("RegistrationFlowExtra"));
        C0f9.A09(1212796558, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2072221652);
        C35203Ffv.A00.A02(this.A00, this.A01, "birthday_additional_info");
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.reg_container);
        layoutInflater.inflate(R.layout.birthday_additional_info_fragment, AbstractC31180DnO.A05(A0A), true);
        ViewOnClickListenerC35667Fp2.A00(A0A.requireViewById(R.id.field_detail_link), 49, this);
        C0f9.A09(-528352632, A02);
        return A0A;
    }
}
