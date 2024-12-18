package X;

import android.app.Activity;
import android.app.Dialog;
import java.util.Map;

/* loaded from: classes10.dex */
public final class SM4 {
    public Dialog A00;
    public final Activity A01;
    public final Map A02 = AbstractC166987dD.A1G();

    public SM4(Activity activity) {
        this.A01 = activity;
    }

    public final void A00(InterfaceC71983XDs interfaceC71983XDs, int i) {
        boolean A1V = AbstractC167007dF.A1V(interfaceC71983XDs);
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        Dialog A00 = WGH.A00(this.A01, interfaceC71983XDs, i, A1V);
        this.A00 = A00;
        if (A00 != null) {
            C0fJ.A00(A00);
        }
    }
}
