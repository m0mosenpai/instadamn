package X;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.telephony.CellLocation;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: X.0T7, reason: invalid class name */
/* loaded from: classes.dex */
public interface C0T7 {
    List DJL(TelephonyManager telephonyManager);

    CellLocation DJN(TelephonyManager telephonyManager);

    WifiInfo DJP(WifiManager wifiManager);

    Location DJS(LocationManager locationManager, String str);

    List DJT(WifiManager wifiManager);

    ServiceState DJU(TelephonyManager telephonyManager);

    void DfB(LocationListener locationListener, LocationManager locationManager);

    void Dg7(Criteria criteria, LocationListener locationListener, LocationManager locationManager, Looper looper, float f, int i, long j);

    void Dg8(LocationListener locationListener, LocationManager locationManager, String str, float f, int i, long j);

    boolean Do8(WifiManager wifiManager);
}
