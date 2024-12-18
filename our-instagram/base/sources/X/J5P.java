package X;

import android.os.SystemClock;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* loaded from: classes7.dex */
public final class J5P implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ InterfaceC72953Ov A02;

    public J5P(UserSession userSession, Reel reel, InterfaceC72953Ov interfaceC72953Ov) {
        this.A01 = reel;
        this.A02 = interfaceC72953Ov;
        this.A00 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Reel reel = this.A01;
        if (!reel.A0Z()) {
            GradientSpinner Blo = this.A02.Blo();
            RingSpec A00 = C3PP.A00(this.A00, reel);
            C14360o3.A0B(A00, 0);
            if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(A00.getName())) {
                A00 = (RingSpec) C3Oc.A0B.getValue();
            }
            Blo.A0E = AbstractC72903Oq.A00(A00);
            C14360o3.A0B(A00, 0);
            Blo.A0C = AbstractC001800i.A0w(A00.BOR());
            Blo.A0D = AbstractC72913Or.A00(A00.Bzg());
            Blo.A0B = AbstractC72913Or.A00(A00.B1y());
            int measuredWidth = Blo.getMeasuredWidth();
            int measuredHeight = Blo.getMeasuredHeight();
            Blo.A0V.setShader(GradientSpinner.A00(Blo, Blo.A0C, Blo.A0D, Blo.A0B, Blo.A0E, measuredWidth, measuredHeight));
            Blo.A08 = SystemClock.elapsedRealtime();
            Blo.invalidate();
        }
    }
}
