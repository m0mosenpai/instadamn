package X;

import android.os.IBinder;
import android.os.IInterface;
import com.xiaomi.market.IMarketDownloadService;

/* loaded from: classes10.dex */
public final class QK5 extends AbstractC64090Sz7 {
    /* JADX WARN: Type inference failed for: r2v1, types: [com.xiaomi.market.IMarketDownloadService$Stub$Proxy, java.lang.Object] */
    @Override // X.XD3
    public final /* bridge */ /* synthetic */ Object AE1(IBinder iBinder) {
        C14360o3.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IMarketDownloadService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IMarketDownloadService)) {
            return queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(-295278860);
        obj.A00 = iBinder;
        C0f9.A0A(202321257, A03);
        return obj;
    }
}
