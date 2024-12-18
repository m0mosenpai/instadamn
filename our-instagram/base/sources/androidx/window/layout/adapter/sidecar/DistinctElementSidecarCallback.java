package androidx.window.layout.adapter.sidecar;

import X.C5O2;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState A00;
    public final C5O2 A01;
    public final SidecarInterface.SidecarCallback A02;
    public final Object A03 = new Object();
    public final Map A04 = new WeakHashMap();

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState != null) {
            synchronized (this.A03) {
                if (!C5O2.A00(this.A00, sidecarDeviceState)) {
                    this.A00 = sidecarDeviceState;
                    this.A02.onDeviceStateChanged(sidecarDeviceState);
                }
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.A03) {
            Map map = this.A04;
            if (!this.A01.A02((SidecarWindowLayoutInfo) map.get(iBinder), sidecarWindowLayoutInfo)) {
                map.put(iBinder, sidecarWindowLayoutInfo);
                this.A02.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }

    public DistinctElementSidecarCallback(C5O2 c5o2, SidecarInterface.SidecarCallback sidecarCallback) {
        this.A01 = c5o2;
        this.A02 = sidecarCallback;
    }
}
