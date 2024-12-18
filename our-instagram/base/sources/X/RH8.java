package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService;
import com.google.android.gms.deviceperformance.internal.IDevicePerformanceService$Stub$Proxy;

/* loaded from: classes10.dex */
public final class RH8 extends AbstractC1340563o {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface A04(IBinder iBinder) {
        C14360o3.A0B(iBinder, 0);
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.deviceperformance.internal.IDevicePerformanceService");
        if (!(queryLocalInterface instanceof IDevicePerformanceService)) {
            return new IDevicePerformanceService$Stub$Proxy(iBinder);
        }
        return queryLocalInterface;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.deviceperformance.internal.IDevicePerformanceService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.deviceperformance.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean A08() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean A09() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        Feature[] featureArr = AbstractC62366S8q.A01;
        C14360o3.A08(featureArr);
        return featureArr;
    }
}
