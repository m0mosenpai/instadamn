package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebookpay.logging.FBPayLoggerData;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EKO extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ConnectFBPayFragment";
    public UserSession A00;
    public boolean A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC58317Pt9.A00(179);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        String A00;
        int A02 = C0f9.A02(215757139);
        super.onCreate(bundle);
        C09Y c09y = C023409i.A0A;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            UserSession A06 = c09y.A06(bundle2);
            this.A00 = A06;
            FVN.A01(A06, true);
            UserSession userSession = this.A00;
            C14360o3.A0A(userSession);
            C62862tP A0O = AbstractC31172DnG.A0O(requireActivity(), new Fu4(), userSession);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                Bundle bundle3 = this.mArguments;
                if (bundle3 != null) {
                    FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) AbstractC153636vY.A00(bundle3, FBPayLoggerData.class, "logger_data");
                    C913045j c913045j = C913045j.A00;
                    C54s c54s = new C54s(c913045j);
                    c54s.A0F("product_type", "FBPAY_HUB");
                    if (fBPayLoggerData != null && (A00 = fBPayLoggerData.A00()) != null) {
                        c54s.A0F(AbstractC58358Pty.A00(), A00);
                        C54s c54s2 = new C54s(c913045j);
                        c54s2.A0C(c54s, "fbpay_params");
                        c54s2.A0F("redirect_service", "fb_pay");
                        c54s2.A0F("entrypoint", "fb_pay_hub");
                        c54s2.A0F("transition_style", "fade");
                        UserSession userSession3 = this.A00;
                        if (userSession3 != null) {
                            c54s2.A0D("cds_client_value", FVN.A00(userSession3));
                            AbstractC192798gL A05 = C192108fB.A05(userSession2, "com.bloks.www.fxcal.settings.async", AbstractC31179DnN.A0f(c54s2, c913045j));
                            C32394EOv.A00(A05, A0O, this, 2);
                            schedule(A05);
                            C0f9.A09(841971371, A02);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = 1126778055;
        } else {
            A14 = AbstractC166987dD.A14("Required value was null.");
            i = -141097780;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1872474354);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.hub_spinner, viewGroup, false);
        C0f9.A09(1257517495, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(182944707);
        super.onResume();
        if (this.A01) {
            AbstractC25226BEj.A1P(this);
        }
        C0f9.A09(-1674325653, A02);
    }
}
