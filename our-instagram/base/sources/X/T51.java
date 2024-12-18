package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes10.dex */
public final class T51 implements C69E, C69G {
    public AbstractC1335861e A00;
    public final int A01;
    public final InterfaceC65457TkT A02;

    @Override // X.C69F
    public final void D7H(int i) {
    }

    public final void A00(InterfaceC65457TkT interfaceC65457TkT) {
        boolean A0F = this.A00.A0F();
        AbstractC1335861e abstractC1335861e = this.A00;
        if (A0F) {
            interfaceC65457TkT.D6e(abstractC1335861e);
            return;
        }
        abstractC1335861e.A0B(new C64223T4x(this, interfaceC65457TkT));
        this.A00.A0D(new T52(this, interfaceC65457TkT));
        this.A00.A08();
    }

    @Override // X.C69F
    public final void D75(Bundle bundle) {
        if (this.A01 == 11) {
            AbstractC1335861e abstractC1335861e = this.A00;
            C3U5.A03(abstractC1335861e, MSV.A00(406));
            abstractC1335861e.A07(new AbstractC60658RGk(SA2.A04, abstractC1335861e));
        }
        this.A02.D6e(this.A00);
        this.A00.A0C(this);
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        this.A02.D6e(null);
    }

    public T51(InterfaceC65457TkT interfaceC65457TkT, boolean z) {
        this.A01 = z ? 10 : 11;
        this.A02 = interfaceC65457TkT;
    }
}
