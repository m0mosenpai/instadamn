package X;

import android.app.Dialog;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class PRY implements Runnable {
    public final /* synthetic */ N55 A00;
    public final /* synthetic */ AbstractC55106ObM A01;

    public PRY(N55 n55, AbstractC55106ObM abstractC55106ObM) {
        this.A00 = n55;
        this.A01 = abstractC55106ObM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        N55 n55 = this.A00;
        Dialog dialog = n55.A01;
        if ((dialog == null || !dialog.isShowing()) && !n55.A0S) {
            C193328hC A0O = AbstractC31175DnJ.A0O(n55);
            A0O.A0k(n55.requireContext().getDrawable(R.drawable.ig_illustrations_illo_glasses_connection_refresh));
            A0O.A0A(2131974240);
            A0O.A09(2131974239);
            DialogInterfaceOnClickListenerC55321Ogj.A01(A0O, this.A01, n55, 48, 2131956794);
            A0O.A0H(DialogInterfaceOnClickListenerC55320Ogi.A00(n55, 36), 2131968687);
            A0O.A04();
            Dialog A02 = A0O.A02();
            n55.A01 = A02;
            if (A02 == null) {
                C14360o3.A0F("currentPermissionsDialog");
                throw C00O.createAndThrow();
            }
            C0fJ.A00(A02);
        }
    }
}
