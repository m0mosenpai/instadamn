package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.2AZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AZ implements SensorEventListener {
    public float A00;
    public final C46172Ab A01;
    public final /* synthetic */ C2AV A02;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        if (java.lang.Math.min(r6.A00, r6.A01) >= 2) goto L55;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AZ.onSensorChanged(android.hardware.SensorEvent):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2AZ(C2AV c2av) {
        this();
        this.A02 = c2av;
    }

    public C2AZ() {
        this.A01 = new C46172Ab(this);
    }
}
