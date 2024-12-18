package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.smartcapture.docauth.CaptureState;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WIO implements SensorEventListener {
    public final int A00;
    public final Object A01;

    public WIO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        WeakReference weakReference;
        C62428SBd c62428SBd;
        float f;
        float[] fArr;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(sensorEvent, 0);
                C69274Vki c69274Vki = (C69274Vki) this.A01;
                float[] fArr2 = c69274Vki.A04;
                boolean z = false;
                float f2 = 0.0f;
                int i = 0;
                do {
                    float f3 = fArr2[i] * 0.8f;
                    float[] fArr3 = sensorEvent.values;
                    float f4 = f3 + (fArr3[i] * 0.19999999f);
                    fArr2[i] = f4;
                    f2 += Math.abs(fArr3[i] - f4);
                    i++;
                } while (i < 3);
                if (f2 < 0.65f) {
                    z = true;
                }
                if (z != c69274Vki.A02 && (weakReference = c69274Vki.A01) != null && (c62428SBd = (C62428SBd) weakReference.get()) != null) {
                    C64094SzB c64094SzB = c62428SBd.A00;
                    InterfaceC65547TmM interfaceC65547TmM = (InterfaceC65547TmM) c64094SzB.A0K.get();
                    if (c64094SzB.A04 == CaptureState.HOLDING_STEADY && interfaceC65547TmM != null) {
                        interfaceC65547TmM.EeP(z);
                    }
                }
                c69274Vki.A02 = z;
                return;
            case 1:
                C14360o3.A0B(sensorEvent, 0);
                if (sensorEvent.sensor.getType() != 15) {
                    return;
                }
                C70299WQe c70299WQe = (C70299WQe) this.A01;
                long j = c70299WQe.A02;
                c70299WQe.A02 = 1 + j;
                if (j <= 10) {
                    return;
                }
                float[] fArr4 = c70299WQe.A0A;
                SensorManager.getRotationMatrixFromVector(fArr4, sensorEvent.values);
                boolean z2 = c70299WQe.A03;
                float[] fArr5 = c70299WQe.A09;
                if (!z2) {
                    AbstractC06960Yn.A0T(fArr4, fArr5, fArr4.length);
                    c70299WQe.A03 = true;
                    C164317Wu c164317Wu = c70299WQe.A08;
                    C7BX.A03 = 0.0f;
                    Iterator A0l = AbstractC167007dF.A0l(C7BX.A04);
                    while (A0l.hasNext()) {
                        C7BX.A00((C7BX) A0l.next());
                    }
                    C66322U8v c66322U8v = (C66322U8v) c164317Wu.A00.A05.invoke();
                    if (c66322U8v == null) {
                        return;
                    }
                    c66322U8v.A00 = 0.0f;
                    c66322U8v.A01 = 0.0f;
                    c66322U8v.A00();
                    c66322U8v.A04.reset();
                    return;
                }
                float f5 = fArr5[2];
                float f6 = fArr4[0] * f5;
                float f7 = fArr5[5];
                float f8 = f6 + (fArr4[3] * f7);
                float f9 = fArr5[8];
                c70299WQe.A01 = (f8 + (fArr4[6] * f9)) * 2.0f;
                c70299WQe.A00 = (f5 * fArr4[1]) + (f7 * fArr4[4]) + (f9 * fArr4[7]);
                C164317Wu c164317Wu2 = c70299WQe.A08;
                C68698Vaa c68698Vaa = c70299WQe.A07;
                C14360o3.A0B(c68698Vaa, 0);
                C164307Wt c164307Wt = c164317Wu2.A00;
                C66322U8v c66322U8v2 = (C66322U8v) c164307Wt.A05.invoke();
                Drawable drawable = (Drawable) c164307Wt.A06.invoke();
                Context context = c164307Wt.A01.getContext();
                if (c66322U8v2 != null && drawable != null) {
                    if (context == null) {
                        return;
                    }
                    AnonymousClass988 anonymousClass988 = c164307Wt.A04;
                    if (AbstractC167007dF.A1Z(anonymousClass988.A04)) {
                        float A00 = AbstractC13880nE.A00(context, (float) ((Number) anonymousClass988.A06.getValue()).doubleValue());
                        C70299WQe c70299WQe2 = c68698Vaa.A00;
                        float f10 = c70299WQe2.A01 * A00;
                        float f11 = c70299WQe2.A00 * A00;
                        float doubleValue = (float) ((Number) anonymousClass988.A1B.getValue()).doubleValue();
                        if (Math.abs(f10) >= doubleValue || Math.abs(f11) >= doubleValue) {
                            c66322U8v2.A00 = f10;
                            c66322U8v2.A01 = f11;
                            c66322U8v2.A00();
                            drawable.invalidateSelf();
                        }
                    }
                } else if (context == null) {
                    return;
                }
                if (!AbstractC25231BEo.A1b(c164307Wt.A07)) {
                    return;
                }
                AnonymousClass988 anonymousClass9882 = c164307Wt.A04;
                float A002 = c68698Vaa.A00.A00 * AbstractC13880nE.A00(context, (float) ((Number) anonymousClass9882.A1A.getValue()).doubleValue());
                if (Math.abs(A002) < ((float) ((Number) anonymousClass9882.A1C.getValue()).doubleValue())) {
                    return;
                }
                C7BX.A03 = A002;
                Iterator A0l2 = AbstractC167007dF.A0l(C7BX.A04);
                while (A0l2.hasNext()) {
                    C7BX.A00((C7BX) A0l2.next());
                }
                return;
            default:
                C24149AnY c24149AnY = (C24149AnY) this.A01;
                if (sensorEvent != null && (fArr = sensorEvent.values) != null) {
                    f = fArr[0];
                } else {
                    f = 0.0f;
                }
                c24149AnY.A00 = f;
                return;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
