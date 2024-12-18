package X;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.0iP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11080iP implements C0X0 {
    public static final Map A01;
    public ConnectivityManager A00;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(4, "vpn");
        builder.put(2, NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
        builder.put(0, NetInfoModule.CONNECTION_TYPE_CELLULAR);
        builder.put(3, NetInfoModule.CONNECTION_TYPE_ETHERNET);
        builder.put(1, NetInfoModule.CONNECTION_TYPE_WIFI);
        builder.put(5, "wifi_aware");
        builder.put(6, "lowpan");
        builder.put(8, "usb");
        A01 = builder.buildOrThrow();
    }

    @Override // X.C0X0
    public final String AOP() {
        return "network_connectivity";
    }

    @Override // X.C0X0
    public final long Cpb() {
        return 16777216L;
    }

    @Override // X.C0X0
    public final void DaR(C0XX c0xx) {
        NetworkCapabilities networkCapabilities;
        String str;
        if (c0xx.CYk(16777216L)) {
            ConnectivityManager connectivityManager = this.A00;
            if (connectivityManager != null) {
                int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                if (restrictBackgroundStatus != 1) {
                    if (restrictBackgroundStatus != 2) {
                        if (restrictBackgroundStatus != 3) {
                            str = "unknown";
                        } else {
                            str = "enabled";
                        }
                    } else {
                        str = "whitelisted";
                    }
                } else {
                    str = "disabled";
                }
                c0xx.BTP().A03("restrict_background_status", str);
            }
            ConnectivityManager connectivityManager2 = this.A00;
            String str2 = null;
            if (connectivityManager2 != null) {
                try {
                    networkCapabilities = connectivityManager2.getNetworkCapabilities(connectivityManager2.getActiveNetwork());
                } catch (SecurityException | RuntimeException unused) {
                }
                if (networkCapabilities != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : A01.entrySet()) {
                        if (networkCapabilities.hasTransport(((Integer) entry.getKey()).intValue())) {
                            arrayList.add((String) entry.getValue());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        str2 = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, arrayList);
                        if (str2 != null) {
                            c0xx.BTP().A03("network_capabilities", str2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0X0
    public final boolean CTn(AbstractC208210e abstractC208210e) {
        return C20150ym.A07(AbstractC20100yh.A00(36315533330746735L));
    }
}
