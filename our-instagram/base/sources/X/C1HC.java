package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.net.Inet4Address;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1HC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HC {
    public static final C1HD A06 = new Object();
    public static volatile C1HC A07;
    public ConnectivityManager.NetworkCallback A00;
    public final ConnectivityManager A01;
    public final Context A03;
    public volatile Integer A05;
    public volatile C9CH A04 = new C9CH();
    public final CopyOnWriteArraySet A02 = new CopyOnWriteArraySet();

    public static final void A00(LinkProperties linkProperties, NetworkCapabilities networkCapabilities, C1HC c1hc) {
        String hostAddress;
        if (networkCapabilities != null) {
            c1hc.A04.A03 = Boolean.valueOf(networkCapabilities.hasTransport(4));
            c1hc.A04.A00 = Boolean.valueOf(networkCapabilities.hasCapability(2));
            c1hc.A04.A02 = Boolean.valueOf(!networkCapabilities.hasCapability(11));
            if (Build.VERSION.SDK_INT >= 31) {
                c1hc.A04.A01 = Boolean.valueOf(networkCapabilities.hasCapability(29));
            }
        }
        if (linkProperties != null) {
            String str = "";
            String str2 = "";
            for (LinkAddress linkAddress : linkProperties.getLinkAddresses()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(linkAddress.getAddress());
                sb.append(',');
                str2 = sb.toString();
            }
            c1hc.A04.A05 = str2;
            if (Build.VERSION.SDK_INT >= 30) {
                C9CH c9ch = c1hc.A04;
                Inet4Address dhcpServerAddress = linkProperties.getDhcpServerAddress();
                if (dhcpServerAddress != null && (hostAddress = dhcpServerAddress.getHostAddress()) != null) {
                    str = hostAddress;
                }
                c9ch.A04 = str;
            }
        }
        Integer num = c1hc.A05;
        int hashCode = c1hc.A04.hashCode();
        if (num == null || num.intValue() != hashCode) {
            c1hc.A04.toString();
            Iterator it = c1hc.A02.iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                ((C1HF) it.next()).A00.A02 = c1hc.A04.toString();
            }
            c1hc.A05 = Integer.valueOf(c1hc.A04.hashCode());
        }
    }

    public C1HC(Context context) {
        this.A03 = context;
        Object systemService = context.getSystemService("connectivity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A01 = (ConnectivityManager) systemService;
    }
}
