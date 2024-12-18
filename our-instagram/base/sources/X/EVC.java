package X;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.nux.cal.model.ConnectContent;

/* loaded from: classes6.dex */
public final class EVC extends AbstractC60592pi {
    public final /* synthetic */ ELU A00;

    public EVC(ELU elu) {
        this.A00 = elu;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        ELU elu = this.A00;
        CallerContext callerContext = ELU.A0B;
        if (elu.A01 == null) {
            C14360o3.A0F("calHelper");
            throw C00O.createAndThrow();
        }
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra != null) {
                        String str = ((ConnectContent) AbstractC153636vY.A00(bundleExtra, ConnectContent.class, "extra_cal_nux_content")).A04;
                        if (str != null) {
                            C1ON A0D = AbstractC35276FhB.A0D(AbstractC166987dD.A0o(elu.A06), stringExtra, str, intent.getStringExtra("argument_selected_age_account_id"), intent.getStringExtra("argument_selected_age_account_type"), null);
                            A0D.A00 = new C32496ESw(elu);
                            C1GJ.A03(A0D);
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
                    ELU.A01(elu);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
