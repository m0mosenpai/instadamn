package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EJ8 extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AutoConfConfirmationFragment";
    public IgTextView A00;
    public ProgressButton A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131952030);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "auto_conf_confirmation";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(1629757402);
        C14360o3.A0B(layoutInflater, 0);
        C47989LJs.A01(AbstractC166987dD.A0o(this.A02), "auto_conf_confirmation", "client_auth_show_confirmation", "optimistic_authentication_flow", "ar_code_sms");
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.auto_conf_confirmation_fragment, false);
        ProgressButton progressButton = (ProgressButton) A0C.requireViewById(R.id.auto_conf_continue_button);
        this.A01 = progressButton;
        if (progressButton == null) {
            str = "continueButton";
        } else {
            ViewOnClickListenerC35667Fp2.A00(progressButton, 44, this);
            IgTextView A0X = AbstractC31172DnG.A0X(A0C, R.id.auto_conf_helper_button);
            AbstractC31180DnO.A13(A0X.getResources(), A0X, 2131953353);
            this.A00 = A0X;
            Context requireContext = requireContext();
            IgTextView igTextView = this.A00;
            str = "helperButton";
            if (igTextView != null) {
                AbstractC35081Fcs.A00(igTextView, requireContext);
                IgTextView igTextView2 = this.A00;
                if (igTextView2 != null) {
                    ViewOnClickListenerC35667Fp2.A00(igTextView2, 45, this);
                    C0f9.A09(-1358941431, A02);
                    return A0C;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-915909720);
        super.onResume();
        C0f9.A09(-1491109159, A02);
    }
}
