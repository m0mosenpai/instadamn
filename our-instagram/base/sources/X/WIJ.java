package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes11.dex */
public final class WIJ implements ServiceConnection {
    public final int A00;
    public final Object A01;

    public WIJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        Handler handler;
        Runnable runnable;
        switch (this.A00) {
            case 0:
                AbstractC55065OaL abstractC55065OaL = (AbstractC55065OaL) this.A01;
                ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
                handler = abstractC55065OaL.A00;
                runnable = abstractC55065OaL.A07;
                break;
            case 1:
            case 3:
            default:
                super.onBindingDied(componentName);
                return;
            case 2:
                WD5.A00(VHi.ERROR_BINDING_DIED, ((AbstractC69781VvI) this.A01).A04, null, "FAILED_SERVICE_CONNECTION", null);
                return;
            case 4:
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A01;
                handler = stellaIpcDirectMessagingServiceClient.handler;
                if (handler == null) {
                    return;
                }
                runnable = stellaIpcDirectMessagingServiceClient.disconnectRunnable;
                break;
        }
        handler.post(runnable);
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(componentName, 0);
                AbstractC55065OaL abstractC55065OaL = (AbstractC55065OaL) this.A01;
                ScheduledExecutorService scheduledExecutorService = AbstractC55065OaL.A08;
                synchronized (abstractC55065OaL.A06) {
                    abstractC55065OaL.A02 = false;
                }
                abstractC55065OaL.A01.setException(AbstractC43594JPz.A0o(componentName, "onNullBinding, component name ", new StringBuilder()));
                return;
            case 1:
            case 3:
            default:
                super.onNullBinding(componentName);
                return;
            case 2:
                WD5.A00(VHi.ERROR_NULL_BINDING, ((AbstractC69781VvI) this.A01).A04, null, "FAILED_SERVICE_CONNECTION", null);
                return;
            case 4:
                StellaIpcDirectMessagingServiceClient stellaIpcDirectMessagingServiceClient = (StellaIpcDirectMessagingServiceClient) this.A01;
                synchronized (stellaIpcDirectMessagingServiceClient.lock) {
                    stellaIpcDirectMessagingServiceClient.isServiceConnectionInProgress = false;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e4, code lost:
    
        if (r0 != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.smartglasses.ipc.aidl.SmartGlassesTunnelInterface$Stub$Proxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, com.meta.arfx.engine.interfaces.IAREngineServiceController$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.instagram.direct.stella.api.IStellaDirectMessagingService$Stub$Proxy, java.lang.Object] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onServiceConnected(android.content.ComponentName r7, android.os.IBinder r8) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WIJ.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.A00) {
            case 0:
                ((AbstractC55065OaL) this.A01).A01 = new Object();
                return;
            case 1:
                UST ust = (UST) this.A01;
                ((AbstractC69781VvI) ust).A04.A01("IPC_SERVICE_DISCONNECTED");
                UST.A00(ust);
                return;
            case 2:
                USV usv = (USV) this.A01;
                WD5 wd5 = ((AbstractC69781VvI) usv).A04;
                wd5.A01("IPC_SERVICE_DISCONNECTED");
                if (usv.A00 < ((int) C18U.A01(C06090Tz.A05, usv.A02.A00, 36598584560585971L))) {
                    usv.A00++;
                    wd5.A01("RECONNECT_ON_SERVICE_DISCONNECTED");
                    usv.A02();
                    usv.A06 = true;
                    USV.A01(usv);
                    return;
                }
                usv.A04(EnumC68128VCm.A04, VDE.A06, "FAILED_INSTALL", VHi.ERROR_UNEXEPECTED_SERVICE_DISCONNECTION.toString());
                return;
            case 3:
                C55188Odt c55188Odt = (C55188Odt) this.A01;
                BinderC50748MbA binderC50748MbA = c55188Odt.A03;
                if (binderC50748MbA != null) {
                    binderC50748MbA.A00 = null;
                }
                c55188Odt.A03 = null;
                c55188Odt.A07 = false;
                return;
            case 4:
                ((StellaIpcDirectMessagingServiceClient) this.A01).serviceInterfaceFuture = new Object();
                return;
            case 5:
                AM6 am6 = (AM6) this.A01;
                synchronized (am6.A0b) {
                    AM6.A00(am6);
                    am6.A0A = null;
                    am6.A0V.bindService(am6.A0W, this, 1);
                }
                return;
            default:
                SMY smy = (SMY) this.A01;
                smy.A01 = null;
                smy.A00 = null;
                smy.A02.A0B(EnumC61134Rfo.A05);
                return;
        }
    }
}
