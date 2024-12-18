package X;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.4YK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YK implements C4YF {
    public WifiManager.WifiLock A00;
    public boolean A01;
    public boolean A02;
    public final WifiManager A03;

    @Override // X.C4YF
    public final void Eeo(boolean z) {
        this.A02 = z;
        WifiManager.WifiLock wifiLock = this.A00;
        if (wifiLock != null) {
            if (this.A01 && z) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    @Override // X.C4YF
    public final void setEnabled(boolean z) {
        if (z && this.A00 == null) {
            WifiManager wifiManager = this.A03;
            if (wifiManager == null) {
                AbstractC46512Bo.A04("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.A00 = createWifiLock;
                createWifiLock.setReferenceCounted(false);
            }
        }
        this.A01 = z;
        WifiManager.WifiLock wifiLock = this.A00;
        if (wifiLock == null) {
            return;
        }
        if (z && this.A02) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public C4YK(Context context) {
        this.A03 = (WifiManager) context.getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_WIFI);
    }
}
