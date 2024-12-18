package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: X.0fX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fX {
    public static void A00(SensorEventListener sensorEventListener, SensorManager sensorManager) {
        C0BW.A00.A06(sensorEventListener, null);
        sensorManager.unregisterListener(sensorEventListener);
    }

    public static boolean A01(Sensor sensor, SensorEventListener sensorEventListener, SensorManager sensorManager, int i) {
        boolean registerListener = sensorManager.registerListener(sensorEventListener, sensor, i);
        if (registerListener) {
            C0BW.A00.A05(sensorEventListener, sensor);
        }
        return registerListener;
    }
}
