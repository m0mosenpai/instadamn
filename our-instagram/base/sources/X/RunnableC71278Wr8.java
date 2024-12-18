package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* renamed from: X.Wr8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71278Wr8 implements Runnable {
    public final /* synthetic */ C70299WQe A00;

    public RunnableC71278Wr8(C70299WQe c70299WQe) {
        this.A00 = c70299WQe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70299WQe c70299WQe = this.A00;
        SensorManager sensorManager = c70299WQe.A05;
        WIO wio = c70299WQe.A06;
        Sensor sensor = c70299WQe.A04;
        if (sensorManager.registerListener(wio, sensor, 1, 2)) {
            C0BW.A00.A05(wio, sensor);
        }
        c70299WQe.A03 = false;
        c70299WQe.A02 = 0L;
    }
}
