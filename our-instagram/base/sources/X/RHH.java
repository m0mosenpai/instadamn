package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbam;

/* loaded from: classes10.dex */
public final class RHH extends AbstractC1340563o {
    public final Bundle A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        return this.A00;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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

    public RHH(Context context, Looper looper, C69F c69f, C69H c69h, C1340363l c1340363l) {
        super(context, looper, c69f, c69h, c1340363l, 212);
        this.A00 = AbstractC166987dD.A0b();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        if (queryLocalInterface instanceof zbam) {
            return queryLocalInterface;
        }
        zba zbaVar = new zba("com.google.android.gms.auth.api.identity.internal.ISignInService", iBinder);
        C0f9.A0A(-449824062, C0f9.A03(-701024673));
        return zbaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        return SA3.A08;
    }
}
