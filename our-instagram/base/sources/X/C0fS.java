package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0fS, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0fS {
    public static final C0fS $redex_init_class = null;

    static {
        C0T8.A02 = true;
    }

    public static Location A00(LocationManager locationManager, String str) {
        if (C0T8.A01()) {
            try {
                ReadWriteLock readWriteLock = C0T8.A01;
                readWriteLock.readLock().lock();
                Location DJS = C0T8.A00.DJS(locationManager, str);
                readWriteLock.readLock().unlock();
                C0T8.A00();
                return DJS;
            } catch (Throwable th) {
                C0T8.A01.readLock().unlock();
                C0T8.A00();
                throw th;
            }
        }
        return locationManager.getLastKnownLocation(str);
    }

    public static void A01(LocationListener locationListener, LocationManager locationManager) {
        if (C0T8.A01()) {
            try {
                ReadWriteLock readWriteLock = C0T8.A01;
                readWriteLock.readLock().lock();
                C0T7 c0t7 = C0T8.A00;
                if (c0t7 != null) {
                    c0t7.DfB(locationListener, locationManager);
                }
                readWriteLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                C0T8.A01.readLock().unlock();
                throw th;
            }
        }
        locationManager.removeUpdates(locationListener);
    }

    public static void A02(LocationListener locationListener, LocationManager locationManager, String str, float f, int i, long j) {
        if (C0T8.A01()) {
            try {
                ReadWriteLock readWriteLock = C0T8.A01;
                readWriteLock.readLock().lock();
                C0T7 c0t7 = C0T8.A00;
                if (c0t7 != null) {
                    c0t7.Dg8(locationListener, locationManager, str, f, i, j);
                }
                readWriteLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                C0T8.A01.readLock().unlock();
                throw th;
            }
        }
        locationManager.requestLocationUpdates(str, j, f, locationListener);
    }
}
