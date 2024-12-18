package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: classes6.dex */
public final class GM2 implements Runnable {
    public final /* synthetic */ EVQ A00;

    public GM2(EVQ evq) {
        this.A00 = evq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EVQ evq = this.A00;
        CallerContext callerContext = EVQ.A0B;
        C140966Yy A0r = AbstractC25225BEi.A0r(evq.A06.getActivity(), evq.A08);
        AbstractC31175DnJ.A0R();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC31171DnF.A12(A0b, "IgSessionManager.LOGGED_OUT_TOKEN");
        EKF ekf = new EKF();
        ekf.setArguments(A0b);
        A0r.A0E(ekf);
        A0r.A04();
    }
}
