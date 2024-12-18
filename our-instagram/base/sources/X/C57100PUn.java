package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PUn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57100PUn implements InterfaceC16660sJ {
    public final /* synthetic */ C55598Omc A00;
    public final /* synthetic */ C55069OaP A01;
    public final /* synthetic */ OMg A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ InterfaceC24901Jp A04;

    public C57100PUn(C55598Omc c55598Omc, C55069OaP c55069OaP, OMg oMg, AtomicBoolean atomicBoolean, InterfaceC24901Jp interfaceC24901Jp) {
        this.A02 = oMg;
        this.A01 = c55069OaP;
        this.A03 = atomicBoolean;
        this.A04 = interfaceC24901Jp;
        this.A00 = c55598Omc;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A05 = AbstractC25227BEk.A05((EnumC53128Neg) obj, 0);
        if (A05 != 2) {
            if (A05 == 3 && this.A03.compareAndSet(false, true)) {
                InterfaceC24901Jp interfaceC24901Jp = this.A04;
                if (interfaceC24901Jp.isActive()) {
                    Throwable th = new Throwable("cdl voltron module download failed");
                    C14360o3.A0B(th, 0);
                    interfaceC24901Jp.resumeWith(MSW.A1D(th));
                }
            }
        } else {
            OMg oMg = this.A02;
            if (oMg != null) {
                oMg.A00("CDL_BRIDGE_INITIALIZED");
            }
            C55069OaP.A00(this.A00, oMg, this.A03, this.A04);
        }
        return C0eB.A00;
    }
}
