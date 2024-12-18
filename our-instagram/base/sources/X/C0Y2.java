package X;

import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.util.SparseArray;

/* renamed from: X.0Y2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Y2 extends AbstractC02970Bv {
    public long A00;
    public long A01;
    public final SparseArray A02 = new SparseArray();
    public final SparseArray A03 = new SparseArray();

    public final synchronized void A05(Object obj) {
        boolean z;
        A02(obj);
        int identityHashCode = System.identityHashCode(obj);
        SparseArray sparseArray = this.A02;
        synchronized (C0Y2.class) {
            z = false;
            if (((Long) sparseArray.get(identityHashCode)) != null) {
                z = true;
            }
        }
        if (z) {
            this.A00 += A00(sparseArray, identityHashCode);
        }
    }

    public final synchronized void A06(Object obj) {
        A02(obj);
        int identityHashCode = System.identityHashCode(obj);
        this.A02.delete(identityHashCode);
        this.A03.delete(identityHashCode);
    }

    public final synchronized void A07(Object obj) {
        A02(obj);
        A01(this.A02, System.identityHashCode(obj));
    }

    public final synchronized void A08(Object obj) {
        A02(obj);
        A01(this.A03, System.identityHashCode(obj));
    }

    public final synchronized void A09(Object obj) {
        A02(obj);
        this.A01 += A00(this.A03, System.identityHashCode(obj));
    }

    public static synchronized long A00(SparseArray sparseArray, int i) {
        long j;
        synchronized (C0Y2.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            j = 0;
            Long l = (Long) sparseArray.get(i);
            if (l != null) {
                j = uptimeMillis - l.longValue();
                sparseArray.remove(i);
            } else {
                android.util.Log.e("CameraMetricsCollector", "Stopped recording details for a camera that hasn't been added yet", null);
            }
        }
        return j;
    }

    public static synchronized void A01(SparseArray sparseArray, int i) {
        synchronized (C0Y2.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (sparseArray.get(i) == null) {
                sparseArray.append(i, Long.valueOf(uptimeMillis));
            }
        }
    }

    public static void A02(Object obj) {
        if (!(obj instanceof Camera) && !(obj instanceof CameraDevice)) {
            throw new IllegalArgumentException("Must pass in a Camera or a CameraDevice");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Bu, java.lang.Object] */
    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03() {
        return new Object();
    }

    @Override // X.AbstractC02970Bv
    public final /* bridge */ /* synthetic */ boolean A04(AbstractC02960Bu abstractC02960Bu) {
        C0YK c0yk = (C0YK) abstractC02960Bu;
        synchronized (this) {
            AbstractC03000By.A00(c0yk);
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A00;
            SparseArray sparseArray = this.A02;
            int size = sparseArray.size();
            long j2 = 0;
            for (int i = 0; i < size; i++) {
                j2 += uptimeMillis - ((Long) sparseArray.valueAt(i)).longValue();
            }
            c0yk.A00 = j + j2;
            long j3 = this.A01;
            SparseArray sparseArray2 = this.A03;
            int size2 = sparseArray2.size();
            long j4 = 0;
            for (int i2 = 0; i2 < size2; i2++) {
                j4 += uptimeMillis - ((Long) sparseArray2.valueAt(i2)).longValue();
            }
            c0yk.A01 = j3 + j4;
        }
        return true;
    }
}
