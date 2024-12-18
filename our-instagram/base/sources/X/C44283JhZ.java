package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.JhZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44283JhZ implements SensorEventListener {
    public final /* synthetic */ C44265JhC A00;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (java.lang.Math.min(r1, 360 - r1) >= 50) goto L22;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSensorChanged(android.hardware.SensorEvent r8) {
        /*
            r7 = this;
            r0 = 0
            X.C14360o3.A0B(r8, r0)
            float[] r1 = r8.values
            r0 = r1[r0]
            float r4 = -r0
            r0 = 1
            r0 = r1[r0]
            float r3 = -r0
            r0 = 2
            r0 = r1[r0]
            float r2 = -r0
            float r1 = r4 * r4
            float r0 = r3 * r3
            float r1 = r1 + r0
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r0
            float r2 = r2 * r2
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L3b
            double r0 = (double) r3
            double r2 = -r0
            double r0 = (double) r4
            double r2 = java.lang.Math.atan2(r2, r0)
            float r1 = (float) r2
            r0 = 1113927393(0x42652ee1, float:57.29578)
            float r1 = r1 * r0
            r5 = 1119092736(0x42b40000, float:90.0)
        L2c:
            float r5 = r5 - r1
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L34
            goto L2c
        L34:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3d
            float r5 = r5 + r1
            goto L34
        L3b:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            X.JhC r4 = r7.A00
            float r0 = r4.A00
            float r1 = X.AbstractC166987dD.A01(r5, r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lad
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L98
            com.instagram.creation.capture.MediaCaptureFragment r0 = r4.A09
            androidx.fragment.app.FragmentActivity r3 = r0.getActivity()
            if (r3 == 0) goto L98
            int r6 = java.lang.Math.round(r5)
            int r2 = r4.A02
            X.0vB r0 = X.AbstractC196848nE.A00
            r0 = -1
            if (r2 == r0) goto L75
            int r0 = r6 - r2
            int r1 = java.lang.Math.abs(r0)
            int r0 = 360 - r1
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 50
            if (r1 < r0) goto L7d
        L75:
            int r0 = r6 + 45
            int r0 = r0 / 90
            int r0 = r0 * 90
            int r2 = r0 % 360
        L7d:
            r4.A02 = r2
            float r0 = (float) r2
            float r2 = r5 - r0
        L82:
            r4.A01 = r2
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8e
            float r2 = r2 - r1
            goto L82
        L8e:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9c
            float r2 = r2 + r1
            r4.A01 = r2
            goto L8e
        L98:
            r0 = 0
            r4.A01 = r0
            goto Lab
        L9c:
            X.Jhh r2 = new X.Jhh
            r2.<init>(r4)
            X.0vB r1 = X.AbstractC196848nE.A00
            X.Jhi r0 = new X.Jhi
            r0.<init>(r3, r2)
            r1.ATO(r0)
        Lab:
            r4.A00 = r5
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44283JhZ.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public C44283JhZ(C44265JhC c44265JhC) {
        this.A00 = c44265JhC;
    }
}
