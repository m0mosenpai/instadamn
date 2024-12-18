package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes10.dex */
public final class T50 implements C69E, C69G {
    public C69D A00;
    public final C61W A01;
    public final boolean A02;

    public T50(C61W c61w, boolean z) {
        this.A01 = c61w;
        this.A02 = z;
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        C3U5.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.D75(bundle);
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        C61W c61w = this.A01;
        boolean z = this.A02;
        C3U5.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.FEx(connectionResult, c61w, z);
    }

    @Override // X.C69F
    public final void D7H(int i) {
        C3U5.A03(this.A00, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.A00.D7H(i);
    }
}
