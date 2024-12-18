package X;

import android.os.Parcel;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService$Stub$Proxy;
import com.google.android.gms.deviceperformance.internal.zzc;

/* loaded from: classes10.dex */
public final class T5S implements InterfaceC65406Tjd {
    public static final T5S A00 = new Object();

    @Override // X.InterfaceC65406Tjd
    public final /* bridge */ /* synthetic */ void accept(Object obj, Object obj2) {
        zzc zzcVar = new zzc((C58411Pup) obj2);
        IDevicePerformanceService$Stub$Proxy iDevicePerformanceService$Stub$Proxy = (IDevicePerformanceService$Stub$Proxy) ((IDevicePerformanceService) ((BaseGmsClient) obj).A03());
        int A03 = C0f9.A03(-1706541908);
        int A032 = C0f9.A03(65224425);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        C0f9.A0A(-1045162293, A032);
        AbstractC58321PtD.A19(zzcVar, obtain);
        int A033 = C0f9.A03(1963009958);
        Parcel obtain2 = Parcel.obtain();
        try {
            AbstractC167027dH.A0k(iDevicePerformanceService$Stub$Proxy.A00, obtain, obtain2, 1);
            obtain.recycle();
            obtain2.recycle();
            C0f9.A0A(-254105201, A033);
            C0f9.A0A(-1558701466, A03);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            C0f9.A0A(-1696037357, A033);
            throw th;
        }
    }
}
