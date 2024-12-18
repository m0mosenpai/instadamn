package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.service.zai;
import com.google.android.gms.internal.base.zaa;

/* loaded from: classes10.dex */
public final class RHE extends AbstractC1340563o {
    public final C64221T4v A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean A08() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 203400000;
    }

    public RHE(Context context, Looper looper, C69F c69f, C69H c69h, C1340363l c1340363l, C64221T4v c64221T4v) {
        super(context, looper, c69f, c69h, c1340363l, 270);
        this.A00 = c64221T4v;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        C64221T4v c64221T4v = this.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        String str = c64221T4v.A00;
        if (str != null) {
            A0b.putString("api", str);
        }
        return A0b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof zai) {
            return queryLocalInterface;
        }
        zaa zaaVar = new zaa("com.google.android.gms.common.internal.service.IClientTelemetryService", iBinder);
        C0f9.A0A(-459638206, C0f9.A03(-1403828755));
        return zaaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        return AbstractC62365S8p.A01;
    }
}
