package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzj;

/* loaded from: classes10.dex */
public final class RHB extends AbstractC1340563o {
    public final Context A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return !(queryLocalInterface instanceof zzi) ? new zzj(iBinder) : queryLocalInterface;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.safetynet.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12200000;
    }

    public RHB(Context context, Looper looper, C69E c69e, C69G c69g, C1340363l c1340363l) {
        super(context, looper, c69e, c69g, c1340363l, 45);
        this.A00 = context;
    }
}
