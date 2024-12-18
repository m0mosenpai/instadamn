package X;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes12.dex */
public final class YGF implements Runnable {
    public final /* synthetic */ Y0A A00;

    public YGF(Y0A y0a) {
        this.A00 = y0a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Y0A y0a = this.A00;
        if (SystemClock.uptimeMillis() - y0a.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
            C0K8.A0O("AnomalyDetector", "Freeze Detected - we did not receive input frames for over %d ms", AbstractC25228BEl.A1Y(5000));
            y0a.A01 = 1 + y0a.A01;
            if (y0a.A03 != null) {
                C0K8.A0C("AnomalyDetector", "Freeze detected");
            }
        }
        Handler handler = y0a.A02;
        if (handler != null) {
            handler.postDelayed(y0a.A04, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
