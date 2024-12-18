package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.spherical.util.Quaternion;

/* loaded from: classes11.dex */
public final class WIN implements SensorEventListener {
    public final /* synthetic */ WIR A00;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C14360o3.A0B(sensorEvent, 0);
        if (sensorEvent.sensor.getType() == WIR.A06) {
            WIR wir = this.A00;
            int i = wir.A00;
            if (i <= 0) {
                float[] fArr = wir.A04;
                SensorManager.getQuaternionFromVector(fArr, sensorEvent.values);
                Quaternion quaternion = wir.A02;
                quaternion.w = fArr[0];
                quaternion.x = fArr[1];
                quaternion.y = fArr[2];
                quaternion.z = fArr[3];
                InterfaceC71867X8a interfaceC71867X8a = wir.A03;
                long j = sensorEvent.timestamp;
                U9K u9k = (U9K) interfaceC71867X8a;
                u9k.A04 = quaternion;
                C149366nm c149366nm = u9k.A0C;
                c149366nm.A00(quaternion, j);
                i = wir.A00;
                if (i == 0) {
                    c149366nm.A03 = true;
                } else if (i <= -1) {
                    return;
                }
            }
            wir.A00 = i - 1;
        }
    }

    public WIN(WIR wir) {
        this.A00 = wir;
    }
}
