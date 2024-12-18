package X;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.4uW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108454uW {
    public ScheduledExecutorService A00;
    public final Context A01;
    public final C0JM A02;
    public final C0JO A03;
    public final C108434uU A04;
    public final C108444uV A05;
    public final C103744ls A06;

    public static boolean A00(C108454uW c108454uW) {
        if (Build.VERSION.SDK_INT >= 29 && c108454uW.A06 != null) {
            return C0L6.A06();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (((android.net.wifi.WifiManager) r2.getSystemService(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_WIFI)).isScanAlwaysAvailable() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02() {
        /*
            r4 = this;
            X.4uU r1 = r4.A04
            r3 = 0
            java.lang.String r0 = "android.permission.ACCESS_WIFI_STATE"
            android.content.Context r2 = r1.A00
            int r0 = r2.checkCallingOrSelfPermission(r0)
            if (r0 != 0) goto L41
            boolean r0 = X.C108434uU.A00(r1)
            if (r0 == 0) goto L41
            android.content.pm.PackageManager r1 = r2.getPackageManager()     // Catch: java.lang.Throwable -> L41
            r0 = 3878(0xf26, float:5.434E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r1.hasSystemFeature(r0)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L41
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.SecurityException -> L31
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch: java.lang.SecurityException -> L31
            boolean r0 = r0.isScanAlwaysAvailable()     // Catch: java.lang.SecurityException -> L31
            if (r0 != 0) goto L40
        L31:
            java.lang.String r0 = "wifi"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            boolean r0 = r0.isWifiEnabled()
            if (r0 != 0) goto L40
            return r3
        L40:
            r3 = 1
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108454uW.A02():boolean");
    }

    public C108454uW(Context context, C0JM c0jm, C0JO c0jo, C103744ls c103744ls, C108434uU c108434uU, C108444uV c108444uV, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = context.getApplicationContext();
        this.A02 = c0jm;
        this.A03 = c0jo;
        this.A00 = scheduledExecutorService;
        this.A04 = c108434uU;
        this.A05 = c108444uV;
        this.A06 = c103744ls;
    }

    public final ArrayList A01(boolean z) {
        List list;
        boolean z2;
        ArrayList arrayList = null;
        if (A00(this) && (z || A02())) {
            WifiManager wifiManager = (WifiManager) this.A01.getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI);
            AbstractC09830fh abstractC09830fh = AbstractC09830fh.$redex_init_class;
            if (C0T8.A01()) {
                try {
                    ReadWriteLock readWriteLock = C0T8.A01;
                    readWriteLock.readLock().lock();
                    C0T7 c0t7 = C0T8.A00;
                    if (c0t7 != null) {
                        list = c0t7.DJT(wifiManager);
                    } else {
                        list = null;
                    }
                    readWriteLock.readLock().unlock();
                } catch (Throwable th) {
                    C0T8.A01.readLock().unlock();
                    throw th;
                }
            } else {
                list = wifiManager.getScanResults();
            }
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (ScanResult scanResult : list) {
                    if (scanResult != null) {
                        String str = scanResult.SSID;
                        if (str != null && (str.endsWith("_nomap") || str.contains("_optout"))) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList.add(scanResult);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
