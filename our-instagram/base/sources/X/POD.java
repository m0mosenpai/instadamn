package X;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.os.Build;
import android.util.Rational;
import android.view.View;

/* loaded from: classes9.dex */
public final class POD implements Runnable {
    public final /* synthetic */ NTU A00;

    public POD(NTU ntu) {
        this.A00 = ntu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        try {
            NTU ntu = this.A00;
            if (ntu.A05) {
                try {
                    rational = ntu.A02;
                    if (rational == null) {
                        Activity activity = ntu.A07;
                        int A0A = AbstractC13880nE.A0A(activity);
                        int A09 = AbstractC13880nE.A09(activity);
                        if (ntu.A00 == 2) {
                            A0A *= 2;
                        }
                        rational = new Rational(A0A, A09);
                    }
                    ntu.A07.setPictureInPictureParams(new PictureInPictureParams.Builder().setAspectRatio(rational).build());
                } catch (Exception e) {
                    C0K8.A0J("RtcCallPipPresenter", "Failed to set FSV PIP params", e);
                    rational = Rational.NaN;
                    C14360o3.A08(rational);
                }
                if (!rational.equals(Rational.NaN)) {
                    NTU.A00(null, rational, ntu);
                    if (Build.VERSION.SDK_INT == 31) {
                        Activity activity2 = ntu.A07;
                        View A08 = AbstractC43592JPx.A08(activity2);
                        C14360o3.A07(A08);
                        activity2.getWindowManager().updateViewLayout(A08, A08.getLayoutParams());
                    }
                }
            }
        } catch (Exception e2) {
            C0w9.A06("RtcCallPipPresenter", "Failed to update FSV PIP params", e2);
        }
    }
}
