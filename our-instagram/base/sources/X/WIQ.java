package X;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;

/* loaded from: classes11.dex */
public final class WIQ implements SensorEventListener {
    public Sensor A00;
    public SensorManager A01;
    public final C69611VsE A02 = new C69611VsE();
    public final C66387UEv A03;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        C69175Vj4 c69175Vj4;
        int i2;
        C69175Vj4 c69175Vj42;
        float[] fArr = sensorEvent.values;
        boolean z = false;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        if ((f * f) + (f2 * f2) + (f3 * f3) > 169.0d) {
            z = true;
        }
        long j = sensorEvent.timestamp;
        C69611VsE c69611VsE = this.A02;
        long j2 = j - 500000000;
        while (true) {
            i = c69611VsE.A01;
            if (i < 4 || (c69175Vj42 = c69611VsE.A03) == null || j2 - c69175Vj42.A00 <= 0) {
                break;
            }
            if (c69175Vj42.A02) {
                c69611VsE.A00--;
            }
            c69611VsE.A01 = i - 1;
            C69175Vj4 c69175Vj43 = c69175Vj42.A01;
            c69611VsE.A03 = c69175Vj43;
            if (c69175Vj43 == null) {
                c69611VsE.A02 = null;
            }
            C68868VdO c68868VdO = c69611VsE.A04;
            c69175Vj42.A01 = c68868VdO.A00;
            c68868VdO.A00 = c69175Vj42;
        }
        C68868VdO c68868VdO2 = c69611VsE.A04;
        C69175Vj4 c69175Vj44 = c68868VdO2.A00;
        if (c69175Vj44 == null) {
            c69175Vj4 = new Object();
        } else {
            c68868VdO2.A00 = c69175Vj44.A01;
            c69175Vj4 = c69175Vj44;
        }
        c69175Vj4.A00 = j;
        c69175Vj4.A02 = z;
        c69175Vj4.A01 = null;
        C69175Vj4 c69175Vj45 = c69611VsE.A02;
        if (c69175Vj45 != null) {
            c69175Vj45.A01 = c69175Vj4;
        }
        c69611VsE.A02 = c69175Vj4;
        C69175Vj4 c69175Vj46 = c69611VsE.A03;
        if (c69175Vj46 == null) {
            c69611VsE.A03 = c69175Vj4;
            c69175Vj46 = c69175Vj4;
        }
        int i3 = i + 1;
        c69611VsE.A01 = i3;
        if (z) {
            c69611VsE.A00++;
        }
        if (c69175Vj46 != null && j - c69175Vj46.A00 >= 250000000 && c69611VsE.A00 >= (i3 >> 1) + (i3 >> 2)) {
            c69611VsE.A00();
            C66387UEv c66387UEv = this.A03;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - c66387UEv.A01 < 500) {
                i2 = c66387UEv.A00 + 1;
                c66387UEv.A00 = i2;
            } else {
                c66387UEv.A00 = 1;
                i2 = 1;
            }
            c66387UEv.A01 = elapsedRealtime;
            if (i2 >= 2 && c66387UEv.getParentFragmentManager().A0Q("dump_debug_info_dialog_fragment") == null) {
                if (c66387UEv.A01 - c66387UEv.A02 <= 1000) {
                    WIQ wiq = c66387UEv.A04;
                    Sensor sensor = wiq.A00;
                    if (sensor != null) {
                        wiq.A02.A00();
                        wiq.A01.unregisterListener(wiq, sensor);
                        C0BW.A00.A06(wiq, sensor);
                        wiq.A01 = null;
                        wiq.A00 = null;
                        return;
                    }
                    return;
                }
                c66387UEv.A03.A0B(c66387UEv.getParentFragmentManager(), "dump_debug_info_dialog_fragment");
                new Thread(new TJh(c66387UEv)).start();
            }
        }
    }

    public WIQ(C66387UEv c66387UEv) {
        this.A03 = c66387UEv;
    }
}
