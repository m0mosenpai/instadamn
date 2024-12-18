package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WIP implements SensorEventListener {
    public C69467Vnq A00;
    public float[] A01;
    public final Sensor A02;
    public final SensorManager A03;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        C14360o3.A0B(sensorEvent, 0);
        float[] fArr = new float[9];
        SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
        float[] fArr2 = this.A01;
        if (fArr2 == null) {
            this.A01 = fArr;
            fArr2 = fArr;
        }
        float[] fArr3 = new float[3];
        SensorManager.getAngleChange(fArr3, fArr, fArr2);
        C69467Vnq c69467Vnq = this.A00;
        if (c69467Vnq != null) {
            float f = fArr3[1];
            float f2 = fArr3[2];
            C25562BRz c25562BRz = c69467Vnq.A0E;
            double d = f2;
            float f3 = (float) (d * 57.29577951308232d);
            double d2 = f;
            float f4 = (float) (d2 * 57.29577951308232d);
            double d3 = c69467Vnq.A02;
            C2XI c2xi = c69467Vnq.A07;
            float f5 = c69467Vnq.A00;
            float f6 = c69467Vnq.A04;
            AbstractC25227BEk.A1D(c2xi, AbstractC25531BQt.A00(f3, f5, f6));
            C2XI c2xi2 = c69467Vnq.A06;
            float f7 = c69467Vnq.A03;
            AbstractC25227BEk.A1D(c2xi2, AbstractC25531BQt.A00(f4, f5, f7));
            C2XI c2xi3 = c69467Vnq.A09;
            float f8 = c69467Vnq.A01;
            AbstractC25227BEk.A1D(c2xi3, AbstractC25531BQt.A00(f3, f8, f6));
            AbstractC25227BEk.A1D(c69467Vnq.A08, AbstractC25531BQt.A00(f4, f8, f7));
            C2XI c2xi4 = c69467Vnq.A0A;
            UserSession userSession = c25562BRz.A04;
            AbstractC25227BEk.A1D(c2xi4, AbstractC25531BQt.A01(userSession, (float) (d2 * d3 * (-1.0d))));
            AbstractC25227BEk.A1D(c69467Vnq.A0B, AbstractC25531BQt.A01(userSession, (float) (d * d3)));
            C2XI c2xi5 = c69467Vnq.A0C;
            float f9 = c69467Vnq.A05;
            AbstractC25227BEk.A1D(c2xi5, AbstractC25531BQt.A01(userSession, f * f9 * (-1.0f)));
            AbstractC25227BEk.A1D(c69467Vnq.A0D, AbstractC25531BQt.A01(userSession, f2 * f9));
        }
    }

    public WIP(Context context) {
        Object systemService = context.getSystemService("sensor");
        if (systemService != null) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.A03 = sensorManager;
            this.A02 = sensorManager.getDefaultSensor(11);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
