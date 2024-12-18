package X;

import android.net.NetworkInfo;
import com.facebook.traffic.nts.TrafficNetworkTelemetryServicesManager;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl;

/* renamed from: X.YEd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73460YEd implements InterfaceC15680qO {
    @Override // X.InterfaceC15680qO
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer;
        ReachabilityV2ProviderImpl reachabilityV2Provider;
        TrafficNetworkTelemetryServicesManager manager = TrafficNetworkTelemetryServicesManager.Companion.getManager();
        if (manager != null && (trafficNTSProvidersAppLayer = manager.providers) != null && (reachabilityV2Provider = trafficNTSProvidersAppLayer.getReachabilityV2Provider()) != null) {
            int i = 1;
            if (networkInfo != null) {
                if (networkInfo.getType() == 1) {
                    i = 3;
                } else {
                    i = 0;
                    if (networkInfo.getType() == 0) {
                        i = 2;
                    }
                }
            }
            reachabilityV2Provider.updateConnectionType(i);
        }
    }

    public C73460YEd() {
        C18150uz.A0B.A03(this);
    }
}
