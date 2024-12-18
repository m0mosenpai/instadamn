package X;

import com.facebook.distribgw.client.ConnectivityManagerOptions;
import com.facebook.distribgw.client.DGWPersonalizationProperty;
import com.facebook.distribgw.client.DGWPersonalizationThreshold;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;

/* renamed from: X.2cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53702cx {
    public DGWPersonalizationProperty A00 = new DGWPersonalizationProperty(0, 0, 0, 60000);
    public DGWPersonalizationProperty A01 = new DGWPersonalizationProperty(0, 0, 0, 5000);
    public DGWPersonalizationThreshold A02 = new DGWPersonalizationThreshold(0, 0);
    public boolean A04 = true;
    public boolean A03 = false;

    public final ConnectivityManagerOptions A00() {
        return new ConnectivityManagerOptions(false, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS, this.A00, this.A01, this.A02, true, false, false, false, 0, this.A04, this.A03, 200L, 1000L, false, false, false);
    }
}
