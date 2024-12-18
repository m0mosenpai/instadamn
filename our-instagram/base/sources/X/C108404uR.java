package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.TransportInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108404uR {
    public final Context A00;
    public final WifiManager A01;
    public final InterfaceC108394uQ A02;
    public final C108374uO A03;
    public final C108464uX A04;

    public static final WifiInfo A00(NetworkCapabilities networkCapabilities) {
        TransportInfo transportInfo;
        if (networkCapabilities == null || (transportInfo = networkCapabilities.getTransportInfo()) == null || !(transportInfo instanceof WifiInfo)) {
            return null;
        }
        return (WifiInfo) transportInfo;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.4uY] */
    public final C108474uY A02() {
        WifiManager wifiManager;
        WifiInfo A01;
        Object obj;
        String str;
        try {
            if ((!this.A02.hasPermission("android.permission.ACCESS_WIFI_STATE")) || (wifiManager = this.A01) == null || !wifiManager.isWifiEnabled() || (A01 = A01()) == null) {
                return null;
            }
            ?? obj2 = new Object();
            obj2.A03 = null;
            obj2.A05 = null;
            obj2.A08 = null;
            obj2.A02 = null;
            obj2.A00 = null;
            obj2.A01 = null;
            obj2.A07 = null;
            obj2.A06 = null;
            obj2.A04 = null;
            obj2.A05 = Integer.valueOf(A01.getRssi());
            obj2.A08 = A01.getBSSID();
            obj2.A03 = Integer.valueOf(A01.getLinkSpeed());
            obj2.A02 = Integer.valueOf(A01.getFrequency());
            obj2.A00 = Boolean.valueOf(wifiManager.is5GHzBandSupported());
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                obj2.A06 = Integer.valueOf(A01.getWifiStandard());
                if (i >= 31) {
                    obj2.A04 = Integer.valueOf(A01.getCurrentSecurityType());
                }
            }
            ArrayList A012 = this.A04.A01();
            String bssid = A01.getBSSID();
            if (A012 != null) {
                Iterator it = A012.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        ScanResult scanResult = (ScanResult) obj;
                        if (scanResult != null) {
                            str = scanResult.BSSID;
                        } else {
                            str = null;
                        }
                        if (C14360o3.A0K(str, bssid)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ScanResult scanResult2 = (ScanResult) obj;
                if (scanResult2 != null) {
                    obj2.A07 = scanResult2.capabilities;
                    obj2.A01 = Integer.valueOf(scanResult2.channelWidth);
                    return obj2;
                }
            }
            return obj2;
        } catch (NullPointerException | SecurityException unused) {
        }
        return null;
    }

    public final String A03() {
        WifiManager wifiManager;
        WifiInfo A01;
        try {
            if ((!this.A02.hasPermission("android.permission.ACCESS_WIFI_STATE")) || (wifiManager = this.A01) == null || !wifiManager.isWifiEnabled() || (A01 = A01()) == null) {
                return null;
            }
            return A01.getBSSID();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final WifiInfo A01() {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        WifiInfo A00 = this.A04.A00();
        if (A00 == null && Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = null;
            Object systemService = this.A00.getSystemService("connectivity");
            if ((systemService instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) systemService) != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null) {
                networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            }
            return A00(networkCapabilities);
        }
        return A00;
    }

    public C108404uR(Context context, WifiManager wifiManager, InterfaceC108394uQ interfaceC108394uQ, C108374uO c108374uO) {
        C103744ls c103744ls;
        this.A00 = context;
        this.A01 = wifiManager;
        this.A03 = c108374uO;
        this.A02 = interfaceC108394uQ;
        C108414uS A00 = C108414uS.A00();
        synchronized (C103744ls.class) {
            c103744ls = C103744ls.A04;
            if (c103744ls == null) {
                c103744ls = new C103744ls(context);
                C103744ls.A04 = c103744ls;
            }
        }
        C03250Di c03250Di = C03250Di.A00;
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A04 = new C108464uX(c103744ls, new C108454uW(context, c03250Di, realtimeSinceBootClock, c103744ls, new C108434uU(context), new C108444uV(c03250Di, realtimeSinceBootClock), new C108424uT(new Handler(context.getMainLooper()))), A00);
    }
}
