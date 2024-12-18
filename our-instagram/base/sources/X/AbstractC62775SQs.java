package X;

import android.content.Context;
import android.telephony.cdma.CdmaCellLocation;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

/* renamed from: X.SQs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62775SQs {
    public static CdmaCellLocation A00(Context context, SB3 sb3) {
        C23411Cd A00 = C1CZ.A00(context, null);
        String A002 = AbstractC43591JPw.A00(5);
        Context context2 = sb3.A00.A00;
        if ((AbstractC23451Ch.A07(context2, A002) || AbstractC23451Ch.A07(context2, "android.permission.ACCESS_FINE_LOCATION")) && A00 != null && A00.A00.getPhoneType() == 2 && A00.A04("DeviceFeatureHelper") != null && AbstractC58321PtD.A1W(CdmaCellLocation.class, A00.A04("DeviceFeatureHelper"))) {
            return (CdmaCellLocation) CdmaCellLocation.class.cast(A00.A04("DeviceFeatureHelper"));
        }
        return null;
    }

    public static ArrayList A01(boolean z) {
        ArrayList A1E = AbstractC166987dD.A1E();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        String hostAddress = nextElement.getHostAddress();
                        if (!(nextElement instanceof Inet6Address) || z) {
                            A1E.add(hostAddress);
                        }
                    }
                }
            }
            return A1E;
        } catch (SocketException unused) {
            return null;
        }
    }
}
