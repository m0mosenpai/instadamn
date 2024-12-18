package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0SC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SC extends AbstractC02970Bv {
    public volatile boolean A03 = true;
    public final ArrayList A02 = new ArrayList();
    public final C005001p A00 = new C005001p(0);
    public final C0SE A01 = new C0SE(true);

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new C0SE(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0C8, java.lang.Object] */
    public final synchronized void A05(SensorEventListener sensorEventListener, Sensor sensor) {
        if (this.A03) {
            this.A02.add(new C0C9(sensorEventListener, sensor));
            C005001p c005001p = this.A00;
            C0C8 c0c8 = (C0C8) c005001p.get(sensor);
            if (c0c8 == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ?? obj = new Object();
                obj.A01 = elapsedRealtime;
                obj.A00 = 1;
                c005001p.put(sensor, obj);
            } else {
                c0c8.A00++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void A06(SensorEventListener sensorEventListener, Sensor sensor) {
        int i;
        if (this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C0C9 c0c9 = (C0C9) it.next();
                if (sensorEventListener == c0c9.A01 && (sensor == null || sensor == c0c9.A00)) {
                    it.remove();
                    C005001p c005001p = this.A00;
                    Sensor sensor2 = c0c9.A00;
                    C0C8 c0c8 = (C0C8) c005001p.get(sensor2);
                    if (c0c8 != null && (i = c0c8.A00) != 0) {
                        if (i > 1) {
                            c0c8.A00 = i - 1;
                        } else {
                            c005001p.remove(sensor2);
                            int type = sensor2.getType();
                            C0SE c0se = this.A01;
                            SparseArray sparseArray = c0se.A01;
                            C0SK c0sk = (C0SK) sparseArray.get(type, null);
                            C0SK c0sk2 = c0sk;
                            if (c0sk == null) {
                                Object obj = new Object();
                                sparseArray.put(type, obj);
                                c0sk2 = obj;
                            }
                            long j = elapsedRealtime - c0c8.A01;
                            c0sk2.A01 += j;
                            C0SK c0sk3 = c0se.A02;
                            c0sk3.A01 += j;
                            double power = ((sensor2.getPower() * j) / 3600.0d) / 1000.0d;
                            c0sk2.A00 += power;
                            c0sk3.A00 += power;
                            if (sensor2.isWakeUpSensor()) {
                                c0sk2.A02 += j;
                                c0sk3.A02 += j;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        C0SE c0se = (C0SE) abstractC02960Bu;
        synchronized (this) {
            AbstractC03000By.A00(c0se);
            if (!this.A03) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            c0se.A04(this.A01);
            C005001p c005001p = this.A00;
            int size = c005001p.size();
            for (int i = 0; i < size; i++) {
                Sensor sensor = (Sensor) c005001p.A05(i);
                C0C8 c0c8 = (C0C8) c005001p.A06(i);
                if (c0c8.A00 > 0) {
                    long j = elapsedRealtime - c0c8.A01;
                    double power = ((sensor.getPower() * j) / 3600.0d) / 1000.0d;
                    C0SK c0sk = c0se.A02;
                    c0sk.A01 += j;
                    c0sk.A00 += power;
                    boolean z = false;
                    if (sensor.isWakeUpSensor()) {
                        z = true;
                        c0sk.A02 += j;
                    }
                    if (c0se.A00) {
                        int type = sensor.getType();
                        SparseArray sparseArray = c0se.A01;
                        C0SK c0sk2 = (C0SK) sparseArray.get(type);
                        C0SK c0sk3 = c0sk2;
                        if (c0sk2 == null) {
                            Object obj = new Object();
                            sparseArray.put(type, obj);
                            c0sk3 = obj;
                        }
                        c0sk3.A01 += j;
                        c0sk3.A00 += power;
                        if (z) {
                            c0sk3.A02 += j;
                        }
                    }
                }
            }
            return true;
        }
    }
}
