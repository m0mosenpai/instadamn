package X;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p003authapiphone.zza;
import com.google.android.gms.internal.p003authapiphone.zzh;

/* loaded from: classes10.dex */
public final class RH7 extends AbstractC1340563o {
    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean A09() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzh) {
            return queryLocalInterface;
        }
        zza zzaVar = new zza(iBinder);
        C0f9.A0A(1004762225, C0f9.A03(-1029614092));
        return zzaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        return AbstractC62386S9l.A04;
    }
}
