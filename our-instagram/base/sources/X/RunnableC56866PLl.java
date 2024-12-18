package X;

import android.os.Handler;
import android.view.Surface;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.proxygen.LigerSamplePolicy;

/* renamed from: X.PLl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56866PLl implements Runnable {
    public final /* synthetic */ P0A A00;

    public RunnableC56866PLl(P0A p0a) {
        this.A00 = p0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        P0A p0a = this.A00;
        FilterChain filterChain = p0a.A02;
        C81N c81n = p0a.A05;
        MXD mxd = p0a.A0F;
        if (mxd.A00 != null && filterChain != null && c81n != null && !p0a.A0R) {
            C178577wV c178577wV = mxd.A00;
            if (c178577wV != null) {
                c178577wV.A06();
            }
            C197368o7 c197368o7 = p0a.A03;
            if (c197368o7 == null) {
                Surface A04 = c81n.A04();
                if (A04 != null) {
                    p0a.A0Q = true;
                    c197368o7 = mxd.A00(new C55721Oon(A04, filterChain, p0a));
                    p0a.A03 = c197368o7;
                } else {
                    return;
                }
            }
            if (c197368o7 != null) {
                Handler handler = mxd.A02;
                Runnable runnable = p0a.A0J;
                handler.removeCallbacks(runnable);
                p0a.A0R = true;
                c197368o7.A04();
                handler.postDelayed(runnable, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                p0a.A0E.A00(p0a);
            }
        }
    }
}
