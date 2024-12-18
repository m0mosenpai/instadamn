package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbaa;

/* loaded from: classes10.dex */
public final class RHI extends AbstractC1340563o {
    public final Bundle A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        return this.A00;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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

    public RHI(Context context, Looper looper, C64219T4t c64219T4t, C69F c69f, C69H c69h, C1340363l c1340363l) {
        super(context, looper, c69f, c69h, c1340363l, 219);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(ST2.A00(0, 10, 79), c64219T4t.A00);
        this.A00 = A0b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        if (queryLocalInterface instanceof zbaa) {
            return queryLocalInterface;
        }
        zba zbaVar = new zba("com.google.android.gms.auth.api.identity.internal.IAuthorizationService", iBinder);
        C0f9.A0A(283120400, C0f9.A03(-1148752177));
        return zbaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        return SA3.A08;
    }
}
