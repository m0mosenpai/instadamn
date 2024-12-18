package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class BO7 implements InterfaceC97454Zf {
    public boolean A00;
    public final /* synthetic */ BO6 A01;
    public final /* synthetic */ InterfaceC31137Dmc A02;

    @Override // X.InterfaceC97454Zf
    public final void DvW(View view, C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        C14360o3.A0B(view, 0);
        this.A02.DvW(view, c4zq, interfaceC41201vU);
    }

    @Override // X.InterfaceC97454Zf
    public final void DvX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        AbstractC167007dF.A1K(interfaceC41201vU, c4zq);
        BOG bog = this.A01.A00;
        bog.A04.FCM(c4zq.Cdl(), false);
        bog.A03.FCM(c4zq.Cdl(), false);
        this.A02.DvX(c4zq, interfaceC41201vU);
    }

    public BO7(BO6 bo6, InterfaceC31137Dmc interfaceC31137Dmc) {
        this.A02 = interfaceC31137Dmc;
        this.A01 = bo6;
    }

    @Override // X.InterfaceC97454Zf
    public final void DMX(C4ZQ c4zq, InterfaceC41201vU interfaceC41201vU) {
        boolean A1a = AbstractC167017dG.A1a(interfaceC41201vU, c4zq);
        if (!this.A00) {
            this.A00 = A1a;
            this.A02.DMX(c4zq, interfaceC41201vU);
        }
    }
}
