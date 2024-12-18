package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.p002authapi.zba;
import com.google.android.gms.internal.p002authapi.zbt;

/* loaded from: classes10.dex */
public final class RHC extends AbstractC1340563o {
    public final C64222T4w A00;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 12800000;
    }

    public RHC(Context context, Looper looper, C64222T4w c64222T4w, C69E c69e, C69G c69g, C1340363l c1340363l) {
        super(context, looper, c69e, c69g, c1340363l, 68);
        this.A00 = new C64222T4w(AbstractC62842STp.A00(), Boolean.valueOf((c64222T4w == null ? C64222T4w.A02 : c64222T4w).A01));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        C64222T4w c64222T4w = this.A00;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("consumer_package", null);
        A0b.putBoolean("force_save_dialog", c64222T4w.A01);
        A0b.putString("log_session_id", c64222T4w.A00);
        return A0b;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbt) {
            return queryLocalInterface;
        }
        zba zbaVar = new zba("com.google.android.gms.auth.api.credentials.internal.ICredentialsService", iBinder);
        C0f9.A0A(2115474116, C0f9.A03(-1893778955));
        return zbaVar;
    }
}
