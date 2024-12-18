package X;

import android.content.Intent;
import android.os.Bundle;
import com.instagram.registration.model.RegFlowExtras;

/* loaded from: classes6.dex */
public final class EVA extends AbstractC60592pi {
    public final /* synthetic */ ELk A00;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    if (intent.getBundleExtra("argument_client_extras_bundle") != null) {
                        ELk eLk = this.A00;
                        RegFlowExtras regFlowExtras = eLk.A05;
                        regFlowExtras.A0y = true;
                        if (eLk.getActivity() != null) {
                            regFlowExtras.A0V = AbstractC34293FAn.A00(C05F.A0j);
                            C140966Yy A0r = AbstractC25225BEi.A0r(eLk.requireActivity(), eLk.A02);
                            RegFlowExtras regFlowExtras2 = eLk.A05;
                            Bundle A0b = AbstractC166987dD.A0b();
                            A0b.putParcelable("RegFlowExtras.EXTRA_KEY", regFlowExtras2);
                            AbstractC31176DnK.A1A(A0b, new AbstractC59962oe(), A0r);
                            return;
                        }
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (stringExtra != null) {
                if (intent.getBundleExtra("argument_client_extras_bundle") != null) {
                    ELk.A02(this.A00);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public EVA(ELk eLk) {
        this.A00 = eLk;
    }
}
