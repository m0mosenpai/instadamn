package X;

import android.os.SystemClock;

/* loaded from: classes11.dex */
public final class WcE implements C2BC {
    public long A00;
    public final C92414Bw A01;

    public final void A00(C4C7 c4c7) {
        this.A01.DvF(EnumC92424Bx.NOT_CACHED, c4c7);
    }

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
        this.A01.D15(interfaceC92354Bq, c4c7, i, z);
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
        this.A01.DvH(interfaceC92354Bq, c4c7, z, z2);
    }

    public WcE(C92414Bw c92414Bw) {
        this.A01 = c92414Bw;
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        this.A00 = SystemClock.elapsedRealtime();
    }
}
