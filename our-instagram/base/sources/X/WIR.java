package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.spherical.util.Quaternion;

/* loaded from: classes11.dex */
public final class WIR implements SensorEventListener {
    public static int A06 = 15;
    public static Boolean A07;
    public int A00;
    public final SensorManager A01;
    public final InterfaceC71867X8a A03;
    public final SensorEventListener A05 = new WIN(this);
    public final Quaternion A02 = new Quaternion();
    public final float[] A04 = new float[4];

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C14360o3.A0B(sensorEvent, 0);
        this.A05.onSensorChanged(sensorEvent);
    }

    public WIR(Context context, InterfaceC71867X8a interfaceC71867X8a) {
        SensorManager sensorManager;
        this.A03 = interfaceC71867X8a;
        Object systemService = context.getSystemService("sensor");
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A01 = sensorManager;
    }
}
