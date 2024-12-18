package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E9t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32120E9t extends AbstractC32319ELj implements GY4 {
    public static final String __redex_internal_original_name = "PasswordTooEasyFragment";
    public C07270a1 A00;
    public RegFlowExtras A01;
    public final Handler A02 = new Handler();

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        if (this.A05) {
            ProgressButton progressButton = super.A02;
            progressButton.getClass();
            progressButton.setShowProgressBar(true);
            this.A01.A0P = AbstractC167007dF.A0g(this.A03);
            C07270a1 c07270a1 = this.A00;
            RegFlowExtras regFlowExtras = this.A01;
            AbstractC35794FrW.A03(this.A02, this, this, c07270a1, this, this, regFlowExtras, AbstractC35794FrW.A01(regFlowExtras), false);
        }
    }

    @Override // X.GY4
    public final void EjS(String str, String str2) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            F9Y.A00(activity, this.A02, this, this.A00, this, this.A01, super.A00, EnumC33523Erw.A0B.A00, str, str2, null);
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A01(this.A00, this.A01.A01(), EnumC33523Erw.A0B.A00.A01);
        return false;
    }

    @Override // X.AbstractC32319ELj, X.InterfaceC11380iw
    public final String getModuleName() {
        return "password_too_easy";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1001895725);
        super.onCreate(bundle);
        this.A00 = AbstractC31180DnO.A0L(this);
        this.A01 = (RegFlowExtras) AbstractC31180DnO.A04(this);
        if (!AbstractC31180DnO.A0f(C06090Tz.A05).contains(__redex_internal_original_name)) {
            if (AbstractC34263F9j.A00().booleanValue()) {
                FBE.A00().A00(requireContext(), this.A00, null);
            }
            if (AbstractC34264F9k.A00().booleanValue()) {
                FBE.A00().A01(requireContext(), this.A00, null);
            }
        }
        C0f9.A09(1580057452, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C35203Ffv.A00.A02(this.A00, this.A01.A01(), EnumC33523Erw.A0B.A00.A01);
    }
}
