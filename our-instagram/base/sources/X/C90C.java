package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Handler;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.90C, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C90C implements C90D {
    public static final float[] A0V = {-0.11970494f, 0.6727418f, 9.56203f};
    public static final float[] A0W = {-0.11796062f, 0.68843085f, 9.781745f};
    public static final float[] A0X = {4.6960264E-4f, -5.1159784E-4f, 2.8634304E-4f};
    public float A00;
    public int A01;
    public long A02;
    public Handler A03;
    public final int A06;
    public final Sensor A07;
    public final Sensor A08;
    public final Sensor A09;
    public final Sensor A0A;
    public final Sensor A0B;
    public final Sensor A0C;
    public final Sensor A0D;
    public final SensorManager A0L;
    public final WindowManager A0M;
    public final float[] A0S;
    public final Integer A0U;
    public final float[] A0Q = new float[16];
    public final float[] A0R = new float[16];
    public final float[] A0O = new float[3];
    public final float[] A0P = new float[3];
    public final float[] A0T = new float[3];
    public final ArrayList A0N = new ArrayList();
    public boolean A05 = false;
    public boolean A04 = false;
    public final SensorEventListener A0K = new SensorEventListener() { // from class: X.90E
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            C90C c90c = C90C.this;
            synchronized (c90c) {
                if (c90c.A04 && (sensorEvent.sensor.getType() == 11 || sensorEvent.sensor.getType() == 15 || sensorEvent.sensor.getType() == 20)) {
                    float[] fArr = c90c.A0Q;
                    SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                    int rotation = c90c.A0M.getDefaultDisplay().getRotation();
                    float[] fArr2 = c90c.A0R;
                    int i = 131;
                    int i2 = 129;
                    if (rotation != 1) {
                        if (rotation != 2) {
                            i2 = 1;
                            if (rotation != 3) {
                                i = 1;
                                i2 = 3;
                            }
                        } else {
                            i = 129;
                            i2 = 131;
                        }
                    } else {
                        i = 3;
                    }
                    SensorManager.remapCoordinateSystem(fArr, i, i2, fArr2);
                    float[] fArr3 = c90c.A0S;
                    fArr3[0] = fArr2[0];
                    fArr3[1] = fArr2[2];
                    fArr3[2] = -fArr2[1];
                    fArr3[3] = 0.0f;
                    fArr3[4] = fArr2[8];
                    fArr3[5] = fArr2[10];
                    fArr3[6] = -fArr2[9];
                    fArr3[7] = 0.0f;
                    fArr3[8] = -fArr2[4];
                    fArr3[9] = -fArr2[6];
                    fArr3[10] = fArr2[5];
                    fArr3[11] = 0.0f;
                    fArr3[12] = 0.0f;
                    fArr3[13] = 0.0f;
                    fArr3[14] = 0.0f;
                    fArr3[15] = 1.0f;
                    if (!c90c.A05) {
                        float[] fArr4 = sensorEvent.values;
                        if (fArr4[0] != 0.0f || fArr4[1] != 0.0f || fArr4[2] != 0.0f) {
                            SensorManager.getOrientation(fArr3, new float[3]);
                            c90c.A00 = (float) Math.toDegrees(r1[2]);
                            c90c.A05 = true;
                        }
                    }
                    Matrix.rotateM(fArr3, 0, c90c.A00, 0.0f, 1.0f, 0.0f);
                    Matrix.invertM(fArr3, 0, fArr3, 0);
                    c90c.A02 = sensorEvent.timestamp;
                    C90C.A00(c90c);
                }
            }
        }
    };
    public final SensorEventListener A0E = new SensorEventListener() { // from class: X.90F
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            C90C c90c = C90C.this;
            synchronized (c90c) {
                if (c90c.A04 && sensorEvent.sensor.getType() == 1) {
                    float[] fArr = c90c.A0O;
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    c90c.A02 = sensorEvent.timestamp;
                }
            }
        }
    };
    public final SensorEventListener A0F = new SensorEventListener() { // from class: X.90G
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            C90C c90c = C90C.this;
            synchronized (c90c) {
                if (c90c.A04 && sensorEvent.sensor.getType() == 9) {
                    float[] fArr = c90c.A0P;
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    c90c.A02 = sensorEvent.timestamp;
                }
            }
        }
    };
    public final SensorEventListener A0J = new SensorEventListener() { // from class: X.90H
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            C90C c90c = C90C.this;
            synchronized (c90c) {
                if (c90c.A04 && sensorEvent.sensor.getType() == 4) {
                    float[] fArr = c90c.A0T;
                    float[] fArr2 = sensorEvent.values;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    c90c.A02 = sensorEvent.timestamp;
                }
            }
        }
    };
    public final SensorEventListener A0G = new SensorEventListener() { // from class: X.90I
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Iterator it = C90C.this.A0N.iterator();
            while (it.hasNext()) {
                ((BCT) it.next()).onRawSensorMeasurementChanged(EnumC222959sa.RAW_ACCELEROMETER, sensorEvent.values, sensorEvent.timestamp);
            }
        }
    };
    public final SensorEventListener A0H = new SensorEventListener() { // from class: X.90J
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Iterator it = C90C.this.A0N.iterator();
            while (it.hasNext()) {
                ((BCT) it.next()).onRawSensorMeasurementChanged(EnumC222959sa.RAW_GYROSCOPE, sensorEvent.values, sensorEvent.timestamp);
            }
        }
    };
    public final SensorEventListener A0I = new SensorEventListener() { // from class: X.90K
        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Iterator it = C90C.this.A0N.iterator();
            while (it.hasNext()) {
                ((BCT) it.next()).onRawSensorMeasurementChanged(EnumC222959sa.RAW_MAGNETOMETER, sensorEvent.values, sensorEvent.timestamp);
            }
        }
    };

    public C90C(Context context, Integer num, boolean z) {
        float[] fArr = new float[16];
        this.A0S = fArr;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.A0L = sensorManager;
        this.A0U = num;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(15);
            if (defaultSensor == null && (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
                defaultSensor = sensorManager.getDefaultSensor(20);
            }
            this.A0D = defaultSensor;
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
            this.A07 = defaultSensor2;
            this.A08 = sensorManager.getDefaultSensor(9);
            this.A0C = sensorManager.getDefaultSensor(4);
            if (z) {
                Sensor defaultSensor3 = this.A0L.getDefaultSensor(35);
                this.A09 = defaultSensor3 != null ? defaultSensor3 : defaultSensor2;
                Sensor defaultSensor4 = sensorManager.getDefaultSensor(16);
                this.A0A = defaultSensor4 == null ? sensorManager.getDefaultSensor(4) : defaultSensor4;
                this.A0B = sensorManager.getDefaultSensor(14);
            } else {
                this.A09 = null;
                this.A0A = null;
                this.A0B = null;
            }
        } else {
            this.A0D = null;
            this.A07 = null;
            this.A08 = null;
            this.A0C = null;
            this.A09 = null;
            this.A0A = null;
            this.A0B = null;
        }
        this.A0M = (WindowManager) context.getSystemService("window");
        this.A06 = 1;
        Matrix.setIdentityM(fArr, 0);
    }

    public static synchronized void A00(C90C c90c) {
        synchronized (c90c) {
            int i = c90c.A01;
            if (i > 0) {
                c90c.A01 = i - 1;
            } else {
                Iterator it = c90c.A0N.iterator();
                while (it.hasNext()) {
                    ((BCT) it.next()).onDataChanged(c90c.A0S, c90c.A0O, c90c.A0P, c90c.A0T, c90c.A02);
                }
            }
        }
    }

    @Override // X.C90D
    public final boolean Ccq(int i) {
        Sensor sensor;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    sensor = this.A0C;
                } else {
                    sensor = this.A08;
                }
            } else {
                sensor = this.A07;
            }
        } else {
            sensor = this.A0D;
        }
        return sensor != null;
    }

    @Override // X.C90D
    public final synchronized void start() {
        if (!this.A04) {
            this.A04 = true;
            this.A05 = false;
            int intValue = this.A0U.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    Matrix.setIdentityM(this.A0S, 0);
                    Matrix.setIdentityM(this.A0Q, 0);
                    Matrix.setIdentityM(this.A0R, 0);
                    float[] fArr = this.A0O;
                    float[] fArr2 = A0V;
                    fArr[0] = fArr2[0];
                    fArr[1] = fArr2[1];
                    fArr[2] = fArr2[2];
                    float[] fArr3 = this.A0P;
                    float[] fArr4 = A0W;
                    fArr3[0] = fArr4[0];
                    fArr3[1] = fArr4[1];
                    fArr3[2] = fArr4[2];
                    float[] fArr5 = this.A0T;
                    float[] fArr6 = A0X;
                    fArr5[0] = fArr6[0];
                    fArr5[1] = fArr6[1];
                    fArr5[2] = fArr6[2];
                    this.A01 = 0;
                    A00(this);
                }
            } else {
                SensorManager sensorManager = this.A0L;
                if (sensorManager != null) {
                    Handler handler = this.A03;
                    if (handler == null) {
                        handler = C175907s4.A01("SensorMotionDataSource");
                        this.A03 = handler;
                    }
                    this.A01 = 2;
                    Sensor sensor = this.A0D;
                    if (sensor != null) {
                        SensorEventListener sensorEventListener = this.A0K;
                        if (sensorManager.registerListener(sensorEventListener, sensor, this.A06, handler)) {
                            C0BW.A00.A05(sensorEventListener, sensor);
                        }
                    }
                    Sensor sensor2 = this.A07;
                    if (sensor2 != null) {
                        SensorEventListener sensorEventListener2 = this.A0E;
                        if (sensorManager.registerListener(sensorEventListener2, sensor2, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener2, sensor2);
                        }
                    }
                    Sensor sensor3 = this.A08;
                    if (sensor3 != null) {
                        SensorEventListener sensorEventListener3 = this.A0F;
                        if (sensorManager.registerListener(sensorEventListener3, sensor3, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener3, sensor3);
                        }
                    }
                    Sensor sensor4 = this.A0C;
                    if (sensor4 != null) {
                        SensorEventListener sensorEventListener4 = this.A0J;
                        if (sensorManager.registerListener(sensorEventListener4, sensor4, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener4, sensor4);
                        }
                    }
                    Sensor sensor5 = this.A09;
                    if (sensor5 != null) {
                        SensorEventListener sensorEventListener5 = this.A0G;
                        if (sensorManager.registerListener(sensorEventListener5, sensor5, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener5, sensor5);
                        }
                    }
                    Sensor sensor6 = this.A0A;
                    if (sensor6 != null) {
                        SensorEventListener sensorEventListener6 = this.A0H;
                        if (sensorManager.registerListener(sensorEventListener6, sensor6, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener6, sensor6);
                        }
                    }
                    Sensor sensor7 = this.A0B;
                    if (sensor7 != null) {
                        SensorEventListener sensorEventListener7 = this.A0I;
                        if (sensorManager.registerListener(sensorEventListener7, sensor7, this.A06, this.A03)) {
                            C0BW.A00.A05(sensorEventListener7, sensor7);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C90D
    public final synchronized void stop() {
        if (this.A04) {
            int intValue = this.A0U.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    this.A00 = 0.0f;
                    int i = 0;
                    this.A05 = false;
                    do {
                        this.A0S[i] = 0.0f;
                        this.A0Q[i] = 0.0f;
                        this.A0R[i] = 0.0f;
                        i++;
                    } while (i < 16);
                    int i2 = 0;
                    do {
                        this.A0O[i2] = 0.0f;
                        this.A0P[i2] = 0.0f;
                        this.A0T[i2] = 0.0f;
                        i2++;
                    } while (i2 < 3);
                }
            } else {
                SensorManager sensorManager = this.A0L;
                if (sensorManager != null) {
                    if (this.A0D != null) {
                        C0fX.A00(this.A0K, sensorManager);
                    }
                    if (this.A07 != null) {
                        C0fX.A00(this.A0E, sensorManager);
                    }
                    if (this.A08 != null) {
                        C0fX.A00(this.A0F, sensorManager);
                    }
                    if (this.A0C != null) {
                        C0fX.A00(this.A0J, sensorManager);
                    }
                    if (this.A09 != null) {
                        C0fX.A00(this.A0G, sensorManager);
                    }
                    if (this.A0A != null) {
                        C0fX.A00(this.A0H, sensorManager);
                    }
                    if (this.A0B != null) {
                        C0fX.A00(this.A0I, sensorManager);
                    }
                    Handler handler = this.A03;
                    if (handler != null) {
                        C175907s4.A02(handler, false, false);
                        this.A03 = null;
                    }
                }
            }
            this.A04 = false;
            this.A05 = false;
            this.A0N.clear();
        }
    }

    @Override // X.C90D
    public final void A8z(BCT bct) {
        this.A0N.add(bct);
    }

    @Override // X.C90D
    public final Integer B2u() {
        return this.A0U;
    }

    @Override // X.C90D
    public final boolean CLa() {
        if (this.A09 == null && this.A0A == null && this.A0B == null) {
            return false;
        }
        return true;
    }
}
