package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: X.LMy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48029LMy implements SensorEventListener {
    public long A00;
    public boolean A01 = true;
    public final int A02;
    public final Sensor A03;
    public final InterfaceC16620sF A04;

    public C48029LMy(Sensor sensor, InterfaceC16620sF interfaceC16620sF, int i) {
        this.A03 = sensor;
        this.A04 = interfaceC16620sF;
        this.A02 = i;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        if (sensorEvent != null && this.A01 && sensorEvent.accuracy != 0) {
            int i = this.A02;
            if ((i > 0 && System.currentTimeMillis() - this.A00 < i) || (fArr = sensorEvent.values) == null) {
                return;
            }
            this.A04.invoke(this.A03, Float.valueOf(fArr[0]));
        }
    }
}
