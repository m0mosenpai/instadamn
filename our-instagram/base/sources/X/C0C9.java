package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.0C9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0C9 {
    public final Sensor A00;
    public final SensorEventListener A01;

    public C0C9(SensorEventListener sensorEventListener, Sensor sensor) {
        this.A01 = sensorEventListener;
        this.A00 = sensor;
    }
}
