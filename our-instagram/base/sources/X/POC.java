package X;

import android.app.Activity;
import android.os.Build;
import android.util.Rational;
import android.view.View;

/* loaded from: classes9.dex */
public final class POC implements Runnable {
    public final /* synthetic */ NTU A00;

    public POC(NTU ntu) {
        this.A00 = ntu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        try {
            NTU ntu = this.A00;
            if (ntu.A05 && AbstractC167007dF.A1Z(ntu.A0E) && (rational = ntu.A02) != null) {
                NTU.A00(null, rational, ntu);
                if (Build.VERSION.SDK_INT == 31) {
                    Activity activity = ntu.A07;
                    View A08 = AbstractC43592JPx.A08(activity);
                    C14360o3.A07(A08);
                    activity.getWindowManager().updateViewLayout(A08, A08.getLayoutParams());
                }
            }
        } catch (Exception e) {
            C0w9.A06("RtcCallPipPresenter", "Failed to update PIP params", e);
        }
    }
}
