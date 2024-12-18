package X;

import android.os.Handler;
import java.util.List;

/* renamed from: X.CnN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28791CnN implements C2DD {
    public Handler A00;
    public final CU3 A03;
    public final C5BW A02 = new C5BW(DRU.A00(this, 48));
    public boolean A01 = true;
    public final InterfaceC16660sJ A05 = DRU.A00(this, 49);
    public final List A04 = AbstractC166987dD.A1E();

    public C28791CnN(CU3 cu3) {
        this.A03 = cu3;
    }

    @Override // X.C2DD
    public final void CuG() {
    }

    @Override // X.C2DD
    public final void DI8() {
        C5BW c5bw = this.A02;
        InterfaceC1127157b interfaceC1127157b = c5bw.A00;
        if (interfaceC1127157b != null) {
            interfaceC1127157b.dispose();
        }
        c5bw.A01();
    }

    @Override // X.C2DD
    public final void Deh() {
        C5BW c5bw = this.A02;
        c5bw.A00 = C3Z5.A01(c5bw.A08);
    }
}
