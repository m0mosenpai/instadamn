package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EV8 extends AbstractC60592pi {
    public final /* synthetic */ ELT A00;

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == intent.getIntExtra("argument_requested_code", -1)) {
            boolean booleanExtra = intent.getBooleanExtra("result_action_positive", false);
            String stringExtra = intent.getStringExtra("argument_access_token");
            if (booleanExtra) {
                if (stringExtra != null) {
                    Bundle bundleExtra = intent.getBundleExtra("argument_client_extras_bundle");
                    if (bundleExtra != null) {
                        Parcelable parcelable = bundleExtra.getParcelable("extra_cal_nux_content");
                        parcelable.getClass();
                        String str = ((ConnectContent) parcelable).A04;
                        if (str != null) {
                            ELT elt = this.A00;
                            C1ON A0D = AbstractC35276FhB.A0D(elt.A02, stringExtra, str, intent.getStringExtra("argument_selected_age_account_id"), intent.getStringExtra("argument_selected_age_account_type"), EnumC72412Xd8.A0b.A01().toUpperCase(Locale.US));
                            A0D.A00 = new EUD(elt);
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
                    return;
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public EV8(ELT elt) {
        this.A00 = elt;
    }
}
