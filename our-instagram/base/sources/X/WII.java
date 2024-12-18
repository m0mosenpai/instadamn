package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class WII implements ServiceConnection {
    public final /* synthetic */ USU A00;
    public final /* synthetic */ AtomicReference A01;
    public final /* synthetic */ boolean A02;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C14360o3.A0B(iBinder, 1);
        AtomicReference atomicReference = this.A01;
        USU usu = this.A00;
        XD3 xd3 = usu.A03;
        atomicReference.set(xd3.AE1(iBinder));
        WD5 wd5 = ((AbstractC69781VvI) usu).A04;
        wd5.A01("IPC_SERVICE_CONNECTED");
        if (this.A02) {
            usu.A03();
            return;
        }
        ((IGalaxyStoreDownloadService) atomicReference.get()).CNA(USU.A00(usu, false));
        wd5.A01("IPC_SERVICE_UNBIND_REQUESTED");
        Context context = ((AbstractC69781VvI) usu).A01;
        C14360o3.A06(context);
        xd3.F94(context, this);
        usu.A06.set(null);
    }

    public WII(USU usu, AtomicReference atomicReference, boolean z) {
        this.A01 = atomicReference;
        this.A00 = usu;
        this.A02 = z;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        USU usu = this.A00;
        ((AbstractC69781VvI) usu).A04.A01("IPC_SERVICE_DISCONNECTED");
        usu.A04(EnumC68128VCm.A04, VDE.A06, "FAILED_INSTALL", VHi.ERROR_SERVICE_UNAVAILABLE.toString());
        this.A01.set(null);
    }
}
