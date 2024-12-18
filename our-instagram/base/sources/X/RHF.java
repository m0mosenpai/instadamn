package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.auth.zza;
import com.google.android.gms.internal.auth.zzbh;

/* loaded from: classes10.dex */
public final class RHF extends AbstractC1340563o {
    public final Bundle A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        return this.A00;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean A09() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12451000;
    }

    public RHF(Context context, Looper looper, C64220T4u c64220T4u, C69F c69f, C69H c69h, C1340363l c1340363l) {
        super(context, looper, c69f, c69h, c1340363l, 16);
        Bundle bundle;
        if (c64220T4u == null) {
            bundle = AbstractC166987dD.A0b();
        } else {
            bundle = new Bundle(c64220T4u.A00);
        }
        this.A00 = bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return queryLocalInterface;
        }
        zza zzaVar = new zza("com.google.android.gms.auth.api.internal.IAuthService", iBinder);
        C0f9.A0A(-422750648, C0f9.A03(-400505182));
        return zzaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final boolean requiresSignIn() {
        C1340363l c1340363l = ((AbstractC1340563o) this).A00;
        if (!TextUtils.isEmpty(null)) {
            c1340363l.A04.get(AbstractC62376S9a.A02);
            if (!c1340363l.A05.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
