package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.networkreachability.AndroidReachabilityListener;
import com.facebook.common.networkreachability.NetworkState;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.SMa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62686SMa {
    public static C62686SMa A05;
    public NetworkState A00;
    public final BroadcastReceiver A01 = new Q1k(this, 5);
    public final Context A02;
    public final AndroidReachabilityListener A03;
    public final ConnectivityManager A04;

    public final NetworkState A00() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.A04;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type != 1) {
                    return NetworkState.UNKNOWN;
                }
                return NetworkState.WIFI;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 20) {
                switch (subtype) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return NetworkState.CELL_2G;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    case 14:
                        return NetworkState.CELL_3G;
                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                        return NetworkState.CELL_4G;
                    case Process.SIGTERM /* 15 */:
                        return NetworkState.CELL_3G_HSPAP;
                    default:
                        return NetworkState.CELL_UNKNOWN;
                }
            }
            return NetworkState.CELL_5G;
        }
        return NetworkState.NONE;
    }

    public C62686SMa(Context context) {
        this.A02 = context;
        Object systemService = context.getSystemService("connectivity");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.A04 = (ConnectivityManager) systemService;
        this.A00 = A00();
        this.A03 = new AndroidReachabilityListener(this);
    }
}
