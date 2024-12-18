package X;

import android.os.IBinder;
import android.os.IInterface;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService;

/* loaded from: classes10.dex */
public final class QK4 extends AbstractC64090Sz7 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService$Stub$Proxy] */
    @Override // X.XD3
    public final /* bridge */ /* synthetic */ Object AE1(IBinder iBinder) {
        C14360o3.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IGalaxyStoreDownloadService)) {
            return queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(-995180281);
        obj.A00 = iBinder;
        C0f9.A0A(-2134208954, A03);
        return obj;
    }
}
