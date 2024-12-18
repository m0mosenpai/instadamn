package X;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09830fh {
    public static final AbstractC09830fh $redex_init_class = null;

    static {
        C0T8.A02 = true;
    }

    public static WifiInfo A00(WifiManager wifiManager) {
        WifiInfo wifiInfo;
        if (C0T8.A01()) {
            try {
                ReadWriteLock readWriteLock = C0T8.A01;
                readWriteLock.readLock().lock();
                C0T7 c0t7 = C0T8.A00;
                if (c0t7 != null) {
                    wifiInfo = c0t7.DJP(wifiManager);
                } else {
                    wifiInfo = null;
                }
                readWriteLock.readLock().unlock();
                return wifiInfo;
            } catch (Throwable th) {
                C0T8.A01.readLock().unlock();
                throw th;
            }
        }
        return wifiManager.getConnectionInfo();
    }
}
