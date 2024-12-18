package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EJF extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacSetupManuallyFragment";
    public TextView A00;
    public TextView A01;
    public String A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131975983);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1993540611);
        super.onCreate(bundle);
        AbstractC35075Fcm.A02(AbstractC166987dD.A0r(this.A03), "setup_manually_auth_app");
        C0f9.A09(-1867869410, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-984819614);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_setup_manually_fragment, viewGroup, false);
        this.A00 = AbstractC166997dE.A0T(inflate, R.id.ig_key_line_one);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.ig_key_line_two);
        ViewOnClickListenerC35667Fp2.A00(inflate.requireViewById(R.id.copy_key), 1, this);
        ((C64P) inflate.requireViewById(R.id.next_bottom_button)).setPrimaryActionOnClickListener(new ViewOnClickListenerC35667Fp2(this, 2));
        registerLifecycleListener(new EVO(getActivity()));
        C0f9.A09(2025929717, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        int A02 = C0f9.A02(-218121751);
        super.onStart();
        String str2 = this.A02;
        if (str2 != null) {
            TextView textView = this.A00;
            if (textView == null) {
                str = "igKeyLineOne";
            } else {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    str = "igKeyLineTwo";
                } else {
                    AbstractC35235FgT.A03(textView, textView2, str2);
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        AbstractC35192Ffk.A02(requireContext(), new C32539EUp(this, 12), AbstractC166987dD.A0o(this.A03));
        C0f9.A09(694403506, A02);
    }
}
