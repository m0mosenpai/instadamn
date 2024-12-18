package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* renamed from: X.SkG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ServiceConnectionC63437SkG implements ServiceConnection {
    public final SM2 A00;
    public final /* synthetic */ C62896SWc A01;

    public ServiceConnectionC63437SkG(C62896SWc c62896SWc, SM2 sm2) {
        this.A01 = c62896SWc;
        this.A00 = sm2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IGetInstallReferrerService iGetInstallReferrerService;
        android.util.Log.isLoggable("InstallReferrerClient", 2);
        C62896SWc c62896SWc = this.A01;
        if (iBinder == null) {
            iGetInstallReferrerService = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IGetInstallReferrerService)) {
                iGetInstallReferrerService = (IGetInstallReferrerService) queryLocalInterface;
            } else {
                ?? obj = new Object();
                int A03 = C0f9.A03(1802072860);
                obj.A00 = iBinder;
                C0f9.A0A(-2002729854, A03);
                iGetInstallReferrerService = obj;
            }
        }
        c62896SWc.A02 = iGetInstallReferrerService;
        c62896SWc.A00 = 2;
        this.A00.A00(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC58320PtC.A1M("InstallReferrerClient", "Install Referrer service disconnected.");
        C62896SWc c62896SWc = this.A01;
        c62896SWc.A02 = null;
        c62896SWc.A00 = 0;
    }
}
