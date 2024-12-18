package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.instagram.creation.capture.MediaCaptureFragment;

/* renamed from: X.JhC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44265JhC {
    public float A00 = -1.0f;
    public float A01;
    public int A02;
    public int A03;
    public SensorEventListener A04;
    public boolean A05;
    public final Sensor A06;
    public final SensorManager A07;
    public final Handler A08;
    public final MediaCaptureFragment A09;

    public C44265JhC(Context context, MediaCaptureFragment mediaCaptureFragment) {
        Object systemService = context.getSystemService("sensor");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.A07 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.A06 = defaultSensor;
        if (defaultSensor != null) {
            this.A04 = new C44283JhZ(this);
        }
        this.A09 = mediaCaptureFragment;
        this.A02 = -1;
        this.A01 = -1.0f;
        this.A08 = AbstractC167007dF.A0J();
    }
}
