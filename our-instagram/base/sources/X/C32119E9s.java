package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.E9s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32119E9s extends AbstractC32319ELj {
    public static final String __redex_internal_original_name = "CreatePasswordFragment";
    public C07270a1 A00;
    public RegFlowExtras A01;

    @Override // X.AbstractC32319ELj, X.InterfaceC11380iw
    public final String getModuleName() {
        return "sac_create_password";
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        C140966Yy A0r;
        Bundle A0b;
        Fragment abstractC59962oe;
        if (this.A05) {
            ProgressButton progressButton = this.A02;
            progressButton.getClass();
            progressButton.setShowProgressBar(true);
            RegFlowExtras regFlowExtras = this.A01;
            regFlowExtras.A0P = AbstractC167007dF.A0g(this.A03);
            regFlowExtras.A0w = this.A04;
            if (getActivity() != null) {
                RegFlowExtras regFlowExtras2 = this.A01;
                if (regFlowExtras2.A0g && regFlowExtras2.A03 == null) {
                    A0r = AbstractC31177DnL.A0N(requireActivity(), this.A00);
                    RegFlowExtras regFlowExtras3 = this.A01;
                    A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras3);
                    AbstractC31173DnH.A1B(A0b);
                    abstractC59962oe = new C33001Ego();
                } else {
                    boolean z = regFlowExtras2.A0t;
                    A0r = AbstractC25225BEi.A0r(requireActivity(), this.A00);
                    if (z) {
                        AbstractC31175DnJ.A0R();
                        RegFlowExtras regFlowExtras4 = this.A01;
                        Bundle A0b2 = AbstractC166987dD.A0b();
                        A0b2.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras4);
                        AbstractC31171DnF.A12(A0b2, "IgSessionManager.LOGGED_OUT_TOKEN");
                        abstractC59962oe = new EKF();
                        abstractC59962oe.setArguments(A0b2);
                        A0r.A0B(null, abstractC59962oe);
                        A0r.A04();
                    }
                    RegFlowExtras regFlowExtras5 = this.A01;
                    A0b = AbstractC166987dD.A0b();
                    A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras5);
                    abstractC59962oe = new AbstractC59962oe();
                }
                abstractC59962oe.setArguments(A0b);
                A0r.A0B(null, abstractC59962oe);
                A0r.A04();
            }
        }
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00.A01(this.A00, EnumC33445EqI.A07, EnumC33523Erw.A0D.A00.A01);
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1427979047);
        super.onCreate(bundle);
        this.A00 = AbstractC31180DnO.A0L(this);
        Parcelable A04 = AbstractC31180DnO.A04(this);
        A04.getClass();
        this.A01 = (RegFlowExtras) A04;
        C0f9.A09(-982883087, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C35203Ffv.A00.A02(this.A00, EnumC33445EqI.A07, EnumC33523Erw.A0D.A00.A01);
    }
}
