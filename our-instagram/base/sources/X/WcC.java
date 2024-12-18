package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class WcC implements InterfaceC98244b3 {
    public final int A00;
    public final long A01 = C98264b5.A03.getAndIncrement();
    public final C4C7 A02;
    public final C98254b4 A03;
    public final InterfaceC92094Ap A04;
    public volatile Object A05;

    @Override // X.InterfaceC98244b3
    public final void AGY() {
    }

    @Override // X.InterfaceC98244b3
    public final void ChG() {
        C98254b4 c98254b4 = this.A03;
        c98254b4.A00 = 0L;
        VCN vcn = new VCN(c98254b4, this.A02);
        try {
            if (!vcn.A00) {
                vcn.A03.open(vcn.A04);
                vcn.A00 = true;
            }
            android.net.Uri uri = c98254b4.getUri();
            uri.getClass();
            this.A05 = this.A04.E3N(uri, vcn);
        } finally {
            try {
                vcn.close();
            } catch (IOException unused) {
            }
        }
    }

    public WcC(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, InterfaceC92094Ap interfaceC92094Ap, int i) {
        this.A03 = new C98254b4(interfaceC92354Bq);
        this.A02 = c4c7;
        this.A00 = i;
        this.A04 = interfaceC92094Ap;
    }
}
