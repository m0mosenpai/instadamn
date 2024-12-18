package X;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Tth, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65766Tth implements Runnable {
    public final /* synthetic */ C70299WQe A00;
    public final /* synthetic */ C164307Wt A01;

    public RunnableC65766Tth(C70299WQe c70299WQe, C164307Wt c164307Wt) {
        this.A01 = c164307Wt;
        this.A00 = c70299WQe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnableC71500Wv4;
        SensorManager sensorManager;
        Sensor defaultSensor;
        C164307Wt c164307Wt = this.A01;
        C70299WQe c70299WQe = this.A00;
        FragmentActivity activity = c164307Wt.A01.getActivity();
        if (activity != null && AbstractC25231BEo.A1b(c164307Wt.A08)) {
            if (c70299WQe == null) {
                C14280ns c14280ns = c164307Wt.A02;
                C206949Dz c206949Dz = new C206949Dz(c164307Wt, 47);
                C164317Wu c164317Wu = c164307Wt.A03;
                AbstractC167017dG.A1Q(c14280ns, c164317Wu);
                Object systemService = activity.getSystemService("sensor");
                if ((systemService instanceof SensorManager) && (sensorManager = (SensorManager) systemService) != null && (defaultSensor = sensorManager.getDefaultSensor(15)) != null && ((Boolean) c206949Dz.invoke()).booleanValue()) {
                    runnableC71500Wv4 = new RunnableC71499Wv3(new C70299WQe(defaultSensor, sensorManager, c164317Wu, c14280ns), c164307Wt);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            if (c70299WQe == null) {
                return;
            }
            c70299WQe.stopTracking();
            if (activity == null) {
                return;
            } else {
                runnableC71500Wv4 = new RunnableC71500Wv4(c70299WQe, c164307Wt);
            }
        }
        activity.runOnUiThread(runnableC71500Wv4);
    }
}
