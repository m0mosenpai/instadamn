package X;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes10.dex */
public final class T53 implements C69G {
    public final int A00;
    public final C69G A01;
    public final AbstractC1335861e A02;
    public final /* synthetic */ RH1 A03;

    public T53(C69G c69g, AbstractC1335861e abstractC1335861e, RH1 rh1, int i) {
        this.A03 = rh1;
        this.A00 = i;
        this.A02 = abstractC1335861e;
        this.A01 = c69g;
    }

    @Override // X.C69H
    public final void D7D(ConnectionResult connectionResult) {
        String.valueOf(String.valueOf(connectionResult));
        this.A03.A0B(connectionResult, this.A00);
    }
}
